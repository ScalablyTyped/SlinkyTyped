package typingsSlinky.babylonjs.thinEngineMod

import typingsSlinky.babylonjs.iofflineproviderMod.IOfflineProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISceneLike extends js.Object {
  var offlineProvider: IOfflineProvider = js.native
  def _addPendingData(data: js.Any): Unit = js.native
  def _removePendingData(data: js.Any): Unit = js.native
}

object ISceneLike {
  @scala.inline
  def apply(
    _addPendingData: js.Any => Unit,
    _removePendingData: js.Any => Unit,
    offlineProvider: IOfflineProvider
  ): ISceneLike = {
    val __obj = js.Dynamic.literal(_addPendingData = js.Any.fromFunction1(_addPendingData), _removePendingData = js.Any.fromFunction1(_removePendingData), offlineProvider = offlineProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISceneLike]
  }
  @scala.inline
  implicit class ISceneLikeOps[Self <: ISceneLike] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_addPendingData(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_addPendingData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def with_removePendingData(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_removePendingData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOfflineProvider(value: IOfflineProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offlineProvider")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

