package typingsSlinky.activexDashDiskquota

import typingsSlinky.activexDashDiskquota.DiskQuotaTypeLibrary.DiskQuotaControl
import typingsSlinky.activexDashDiskquota.activexDashDiskquotaStrings.OnUserNameChanged
import typingsSlinky.activexDashDiskquota.activexDashDiskquotaStrings.pUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObject extends js.Object {
  def on(
    obj: DiskQuotaControl,
    event: OnUserNameChanged,
    argNames: js.Array[pUser],
    handler: js.ThisFunction1[/* this */ DiskQuotaControl, /* parameter */ Anon_PUser, Unit]
  ): Unit
}

object ActiveXObject {
  @scala.inline
  def apply(
    on: (DiskQuotaControl, OnUserNameChanged, js.Array[pUser], js.ThisFunction1[/* this */ DiskQuotaControl, /* parameter */ Anon_PUser, Unit]) => Unit
  ): ActiveXObject = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction4(on))
  
    __obj.asInstanceOf[ActiveXObject]
  }
}

