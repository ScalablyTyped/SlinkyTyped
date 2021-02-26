package typingsSlinky.chromeApps.chrome

import org.scalajs.dom.crypto.KeyAlgorithm
import typingsSlinky.chromeApps.anon.ECDSASIGN
import typingsSlinky.chromeApps.chromeAppsStrings.ECDSA_SIGN
import typingsSlinky.chromeApps.chromeAppsStrings.RSA_SIGN
import typingsSlinky.chromeApps.chromeAppsStrings.ecdsaSign
import typingsSlinky.chromeApps.chromeAppsStrings.rsaSign
import typingsSlinky.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.platformKeys
///////////////////
// Platform Keys //
///////////////////
/**
  * @requires(CrOS) Only for Chrome OS.
  * @requires Permissions: 'platformKeys'
  * @description
  * Use the *chrome.platformKeys* API to access client certificates
  * managed by the platform. If the user or policy grants the permission, an
  * app can use such a certficate in its custom authentication protocol.
  * E.g. this allows usage of platform managed certificates in third party VPNs
  * @see chrome.vpnProvider
  */
object platformKeys {
  
  /**
    * Analogous to TLS1.1's CertificateRequest.
    * @see{@link http://tools.ietf.org/html/rfc4346#section-7.4.4}
    */
  @js.native
  trait ClientCertificateRequest extends StObject {
    
    /**
      * List of distinguished names of certificate authorities allowed by the
      * server. Each entry must be a DER-encoded X.509 DistinguishedName.
      */
    var certificateAuthorities: js.Array[js.typedarray.ArrayBuffer] = js.native
    
    /**
      * This field is a list of the types of certificates requested, sorted in
      * order of the server's preference. Only certificates of a type contained
      * in this list will be retrieved. If *certificateTypes* is the
      * empty list, however, certificates of any type will be returned.
      * @see ClientCertificateType
      */
    var certificateTypes: js.Array[
        ToStringLiteral[
          ECDSASIGN, 
          /* keyof chrome-apps.anon.ECDSASIGN */ RSA_SIGN | ECDSA_SIGN, 
          Exclude[/* keyof chrome-apps.anon.ECDSASIGN */ RSA_SIGN | ECDSA_SIGN, rsaSign | ecdsaSign]
        ]
      ] = js.native
  }
  object ClientCertificateRequest {
    
    @scala.inline
    def apply(
      certificateAuthorities: js.Array[js.typedarray.ArrayBuffer],
      certificateTypes: js.Array[
          ToStringLiteral[
            ECDSASIGN, 
            /* keyof chrome-apps.anon.ECDSASIGN */ RSA_SIGN | ECDSA_SIGN, 
            Exclude[/* keyof chrome-apps.anon.ECDSASIGN */ RSA_SIGN | ECDSA_SIGN, rsaSign | ecdsaSign]
          ]
        ]
    ): ClientCertificateRequest = {
      val __obj = js.Dynamic.literal(certificateAuthorities = certificateAuthorities.asInstanceOf[js.Any], certificateTypes = certificateTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientCertificateRequest]
    }
    
