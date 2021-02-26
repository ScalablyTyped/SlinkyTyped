package typingsSlinky.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object certificateChainValidationEngineMod {
  
  @JSImport("pkijs/src/CertificateChainValidationEngine", JSImport.Default)
  @js.native
  /**
    * Constructor for CertificateChainValidationEngine class
    * @param {*} [parameters={}]
    * @property {any} [schema] asn1js parsed value
    */
  class default () extends CertificateChainValidationEngine {
    def this(parameters: js.Any) = this()
  }
  
  @js.native
  trait CertificateChainValidationEngine extends StObject {
    
    var certs: js.Array[typingsSlinky.pkijs.certificateMod.default] = js.native
    
    var checkDate: js.Date = js.native
    
    var crls: js.Array[typingsSlinky.pkijs.certificateRevocationListMod.default] = js.native
    
    var ocsp: typingsSlinky.pkijs.ocspresponseMod.default = js.native
    
    def sort(): js.Any = js.native
    
    var trustedCerts: js.Array[typingsSlinky.pkijs.certificateMod.default] = js.native
    
    /**
      * Major verification function for certificate chain.
      * @param {{initialPolicySet, initialExplicitPolicy, initialPolicyMappingInhibit, initialInhibitPolicy, initialPermittedSubtreesSet, initialExcludedSubtreesSet, initialRequiredNameForms}} [parameters]
      * @returns {PromiseLike<any>}
      */
    def verify(): js.Thenable[_] = js.native
    def verify(parameters: js.Any): js.Thenable[_] = js.native
  }
}
