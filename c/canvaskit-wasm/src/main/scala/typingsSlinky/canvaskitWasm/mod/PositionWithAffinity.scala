package typingsSlinky.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PositionWithAffinity extends StObject {
  
  var affinity: Affinity = js.native
  
  var pos: Double = js.native
}
object PositionWithAffinity {
  
  @scala.inline
  def apply(affinity: Affinity, pos: Double): PositionWithAffinity = {
    val __obj = js.Dynamic.literal(affinity = affinity.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionWithAffinity]
  }
  
  @scala.inline
  implicit class PositionWithAffinityMutableBuilder[Self <: PositionWithAffinity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAffinity(value: Affinity): Self = StObject.set(x, "affinity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
  }
}
