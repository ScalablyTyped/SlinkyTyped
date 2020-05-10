package typingsSlinky.cesium

import org.scalajs.dom.raw.Element
import typingsSlinky.cesium.mod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLowFrameRateMessage extends js.Object {
  var container: Element | String = js.native
  var lowFrameRateMessage: js.UndefOr[String] = js.native
  var scene: Scene = js.native
}

object AnonLowFrameRateMessage {
  @scala.inline
  def apply(container: Element | String, scene: Scene): AnonLowFrameRateMessage = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLowFrameRateMessage]
  }
  @scala.inline
  implicit class AnonLowFrameRateMessageOps[Self <: AnonLowFrameRateMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: Element | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
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

