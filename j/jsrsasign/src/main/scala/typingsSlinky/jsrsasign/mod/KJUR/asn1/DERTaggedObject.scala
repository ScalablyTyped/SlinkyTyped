package typingsSlinky.jsrsasign.mod.KJUR.asn1

import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.ASN1ObjectParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.ExplicitParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.TagParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * class for ASN.1 DER TaggedObject
  *
  * @description
  * Parameter 'tagNoNex' is ASN.1 tag(T) value for this object.
  * For example, if you find '[1]' tag in a ASN.1 dump,
  * 'tagNoHex' will be 'a1'.
  *
  * As for optional argument 'params' for constructor, you can specify *ANY* of
  * following properties:
  *
  * - explicit - specify true if this is explicit tag otherwise false
  *   (default is 'true').
  * - tag - specify tag (default is 'a0' which means [0])
  * - obj - specify ASN1Object which is tagged
  *
  * @example
  * d1 = new KJUR.asn1.DERUTF8String({'str':'a'});
  * d2 = new KJUR.asn1.DERTaggedObject({'obj': d1});
  * hex = d2.getEncodedHex();
  */
@JSImport("jsrsasign", "KJUR.asn1.DERTaggedObject")
@js.native
class DERTaggedObject ()
  extends typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.DERTaggedObject {
  def this(params: ASN1ObjectParam) = this()
  def this(params: ExplicitParam) = this()
  def this(params: TagParam) = this()
}
