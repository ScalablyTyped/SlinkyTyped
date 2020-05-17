package typingsSlinky.reactNativeNavigation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResizeMode extends js.Object {
  var resizeMode: String = js.native
}

object ResizeMode {
  @scala.inline
  def apply(resizeMode: String): ResizeMode = {
    val __obj = js.Dynamic.literal(resizeMode = resizeMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeMode]
  }
  @scala.inline
  implicit class ResizeModeOps[Self <: ResizeMode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResizeMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

