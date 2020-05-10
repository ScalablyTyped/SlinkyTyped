package typingsSlinky.cesium

import typingsSlinky.cesium.mod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonScene extends js.Object {
  var lowFrameRateMessage: js.UndefOr[String] = js.native
  var scene: Scene = js.native
}

object AnonScene {
  @scala.inline
  def apply(scene: Scene): AnonScene = {
    val __obj = js.Dynamic.literal(scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScene]
  }
  @scala.inline
  implicit class AnonSceneOps[Self <: AnonScene] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScene(value: Scene): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scene")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLowFrameRateMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowFrameRateMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowFrameRateMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowFrameRateMessage")(js.undefined)
        ret
    }
  }
  
}

