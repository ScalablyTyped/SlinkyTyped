package typingsSlinky.jpegJs

import typingsSlinky.jpegJs.jpegJsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonColorTransform extends js.Object {
  var colorTransform: js.UndefOr[Boolean] = js.native
  var useTArray: `true` = js.native
}

object AnonColorTransform {
  @scala.inline
  def apply(useTArray: `true`): AnonColorTransform = {
    val __obj = js.Dynamic.literal(useTArray = useTArray.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorTransform]
  }
  @scala.inline
  implicit class AnonColorTransformOps[Self <: AnonColorTransform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUseTArray(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorTransform(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorTransform")(js.undefined)
        ret
    }
  }
  
}

