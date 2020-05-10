package typingsSlinky.popperJs.mod.Popper

import typingsSlinky.popperJs.popperJsBooleans.`false`
import typingsSlinky.popperJs.popperJsStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attributes extends js.Object {
  var `x-out-of-boundaries`: _empty | `false` = js.native
  var `x-placement`: Placement = js.native
}

object Attributes {
  @scala.inline
  def apply(`x-out-of-boundaries`: _empty | `false`, `x-placement`: Placement): Attributes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x-out-of-boundaries")(`x-out-of-boundaries`.asInstanceOf[js.Any])
    __obj.updateDynamic("x-placement")(`x-placement`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
  @scala.inline
  implicit class AttributesOps[Self <: Attributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withX-out-of-boundaries`(value: _empty | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-out-of-boundaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withX-placement`(value: Placement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-placement")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

