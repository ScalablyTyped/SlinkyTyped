package typingsSlinky.amapJsApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetI[I] extends StObject {
  
  var target: I = js.native
}
object TargetI {
  
  @scala.inline
  def apply[I](target: I): TargetI[I] = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetI[I]]
  }
  
  @scala.inline
  implicit class TargetIMutableBuilder[Self <: TargetI[_], I] (val x: Self with TargetI[I]) extends AnyVal {
    
    @scala.inline
    def setTarget(value: I): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
