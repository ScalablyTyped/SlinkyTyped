package typingsSlinky.c3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Opacity extends StObject {
  
  /** Class to apply to the region. */
  var `class`: js.UndefOr[String] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  /** Points should be added in counter-clockwise direction  to close the polygon. */
  var points: js.Array[X] = js.native
  
  var text: js.UndefOr[js.Function2[/* value */ Double, /* percentage */ Double, String]] = js.native
}
object Opacity {
  
  @scala.inline
  def apply(points: js.Array[X]): Opacity = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[Opacity]
  }
  
  @scala.inline
  implicit class OpacityMutableBuilder[Self <: Opacity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setPoints(value: js.Array[X]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsVarargs(value: X*): Self = StObject.set(x, "points", js.Array(value :_*))
    
    @scala.inline
    def setText(value: (/* value */ Double, /* percentage */ Double) => String): Self = StObject.set(x, "text", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
