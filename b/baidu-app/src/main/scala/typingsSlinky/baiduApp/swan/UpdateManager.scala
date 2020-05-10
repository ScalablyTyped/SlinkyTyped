package typingsSlinky.baiduApp.swan

import typingsSlinky.baiduApp.AnonConfirm
import typingsSlinky.baiduApp.AnonHasUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #region 更新
@js.native
trait UpdateManager extends js.Object {
  def applyUpdate(): Unit = js.native
  def onCheckForUpdate(callback: js.Function1[/* res */ AnonHasUpdate, Unit]): Unit = js.native
  def onUpdateFailed(callback: js.Function1[/* res */ js.Any, Unit]): Unit = js.native
  def onUpdateReady(callback: js.Function1[/* res */ AnonConfirm, Unit]): Unit = js.native
}

object UpdateManager {
  @scala.inline
  def apply(
    applyUpdate: () => Unit,
    onCheckForUpdate: js.Function1[/* res */ AnonHasUpdate, Unit] => Unit,
    onUpdateFailed: js.Function1[/* res */ js.Any, Unit] => Unit,
    onUpdateReady: js.Function1[/* res */ AnonConfirm, Unit] => Unit
  ): UpdateManager = {
    val __obj = js.Dynamic.literal(applyUpdate = js.Any.fromFunction0(applyUpdate), onCheckForUpdate = js.Any.fromFunction1(onCheckForUpdate), onUpdateFailed = js.Any.fromFunction1(onUpdateFailed), onUpdateReady = js.Any.fromFunction1(onUpdateReady))
    __obj.asInstanceOf[UpdateManager]
  }
  @scala.inline
  implicit class UpdateManagerOps[Self <: UpdateManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyUpdate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnCheckForUpdate(value: js.Function1[/* res */ AnonHasUpdate, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCheckForUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnUpdateFailed(value: js.Function1[/* res */ js.Any, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdateFailed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnUpdateReady(value: js.Function1[/* res */ AnonConfirm, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdateReady")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

