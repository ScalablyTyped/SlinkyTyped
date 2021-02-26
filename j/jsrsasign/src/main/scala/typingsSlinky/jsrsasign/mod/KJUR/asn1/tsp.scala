package typingsSlinky.jsrsasign.mod.KJUR.asn1

import typingsSlinky.jsrsasign.anon.Certreq
import typingsSlinky.jsrsasign.anon.Failinfo
import typingsSlinky.jsrsasign.anon.HashValue
import typingsSlinky.jsrsasign.anon.Mi
import typingsSlinky.jsrsasign.anon.Micros
import typingsSlinky.jsrsasign.anon.SigAlg
import typingsSlinky.jsrsasign.anon.SignerCert
import typingsSlinky.jsrsasign.anon.Status
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.ArrayParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.IntegerParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.NameParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.cms.SignedData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * kjur's ASN.1 class for RFC 3161 Time Stamp Protocol
  *
  * This name space provides
  * [RFC 3161 Time-Stamp Protocol(TSP)](https://tools.ietf.org/html/rfc3161)
  * data generator.
  *
  * __FEATURES__
  *
  * - easily generate CMS SignedData
  * - APIs are very similar to BouncyCastle library ASN.1 classes. So easy to learn.
  */
object tsp {
  
  /**
    * abstract class for TimeStampToken generator
    * @param params associative array of parameters
    * @description
    */
  @JSImport("jsrsasign", "KJUR.asn1.tsp.AbstractTSAAdapter")
  @js.native
  class AbstractTSAAdapter ()
    extends typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.tsp.AbstractTSAAdapter
  
  /**
    * class for TSP Accuracy ASN.1 object
    * @param params associative array of parameters
    * @description
    * ```
    * Accuracy ::= SEQUENCE {
    *       seconds        INTEGER              OPTIONAL,
    *       millis     [0] INTEGER  (1..999)    OPTIONAL,
    *       micros     [1] INTEGER  (1..999)    OPTIONAL  }
    * ```
    * @example
    * o = new KJUR.asn1.tsp.Accuracy({seconds: 1,
    *                                 millis: 500,
    *                                 micros: 500});
    */
  @JSImport("jsrsasign", "KJUR.asn1.tsp.Accuracy")
  @js.native
  class Accuracy ()
    extends typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.tsp.Accuracy {
    def this(params: Micros) = this()
  }
  
  /**
    * class for fixed TimeStampToken generator
    * @param params associative array of parameters
    * @description
    * This class generates fixed TimeStampToken except messageImprint
    * for testing purpose.
    * General TSA generates TimeStampToken which varies following
    * fields:
    *
    * - genTime
    * - serialNumber
    * - nonce
    *
    * Those values are provided by initial parameters.
    */
  @JSImport("jsrsasign", "KJUR.asn1.tsp.FixedTSAAdapter")
  @js.native
  class FixedTSAAdapter ()
    extends typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.tsp.FixedTSAAdapter {
    def this(initParams: SigAlg) = this()
  }
  
  /**
    * class for TSP MessageImprint ASN.1 object
    * @param params associative array of parameters
    * @description
    * ```
    * MessageImprint ::= SEQUENCE  {
    *      hashAlgorithm                AlgorithmIdentifier,
    *      hashedMessage                OCTET STRING  }
    * ```
    * @example
    * o = new KJUR.asn1.tsp.MessageImprint({hashAlg: 'sha1',
    *                                       hashValue: '1f3dea...'});
    */
  @JSImport("jsrsasign", "KJUR.asn1.tsp.MessageImprint")
  @js.native
  class MessageImprint ()
    extends typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.tsp.MessageImprint {
    def this(params: HashValue) = this()
  }
  
  /**
    * class for TSP PKIFailureInfo ASN.1 object
    * @param params associative array of parameters
    * @description
    * ```
    * PKIFailureInfo ::= BIT STRING {
    *    badAlg                 (0),
    *    badRequest             (2),
    *    badDataFormat          (5),
    *    timeNotAvailable       (14),
    *    unacceptedPolicy       (15),
    *    unacceptedExtension    (16),
    *    addInfoNotAvailable    (17),
    *    systemFailure          (25) }
    * ```
    */
  @JSImport("jsrsasign", "KJUR.asn1.tsp.PKIFailureInfo")
  @js.native
  class PKIFailureInfo ()
    extends typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object {
    def this(params: IntegerParam) = this()
    def this(params: NameParam) = this()
  }
  object PKIFailureInfo {
    
    /* static member */
    object valueList {
      
      @JSImport("jsrsasign", "KJUR.asn1.tsp.PKIFailureInfo.valueList")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("jsrsasign", "KJUR.asn1.tsp.PKIFailureInfo.valueList.addInfoNotAvailable")
      @js.native
      def addInfoNotAvailable: Double = js.native
      @scala.inline
      def addInfoNotAvailable_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addInfoNotAvailable")(x.asInstanceOf[js.Any])
      
      @JSImport("jsrsasign", "KJUR.asn1.tsp.PKIFailureInfo.valueList.badAlg")
      @js.native
      def badAlg: Double = js.native
      @scala.inline
      def badAlg_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("badAlg")(x.asInstanceOf[js.Any])
      
      @JSImport("jsrsasign", "KJUR.asn1.tsp.PKIFailureInfo.valueList.badDataFormat")
      @js.native
      def badDataFormat: Double = js.native
      @scala.inline
      def badDataFormat_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("badDataFormat")(x.asInstanceOf[js.Any])
      
      @JSImport("jsrsasign", "KJUR.asn1.tsp.PKIFailureInfo.valueList.badRequest")
      @js.native
      def badRequest: Double = js.native
      @scala.inline
      def badRequest_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("badRequest")(x.asInstanceOf[js.Any])
      
      @JSImport("jsrsasign", "KJUR.asn1.tsp.PKIFailureInfo.valueList.systemFailure")
      @js.native
      def systemFailure: Double = js.native
      @scala.inline
      def systemFailure_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("systemFailure")(x.asInstanceOf[js.Any])
      
      @JSImport("jsrsasign", "KJUR.asn1.tsp.PKIFailureInfo.valueList.timeNotAvailable")
      @js.native
      def timeNotAvailable: Double = js.native
      @scala.inline
      def timeNotAvailable_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeNotAvailable")(x.asInstanceOf[js.Any])
      
      @JSImport("jsrsasign", "KJUR.asn1.tsp.PKIFailureInfo.valueList.unacceptedExtension")
      @js.native
      def unacceptedExtension: Double = js.native
      @scala.inline
      def unacceptedExtension_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unacceptedExtension")(x.asInstanceOf[js.Any])
      
      @JSImport("jsrsasign", "KJUR.asn1.tsp.PKIFailureInfo.valueList.unacceptedPolicy")
      @js.native
      def unacceptedPolicy: Double = js.native
      @scala.inline
      def unacceptedPolicy_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unacceptedPolicy")(x.asInstanceOf[js.Any])
    }
  }
  
  /**
    * class for TSP PKIFreeText ASN.1 object
    * @param params associative array of parameters
    * @description
    * ```
    * PKIFreeText ::= SEQUENCE {
    *    SIZE (1..MAX) OF UTF8String }
    * ```
    */
  @JSImport("jsrsasign", "KJUR.asn1.tsp.PKIFreeText")
  @js.native
  class PKIFreeText ()
    extends typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object {
    def this(params: ArrayParam[String]) = this()
  }
  
  /**
    * class for TSP PKIStatus ASN.1 object
    * @param params associative array of parameters
    * @description
    * ```
    * PKIStatus ::= INTEGER {
    *    granted                (0),
    *    grantedWithMods        (1),
    *    rejection              (2),
    *    waiting                (3),
    *    revocationWarning      (4),
    *    revocationNotification (5) }
    * ```
    */
  @JSImport("jsrsasign", "KJUR.asn1.tsp.PKIStatus")
  @js.native
  class PKIStatus ()
    extends typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object {
    def this(params: NameParam) = this()
  }
  object PKIStatus {
    
    /* static member */
    object valueList {
      
      @JSImport("jsrsasign", "KJUR.asn1.tsp.PKIStatus.valueList")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("jsrsasign", "KJUR.asn1.tsp.PKIStatus.valueList.granted")
      @js.native
      def granted: Double = js.native
      
      @JSImport("jsrsasign", "KJUR.asn1.tsp.PKIStatus.valueList.grantedWithMods")
      @js.native
      def grantedWithMods: Double = js.native
      @scala.inline
      def grantedWithMods_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grantedWithMods")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def granted_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("granted")(x.asInstanceOf[js.Any])
      
      @JSImport("jsrsasign", "KJUR.asn1.tsp.PKIStatus.valueList.rejection")
      @js.native
      def rejection: Double = js.native
      @scala.inline
      def rejection_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rejection")(x.asInstanceOf[js.Any])
      
      @JSImport("jsrsasign", "KJUR.asn1.tsp.PKIStatus.valueList.revocationNotification")
      @js.native
      def revocationNotification: Double = js.native
      @scala.inline
      def revocationNotification_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("revocationNotification")(x.asInstanceOf[js.Any])
      
      @JSImport("jsrsasign", "KJUR.asn1.tsp.PKIStatus.valueList.revocationWarning")
      @js.native
      def revocationWarning: Double = js.native
      @scala.inline
      def revocationWarning_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("revocationWarning")(x.asInstanceOf[js.Any])
      
      @JSImport("jsrsasign", "KJUR.asn1.tsp.PKIStatus.valueList.waiting")
      @js.native
      def waiting: Double = js.native
      @scala.inline
      def waiting_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("waiting")(x.asInstanceOf[js.Any])
    }
  }
  
  /**
    * class for TSP PKIStatusInfo ASN.1 object
    * @param params associative array of parameters
    * @description
    * ```
    * PKIStatusInfo ::= SEQUENCE {
    *    status                  PKIStatus,
    *    statusString            PKIFreeText     OPTIONAL,
    *    failInfo                PKIFailureInfo  OPTIONAL  }
    * ```
    */
  @JSImport("jsrsasign", "KJUR.asn1.tsp.PKIStatusInfo")
  @js.native
  class PKIStatusInfo ()
    extends typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object {
    def this(params: Failinfo) = this()
  }
  
  /**
    * class for simple TimeStampToken generator
    * @param params associative array of parameters
    * @description
    */
  @JSImport("jsrsasign", "KJUR.asn1.tsp.SimpleTSAAdapter")
  @js.native
  class SimpleTSAAdapter ()
    extends typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.tsp.SimpleTSAAdapter {
    def this(initParams: SigAlg) = this()
  }
  
  object TSPUtil {
    
    /**
      * generate TimeStampToken ASN.1 object specified by JSON parameters
      * @param param JSON parameter to generate TimeStampToken
      * @return object just generated
      * @description
      * @example
      */
    @JSImport("jsrsasign", "KJUR.asn1.tsp.TSPUtil.newTimeStampToken")
    @js.native
    def newTimeStampToken(): SignedData = js.native
    @JSImport("jsrsasign", "KJUR.asn1.tsp.TSPUtil.newTimeStampToken")
    @js.native
    def newTimeStampToken(param: SignerCert): SignedData = js.native
  }
  
  /**
    * class for TSP TSTInfo ASN.1 object
    * @param params associative array of parameters
    * @description
    * ```
    * TSTInfo ::= SEQUENCE  {
    *    version         INTEGER  { v1(1) },
    *    policy          TSAPolicyId,
    *    messageImprint  MessageImprint,
    *    serialNumber    INTEGER, -- up to 160bit
    *    genTime         GeneralizedTime,
    *    accuracy        Accuracy                 OPTIONAL,
    *    ordering        BOOLEAN                  DEFAULT FALSE,
    *    nonce           INTEGER                  OPTIONAL,
    *    tsa             [0] GeneralName          OPTIONAL,
    *    extensions      [1] IMPLICIT Extensions  OPTIONAL   }
    * ```
    * @example
    * o = new KJUR.asn1.tsp.TSTInfo({
    *     policy:    '1.2.3.4.5',
    *     messageImprint: {hashAlg: 'sha256', hashMsgHex: '1abc...'},
    *     genTime:   {withMillis: true},     // OPTION
    *     accuracy:  {micros: 500},          // OPTION
    *     ordering:  true,                   // OPTION
    *     nonce:     {hex: '52fab1...'},     // OPTION
    *     tsa:       {str: '/C=US/O=TSA1'}   // OPTION
    * });
    */
  @JSImport("jsrsasign", "KJUR.asn1.tsp.TSTInfo")
  @js.native
  class TSTInfo protected ()
    extends typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.tsp.TSTInfo {
    def this(params: typingsSlinky.jsrsasign.anon.Accuracy) = this()
  }
  
  /**
    * class for TSP TimeStampReq ASN.1 object
    * @param params associative array of parameters
    * @description
    * ```
    * TimeStampReq ::= SEQUENCE  {
    *    version          INTEGER  { v1(1) },
    *    messageImprint   MessageImprint,
    *    reqPolicy        TSAPolicyId               OPTIONAL,
    *    nonce            INTEGER                   OPTIONAL,
    *    certReq          BOOLEAN                   DEFAULT FALSE,
    *    extensions       [0] IMPLICIT Extensions   OPTIONAL  }
    * ```
    */
  @JSImport("jsrsasign", "KJUR.asn1.tsp.TimeStampReq")
  @js.native
  class TimeStampReq ()
    extends typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.tsp.TimeStampReq {
    def this(params: Mi) = this()
  }
  
  /**
    * class for TSP TimeStampResp ASN.1 object
    * @param params associative array of parameters
    * @description
    * ```
    * TimeStampResp ::= SEQUENCE  {
    *    status                  PKIStatusInfo,
    *    timeStampToken          TimeStampToken     OPTIONAL  }
    * ```
    */
  @JSImport("jsrsasign", "KJUR.asn1.tsp.TimeStampResp")
  @js.native
  class TimeStampResp ()
    extends typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object {
    def this(params: Status) = this()
  }
  
  /**
    * parse hexadecimal string of MessageImprint
    * @param hexadecimal string of MessageImprint
    * @return JSON object of parsed parameters
    * @description
    * This method parses a hexadecimal string of MessageImprint
    * and returns parsed their fields:
    * @example
    * var json = KJUR.asn1.tsp.TSPUtil.parseMessageImprint("302602...");
    * // resulted DUMP of above 'json':
    * {hashAlg: 'sha256',          // MessageImprint hashAlg
    *  hashValue: 'a1a2a3a4...'}   // MessageImprint hashValue
    */
  @JSImport("jsrsasign", "KJUR.asn1.tsp.parseMessageImprint")
  @js.native
  def parseMessageImprint(miHex: String): typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.tsp.MessageImprint = js.native
  
  /**
    * parse hexadecimal string of TimeStampReq
    * @param hexadecimal string of TimeStampReq
    * @return JSON object of parsed parameters
    * @description
    * This method parses a hexadecimal string of TimeStampReq
    * and returns parsed their fields:
    * @example
    * var json = KJUR.asn1.tsp.TSPUtil.parseTimeStampReq("302602...");
    * // resulted DUMP of above 'json':
    * {mi: {hashAlg: 'sha256',          // MessageImprint hashAlg
    *       hashValue: 'a1a2a3a4...'},  // MessageImprint hashValue
    *  policy: '1.2.3.4.5',             // tsaPolicy (OPTION)
    *  nonce: '9abcf318...',            // nonce (OPTION)
    *  certreq: true}                   // certReq (OPTION)
    */
  @JSImport("jsrsasign", "KJUR.asn1.tsp.parseTimeStampReq")
  @js.native
  def parseTimeStampReq(reqHex: String): Certreq = js.native
}
