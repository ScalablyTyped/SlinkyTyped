package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMaxNodeName extends js.Object {
  var maxNodeName: String = js.native
  var minNodeName: String = js.native
  var valueNodeName: String = js.native
}

object AnonMaxNodeName {
  @scala.inline
  def apply(maxNodeName: String, minNodeName: String, valueNodeName: String): AnonMaxNodeName = {
    val __obj = js.Dynamic.literal(maxNodeName = maxNodeName.asInstanceOf[js.Any], minNodeName = minNodeName.asInstanceOf[js.Any], valueNodeName = valueNodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaxNodeName]
  }
  @scala.inline
  implicit class AnonMaxNodeNameOps[Self <: AnonMaxNodeName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxNodeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNodeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinNodeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minNodeName")(value.asInstanceOf[js.Any])
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

