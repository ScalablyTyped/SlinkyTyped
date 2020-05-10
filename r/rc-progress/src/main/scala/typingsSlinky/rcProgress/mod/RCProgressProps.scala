package typingsSlinky.rcProgress.mod

import typingsSlinky.rcProgress.rcProgressStrings.bottom
import typingsSlinky.rcProgress.rcProgressStrings.butt
import typingsSlinky.rcProgress.rcProgressStrings.left
import typingsSlinky.rcProgress.rcProgressStrings.right
import typingsSlinky.rcProgress.rcProgressStrings.round
import typingsSlinky.rcProgress.rcProgressStrings.square
import typingsSlinky.rcProgress.rcProgressStrings.top
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RCProgressProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var gapDegree: js.UndefOr[Double] = js.native
  var gapPosition: js.UndefOr[top | right | bottom | left] = js.native
  var percent: js.UndefOr[Double | js.Array[Double]] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var strokeColor: js.UndefOr[String | js.Array[String] | js.Object] = js.native
  var strokeLinecap: js.UndefOr[butt | square | round] = js.native
  var strokeWidth: js.UndefOr[Double] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var trailColor: js.UndefOr[String] = js.native
  var trailWidth: js.UndefOr[Double] = js.native
}

object RCProgressProps {
  @scala.inline
  def apply(): RCProgressProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RCProgressProps]
  }
  @scala.inline
  implicit class RCProgressPropsOps[Self <: RCProgressProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withGapDegree(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gapDegree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGapDegree: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gapDegree")(js.undefined)
        ret
    }
    @scala.inline
    def withGapPosition(value: top | right | bottom | left): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gapPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGapPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gapPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withPercent(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percent")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeColor(value: String | js.Array[String] | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeColor")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeLinecap(value: butt | square | round): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeLinecap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeLinecap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeLinecap")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTrailColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrailColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTrailWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrailWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailWidth")(js.undefined)
        ret
    }
  }
  
}

