package typingsSlinky.jsClipper.ClipperLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scanbeam extends StObject {
  
  var Y: Double = js.native
  
  var next: TEdge = js.native
}
object Scanbeam {
  
  @scala.inline
  def apply(Y: Double, next: TEdge): Scanbeam = {
    val __obj = js.Dynamic.literal(Y = Y.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scanbeam]
  }
  
  @scala.inline
  implicit class ScanbeamMutableBuilder[Self <: Scanbeam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNext(value: TEdge): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
  }
}
