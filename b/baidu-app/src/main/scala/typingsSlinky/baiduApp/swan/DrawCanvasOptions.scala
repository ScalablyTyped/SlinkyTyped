package typingsSlinky.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawCanvasOptions extends js.Object {
  /**
  		 * 绘图动作数组，由 swan.createCanvasContext 创建的 context，
  		 * 调用 getActions 方法导出绘图动作数组。
  		 */
  var actions: js.Array[CanvasAction] = js.native
  /** 画布标识，传入 <canvas/> 的 cavas-id */
  var canvasId: Double | String = js.native
}

object DrawCanvasOptions {
  @scala.inline
  def apply(actions: js.Array[CanvasAction], canvasId: Double | String): DrawCanvasOptions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], canvasId = canvasId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawCanvasOptions]
  }
  @scala.inline
  implicit class DrawCanvasOptionsOps[Self <: DrawCanvasOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: js.Array[CanvasAction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanvasId(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvasId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

