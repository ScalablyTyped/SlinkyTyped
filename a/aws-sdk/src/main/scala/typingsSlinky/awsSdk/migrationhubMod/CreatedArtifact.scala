package typingsSlinky.awsSdk.migrationhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatedArtifact extends StObject {
  
  /**
    * A description that can be free-form text to record additional detail about the artifact for clarity or for later reference.
    */
  var Description: js.UndefOr[CreatedArtifactDescription] = js.native
  
  /**
    * An ARN that uniquely identifies the result of a migration task.
    */
  var Name: CreatedArtifactName = js.native
}
object CreatedArtifact {
  
  @scala.inline
  def apply(Name: CreatedArtifactName): CreatedArtifact = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatedArtifact]
  }
  
  @scala.inline
  implicit class CreatedArtifactMutableBuilder[Self <: CreatedArtifact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: CreatedArtifactDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setName(value: CreatedArtifactName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
