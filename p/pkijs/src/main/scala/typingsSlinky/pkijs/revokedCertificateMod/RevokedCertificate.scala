package typingsSlinky.pkijs.revokedCertificateMod

import typingsSlinky.asn1js.mod.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevokedCertificate extends js.Object {
  var crlEntryExtensions: typingsSlinky.pkijs.extensionsMod.default
  var revocationDate: typingsSlinky.pkijs.timeMod.default
  var userCertificate: Integer
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
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
}

