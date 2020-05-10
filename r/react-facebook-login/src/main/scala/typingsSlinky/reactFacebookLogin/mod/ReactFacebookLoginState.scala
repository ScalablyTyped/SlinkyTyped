package typingsSlinky.reactFacebookLogin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactFacebookLoginState extends js.Object {
  var isProcessing: js.UndefOr[Boolean] = js.native
  var isSdkLoaded: js.UndefOr[Boolean] = js.native
}

object ReactFacebookLoginState {
  @scala.inline
  def apply(): ReactFacebookLoginState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactFacebookLoginState]
  }
  @scala.inline
  implicit class ReactFacebookLoginStateOps[Self <: ReactFacebookLoginState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsProcessing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isProcessing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsProcessing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isProcessing")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSdkLoaded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSdkLoaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSdkLoaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSdkLoaded")(js.undefined)
        ret
    }
  }
  
}

