package typingsSlinky.kdbxweb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGZip extends js.Object {
  var GZip: Double = js.native
  var None: Double = js.native
}

object AnonGZip {
  @scala.inline
  def apply(GZip: Double, None: Double): AnonGZip = {
    val __obj = js.Dynamic.literal(GZip = GZip.asInstanceOf[js.Any], None = None.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGZip]
  }
  @scala.inline
  implicit class AnonGZipOps[Self <: AnonGZip] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGZip(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GZip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("None")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

