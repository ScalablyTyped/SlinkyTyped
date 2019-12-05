package typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.x509

import typingsSlinky.jsrsasign.Anon_ArrayHexParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.HexParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.NameParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.ObjectIdentifierParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * KeyUsage ASN.1 structure class
  * @param params associative array of parameters
  * @example
  * e1 = new KJUR.asn1.x509.ExtKeyUsage({
  *   critical: true,
  *   array: [
  *     {oid: '2.5.29.37.0'},  // anyExtendedKeyUsage
  *     {name: 'clientAuth'}
  *   ]
  * });
  * // id-ce-extKeyUsage OBJECT IDENTIFIER ::= { id-ce 37 }
  * // ExtKeyUsageSyntax ::= SEQUENCE SIZE (1..MAX) OF KeyPurposeId
  * // KeyPurposeId ::= OBJECT IDENTIFIER
  */
@JSGlobal("jsrsasign.KJUR.asn1.x509.ExtKeyUsage")
@js.native
class ExtKeyUsage () extends Extension {
  def this(params: Anon_ArrayHexParam) = this()
  def getExtnValueHex(): String = js.native
  def setPurposeArray(purposeArray: js.Array[ObjectIdentifierParam | HexParam | NameParam]): Unit = js.native
}

