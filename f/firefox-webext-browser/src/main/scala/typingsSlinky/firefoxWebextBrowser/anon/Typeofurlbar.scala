package typingsSlinky.firefoxWebextBrowser.anon

import typingsSlinky.firefoxWebextBrowser.browser.types.Setting
import typingsSlinky.firefoxWebextBrowser.browser.urlbar.Result
import typingsSlinky.firefoxWebextBrowser.browser.urlbar.UrlbarOnBehaviorRequestedEvent
import typingsSlinky.firefoxWebextBrowser.browser.urlbar.UrlbarOnQueryCanceledEvent
import typingsSlinky.firefoxWebextBrowser.browser.urlbar.UrlbarOnResultsRequestedEvent
import typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.active
import typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.inactive
import typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.restricting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofurlbar extends js.Object {
  /**
    * A contextual tip appears in the urlbar's view (its search results panel) and has an icon, text, optional button, and
    * an optional link. Use the `browser.urlbar.contextualTip` API to experiment with the contextual tip. Restricted to
    * Mozilla privileged WebExtensions.
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val contextualTip: TypeofcontextualTip = js.native
  /** Enables or disables the engagement telemetry. */
  val engagementTelemetry: Setting = js.native
  /* urlbar events */
  /**
    * Before a query starts, this event is fired for the given provider. Its purpose is to request the provider's
    * behavior for the query. The listener should return a behavior in response. By default, providers are inactive,
    * so if your provider should always be inactive, you don't need to listen for this event.
    * @param query The query for which the behavior is requested.
    * @returns The behavior of the provider for the query.
    */
  val onBehaviorRequested: UrlbarOnBehaviorRequestedEvent[
    js.Function1[
      /* query */ typingsSlinky.firefoxWebextBrowser.browser.urlbar.Query, 
      active | inactive | restricting
    ]
  ] = js.native
  /**
    * This event is fired for the given provider when a query is canceled. The listener should stop any ongoing fetch
    * or creation of results and clean up its resources.
    * @param query The query that was canceled.
    */
  val onQueryCanceled: UrlbarOnQueryCanceledEvent[
    js.Function1[/* query */ typingsSlinky.firefoxWebextBrowser.browser.urlbar.Query, Unit]
  ] = js.native
  /**
    * When a query starts, this event is fired for the given provider if the provider is active for the query and
    * there are no other providers that are restricting. Its purpose is to request the provider's results for the
    * query. The listener should return a list of results in response.
    * @param query The query for which results are requested.
    * @returns The results that the provider fetched for the query.
    */
  val onResultsRequested: UrlbarOnResultsRequestedEvent[
    js.Function1[
      /* query */ typingsSlinky.firefoxWebextBrowser.browser.urlbar.Query, 
      js.Array[Result]
    ]
  ] = js.native
  /* urlbar properties */
  /** Enables or disables the open-view-on-focus mode. */
  val openViewOnFocus: Setting = js.native
}

object Typeofurlbar {
  @scala.inline
  def apply(
    contextualTip: TypeofcontextualTip,
    engagementTelemetry: Setting,
    onBehaviorRequested: UrlbarOnBehaviorRequestedEvent[
      js.Function1[
        /* query */ typingsSlinky.firefoxWebextBrowser.browser.urlbar.Query, 
        active | inactive | restricting
      ]
    ],
    onQueryCanceled: UrlbarOnQueryCanceledEvent[
      js.Function1[/* query */ typingsSlinky.firefoxWebextBrowser.browser.urlbar.Query, Unit]
    ],
    onResultsRequested: UrlbarOnResultsRequestedEvent[
      js.Function1[
        /* query */ typingsSlinky.firefoxWebextBrowser.browser.urlbar.Query, 
        js.Array[Result]
      ]
    ],
    openViewOnFocus: Setting
  ): Typeofurlbar = {
    val __obj = js.Dynamic.literal(contextualTip = contextualTip.asInstanceOf[js.Any], engagementTelemetry = engagementTelemetry.asInstanceOf[js.Any], onBehaviorRequested = onBehaviorRequested.asInstanceOf[js.Any], onQueryCanceled = onQueryCanceled.asInstanceOf[js.Any], onResultsRequested = onResultsRequested.asInstanceOf[js.Any], openViewOnFocus = openViewOnFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofurlbar]
  }
  @scala.inline
  implicit class TypeofurlbarOps[Self <: Typeofurlbar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContextualTip(value: TypeofcontextualTip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextualTip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEngagementTelemetry(value: Setting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engagementTelemetry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnBehaviorRequested(
      value: UrlbarOnBehaviorRequestedEvent[
          js.Function1[
            /* query */ typingsSlinky.firefoxWebextBrowser.browser.urlbar.Query, 
            active | inactive | restricting
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBehaviorRequested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnQueryCanceled(
      value: UrlbarOnQueryCanceledEvent[
          js.Function1[/* query */ typingsSlinky.firefoxWebextBrowser.browser.urlbar.Query, Unit]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onQueryCanceled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnResultsRequested(
      value: UrlbarOnResultsRequestedEvent[
          js.Function1[
            /* query */ typingsSlinky.firefoxWebextBrowser.browser.urlbar.Query, 
            js.Array[Result]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResultsRequested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenViewOnFocus(value: Setting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openViewOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

