package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultUserSettingOperations extends js.Object {
  def ChangeVaultLanguage(Language: Double): Unit = js.native
  def GetSubstituteUsers(): IUserOrUserGroupIDs = js.native
  def GetVaultLanguage(): Double = js.native
  def GetVaultLanguageCode(): String = js.native
  def SetSubstituteUsers(UserOrUserGroupIDs: IUserOrUserGroupIDs): Unit = js.native
}

object IVaultUserSettingOperations {
  @scala.inline
  def apply(
    ChangeVaultLanguage: Double => Unit,
    GetSubstituteUsers: () => IUserOrUserGroupIDs,
    GetVaultLanguage: () => Double,
    GetVaultLanguageCode: () => String,
    SetSubstituteUsers: IUserOrUserGroupIDs => Unit
  ): IVaultUserSettingOperations = {
    val __obj = js.Dynamic.literal(ChangeVaultLanguage = js.Any.fromFunction1(ChangeVaultLanguage), GetSubstituteUsers = js.Any.fromFunction0(GetSubstituteUsers), GetVaultLanguage = js.Any.fromFunction0(GetVaultLanguage), GetVaultLanguageCode = js.Any.fromFunction0(GetVaultLanguageCode), SetSubstituteUsers = js.Any.fromFunction1(SetSubstituteUsers))
    __obj.asInstanceOf[IVaultUserSettingOperations]
  }
  @scala.inline
  implicit class IVaultUserSettingOperationsOps[Self <: IVaultUserSettingOperations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeVaultLanguage(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeVaultLanguage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSubstituteUsers(value: () => IUserOrUserGroupIDs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetSubstituteUsers")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetVaultLanguage(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetVaultLanguage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetVaultLanguageCode(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetVaultLanguageCode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetSubstituteUsers(value: IUserOrUserGroupIDs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetSubstituteUsers")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

