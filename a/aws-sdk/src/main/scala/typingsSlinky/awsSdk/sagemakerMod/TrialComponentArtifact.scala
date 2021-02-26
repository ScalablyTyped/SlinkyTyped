package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrialComponentArtifact extends StObject {
  
  /**
    * The media type of the artifact, which indicates the type of data in the artifact file. The media type consists of a type and a subtype concatenated with a slash (/) character, for example, text/csv, image/jpeg, and s3/uri. The type specifies the category of the media. The subtype specifies the kind of data.
    */
  var MediaType: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.MediaType] = js.native
  
  /**
    * The location of the artifact.
    */
  var Value: TrialComponentArtifactValue = js.native
}
object TrialComponentArtifact {
  
  @scala.inline
  def apply(Value: TrialComponentArtifactValue): TrialComponentArtifact = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrialComponentArtifact]
  }
  
  @scala.inline
  implicit class TrialComponentArtifactMutableBuilder[Self <: TrialComponentArtifact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaType(value: MediaType): Self = StObject.set(x, "MediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaTypeUndefined: Self = StObject.set(x, "MediaType", js.undefined)
    
    @scala.inline
    def setValue(value: TrialComponentArtifactValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
