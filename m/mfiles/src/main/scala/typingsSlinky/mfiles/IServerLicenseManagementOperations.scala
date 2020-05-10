package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IServerLicenseManagementOperations extends js.Object {
  def GetLicenseStatus(): ILicenseStatus = js.native
  def SetLicenseCodeAndSerialNumber(SerialNumber: String, LicenseCode: String): Unit = js.native
}

object IServerLicenseManagementOperations {
  @scala.inline
  def apply(GetLicenseStatus: () => ILicenseStatus, SetLicenseCodeAndSerialNumber: (String, String) => Unit): IServerLicenseManagementOperations = {
    val __obj = js.Dynamic.literal(GetLicenseStatus = js.Any.fromFunction0(GetLicenseStatus), SetLicenseCodeAndSerialNumber = js.Any.fromFunction2(SetLicenseCodeAndSerialNumber))
    __obj.asInstanceOf[IServerLicenseManagementOperations]
  }
  @scala.inline
  implicit class IServerLicenseManagementOperationsOps[Self <: IServerLicenseManagementOperations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetLicenseStatus(value: () => ILicenseStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetLicenseStatus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetLicenseCodeAndSerialNumber(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetLicenseCodeAndSerialNumber")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

