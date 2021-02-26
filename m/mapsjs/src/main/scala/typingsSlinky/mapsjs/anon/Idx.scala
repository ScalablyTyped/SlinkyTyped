package typingsSlinky.mapsjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Idx extends StObject {
  
  var idx: Double = js.native
  
  var setIdx: Double = js.native
}
object Idx {
  
  @scala.inline
  def apply(idx: Double, setIdx: Double): Idx = {
    val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], setIdx = setIdx.asInstanceOf[js.Any])
    __obj.asInstanceOf[Idx]
  }
  
  @scala.inline
  implicit class IdxMutableBuilder[Self <: Idx] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetIdx(value: Double): Self = StObject.set(x, "setIdx", value.asInstanceOf[js.Any])
  }
}
