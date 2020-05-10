package typingsSlinky.reactNativeIndicators.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaterialIndicatorProps extends BaseIndicatorProps {
  /**
    * Component color
    * @default 'rgb(0, 0, 0)'
    */
  var color: js.UndefOr[String] = js.native
  /**
    * Base component size
    * @default 40
    */
  var size: js.UndefOr[Double] = js.native
  /**
    * Indicator track width
    * @default 'size / 10'
    */
  var trackWidth: js.UndefOr[Double] = js.native
}

object MaterialIndicatorProps {
  @scala.inline
  def apply(): MaterialIndicatorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaterialIndicatorProps]
  }
  @scala.inline
  implicit class MaterialIndicatorPropsOps[Self <: MaterialIndicatorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
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
    def withTrackWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackWidth")(js.undefined)
        ret
    }
  }
  
}

