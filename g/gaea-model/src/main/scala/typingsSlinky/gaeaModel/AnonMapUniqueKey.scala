package typingsSlinky.gaeaModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMapUniqueKey extends js.Object {
  // 当前拖拽组件的 mapUniqueKey
  var mapUniqueKey: String = js.native
  // 拖拽目标的 index
  var targetIndex: js.UndefOr[Double] = js.native
  // 拖拽目标的 mapUniqueKey
  var targetMapUniqueKey: js.UndefOr[String] = js.native
}

object AnonMapUniqueKey {
  @scala.inline
  def apply(mapUniqueKey: String): AnonMapUniqueKey = {
    val __obj = js.Dynamic.literal(mapUniqueKey = mapUniqueKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMapUniqueKey]
  }
  @scala.inline
  implicit class AnonMapUniqueKeyOps[Self <: AnonMapUniqueKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMapUniqueKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapUniqueKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetMapUniqueKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetMapUniqueKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetMapUniqueKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetMapUniqueKey")(js.undefined)
        ret
    }
  }
  
}

