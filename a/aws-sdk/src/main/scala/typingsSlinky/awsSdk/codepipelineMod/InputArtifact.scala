package typingsSlinky.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputArtifact extends StObject {
  
  /**
    * The name of the artifact to be worked on (for example, "My App"). The input artifact of an action must exactly match the output artifact declared in a preceding action, but the input artifact does not have to be the next action in strict sequence from the action that provided the output artifact. Actions in parallel can declare different output artifacts, which are in turn consumed by different following actions.
    */
  var name: ArtifactName = js.native
}
object InputArtifact {
  
  @scala.inline
  def apply(name: ArtifactName): InputArtifact = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputArtifact]
  }
  
  @scala.inline
  implicit class InputArtifactMutableBuilder[Self <: InputArtifact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: ArtifactName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
