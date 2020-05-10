package typingsSlinky.pkijs.revokedCertificateMod

import typingsSlinky.asn1js.mod.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevokedCertificate extends js.Object {
  var crlEntryExtensions: typingsSlinky.pkijs.extensionsMod.default = js.native
  var revocationDate: typingsSlinky.pkijs.timeMod.default = js.native
  var userCertificate: Integer = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object RevokedCertificate {
  @scala.inline
  def apply(
    crlEntryExtensions: typingsSlinky.pkijs.extensionsMod.default,
    fromSchema: js.Any => Unit,
    revocationDate: typingsSlinky.pkijs.timeMod.default,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    userCertificate: Integer
  ): RevokedCertificate = {
    val __obj = js.Dynamic.literal(crlEntryExtensions = crlEntryExtensions.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), revocationDate = revocationDate.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), userCertificate = userCertificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokedCertificate]
  }
  @scala.inline
  implicit class RevokedCertificateOps[Self <: RevokedCertificate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrlEntryExtensions(value: typingsSlinky.pkijs.extensionsMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crlEntryExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromSchema(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromSchema")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRevocationDate(value: typingsSlinky.pkijs.timeMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revocationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToJSON(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToSchema(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toSchema")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUserCertificate(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userCertificate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

