package typingsSlinky.popperJs.mod.Popper

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.popperJs.anon.BaseModifierbehaviorBehav
import typingsSlinky.popperJs.anon.BaseModifierelementstring
import typingsSlinky.popperJs.anon.BaseModifiergpuAccelerati
import typingsSlinky.popperJs.anon.BaseModifieroffsetnumbers
import typingsSlinky.popperJs.anon.BaseModifieronLoadFunctio
import typingsSlinky.popperJs.anon.BaseModifierpriorityArray
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Modifiers
  extends /* name */ StringDictionary[js.UndefOr[BaseModifier with (Record[String, _])]] {
  var applyStyle: js.UndefOr[BaseModifieronLoadFunctio] = js.native
  var arrow: js.UndefOr[BaseModifierelementstring] = js.native
  var computeStyle: js.UndefOr[BaseModifiergpuAccelerati] = js.native
  var flip: js.UndefOr[BaseModifierbehaviorBehav] = js.native
  var hide: js.UndefOr[BaseModifier] = js.native
  var inner: js.UndefOr[BaseModifier] = js.native
  var keepTogether: js.UndefOr[BaseModifier] = js.native
  var offset: js.UndefOr[BaseModifieroffsetnumbers] = js.native
  var preventOverflow: js.UndefOr[BaseModifierpriorityArray] = js.native
  var shift: js.UndefOr[BaseModifier] = js.native
}

object Modifiers {
  @scala.inline
  def apply(): Modifiers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Modifiers]
  }
  @scala.inline
  implicit class ModifiersOps[Self <: Modifiers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyStyle(value: BaseModifieronLoadFunctio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withArrow(value: BaseModifierelementstring): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrow")(js.undefined)
        ret
    }
    @scala.inline
    def withComputeStyle(value: BaseModifiergpuAccelerati): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputeStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFlip(value: BaseModifierbehaviorBehav): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flip")(js.undefined)
        ret
    }
    @scala.inline
    def withHide(value: BaseModifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.undefined)
        ret
    }
    @scala.inline
    def withInner(value: BaseModifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inner")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepTogether(value: BaseModifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepTogether")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepTogether: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepTogether")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: BaseModifieroffsetnumbers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventOverflow(value: BaseModifierpriorityArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventOverflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventOverflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventOverflow")(js.undefined)
        ret
    }
    @scala.inline
    def withShift(value: BaseModifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shift")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShift: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shift")(js.undefined)
        ret
    }
  }
  
}

