package typingsSlinky.cesium.anon

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LowFrameRateMessage extends js.Object {
  var container: Element | String
  var lowFrameRateMessage: js.UndefOr[String] = js.undefined
  var scene: typingsSlinky.cesium.mod.Scene
}

object LowFrameRateMessage {
  @scala.inline
  def apply(
    container: Element | String,
    scene: typingsSlinky.cesium.mod.Scene,
    lowFrameRateMessage: String = null
  ): LowFrameRateMessage = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    if (lowFrameRateMessage != null) __obj.updateDynamic("lowFrameRateMessage")(lowFrameRateMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[LowFrameRateMessage]
  }
}

