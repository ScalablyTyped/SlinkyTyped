package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPressedNodeName extends js.Object {
  var pressedNodeName: String = js.native
  var unpressedNodeName: String = js.native
  var valueNodeName: String = js.native
}

object AnonPressedNodeName {
  @scala.inline
  def apply(pressedNodeName: String, unpressedNodeName: String, valueNodeName: String): AnonPressedNodeName = {
    val __obj = js.Dynamic.literal(pressedNodeName = pressedNodeName.asInstanceOf[js.Any], unpressedNodeName = unpressedNodeName.asInstanceOf[js.Any], valueNodeName = valueNodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPressedNodeName]
  }
  @scala.inline
  implicit class AnonPressedNodeNameOps[Self <: AnonPressedNodeName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPressedNodeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressedNodeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnpressedNodeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unpressedNodeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueNodeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueNodeName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

