package typingsSlinky.grommet.anon

import typingsSlinky.grommet.utilsMod.OpacityType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpacityOpacityType extends js.Object {
  var opacity: OpacityType = js.native
}

object OpacityOpacityType {
  @scala.inline
  def apply(opacity: OpacityType): OpacityOpacityType = {
    val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpacityOpacityType]
  }
  @scala.inline
  implicit class OpacityOpacityTypeOps[Self <: OpacityOpacityType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOpacity(value: OpacityType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

