package typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.cms

import typingsSlinky.jsrsasign.anon.E
import typingsSlinky.jsrsasign.anon.EciObj
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import typingsSlinky.jsrsasign.jsrsasign.KJUR.crypto.DSA
import typingsSlinky.jsrsasign.jsrsasign.KJUR.crypto.ECDSA
import typingsSlinky.jsrsasign.jsrsasign.KJUR.jws.JWS.JsonWebKey
import typingsSlinky.jsrsasign.jsrsasign.RSAKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * class for SignerInfo ASN.1 structure of CMS SignedData
  * @param params associative array of parameters
  * @description
  * ```
  * SignerInfo ::= SEQUENCE {
  *    version CMSVersion,
  *    sid SignerIdentifier,
  *    digestAlgorithm DigestAlgorithmIdentifier,
  *    signedAttrs [0] IMPLICIT SignedAttributes OPTIONAL,
  *    signatureAlgorithm SignatureAlgorithmIdentifier,
  *    signature SignatureValue,
  *    unsignedAttrs [1] IMPLICIT UnsignedAttributes OPTIONAL }
  * ```
  * @example
  * o = new KJUR.asn1.cms.SignerInfo();
  * o.setSignerIdentifier(certPEMstring);
  * o.dSignedAttrs.add(new KJUR.asn1.cms.ContentType({name: 'data'}));
  * o.dSignedAttrs.add(new KJUR.asn1.cms.MessageDigest({hex: 'a1b2...'}));
  * o.dSignedAttrs.add(new KJUR.asn1.cms.SigningTime());
  * o.sign(privteKeyParam, "SHA1withRSA");
  */
@js.native
trait SignerInfo extends ASN1Object {
  
  def addUnsigned(attr: Attribute): Unit = js.native
  
  /**
    * set ContentType/MessageDigest/DigestAlgorithms for SignerInfo/SignedData
    * @param params JSON parameter to set content related field
    * @description
    * This method will specify following fields by a parameters:
    *
    * - add ContentType signed attribute by encapContentInfo
    * - add MessageDigest signed attribute by encapContentInfo and hashAlg
    * - add a hash algorithm used in MessageDigest to digestAlgorithms field of SignedData
    * - set a hash algorithm used in MessageDigest to digestAlgorithm field of SignerInfo
    *
    * Argument 'params' is an associative array having following elements:
    *
    * - eciObj - `KJUR.asn1.cms.EncapsulatedContentInfo` object
    * - sdObj - `KJUR.asn1.cms.SignedData` object (Option) to set DigestAlgorithms
    * - hashAlg - string of hash algorithm name which is used for MessageDigest attribute
    *
    * some of elements can be omited.
    * @example
    * sd = new KJUR.asn1.cms.SignedData();
    * signerInfo.setForContentAndHash({sdObj: sd,
    *                                  eciObj: sd.dEncapContentInfo,
    *                                  hashAlg: 'sha256'});
    */
  def setForContentAndHash(params: EciObj): Unit = js.native
  
  def setSignerIdentifier(params: String): Unit = js.native
  
  def sign(keyParam: String, sigAlg: String): Unit = js.native
  def sign(keyParam: E, sigAlg: String): Unit = js.native
  def sign(keyParam: DSA, sigAlg: String): Unit = js.native
  def sign(keyParam: ECDSA, sigAlg: String): Unit = js.native
  def sign(keyParam: JsonWebKey, sigAlg: String): Unit = js.native
  def sign(keyParam: RSAKey, sigAlg: String): Unit = js.native
}
