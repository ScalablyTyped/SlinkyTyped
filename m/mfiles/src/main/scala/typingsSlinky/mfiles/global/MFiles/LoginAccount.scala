package typingsSlinky.mfiles.global.MFiles

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.mfiles.ILoginAccount
import typingsSlinky.mfiles.MFiles.MFLicenseType
import typingsSlinky.mfiles.MFiles.MFLoginAccountType
import typingsSlinky.mfiles.MFiles.MFLoginServerRole
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.LoginAccount")
@js.native
class LoginAccount () extends ILoginAccount {
  /* CompleteClass */
  override val AccountName: String = js.native
  /* CompleteClass */
  override var AccountType: MFLoginAccountType = js.native
  /* CompleteClass */
  override var DomainName: String = js.native
  /* CompleteClass */
  override var EmailAddress: String = js.native
  /* CompleteClass */
  override var Enabled: Boolean = js.native
  /* CompleteClass */
  override var FullName: String = js.native
  /* CompleteClass */
  override var LicenseType: MFLicenseType = js.native
  /* CompleteClass */
  override var ServerRoles: MFLoginServerRole = js.native
  /* CompleteClass */
  override var UserName: String = js.native
  /* CompleteClass */
  override def Clone(): ILoginAccount = js.native
  /* CompleteClass */
  override def CloneFrom(LoginAccount: ILoginAccount): Unit = js.native
  /* CompleteClass */
  override def Set(
    LoginAccountType: MFLoginAccountType,
    DomainName: String,
    UserName: String,
    ServerRoles: MFLoginServerRole,
    FullName: String,
    EmailAddress: String,
    LicenseType: MFLicenseType
  ): Unit = js.native
}

@JSGlobal("MFiles.LoginAccount")
@js.native
object LoginAccount extends Instantiable0[ILoginAccount]

