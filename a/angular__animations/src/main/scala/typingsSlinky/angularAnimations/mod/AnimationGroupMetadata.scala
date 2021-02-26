package typingsSlinky.angularAnimations.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationGroupMetadata extends AnimationMetadata {
  
  /**
    * An options object containing a delay and
    * developer-defined parameters that provide styling defaults and
    * can be overridden on invocation. Default delay is 0.
    */
  var options: AnimationOptions | Null = js.native
  
  /**
    * One or more animation or style steps that form this group.
    */
  var steps: js.Array[AnimationMetadata] = js.native
}
object AnimationGroupMetadata {
  
  @scala.inline
  def apply(steps: js.Array[AnimationMetadata], `type`: AnimationMetadataType): AnimationGroupMetadata = {
    val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationGroupMetadata]
  }
  
  @scala.inline
  implicit class AnimationGroupMetadataMutableBuilder[Self <: AnimationGroupMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: AnimationOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsNull: Self = StObject.set(x, "options", null)
    
    @scala.inline
    def setSteps(value: js.Array[AnimationMetadata]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsVarargs(value: AnimationMetadata*): Self = StObject.set(x, "steps", js.Array(value :_*))
  }
}
