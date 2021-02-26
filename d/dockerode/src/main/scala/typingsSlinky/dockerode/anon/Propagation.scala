package typingsSlinky.dockerode.anon

import typingsSlinky.dockerode.mod.MountPropagation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Propagation extends StObject {
  
  var Propagation: MountPropagation = js.native
}
object Propagation {
  
  @scala.inline
  def apply(Propagation: MountPropagation): Propagation = {
    val __obj = js.Dynamic.literal(Propagation = Propagation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Propagation]
  }
  
  @scala.inline
  implicit class PropagationMutableBuilder[Self <: Propagation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPropagation(value: MountPropagation): Self = StObject.set(x, "Propagation", value.asInstanceOf[js.Any])
  }
}
