package typingsSlinky.jsrsasign.mod.KJUR.asn1

import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.ASN1ObjectParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.ArrayParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.BinParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.HexParam
import typingsSlinky.jsrsasign.jsrsasignBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * class for ASN.1 DER encoded BitString primitive
  * @description
  * As for argument 'params' for constructor, you can specify one of
  * following properties:
  *
  * - bin - specify binary string (ex. '10111')
  * - array - specify array of boolean (ex. [true,false,true,true])
  * - hex - specify hexadecimal string of ASN.1 value(V) including unused bits
  * - obj - specify `KJUR.asn1.ASN1Util.newObject`
  *   argument for "BitString encapsulates" structure.
  *
  * NOTE1: 'params' can be omitted.
  * NOTE2: 'obj' parameter have been supported since
  * asn1 1.0.11, jsrsasign 6.1.1 (2016-Sep-25).
  *
  * @example
  * // default constructor
  * o = new KJUR.asn1.DERBitString();
  * // initialize with binary string
  * o = new KJUR.asn1.DERBitString({bin: "1011"});
  * // initialize with boolean array
  * o = new KJUR.asn1.DERBitString({array: [true,false,true,true]});
  * // initialize with hexadecimal string (04 is unused bits)
  * o = new KJUR.asn1.DEROctetString({hex: "04bac0"});
  * // initialize with ASN1Util.newObject argument for encapsulated
  * o = new KJUR.asn1.DERBitString({obj: {seq: [{int: 3}, {prnstr: 'aaa'}]}});
  * // above generates a ASN.1 data like this:
  * // BIT STRING, encapsulates {
  * //   SEQUENCE {
  * //     INTEGER 3
  * //     PrintableString 'aaa'
  * //     }
  * //   }
  */
@JSImport("jsrsasign", "KJUR.asn1.DERBitString")
@js.native
class DERBitString ()
  extends typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.DERBitString {
  def this(params: ASN1ObjectParam) = this()
  def this(params: ArrayParam[Boolean]) = this()
  def this(params: BinParam) = this()
  def this(params: HexParam) = this()
}
object DERBitString {
  
  /**
    * generate an array of falses with specified length
    * @param nLength length of array to generate
    * @return array of boolean falses
    * @description
    * This static method may be useful to initialize boolean array.
    * @example
    * o = new KJUR.asn1.DERBitString();
    * o.newFalseArray(3) → [false, false, false]
    */
  /* static member */
  @JSImport("jsrsasign", "KJUR.asn1.DERBitString.newFalseArray")
  @js.native
  def newFalseArray(nLength: Double): js.Array[`false`] = js.native
}
