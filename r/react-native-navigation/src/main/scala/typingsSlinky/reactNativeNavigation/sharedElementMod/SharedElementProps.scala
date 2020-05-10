package typingsSlinky.reactNativeNavigation.sharedElementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedElementProps extends js.Object {
  var elementId: String = js.native
  var resizeMode: String = js.native
}

object SharedElementProps {
  @scala.inline
  def apply(elementId: String, resizeMode: String): SharedElementProps = {
    val __obj = js.Dynamic.literal(elementId = elementId.asInstanceOf[js.Any], resizeMode = resizeMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedElementProps]
  }
  @scala.inline
  implicit class SharedElementPropsOps[Self <: SharedElementProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElementId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResizeMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

