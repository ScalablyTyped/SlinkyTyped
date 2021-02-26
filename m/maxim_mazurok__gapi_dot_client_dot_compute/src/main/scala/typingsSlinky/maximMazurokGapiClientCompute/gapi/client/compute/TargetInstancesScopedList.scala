package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import typingsSlinky.maximMazurokGapiClientCompute.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetInstancesScopedList extends StObject {
  
  /** A list of target instances contained in this scope. */
  var targetInstances: js.UndefOr[js.Array[TargetInstance]] = js.native
  
  /** Informational warning which replaces the list of addresses when the list is empty. */
  var warning: js.UndefOr[Code] = js.native
}
object TargetInstancesScopedList {
  
  @scala.inline
  def apply(): TargetInstancesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetInstancesScopedList]
  }
  
  @scala.inline
  implicit class TargetInstancesScopedListMutableBuilder[Self <: TargetInstancesScopedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetInstances(value: js.Array[TargetInstance]): Self = StObject.set(x, "targetInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetInstancesUndefined: Self = StObject.set(x, "targetInstances", js.undefined)
    
    @scala.inline
    def setTargetInstancesVarargs(value: TargetInstance*): Self = StObject.set(x, "targetInstances", js.Array(value :_*))
    
    @scala.inline
    def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
