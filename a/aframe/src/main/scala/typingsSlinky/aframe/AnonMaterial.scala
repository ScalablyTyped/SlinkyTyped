package typingsSlinky.aframe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMaterial extends js.Object {
  var material: js.Object = js.native
}

object AnonMaterial {
  @scala.inline
  def apply(material: js.Object): AnonMaterial = {
    val __obj = js.Dynamic.literal(material = material.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaterial]
  }
  @scala.inline
  implicit class AnonMaterialOps[Self <: AnonMaterial] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaterial(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

