package typingsSlinky.pkijs.authorityKeyIdentifierMod

import typingsSlinky.asn1js.mod.Integer
import typingsSlinky.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorityKeyIdentifier extends js.Object {
  var authorityCertIssuer: js.Array[typingsSlinky.pkijs.accessDescriptionMod.default] = js.native
  var authorityCertSerialNumber: Integer = js.native
  var keyIdentifier: OctetString = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object AuthorityKeyIdentifier {
  @scala.inline
  def apply(
    authorityCertIssuer: js.Array[typingsSlinky.pkijs.accessDescriptionMod.default],
    authorityCertSerialNumber: Integer,
    fromSchema: js.Any => Unit,
    keyIdentifier: OctetString,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): AuthorityKeyIdentifier = {
    val __obj = js.Dynamic.literal(authorityCertIssuer = authorityCertIssuer.asInstanceOf[js.Any], authorityCertSerialNumber = authorityCertSerialNumber.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), keyIdentifier = keyIdentifier.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[AuthorityKeyIdentifier]
  }
  @scala.inline
  implicit class AuthorityKeyIdentifierOps[Self <: AuthorityKeyIdentifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorityCertIssuer(value: js.Array[typingsSlinky.pkijs.accessDescriptionMod.default]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorityCertIssuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthorityCertSerialNumber(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorityCertSerialNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromSchema(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromSchema")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKeyIdentifier(value: OctetString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyIdentifier")(value.asInstanceOf[js.Any])
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
  }
  
}

