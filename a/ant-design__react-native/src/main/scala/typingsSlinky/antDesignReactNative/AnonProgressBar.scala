package typingsSlinky.antDesignReactNative

import typingsSlinky.reactNative.mod.RegisteredStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonProgressBar extends js.Object {
  var progressBar: RegisteredStyle[ViewStyle] = js.native
  var progressOuter: RegisteredStyle[ViewStyle] = js.native
}

object AnonProgressBar {
  @scala.inline
  def apply(progressBar: RegisteredStyle[ViewStyle], progressOuter: RegisteredStyle[ViewStyle]): AnonProgressBar = {
    val __obj = js.Dynamic.literal(progressBar = progressBar.asInstanceOf[js.Any], progressOuter = progressOuter.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProgressBar]
  }
  @scala.inline
  implicit class AnonProgressBarOps[Self <: AnonProgressBar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProgressBar(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgressOuter(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressOuter")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

