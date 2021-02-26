package typingsSlinky.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuiltinSlotTypeMetadata extends StObject {
  
  /**
    * A unique identifier for the built-in slot type. To find the signature for a slot type, see Slot Type Reference in the Alexa Skills Kit.
    */
  var signature: js.UndefOr[BuiltinSlotTypeSignature] = js.native
  
  /**
    * A list of target locales for the slot. 
    */
  var supportedLocales: js.UndefOr[LocaleList] = js.native
}
object BuiltinSlotTypeMetadata {
  
  @scala.inline
  def apply(): BuiltinSlotTypeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuiltinSlotTypeMetadata]
  }
  
  @scala.inline
  implicit class BuiltinSlotTypeMetadataMutableBuilder[Self <: BuiltinSlotTypeMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSignature(value: BuiltinSlotTypeSignature): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    @scala.inline
    def setSupportedLocales(value: LocaleList): Self = StObject.set(x, "supportedLocales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedLocalesUndefined: Self = StObject.set(x, "supportedLocales", js.undefined)
    
    @scala.inline
    def setSupportedLocalesVarargs(value: Locale*): Self = StObject.set(x, "supportedLocales", js.Array(value :_*))
  }
}
