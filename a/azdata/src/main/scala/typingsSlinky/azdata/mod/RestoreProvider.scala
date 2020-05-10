package typingsSlinky.azdata.mod

import typingsSlinky.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreProvider extends DataProvider {
  def cancelRestorePlan(connectionUri: String, restoreInfo: RestoreInfo): Thenable[Boolean] = js.native
  def getRestoreConfigInfo(connectionUri: String): Thenable[RestoreConfigInfo] = js.native
  def getRestorePlan(connectionUri: String, restoreInfo: RestoreInfo): Thenable[RestorePlanResponse] = js.native
  def restore(connectionUri: String, restoreInfo: RestoreInfo): Thenable[RestoreResponse] = js.native
}

object RestoreProvider {
  @scala.inline
  def apply(
    cancelRestorePlan: (String, RestoreInfo) => Thenable[Boolean],
    getRestoreConfigInfo: String => Thenable[RestoreConfigInfo],
    getRestorePlan: (String, RestoreInfo) => Thenable[RestorePlanResponse],
    providerId: String,
    restore: (String, RestoreInfo) => Thenable[RestoreResponse]
  ): RestoreProvider = {
    val __obj = js.Dynamic.literal(cancelRestorePlan = js.Any.fromFunction2(cancelRestorePlan), getRestoreConfigInfo = js.Any.fromFunction1(getRestoreConfigInfo), getRestorePlan = js.Any.fromFunction2(getRestorePlan), providerId = providerId.asInstanceOf[js.Any], restore = js.Any.fromFunction2(restore))
    __obj.asInstanceOf[RestoreProvider]
  }
  @scala.inline
  implicit class RestoreProviderOps[Self <: RestoreProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancelRestorePlan(value: (String, RestoreInfo) => Thenable[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelRestorePlan")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetRestoreConfigInfo(value: String => Thenable[RestoreConfigInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRestoreConfigInfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetRestorePlan(value: (String, RestoreInfo) => Thenable[RestorePlanResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRestorePlan")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRestore(value: (String, RestoreInfo) => Thenable[RestoreResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restore")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

