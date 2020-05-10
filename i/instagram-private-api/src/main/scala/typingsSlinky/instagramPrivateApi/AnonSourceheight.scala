package typingsSlinky.instagramPrivateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSourceheight extends js.Object {
  var source_height: Double = js.native
  var source_width: Double = js.native
}

object AnonSourceheight {
  @scala.inline
  def apply(source_height: Double, source_width: Double): AnonSourceheight = {
    val __obj = js.Dynamic.literal(source_height = source_height.asInstanceOf[js.Any], source_width = source_width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSourceheight]
  }
  @scala.inline
  implicit class AnonSourceheightOps[Self <: AnonSourceheight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSource_height(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource_width(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

