package typingsSlinky.flot.jquery.flot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait axis extends axisOptions {
  
  def c2p(canvasPoint: canvasPoint): point = js.native
  
  var options: axisOptions = js.native
  
  def p2c(point: point): canvasPoint = js.native
}
object axis {
  
  @scala.inline
  def apply(c2p: canvasPoint => point, options: axisOptions, p2c: point => canvasPoint): axis = {
    val __obj = js.Dynamic.literal(c2p = js.Any.fromFunction1(c2p), options = options.asInstanceOf[js.Any], p2c = js.Any.fromFunction1(p2c))
    __obj.asInstanceOf[axis]
  }
  
  @scala.inline
  implicit class axisMutableBuilder[Self <: axis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setC2p(value: canvasPoint => point): Self = StObject.set(x, "c2p", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOptions(value: axisOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP2c(value: point => canvasPoint): Self = StObject.set(x, "p2c", js.Any.fromFunction1(value))
  }
}
