package typingsSlinky.blueprintjsCore.progressBarMod

import typingsSlinky.blueprintjsCore.propsMod.IIntentProps
import typingsSlinky.blueprintjsCore.propsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProgressBarProps
  extends IProps
     with IIntentProps {
  /**
    * Whether the background should animate.
    * @default true
    */
  var animate: js.UndefOr[Boolean] = js.native
  /**
    * Whether the background should be striped.
    * @default true
    */
  var stripes: js.UndefOr[Boolean] = js.native
  /**
    * A value between 0 and 1 (inclusive) representing how far along the operation is.
    * Values below 0 or above 1 will be interpreted as 0 or 1, respectively.
    * Omitting this prop will result in an "indeterminate" progress meter that fills the entire bar.
    */
  var value: js.UndefOr[Double] = js.native
}

object IProgressBarProps {
  @scala.inline
  def apply(): IProgressBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProgressBarProps]
  }
  @scala.inline
  implicit class IProgressBarPropsOps[Self <: IProgressBarProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(js.undefined)
        ret
    }
    @scala.inline
    def withStripes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripes")(js.undefined)
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

