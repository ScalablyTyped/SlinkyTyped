package typingsSlinky.reactNativeFbsdk.mod

import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShareButtonProps extends js.Object {
  /**
    * Content to be shared.
    */
  var shareContent: ShareContent = js.native
  /**
    * View style, if any.
    */
  var style: js.UndefOr[ViewStyle] = js.native
}

object ShareButtonProps {
  @scala.inline
  def apply(shareContent: ShareContent): ShareButtonProps = {
    val __obj = js.Dynamic.literal(shareContent = shareContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareButtonProps]
  }
  @scala.inline
  implicit class ShareButtonPropsOps[Self <: ShareButtonProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShareContent(value: ShareContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: ViewStyle): Self = {
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
  }
  
}

