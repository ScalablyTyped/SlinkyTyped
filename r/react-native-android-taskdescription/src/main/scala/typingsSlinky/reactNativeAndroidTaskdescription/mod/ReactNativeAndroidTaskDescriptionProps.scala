package typingsSlinky.reactNativeAndroidTaskdescription.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactNativeAndroidTaskDescriptionProps extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.native
  var label: js.UndefOr[String] = js.native
}

object ReactNativeAndroidTaskDescriptionProps {
  @scala.inline
  def apply(): ReactNativeAndroidTaskDescriptionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactNativeAndroidTaskDescriptionProps]
  }
  @scala.inline
  implicit class ReactNativeAndroidTaskDescriptionPropsOps[Self <: ReactNativeAndroidTaskDescriptionProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
  }
  
}

