package typingsSlinky.rcFieldForm.anon

import typingsSlinky.rcFieldForm.interfaceMod.NotifyInfo
import typingsSlinky.rcFieldForm.rcFieldFormStrings.reset
import typingsSlinky.rcFieldForm.rcFieldFormStrings.validateFinish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Type extends NotifyInfo {
  var `type`: validateFinish | reset = js.native
}

object Type {
  @scala.inline
  def apply(`type`: validateFinish | reset): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  @scala.inline
  implicit class TypeOps[Self <: Type] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: validateFinish | reset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

