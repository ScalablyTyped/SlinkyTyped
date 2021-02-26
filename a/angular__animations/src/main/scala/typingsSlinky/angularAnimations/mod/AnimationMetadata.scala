package typingsSlinky.angularAnimations.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationMetadata extends StObject {
  
  var `type`: AnimationMetadataType = js.native
}
object AnimationMetadata {
  
  @scala.inline
  def apply(`type`: AnimationMetadataType): AnimationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationMetadata]
  }
  
  @scala.inline
  implicit class AnimationMetadataMutableBuilder[Self <: AnimationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: AnimationMetadataType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
