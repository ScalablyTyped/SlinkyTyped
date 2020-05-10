package typingsSlinky.antdMobileRn.activityIndicatorIndexNativeMod

import typingsSlinky.antdMobileRn.activityIndicatorPropsTypeMod.ActivityIndicatorPropTypes
import typingsSlinky.antdMobileRn.styleIndexDotnativeMod.IActivityIndicatorStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityIndicatorNativeProps extends ActivityIndicatorPropTypes {
  var color: js.UndefOr[String] = js.native
  var styles: js.UndefOr[IActivityIndicatorStyle] = js.native
}

object ActivityIndicatorNativeProps {
  @scala.inline
  def apply(): ActivityIndicatorNativeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityIndicatorNativeProps]
  }
  @scala.inline
  implicit class ActivityIndicatorNativePropsOps[Self <: ActivityIndicatorNativeProps] (val x: Self) extends AnyVal {
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
    def withStyles(value: IActivityIndicatorStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
  }
  
}

