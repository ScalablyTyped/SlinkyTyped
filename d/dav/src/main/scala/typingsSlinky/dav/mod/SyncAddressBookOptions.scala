package typingsSlinky.dav.mod

import typingsSlinky.dav.davStrings.basic
import typingsSlinky.dav.davStrings.webdav
import typingsSlinky.dav.mod.transport.Transport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyncAddressBookOptions extends js.Object {
  /**
    * request sandbox.
    */
  var sandbox: js.UndefOr[Sandbox] = js.native
  /**
    * either 'basic' or 'webdav'.If unspecified, will try to do webdav sync
    * and failover to basic sync if rfc 6578 is not supported by the server.
    */
  var syncMethod: js.UndefOr[basic | webdav] = js.native
  /**
    * request sender.
    */
  var xhr: js.UndefOr[Transport] = js.native
}

object SyncAddressBookOptions {
  @scala.inline
  def apply(): SyncAddressBookOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncAddressBookOptions]
  }
  @scala.inline
  implicit class SyncAddressBookOptionsOps[Self <: SyncAddressBookOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSandbox(value: Sandbox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sandbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSandbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sandbox")(js.undefined)
        ret
    }
    @scala.inline
    def withSyncMethod(value: basic | webdav): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyncMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withXhr(value: Transport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXhr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhr")(js.undefined)
        ret
    }
  }
  
}

