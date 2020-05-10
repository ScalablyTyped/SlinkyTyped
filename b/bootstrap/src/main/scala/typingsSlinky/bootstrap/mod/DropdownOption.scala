package typingsSlinky.bootstrap.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.bootstrap.bootstrapStrings.dynamic
import typingsSlinky.bootstrap.bootstrapStrings.parent
import typingsSlinky.bootstrap.bootstrapStrings.static
import typingsSlinky.bootstrap.bootstrapStrings.toggle
import typingsSlinky.popperJs.mod.Boundary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropdownOption extends js.Object {
  /**
    * Overflow constraint boundary of the dropdown menu.
    * Accepts the values of 'viewport', 'window', 'scrollParent', or an HTMLElement reference (JavaScript only).
    * For more information refer to Popper.js's preventOverflow docs.
    *
    * @default "scrollParent"
    */
  var boundary: js.UndefOr[Boundary | HTMLElement] = js.native
  /**
    * By default, we use Popper.js for dynamic positioning. Disable this with 'static'.
    *
    * @default "dynamic"
    */
  var display: js.UndefOr[dynamic | static] = js.native
  /**
    * Allow Dropdown to flip in case of an overlapping on the reference element.
    * For more information refer to Popper.js's flip docs.
    *
    * @default true
    */
  var flip: js.UndefOr[Boolean] = js.native
  /**
    * Offset of the dropdown relative to its target.
    * For more information refer to Popper.js's offset docs.
    *
    * @default 0
    */
  var offset: js.UndefOr[
    Double | String | (js.ThisFunction1[/* this */ this.type, /* offset */ OffsetsExtend, OffsetsExtend])
  ] = js.native
  /**
    * Reference element of the dropdown menu. Accepts the values of 'toggle', 'parent', or an HTMLElement reference.
    * For more information refer to Popper.js's referenceObject docs.
    *
    * @default "toggle"
    */
  var reference: js.UndefOr[toggle | parent | HTMLElement] = js.native
}

object DropdownOption {
  @scala.inline
  def apply(): DropdownOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropdownOption]
  }
  @scala.inline
  implicit class DropdownOptionOps[Self <: DropdownOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundaryHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoundary(value: Boundary | HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundary")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplay(value: dynamic | static): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(js.undefined)
        ret
    }
    @scala.inline
    def withFlip(value: Boolean): Self = {
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
    def withOffset(
      value: Double | String | (js.ThisFunction1[DropdownOption, /* offset */ OffsetsExtend, OffsetsExtend])
    ): Self = {
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
    def withReferenceHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReference(value: toggle | parent | HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference")(js.undefined)
        ret
    }
  }
  
}

