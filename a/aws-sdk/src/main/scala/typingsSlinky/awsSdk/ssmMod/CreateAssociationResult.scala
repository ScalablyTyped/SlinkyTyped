package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAssociationResult extends StObject {
  
  /**
    * Information about the association.
    */
  var AssociationDescription: js.UndefOr[typingsSlinky.awsSdk.ssmMod.AssociationDescription] = js.native
}
object CreateAssociationResult {
  
  @scala.inline
  def apply(): CreateAssociationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAssociationResult]
  }
  
  @scala.inline
  implicit class CreateAssociationResultMutableBuilder[Self <: CreateAssociationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociationDescription(value: AssociationDescription): Self = StObject.set(x, "AssociationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationDescriptionUndefined: Self = StObject.set(x, "AssociationDescription", js.undefined)
  }
}
