package typingsSlinky.googleCloudStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOWNERROLE extends js.Object {
  var OWNER_ROLE: String = js.native
  var READER_ROLE: String = js.native
  var WRITER_ROLE: String = js.native
}

object AnonOWNERROLE {
  @scala.inline
  def apply(OWNER_ROLE: String, READER_ROLE: String, WRITER_ROLE: String): AnonOWNERROLE = {
    val __obj = js.Dynamic.literal(OWNER_ROLE = OWNER_ROLE.asInstanceOf[js.Any], READER_ROLE = READER_ROLE.asInstanceOf[js.Any], WRITER_ROLE = WRITER_ROLE.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOWNERROLE]
  }
  @scala.inline
  implicit class AnonOWNERROLEOps[Self <: AnonOWNERROLE] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOWNER_ROLE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OWNER_ROLE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withREADER_ROLE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("READER_ROLE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWRITER_ROLE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WRITER_ROLE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

