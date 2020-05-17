package typingsSlinky.firefoxWebextBrowser.anon

import typingsSlinky.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofcontextualIdentitie extends js.Object {
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
  def create(details: Color): js.Promise[
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
  def update(cookieStoreId: String, details: Icon): js.Promise[
    typingsSlinky.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity
  ] = js.native
}

object TypeofcontextualIdentitie {
  @scala.inline
  def apply(
    create: Color => js.Promise[
      typingsSlinky.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity
    ],
    get: String => js.Promise[
      typingsSlinky.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity
    ],
    onCreated: WebExtEvent[js.Function1[/* changeInfo */ ContextualIdentity, Unit]],
    onRemoved: WebExtEvent[js.Function1[/* changeInfo */ ContextualIdentity, Unit]],
    onUpdated: WebExtEvent[js.Function1[/* changeInfo */ ContextualIdentity, Unit]],
    query: Name => js.Promise[
      js.Array[
        typingsSlinky.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity
      ]
    ],
    remove: String => js.Promise[
      typingsSlinky.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity
    ],
    update: (String, Icon) => js.Promise[
      typingsSlinky.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity
    ]
  ): TypeofcontextualIdentitie = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), onCreated = onCreated.asInstanceOf[js.Any], onRemoved = onRemoved.asInstanceOf[js.Any], onUpdated = onUpdated.asInstanceOf[js.Any], query = js.Any.fromFunction1(query), remove = js.Any.fromFunction1(remove), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[TypeofcontextualIdentitie]
  }
  @scala.inline
  implicit class TypeofcontextualIdentitieOps[Self <: TypeofcontextualIdentitie] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(
      value: Color => js.Promise[
          typingsSlinky.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(
      value: String => js.Promise[
          typingsSlinky.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnCreated(value: WebExtEvent[js.Function1[/* changeInfo */ ContextualIdentity, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCreated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnRemoved(value: WebExtEvent[js.Function1[/* changeInfo */ ContextualIdentity, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemoved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnUpdated(value: WebExtEvent[js.Function1[/* changeInfo */ ContextualIdentity, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(
      value: Name => js.Promise[
          js.Array[
            typingsSlinky.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemove(
      value: String => js.Promise[
          typingsSlinky.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(
      value: (String, Icon) => js.Promise[
          typingsSlinky.firefoxWebextBrowser.browser.contextualIdentities.ContextualIdentity
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

