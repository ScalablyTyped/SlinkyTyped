package typingsSlinky.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCharset extends js.Object {
  var charset: String = js.native
}

object AnonCharset {
  @scala.inline
  def apply(charset: String): AnonCharset = {
    val __obj = js.Dynamic.literal(charset = charset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCharset]
  }
  @scala.inline
  implicit class AnonCharsetOps[Self <: AnonCharset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

