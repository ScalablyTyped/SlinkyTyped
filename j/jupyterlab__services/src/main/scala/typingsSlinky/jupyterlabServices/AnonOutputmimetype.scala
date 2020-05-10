package typingsSlinky.jupyterlabServices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOutputmimetype extends js.Object {
  var output_mimetype: String = js.native
}

object AnonOutputmimetype {
  @scala.inline
  def apply(output_mimetype: String): AnonOutputmimetype = {
    val __obj = js.Dynamic.literal(output_mimetype = output_mimetype.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOutputmimetype]
  }
  @scala.inline
  implicit class AnonOutputmimetypeOps[Self <: AnonOutputmimetype] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutput_mimetype(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output_mimetype")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

