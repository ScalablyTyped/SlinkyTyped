package typingsSlinky.activexLibreoffice.com_.sun.star.xml.crypto

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of XML signature
  *
  * This interface represents a XML signer or verifier.
  *
  * The signer or verifier concrete a key by retrieve signature context and signature template.
  *
  * In some cases, the signer or verifier can determine and locate the contents to be signed from the signature template by dereference the URI.
  *
  * In some cases, the contents to be signed need to be clearly pointed out by the signature template.
  */
@js.native
trait XXMLSignature extends XInterface {
  
  /** Perform signature in the environment of signature template and context. */
  def generate(aTemplate: XXMLSignatureTemplate, aEnvironment: XSecurityEnvironment): XXMLSignatureTemplate = js.native
  
  /** Perform validation in the environment of signature template and context. */
  def validate(aTemplate: XXMLSignatureTemplate, aContext: XXMLSecurityContext): XXMLSignatureTemplate = js.native
}
object XXMLSignature {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    generate: (XXMLSignatureTemplate, XSecurityEnvironment) => XXMLSignatureTemplate,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    validate: (XXMLSignatureTemplate, XXMLSecurityContext) => XXMLSignatureTemplate
  ): XXMLSignature = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), generate = js.Any.fromFunction2(generate), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), validate = js.Any.fromFunction2(validate))
    __obj.asInstanceOf[XXMLSignature]
  }
  
  @scala.inline
  implicit class XXMLSignatureMutableBuilder[Self <: XXMLSignature] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGenerate(value: (XXMLSignatureTemplate, XSecurityEnvironment) => XXMLSignatureTemplate): Self = StObject.set(x, "generate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setValidate(value: (XXMLSignatureTemplate, XXMLSecurityContext) => XXMLSignatureTemplate): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
  }
}
