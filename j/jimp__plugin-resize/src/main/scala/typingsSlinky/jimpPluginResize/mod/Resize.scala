package typingsSlinky.jimpPluginResize.mod

import typingsSlinky.jimpPluginResize.AnonRESIZEBEZIER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resize extends js.Object {
  var `class`: ResizeClass = js.native
  var constants: AnonRESIZEBEZIER = js.native
}

object Resize {
  @scala.inline
  def apply(`class`: ResizeClass, constants: AnonRESIZEBEZIER): Resize = {
    val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resize]
  }
  @scala.inline
  implicit class ResizeOps[Self <: Resize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClass(value: ResizeClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConstants(value: AnonRESIZEBEZIER): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constants")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

