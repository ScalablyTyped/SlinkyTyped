package typingsSlinky.azure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDelete extends js.Object {
  var Delete: Boolean = js.native
  var Read: Boolean = js.native
  var RetentionPolicy: AnonDays = js.native
  var Version: Double = js.native
  var Write: Boolean = js.native
}

object AnonDelete {
  @scala.inline
  def apply(Delete: Boolean, Read: Boolean, RetentionPolicy: AnonDays, Version: Double, Write: Boolean): AnonDelete = {
    val __obj = js.Dynamic.literal(Delete = Delete.asInstanceOf[js.Any], Read = Read.asInstanceOf[js.Any], RetentionPolicy = RetentionPolicy.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any], Write = Write.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDelete]
  }
  @scala.inline
  implicit class AnonDeleteOps[Self <: AnonDelete] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRead(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Read")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetentionPolicy(value: AnonDays): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetentionPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Write")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

