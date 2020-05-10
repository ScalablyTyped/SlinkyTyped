package typingsSlinky.reactNativeMaterialKit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressStyle extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.native
  var bufferColor: js.UndefOr[String] = js.native
  var progressColor: js.UndefOr[String] = js.native
}

object ProgressStyle {
  @scala.inline
  def apply(): ProgressStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressStyle]
  }
  @scala.inline
  implicit class ProgressStyleOps[Self <: ProgressStyle] (val x: Self) extends AnyVal {
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
    def withBufferColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBufferColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferColor")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressColor")(js.undefined)
        ret
    }
  }
  
}

