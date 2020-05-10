package typingsSlinky.antDesignReactNative.progressStyleMod

import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressStyle extends js.Object {
  var progressBar: ViewStyle = js.native
  var progressOuter: ViewStyle = js.native
}

object ProgressStyle {
  @scala.inline
  def apply(progressBar: ViewStyle, progressOuter: ViewStyle): ProgressStyle = {
    val __obj = js.Dynamic.literal(progressBar = progressBar.asInstanceOf[js.Any], progressOuter = progressOuter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressStyle]
  }
  @scala.inline
  implicit class ProgressStyleOps[Self <: ProgressStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProgressBar(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgressOuter(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressOuter")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

