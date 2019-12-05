package typingsSlinky.jsrsasign.jsrsasignMod.KJUR.asn1.x509

import typingsSlinky.jsrsasign.jsrsasign.KJUR.crypto.DSA
import typingsSlinky.jsrsasign.jsrsasign.KJUR.crypto.ECDSA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SubjectPublicKeyInfo ASN.1 structure class
  * @param params parameter for subject public key
  * @description
  * As for argument 'params' for constructor, you can specify one of
  * following properties:
  *
  * - `RSAKey` object
  * - `KJUR.crypto.ECDSA` object
  * - `KJUR.crypto.DSA` object
  *
  * NOTE1: 'params' can be omitted.
  * NOTE2: DSA/ECDSA key object is also supported since asn1x509 1.0.6.
  *
  * @example
  * spki = new KJUR.asn1.x509.SubjectPublicKeyInfo(RSAKey_object);
  * spki = new KJUR.asn1.x509.SubjectPublicKeyInfo(KJURcryptoECDSA_object);
  * spki = new KJUR.asn1.x509.SubjectPublicKeyInfo(KJURcryptoDSA_object);
  */
@JSImport("jsrsasign", "KJUR.asn1.x509.SubjectPublicKeyInfo")
@js.native
class SubjectPublicKeyInfo ()
  extends typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.x509.SubjectPublicKeyInfo {
  def this(params: DSA) = this()
  def this(params: ECDSA) = this()
  def this(params: typingsSlinky.jsrsasign.jsrsasign.RSAKey) = this()
}

