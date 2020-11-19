package typingsSlinky.jsrsasign.mod.KJUR.asn1.x509

import typingsSlinky.jsrsasign.anon.Cakey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsrsasign", "KJUR.asn1.x509.X509Util")
@js.native
object X509Util extends js.Object {
  
  /**
    * issue a certificate in PEM format
    * @param param parameter to issue a certificate
    * @description
    * This method can issue a certificate by a simple
    * JSON object.
    * Signature value will be provided by signing with
    * private key using 'cakey' parameter or
    * hexa decimal signature value by 'sighex' parameter.
    *
    * NOTE: Algorithm parameter of AlgorithmIdentifier will
    * be set automatically by default. (see `KJUR.asn1.x509.AlgorithmIdentifier`)
    * from jsrsasign 7.1.1 asn1x509 1.0.20.
    *
    * @example
    * var certPEM = KJUR.asn1.x509.X509Util.newCertPEM({
    *   serial: {int: 4},
    *   sigalg: {name: 'SHA1withECDSA'},
    *   issuer: {str: '/C=US/O=a'},
    *   notbefore: {'str': '130504235959Z'},
    *   notafter: {'str': '140504235959Z'},
    *   subject: {str: '/C=US/O=b'},
    *   sbjpubkey: pubKeyObj,
    *   ext: [
    *     {basicConstraints: {cA: true, critical: true}},
    *     {keyUsage: {bin: '11'}},
    *   ],
    *   cakey: prvKeyObj
    * });
    * // -- or --
    * var certPEM = KJUR.asn1.x509.X509Util.newCertPEM({
    *   serial: {int: 4},
    *   sigalg: {name: 'SHA1withECDSA'},
    *   issuer: {str: '/C=US/O=a'},
    *   notbefore: {'str': '130504235959Z'},
    *   notafter: {'str': '140504235959Z'},
    *   subject: {str: '/C=US/O=b'},
    *   sbjpubkey: pubKeyPEM,
    *   ext: [
    *     {basicConstraints: {cA: true, critical: true}},
    *     {keyUsage: {bin: '11'}},
    *   ],
    *   cakey: [prvkey, pass]}
    * );
    * // -- or --
    * var certPEM = KJUR.asn1.x509.X509Util.newCertPEM({
    *   serial: {int: 1},
    *   sigalg: {name: 'SHA1withRSA'},
    *   issuer: {str: '/C=US/O=T1'},
    *   notbefore: {'str': '130504235959Z'},
    *   notafter: {'str': '140504235959Z'},
    *   subject: {str: '/C=US/O=T1'},
    *   sbjpubkey: pubKeyObj,
    *   sighex: '0102030405..'
    * });
    * // for the issuer and subject field, another
    * // representation is also available
    * var certPEM = KJUR.asn1.x509.X509Util.newCertPEM({
    *   serial: {int: 1},
    *   sigalg: {name: 'SHA256withRSA'},
    *   issuer: {C: "US", O: "T1"},
    *   notbefore: {'str': '130504235959Z'},
    *   notafter: {'str': '140504235959Z'},
    *   subject: {C: "US", O: "T1", CN: "http://example.com/"},
    *   sbjpubkey: pubKeyObj,
    *   sighex: '0102030405..'
    * });
    */
  def newCertPEM(): String = js.native
  def newCertPEM(param: Cakey): String = js.native
}
