package typingsSlinky.rmcTabs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MozTransform extends js.Object {
  var MozTransform: js.Any = js.native
  var WebkitTransform: js.Any = js.native
  var transform: js.Any = js.native
}

object MozTransform {
  @scala.inline
  def apply(MozTransform: js.Any, WebkitTransform: js.Any, transform: js.Any): MozTransform = {
    val __obj = js.Dynamic.literal(MozTransform = MozTransform.asInstanceOf[js.Any], WebkitTransform = WebkitTransform.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[MozTransform]
  }
  @scala.inline
  implicit class MozTransformOps[Self <: MozTransform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMozTransform(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebkitTransform(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebkitTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransform(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