    @scala.inline
    implicit class ClientCertificateRequestMutableBuilder[Self <: ClientCertificateRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCertificateAuthorities(value: js.Array[js.typedarray.ArrayBuffer]): Self = StObject.set(x, "certificateAuthorities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateAuthoritiesVarargs(value: js.typedarray.ArrayBuffer*): Self = StObject.set(x, "certificateAuthorities", js.Array(value :_*))
      
      @scala.inline
      def setCertificateTypes(
        value: js.Array[
              ToStringLiteral[
                ECDSASIGN, 
                /* keyof chrome-apps.anon.ECDSASIGN */ RSA_SIGN | ECDSA_SIGN, 
                Exclude[/* keyof chrome-apps.anon.ECDSASIGN */ RSA_SIGN | ECDSA_SIGN, rsaSign | ecdsaSign]
              ]
            ]
      ): Self = StObject.set(x, "certificateTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateTypesVarargs(
        value: (ToStringLiteral[
              ECDSASIGN, 
              /* keyof chrome-apps.anon.ECDSASIGN */ RSA_SIGN | ECDSA_SIGN, 
              Exclude[/* keyof chrome-apps.anon.ECDSASIGN */ RSA_SIGN | ECDSA_SIGN, rsaSign | ecdsaSign]
            ])*
      ): Self = StObject.set(x, "certificateTypes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Match extends StObject {
    
    /** The DER encoding of a X.509 certificate. */
    var certificate: js.typedarray.ArrayBuffer = js.native
    
    /**
      * @see[KeyAlgorithm]{@link http://www.w3.org/TR/WebCryptoAPI/#key-algorithm-interface}
      * @description
      * The KeyAlgorithm of the certified key. This contains algorithm
      * parameters that are inherent to the key of the certificate (e.g. the key
      * length). Other parameters like the hash function used by the sign
      * function are not included. */
    var keyAlgorithm: KeyAlgorithm = js.native
  }
  object Match {
    
    @scala.inline
    def apply(certificate: js.typedarray.ArrayBuffer, keyAlgorithm: KeyAlgorithm): Match = {
      val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], keyAlgorithm = keyAlgorithm.asInstanceOf[js.Any])
      __obj.asInstanceOf[Match]
    }
    
    @scala.inline
    implicit class MatchMutableBuilder[Self <: Match] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCertificate(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyAlgorithm(value: KeyAlgorithm): Self = StObject.set(x, "keyAlgorithm", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SelectDetails extends StObject {
    
    /**
      * If given, the *selectClientCertificates* operates on this
      * list. Otherwise, obtains the list of all certificates from the platform's
      * certificate stores that are available to this extensions.
      * Entries that the extension doesn't have permission for or which doesn't
      * match the request, are removed.
      */
    var clientCerts: js.UndefOr[js.Array[js.typedarray.ArrayBuffer]] = js.native
    
    /** If true, the filtered list is presented to the user to manually select a
      * certificate and thereby granting the extension access to the
      * certificate(s) and key(s).Only the selected certificate(s) will be
      * returned. If is false, the list is reduced to all certificates that the
      * extension has been granted access to (automatically or manually). */
    var interactive: Boolean = js.native
    
    /** Only certificates that match this request will be returned. */
    var request: ClientCertificateRequest = js.native
  }
  object SelectDetails {
    
    @scala.inline
    def apply(interactive: Boolean, request: ClientCertificateRequest): SelectDetails = {
      val __obj = js.Dynamic.literal(interactive = interactive.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectDetails]
    }
    
    @scala.inline
    implicit class SelectDetailsMutableBuilder[Self <: SelectDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientCerts(value: js.Array[js.typedarray.ArrayBuffer]): Self = StObject.set(x, "clientCerts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientCertsUndefined: Self = StObject.set(x, "clientCerts", js.undefined)
      
      @scala.inline
      def setClientCertsVarargs(value: js.typedarray.ArrayBuffer*): Self = StObject.set(x, "clientCerts", js.Array(value :_*))
      
      @scala.inline
      def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: ClientCertificateRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VerificationDetails extends StObject {
    
    // The hostname of the server to verify the certificate for, e.g. the server
    // that presented the *serverCertificateChain*.
    var hostname: String = js.native
    
    // Each chain entry must be the DER encoding of a X.509 certificate, the
    // first entry must be the server certificate and each entry must certify
    // the entry preceding it.
    var serverCertificateChain: js.Array[js.typedarray.ArrayBuffer] = js.native
  }
  object VerificationDetails {
    
    @scala.inline
    def apply(hostname: String, serverCertificateChain: js.Array[js.typedarray.ArrayBuffer]): VerificationDetails = {
      val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], serverCertificateChain = serverCertificateChain.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerificationDetails]
    }
    
    @scala.inline
    implicit class VerificationDetailsMutableBuilder[Self <: VerificationDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerCertificateChain(value: js.Array[js.typedarray.ArrayBuffer]): Self = StObject.set(x, "serverCertificateChain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerCertificateChainVarargs(value: js.typedarray.ArrayBuffer*): Self = StObject.set(x, "serverCertificateChain", js.Array(value :_*))
    }
  }
  
  @js.native
  trait VerificationResult extends StObject {
    
    /**
      * If the trust verification failed, this array contains the errors reported
      * by the underlying network layer. Otherwise, this array is empty.
      * **Note:** This list is meant for debugging only and may not
      * contain all relevant errors. The errors returned may change in future
      * revisions of this API, and are not guaranteed to be forwards or backwards
      * compatible.
      */
    var debug_errors: js.Array[String] = js.native
    
    /**
      * The result of the trust verification: true if trust for the given
      * verification details could be established and false if trust is rejected
      * for any reason*
      */
    var trusted: Boolean = js.native
  }
  object VerificationResult {
    
    @scala.inline
    def apply(debug_errors: js.Array[String], trusted: Boolean): VerificationResult = {
      val __obj = js.Dynamic.literal(debug_errors = debug_errors.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerificationResult]
    }
    
    @scala.inline
    implicit class VerificationResultMutableBuilder[Self <: VerificationResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug_errors(value: js.Array[String]): Self = StObject.set(x, "debug_errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebug_errorsVarargs(value: String*): Self = StObject.set(x, "debug_errors", js.Array(value :_*))
      
      @scala.inline
      def setTrusted(value: Boolean): Self = StObject.set(x, "trusted", value.asInstanceOf[js.Any])
    }
  }
}
