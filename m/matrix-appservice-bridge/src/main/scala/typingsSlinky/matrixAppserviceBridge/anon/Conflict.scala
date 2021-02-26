package typingsSlinky.matrixAppserviceBridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Conflict extends StObject {
  
  var conflict: js.Array[js.RegExp] = js.native
  
  var exempt: js.Array[js.RegExp] = js.native
}
object Conflict {
  
  @scala.inline
  def apply(conflict: js.Array[js.RegExp], exempt: js.Array[js.RegExp]): Conflict = {
    val __obj = js.Dynamic.literal(conflict = conflict.asInstanceOf[js.Any], exempt = exempt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conflict]
  }
  
  @scala.inline
  implicit class ConflictMutableBuilder[Self <: Conflict] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConflict(value: js.Array[js.RegExp]): Self = StObject.set(x, "conflict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConflictVarargs(value: js.RegExp*): Self = StObject.set(x, "conflict", js.Array(value :_*))
    
    @scala.inline
    def setExempt(value: js.Array[js.RegExp]): Self = StObject.set(x, "exempt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExemptVarargs(value: js.RegExp*): Self = StObject.set(x, "exempt", js.Array(value :_*))
  }
}
