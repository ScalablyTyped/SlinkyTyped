package typingsSlinky.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait COMPLETIONSTATUSKHR extends StObject {
  
  var COMPLETION_STATUS_KHR: Double = js.native
}
object COMPLETIONSTATUSKHR {
  
  @scala.inline
  def apply(COMPLETION_STATUS_KHR: Double): COMPLETIONSTATUSKHR = {
    val __obj = js.Dynamic.literal(COMPLETION_STATUS_KHR = COMPLETION_STATUS_KHR.asInstanceOf[js.Any])
    __obj.asInstanceOf[COMPLETIONSTATUSKHR]
  }
  
  @scala.inline
  implicit class COMPLETIONSTATUSKHRMutableBuilder[Self <: COMPLETIONSTATUSKHR] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCOMPLETION_STATUS_KHR(value: Double): Self = StObject.set(x, "COMPLETION_STATUS_KHR", value.asInstanceOf[js.Any])
  }
}
