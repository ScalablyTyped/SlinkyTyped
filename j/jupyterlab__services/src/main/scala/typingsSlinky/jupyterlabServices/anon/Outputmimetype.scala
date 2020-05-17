package typingsSlinky.jupyterlabServices.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Outputmimetype extends js.Object {
  var output_mimetype: String = js.native
}

object Outputmimetype {
  @scala.inline
  def apply(output_mimetype: String): Outputmimetype = {
    val __obj = js.Dynamic.literal(output_mimetype = output_mimetype.asInstanceOf[js.Any])
    __obj.asInstanceOf[Outputmimetype]
  }
  @scala.inline
  implicit class OutputmimetypeOps[Self <: Outputmimetype] (val x: Self) extends AnyVal {
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

