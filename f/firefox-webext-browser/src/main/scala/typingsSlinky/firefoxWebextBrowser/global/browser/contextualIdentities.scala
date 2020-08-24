package typingsSlinky.firefoxWebextBrowser.global.browser

import typingsSlinky.firefoxWebextBrowser.WebExtEvent
import typingsSlinky.firefoxWebextBrowser.anon.ColorIcon
import typingsSlinky.firefoxWebextBrowser.anon.ContextualIdentity
import typingsSlinky.firefoxWebextBrowser.anon.Icon
import typingsSlinky.firefoxWebextBrowser.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Use the `browser.contextualIdentities` API to query and modify contextual identity, also called as containers.
  *
  * Permissions: `contextualIdentities`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
@JSGlobal("browser.contextualIdentities")
@js.native
object contextualIdentities extends js.Object {
  /** Fired when a new container is created. */
  val onCreated: WebExtEvent[js.Function1[/* changeInfo */ ContextualIdentity, Unit]] = js.native
  /** Fired when a container is removed. */
  val onRemoved: WebExtEvent[js.Function1[/* changeInfo */ ContextualIdentity, Unit]] = js.native
  /* contextualIdentities events */
  /** Fired when a container is updated. */
  val onUpdated: WebExtEvent[js.Function1[/* changeInfo */ ContextualIdentity, Unit]] = js.native
  /**
    * Creates a contextual identity with the given data.
    * @param details Details about the contextual identity being created.
    */
  def create(details: Icon): js.Promise[
    typingsSlinky.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity
  ] = js.native
  /* contextualIdentities functions */
  /**
    * Retrieves information about a single contextual identity.
    * @param cookieStoreId The ID of the contextual identity cookie store.
    */
  def get(cookieStoreId: String): js.Promise[
    typingsSlinky.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity
  ] = js.native
  /**
    * Retrieves all contextual identities
    * @param details Information to filter the contextual identities being retrieved.
    */
  def query(details: Name): js.Promise[
    js.Array[
      typingsSlinky.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity
    ]
  ] = js.native
  /**
    * Deletes a contetual identity by its cookie Store ID.
    * @param cookieStoreId The ID of the contextual identity cookie store.
    */
  def remove(cookieStoreId: String): js.Promise[
    typingsSlinky.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity
  ] = js.native
  /**
    * Updates a contextual identity with the given data.
    * @param cookieStoreId The ID of the contextual identity cookie store.
    * @param details Details about the contextual identity being created.
    */
  def update(cookieStoreId: String, details: ColorIcon): js.Promise[
    typingsSlinky.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity
  ] = js.native
}

