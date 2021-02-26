package typingsSlinky.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublishRecipeResponse extends StObject {
  
  /**
    * The name of the recipe that you published.
    */
  var Name: RecipeName = js.native
}
object PublishRecipeResponse {
  
  @scala.inline
  def apply(Name: RecipeName): PublishRecipeResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishRecipeResponse]
  }
  
  @scala.inline
  implicit class PublishRecipeResponseMutableBuilder[Self <: PublishRecipeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: RecipeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
