package typingsSlinky.firefoxWebextBrowser.anon

import typingsSlinky.firefoxWebextBrowser.WebExtEvent
import typingsSlinky.firefoxWebextBrowser.browser.permissions.AnyPermissions
import typingsSlinky.firefoxWebextBrowser.browser.permissions.Permissions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofpermissions extends js.Object {
  /* permissions events */
  /**
    * Fired when the extension acquires new permissions.
    * @deprecated Unsupported on Firefox at this time.
    */
  val onAdded: js.UndefOr[WebExtEvent[js.Function1[/* permissions */ Permissions, Unit]]] = js.native
  /**
    * Fired when permissions are removed from the extension.
    * @deprecated Unsupported on Firefox at this time.
    */
  val onRemoved: js.UndefOr[WebExtEvent[js.Function1[/* permissions */ Permissions, Unit]]] = js.native
  /** Check if the extension has the given permissions. */
  def contains(permissions: AnyPermissions): js.Promise[Boolean] = js.native
  /* permissions functions */
  /** Get a list of all the extension's permissions. */
  def getAll(): js.Promise[AnyPermissions] = js.native
  /** Relinquish the given permissions. */
  def remove(permissions: Permissions): js.Promise[Boolean] = js.native
  /**
    * Request the given permissions.
    *
    * Not allowed in: Devtools pages
    */
  def request(permissions: Permissions): js.Promise[Boolean] = js.native
}

object Typeofpermissions {
  @scala.inline
  def apply(
    contains: AnyPermissions => js.Promise[Boolean],
    getAll: () => js.Promise[AnyPermissions],
    remove: Permissions => js.Promise[Boolean],
    request: Permissions => js.Promise[Boolean]
  ): Typeofpermissions = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), getAll = js.Any.fromFunction0(getAll), remove = js.Any.fromFunction1(remove), request = js.Any.fromFunction1(request))
    __obj.asInstanceOf[Typeofpermissions]
  }
  @scala.inline
  implicit class TypeofpermissionsOps[Self <: Typeofpermissions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContains(value: AnyPermissions => js.Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAll(value: () => js.Promise[AnyPermissions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemove(value: Permissions => js.Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequest(value: Permissions => js.Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnAdded(value: WebExtEvent[js.Function1[/* permissions */ Permissions, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAdded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnAdded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAdded")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRemoved(value: WebExtEvent[js.Function1[/* permissions */ Permissions, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemoved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnRemoved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemoved")(js.undefined)
        ret
    }
  }
  
}

