package typingsSlinky.jsrsasign.global.jsrsasign.KJUR.asn1

import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.BigIntegerParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.HexParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.IntegerParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * class for ASN.1 DER Integer
  * @description
  * As for argument 'params' for constructor, you can specify one of
  * following properties:
  *
  * - int - specify initial ASN.1 value(V) by integer value
  * - bigint - specify initial ASN.1 value(V) by BigInteger object
  * - hex - specify initial ASN.1 value(V) by a hexadecimal string
  *
  * NOTE: 'params' can be omitted.
  */
@JSGlobal("jsrsasign.KJUR.asn1.DERInteger")
@js.native
class DERInteger ()
  extends typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.DERInteger {
  def this(params: Double) = this()
  def this(params: BigIntegerParam) = this()
  def this(params: HexParam) = this()
  def this(params: IntegerParam) = this()
}
