package typingsSlinky.amqp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCaFile extends js.Object {
  var caFile: js.UndefOr[String] = js.native
  var certFile: js.UndefOr[String] = js.native
  var enabled: Boolean = js.native
  var keyFile: js.UndefOr[String] = js.native
  var rejectUnauthorized: js.UndefOr[Boolean] = js.native
}

object AnonCaFile {
  @scala.inline
  def apply(enabled: Boolean): AnonCaFile = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCaFile]
  }
  @scala.inline
  implicit class AnonCaFileOps[Self <: AnonCaFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caFile")(js.undefined)
        ret
    }
    @scala.inline
    def withCertFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certFile")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyFile")(js.undefined)
        ret
    }
    @scala.inline
    def withRejectUnauthorized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectUnauthorized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRejectUnauthorized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectUnauthorized")(js.undefined)
        ret
    }
  }
  
}

