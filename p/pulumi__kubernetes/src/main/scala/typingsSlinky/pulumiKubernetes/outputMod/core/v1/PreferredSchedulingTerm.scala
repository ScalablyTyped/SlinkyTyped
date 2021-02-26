package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An empty preferred scheduling term matches all objects with implicit weight 0 (i.e. it's a no-op). A null preferred scheduling term matches no objects (i.e. is also a no-op).
  */
@js.native
trait PreferredSchedulingTerm extends StObject {
  
  /**
    * A node selector term, associated with the corresponding weight.
    */
  var preference: NodeSelectorTerm = js.native
  
  /**
    * Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.
    */
  var weight: Double = js.native
}
object PreferredSchedulingTerm {
  
  @scala.inline
  def apply(preference: NodeSelectorTerm, weight: Double): PreferredSchedulingTerm = {
    val __obj = js.Dynamic.literal(preference = preference.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreferredSchedulingTerm]
  }
  
  @scala.inline
  implicit class PreferredSchedulingTermMutableBuilder[Self <: PreferredSchedulingTerm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreference(value: NodeSelectorTerm): Self = StObject.set(x, "preference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
