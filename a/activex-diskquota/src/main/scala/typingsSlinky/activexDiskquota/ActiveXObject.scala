package typingsSlinky.activexDiskquota

import typingsSlinky.activexDiskquota.DiskQuotaTypeLibrary.DiskQuotaControl
import typingsSlinky.activexDiskquota.activexDiskquotaStrings.OnUserNameChanged
import typingsSlinky.activexDiskquota.activexDiskquotaStrings.pUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  def on(
    obj: DiskQuotaControl,
    event: OnUserNameChanged,
    argNames: js.Array[pUser],
    handler: js.ThisFunction1[/* this */ DiskQuotaControl, /* parameter */ AnonPUser, Unit]
  ): Unit = js.native
}

object ActiveXObject {
  @scala.inline
  def apply(
    on: (DiskQuotaControl, OnUserNameChanged, js.Array[pUser], js.ThisFunction1[/* this */ DiskQuotaControl, /* parameter */ AnonPUser, Unit]) => Unit
  ): ActiveXObject = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction4(on))
    __obj.asInstanceOf[ActiveXObject]
  }
  @scala.inline
  implicit class ActiveXObjectOps[Self <: ActiveXObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOn(
      value: (DiskQuotaControl, OnUserNameChanged, js.Array[pUser], js.ThisFunction1[/* this */ DiskQuotaControl, /* parameter */ AnonPUser, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}

