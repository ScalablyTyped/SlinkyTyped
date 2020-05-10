package typingsSlinky.cassandraDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMaxSchemaAgreementWaitSeconds extends js.Object {
  var maxSchemaAgreementWaitSeconds: js.UndefOr[Double] = js.native
  var maxVersion: js.UndefOr[Double] = js.native
  var noCompact: js.UndefOr[Boolean] = js.native
  var port: js.UndefOr[Double] = js.native
}

object AnonMaxSchemaAgreementWaitSeconds {
  @scala.inline
  def apply(): AnonMaxSchemaAgreementWaitSeconds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonMaxSchemaAgreementWaitSeconds]
  }
  @scala.inline
  implicit class AnonMaxSchemaAgreementWaitSecondsOps[Self <: AnonMaxSchemaAgreementWaitSeconds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxSchemaAgreementWaitSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSchemaAgreementWaitSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSchemaAgreementWaitSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSchemaAgreementWaitSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withNoCompact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCompact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoCompact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCompact")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
  }
  
}

