package typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * class for ASN.1 DER UTCTime
  * @param params associative array of parameters (ex. {'str': '130430235959Z'})
  * @description
  * As for argument 'params' for constructor, you can specify one of
  * following properties:
  *
  * - str - specify initial ASN.1 value(V) by a string (ex.'130430235959Z')
  * - hex - specify initial ASN.1 value(V) by a hexadecimal string
  * - date - specify Date object.
  *
  * NOTE: 'params' can be omitted.
  * @example
  * d1 = new KJUR.asn1.DERUTCTime();
  * d1.setString('130430125959Z');
  *
  * d2 = new KJUR.asn1.DERUTCTime({'str': '130430125959Z'});
  * d3 = new KJUR.asn1.DERUTCTime({'date': new Date(Date.UTC(2015, 0, 31, 0, 0, 0, 0))});
  * d4 = new KJUR.asn1.DERUTCTime('130430125959Z');
  */
@js.native
trait DERUTCTime extends DERAbstractTime {
  
  /**
    * set value by a Date object
    * @param dateObject Date object to set ASN.1 value(V)
    * @example
    * o = new KJUR.asn1.DERUTCTime();
    * o.setByDate(new Date("2016/12/31"));
    */
  def setByDate(dateObject: js.Date): Unit = js.native
}
