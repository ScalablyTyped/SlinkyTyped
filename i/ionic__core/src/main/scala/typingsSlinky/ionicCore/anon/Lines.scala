package typingsSlinky.ionicCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Lines extends StObject {
  
  var dur: Double = js.native
  
  def fn(dur: Double, index: Double, total: Double): Y1 = js.native
  
  var lines: Double = js.native
}
object Lines {
  
  @scala.inline
  def apply(dur: Double, fn: (Double, Double, Double) => Y1, lines: Double): Lines = {
    val __obj = js.Dynamic.literal(dur = dur.asInstanceOf[js.Any], fn = js.Any.fromFunction3(fn), lines = lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lines]
  }
  
  @scala.inline
  implicit class LinesMutableBuilder[Self <: Lines] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDur(value: Double): Self = StObject.set(x, "dur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFn(value: (Double, Double, Double) => Y1): Self = StObject.set(x, "fn", js.Any.fromFunction3(value))
    
    @scala.inline
    def setLines(value: Double): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
  }
}
