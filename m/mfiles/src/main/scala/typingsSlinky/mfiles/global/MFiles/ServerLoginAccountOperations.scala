package typingsSlinky.mfiles.global.MFiles

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.mfiles.ILoginAccount
import typingsSlinky.mfiles.ILoginAccountPersonalInformation
import typingsSlinky.mfiles.ILoginAccounts
import typingsSlinky.mfiles.IServerLoginAccountOperations
import typingsSlinky.mfiles.IStrings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ServerLoginAccountOperations")
@js.native
class ServerLoginAccountOperations () extends IServerLoginAccountOperations {
  /* CompleteClass */
  override def AddLoginAccount(LoginAccount: ILoginAccount, Password: String): Unit = js.native
  /* CompleteClass */
  override def ForceLogout(AccountNames: IStrings): Unit = js.native
  /* CompleteClass */
  override def GetLoginAccount(AccountName: String): ILoginAccount = js.native
  /* CompleteClass */
  override def GetLoginAccounts(): ILoginAccounts = js.native
  /* CompleteClass */
  override def GetLoginAccountsWithSessions(): ILoginAccounts = js.native
  /* CompleteClass */
  override def GetPersonalInformationFromDomain(AccountName: String): ILoginAccountPersonalInformation = js.native
  /* CompleteClass */
  override def ModifyLoginAccount(LoginAccount: ILoginAccount): Unit = js.native
  /* CompleteClass */
  override def RemoveLoginAccount(AccountName: String): Unit = js.native
  /* CompleteClass */
  override def UpdateLoginPassword(AccountName: String, NewPassword: String): Unit = js.native
}

@JSGlobal("MFiles.ServerLoginAccountOperations")
@js.native
object ServerLoginAccountOperations extends Instantiable0[IServerLoginAccountOperations]

