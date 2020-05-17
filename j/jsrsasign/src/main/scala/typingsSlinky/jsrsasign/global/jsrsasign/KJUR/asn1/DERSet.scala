package typingsSlinky.jsrsasign.global.jsrsasign.KJUR.asn1

import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.ArrayParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for ASN.1 DER Set
  *
  * @description
  * As for argument 'params' for constructor, you can specify one of
  * following properties:
  *
  * - array - specify array of ASN1Object to set elements of content
  * - sortflag - flag for sort (default: true). ASN.1 BER is not sorted in 'SET OF'.
  *
  * NOTE1: 'params' can be omitted.
  * NOTE2: sortflag is supported since 1.0.5.
  */
@JSGlobal("jsrsasign.KJUR.asn1.DERSet")
@js.native
class DERSet ()
  extends typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.DERAbstractStructured {
  def this(params: ArrayParam[typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object]) = this()
}

