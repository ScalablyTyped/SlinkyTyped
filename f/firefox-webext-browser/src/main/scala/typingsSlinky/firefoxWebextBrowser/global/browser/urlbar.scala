package typingsSlinky.firefoxWebextBrowser.global.browser

import typingsSlinky.firefoxWebextBrowser.browser.types.Setting
import typingsSlinky.firefoxWebextBrowser.browser.urlbar.EngagementState
import typingsSlinky.firefoxWebextBrowser.browser.urlbar.Query
import typingsSlinky.firefoxWebextBrowser.browser.urlbar.Result
import typingsSlinky.firefoxWebextBrowser.browser.urlbar.SearchOptions
import typingsSlinky.firefoxWebextBrowser.browser.urlbar.UrlbarOnBehaviorRequestedEvent
import typingsSlinky.firefoxWebextBrowser.browser.urlbar.UrlbarOnEngagementEvent
import typingsSlinky.firefoxWebextBrowser.browser.urlbar.UrlbarOnQueryCanceledEvent
import typingsSlinky.firefoxWebextBrowser.browser.urlbar.UrlbarOnResultPickedEvent
import typingsSlinky.firefoxWebextBrowser.browser.urlbar.UrlbarOnResultsRequestedEvent
import typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.active
import typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.inactive
import typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.restricting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.urlbar` API to experiment with new features in the URLBar. Restricted to Mozilla privileged
  * WebExtensions.
  *
  * Permissions: `urlbar`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
@JSGlobal("browser.urlbar")
@js.native
object urlbar extends js.Object {
  
  /* urlbar functions */
  /** Closes the urlbar view in the current window. */
  def closeView(): js.Promise[_] = js.native
  
  /* urlbar properties */
  /** Enables or disables the engagement telemetry. */
  val engagementTelemetry: Setting = js.native
  
  /**
    * Focuses the urlbar in the current window.
    * @param [select] If true, the text in the urlbar will also be selected.
    */
  def focus(): js.Promise[_] = js.native
  def focus(select: Boolean): js.Promise[_] = js.native
  
  /* urlbar events */
  /**
    * Before a query starts, this event is fired for the given provider. Its purpose is to request the provider's
    * behavior for the query. The listener should return a behavior in response. By default, providers are inactive,
    * so if your provider should always be inactive, you don't need to listen for this event.
    * @param query The query for which the behavior is requested.
    * @returns The behavior of the provider for the query.
    */
  val onBehaviorRequested: UrlbarOnBehaviorRequestedEvent[js.Function1[/* query */ Query, active | inactive | restricting]] = js.native
  
  /**
    * This event is fired when the user starts and ends an engagement with the urlbar.
    * @param state The state of the engagement.
    */
  val onEngagement: UrlbarOnEngagementEvent[js.Function1[/* state */ EngagementState, Unit]] = js.native
  
  /**
    * This event is fired for the given provider when a query is canceled. The listener should stop any ongoing fetch
    * or creation of results and clean up its resources.
    * @param query The query that was canceled.
    */
  val onQueryCanceled: UrlbarOnQueryCanceledEvent[js.Function1[/* query */ Query, Unit]] = js.native
  
  /**
    * Typically, a provider includes a `url` property in its results' payloads. When the user picks a result with a
    * URL, Firefox automatically loads the URL. URLs don't make sense for every result type, however. When the user
    * picks a result without a URL, this event is fired. The provider should take an appropriate action in response.
    * Currently the only applicable `ResultType` is `tip`.
    * @param payload The payload of the result that was picked.
    */
  val onResultPicked: UrlbarOnResultPickedEvent[js.Function1[/* payload */ js.Object, Unit]] = js.native
  
  /**
    * When a query starts, this event is fired for the given provider if the provider is active for the query and
    * there are no other providers that are restricting. Its purpose is to request the provider's results for the
    * query. The listener should return a list of results in response.
    * @param query The query for which results are requested.
    * @returns The results that the provider fetched for the query.
    */
  val onResultsRequested: UrlbarOnResultsRequestedEvent[js.Function1[/* query */ Query, js.Array[Result]]] = js.native
  
  /**
    * Starts a search in the urlbar in the current window.
    * @param searchString The search string.
    * @param [options] Options for the search.
    */
  def search(searchString: String): js.Promise[_] = js.native
  def search(searchString: String, options: SearchOptions): js.Promise[_] = js.native
}
