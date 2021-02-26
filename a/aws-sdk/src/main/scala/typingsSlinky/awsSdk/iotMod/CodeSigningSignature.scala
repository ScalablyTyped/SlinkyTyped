package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeSigningSignature extends StObject {
  
  /**
    * A base64 encoded binary representation of the code signing signature.
    */
  var inlineDocument: js.UndefOr[Signature] = js.native
}
object CodeSigningSignature {
  
  @scala.inline
  def apply(): CodeSigningSignature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeSigningSignature]
  }
  
  @scala.inline
  implicit class CodeSigningSignatureMutableBuilder[Self <: CodeSigningSignature] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInlineDocument(value: Signature): Self = StObject.set(x, "inlineDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineDocumentUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "inlineDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineDocumentUndefined: Self = StObject.set(x, "inlineDocument", js.undefined)
  }
}
