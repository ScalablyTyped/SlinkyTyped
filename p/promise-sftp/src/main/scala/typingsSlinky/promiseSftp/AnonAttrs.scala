package typingsSlinky.promiseSftp

import typingsSlinky.ssh2Streams.mod.Attributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAttrs extends js.Object {
  var attrs: Attributes = js.native
  var filename: String = js.native
  var longname: String = js.native
}

object AnonAttrs {
  @scala.inline
  def apply(attrs: Attributes, filename: String, longname: String): AnonAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], longname = longname.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttrs]
  }
  @scala.inline
  implicit class AnonAttrsOps[Self <: AnonAttrs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttrs(value: Attributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longname")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

