package typingsSlinky.expoConfigureSplashScreen.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Target extends StObject {
  
  var target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PBXNativeTarget */ js.Any = js.native
  
  var uuid: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UUID */ js.Any = js.native
}
object Target {
  
  @scala.inline
  def apply(
    target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PBXNativeTarget */ js.Any,
    uuid: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UUID */ js.Any
  ): Target = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
  
  @scala.inline
  implicit class TargetMutableBuilder[Self <: Target] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTarget(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PBXNativeTarget */ js.Any
    ): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UUID */ js.Any
    ): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
