package typingsSlinky.chartmogulNode.mod.CustomAttribute

import typingsSlinky.chartmogulNode.commonMod.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomAttributes extends js.Object {
  var custom: Map = js.native
}

object CustomAttributes {
  @scala.inline
  def apply(custom: Map): CustomAttributes = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomAttributes]
  }
  @scala.inline
  implicit class CustomAttributesOps[Self <: CustomAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustom(value: Map): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

