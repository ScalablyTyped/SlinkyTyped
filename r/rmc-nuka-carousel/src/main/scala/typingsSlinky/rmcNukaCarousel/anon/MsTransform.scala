package typingsSlinky.rmcNukaCarousel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MsTransform extends js.Object {
  var WebkitTransform: String = js.native
  var left: String = js.native
  var msTransform: String = js.native
  var position: String = js.native
  var top: Double = js.native
  var transform: String = js.native
}

object MsTransform {
  @scala.inline
  def apply(
    WebkitTransform: String,
    left: String,
    msTransform: String,
    position: String,
    top: Double,
    transform: String
  ): MsTransform = {
    val __obj = js.Dynamic.literal(WebkitTransform = WebkitTransform.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], msTransform = msTransform.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[MsTransform]
  }
  @scala.inline
  implicit class MsTransformOps[Self <: MsTransform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWebkitTransform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebkitTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMsTransform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

