package typingsSlinky.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteServiceActionInput extends StObject {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  
  /**
    * The self-service action identifier. For example, act-fs7abcd89wxyz.
    */
  var Id: typingsSlinky.awsSdk.servicecatalogMod.Id = js.native
}
object DeleteServiceActionInput {
  
  @scala.inline
  def apply(Id: Id): DeleteServiceActionInput = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteServiceActionInput]
  }
  
  @scala.inline
  implicit class DeleteServiceActionInputMutableBuilder[Self <: DeleteServiceActionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    @scala.inline
    def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
