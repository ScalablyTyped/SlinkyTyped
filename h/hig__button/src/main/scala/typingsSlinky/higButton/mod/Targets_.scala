package typingsSlinky.higButton.mod

import typingsSlinky.higButton.higButtonStrings._blank
import typingsSlinky.higButton.higButtonStrings._parent
import typingsSlinky.higButton.higButtonStrings._self
import typingsSlinky.higButton.higButtonStrings._top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Targets_ extends js.Object {
  var BLANK: _blank = js.native
  var PARENT: _parent = js.native
  var SELF: _self = js.native
  var TOP: _top = js.native
}

object Targets_ {
  @scala.inline
  def apply(BLANK: _blank, PARENT: _parent, SELF: _self, TOP: _top): Targets_ = {
    val __obj = js.Dynamic.literal(BLANK = BLANK.asInstanceOf[js.Any], PARENT = PARENT.asInstanceOf[js.Any], SELF = SELF.asInstanceOf[js.Any], TOP = TOP.asInstanceOf[js.Any])
    __obj.asInstanceOf[Targets_]
  }
  @scala.inline
  implicit class Targets_Ops[Self <: Targets_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBLANK(value: _blank): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BLANK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPARENT(value: _parent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PARENT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSELF(value: _self): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SELF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTOP(value: _top): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TOP")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

