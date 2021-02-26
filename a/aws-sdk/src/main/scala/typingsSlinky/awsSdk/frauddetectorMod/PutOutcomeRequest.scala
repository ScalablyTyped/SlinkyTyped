package typingsSlinky.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutOutcomeRequest extends StObject {
  
  /**
    * The outcome description.
    */
  var description: js.UndefOr[typingsSlinky.awsSdk.frauddetectorMod.description] = js.native
  
  /**
    * The name of the outcome.
    */
  var name: identifier = js.native
  
  /**
    * A collection of key and value pairs.
    */
  var tags: js.UndefOr[tagList] = js.native
}
object PutOutcomeRequest {
  
  @scala.inline
  def apply(name: identifier): PutOutcomeRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutOutcomeRequest]
  }
  
  @scala.inline
  implicit class PutOutcomeRequestMutableBuilder[Self <: PutOutcomeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: identifier): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: tagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
