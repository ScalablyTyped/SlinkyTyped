package typingsSlinky.activexLibreoffice.com_.sun.star.animations

import typingsSlinky.activexLibreoffice.com_.sun.star.beans.NamedValue
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Properties of an animated target.
  *
  * This struct collects all global attributes that apply to an animation target. An animation target is anything that is referenced from a given {@link
  * XAnimationNode} tree as a target object.
  */
@js.native
trait TargetProperties extends StObject {
  
  var Properties: SafeArray[NamedValue] = js.native
  
  var Target: js.Any = js.native
}
object TargetProperties {
  
  @scala.inline
  def apply(Properties: SafeArray[NamedValue], Target: js.Any): TargetProperties = {
    val __obj = js.Dynamic.literal(Properties = Properties.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetProperties]
  }
  
  @scala.inline
  implicit class TargetPropertiesMutableBuilder[Self <: TargetProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperties(value: SafeArray[NamedValue]): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: js.Any): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
  }
}
