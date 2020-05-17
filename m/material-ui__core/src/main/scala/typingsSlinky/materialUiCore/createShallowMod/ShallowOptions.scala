package typingsSlinky.materialUiCore.createShallowMod

import slinky.core.facade.ReactElement
import typingsSlinky.enzyme.mod.EnzymeSelector
import typingsSlinky.materialUiCore.anon.Fn1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShallowOptions extends js.Object {
  var dive: Boolean = js.native
  var shallow: Fn1 = js.native
  var untilSelector: EnzymeSelector = js.native
}

object ShallowOptions {
  @scala.inline
  def apply(dive: Boolean, shallow: Fn1, untilSelector: EnzymeSelector): ShallowOptions = {
    val __obj = js.Dynamic.literal(dive = dive.asInstanceOf[js.Any], shallow = shallow.asInstanceOf[js.Any], untilSelector = untilSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShallowOptions]
  }
  @scala.inline
  implicit class ShallowOptionsOps[Self <: ShallowOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShallow(value: Fn1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shallow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUntilSelectorFunction2(value: (js.Any, /* context */ js.UndefOr[js.Any]) => ReactElement | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("untilSelector")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUntilSelector(value: EnzymeSelector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("untilSelector")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

