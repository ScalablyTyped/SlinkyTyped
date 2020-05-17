package typingsSlinky.cesium.anon

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LowFrameRateMessage extends js.Object {
  var container: Element | String = js.native
  var lowFrameRateMessage: js.UndefOr[String] = js.native
  var scene: typingsSlinky.cesium.mod.Scene = js.native
}

object LowFrameRateMessage {
  @scala.inline
  def apply(container: Element | String, scene: typingsSlinky.cesium.mod.Scene): LowFrameRateMessage = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[LowFrameRateMessage]
  }
  @scala.inline
  implicit class LowFrameRateMessageOps[Self <: LowFrameRateMessage] (val x: Self) extends AnyVal {
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
    def withScene(value: typingsSlinky.cesium.mod.Scene): Self = {
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

