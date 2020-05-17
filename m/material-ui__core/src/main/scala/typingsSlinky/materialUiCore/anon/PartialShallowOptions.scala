package typingsSlinky.materialUiCore.anon

import slinky.core.facade.ReactElement
import typingsSlinky.enzyme.mod.EnzymeSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/test-utils/createShallow.ShallowOptions> */
@js.native
trait PartialShallowOptions extends js.Object {
  var dive: js.UndefOr[Boolean] = js.native
  var shallow: js.UndefOr[Fn2] = js.native
  var untilSelector: js.UndefOr[EnzymeSelector] = js.native
}

object PartialShallowOptions {
  @scala.inline
  def apply(): PartialShallowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialShallowOptions]
  }
  @scala.inline
  implicit class PartialShallowOptionsOps[Self <: PartialShallowOptions] (val x: Self) extends AnyVal {
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
    def withoutDive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dive")(js.undefined)
        ret
    }
    @scala.inline
    def withShallow(value: Fn2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shallow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShallow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shallow")(js.undefined)
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
    @scala.inline
    def withoutUntilSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("untilSelector")(js.undefined)
        ret
    }
  }
  
}

