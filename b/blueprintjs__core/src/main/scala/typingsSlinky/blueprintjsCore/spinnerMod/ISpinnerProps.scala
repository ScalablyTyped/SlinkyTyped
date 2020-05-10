package typingsSlinky.blueprintjsCore.spinnerMod

import typingsSlinky.blueprintjsCore.propsMod.IIntentProps
import typingsSlinky.blueprintjsCore.propsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISpinnerProps
  extends IProps
     with IIntentProps {
  /**
    * Width and height of the spinner in pixels. The size cannot be less than
    * 10px.
    *
    * Constants are available for common sizes:
    * - `Spinner.SIZE_SMALL = 20px`
    * - `Spinner.SIZE_STANDARD = 50px`
    * - `Spinner.SIZE_LARGE = 100px`
    *
    * @default Spinner.SIZE_STANDARD = 50
    */
  var size: js.UndefOr[Double] = js.native
  /**
    * HTML tag for the two wrapper elements. If rendering a `<Spinner>` inside
    * an `<svg>`, change this to an SVG element like `"g"`.
    * @default "div"
    */
  var tagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
  ] = js.native
  /**
    * A value between 0 and 1 (inclusive) representing how far along the operation is.
    * Values below 0 or above 1 will be interpreted as 0 or 1 respectively.
    * Omitting this prop will result in an "indeterminate" spinner where the head spins indefinitely.
    */
  var value: js.UndefOr[Double] = js.native
}

object ISpinnerProps {
  @scala.inline
  def apply(): ISpinnerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISpinnerProps]
  }
  @scala.inline
  implicit class ISpinnerPropsOps[Self <: ISpinnerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagName")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

