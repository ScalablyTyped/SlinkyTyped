package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * VolumeNodeAffinity defines constraints that limit what nodes this volume can be accessed from.
  */
@js.native
trait VolumeNodeAffinity extends StObject {
  
  /**
    * Required specifies hard node constraints that must be met.
    */
  var required: NodeSelector = js.native
}
object VolumeNodeAffinity {
  
  @scala.inline
  def apply(required: NodeSelector): VolumeNodeAffinity = {
    val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeNodeAffinity]
  }
  
  @scala.inline
  implicit class VolumeNodeAffinityMutableBuilder[Self <: VolumeNodeAffinity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequired(value: NodeSelector): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
  }
}
