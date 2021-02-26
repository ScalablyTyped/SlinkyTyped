package typingsSlinky.mathjax.MathJax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZoomStruct extends StObject {
  
  /*The vertical offset from the top of the span to the baseline of the mathematics*/
  var Y: Double = js.native
  
  /*The height of the original mathematics element*/
  var mH: Double = js.native
  
  /*The width of the original mathematics element*/
  var mW: Double = js.native
  
  /*The height of the zoomed math*/
  var zH: Double = js.native
  
  /*The width of the zoomed math*/
  var zW: Double = js.native
}
object ZoomStruct {
  
  @scala.inline
  def apply(Y: Double, mH: Double, mW: Double, zH: Double, zW: Double): ZoomStruct = {
    val __obj = js.Dynamic.literal(Y = Y.asInstanceOf[js.Any], mH = mH.asInstanceOf[js.Any], mW = mW.asInstanceOf[js.Any], zH = zH.asInstanceOf[js.Any], zW = zW.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomStruct]
  }
  
  @scala.inline
  implicit class ZoomStructMutableBuilder[Self <: ZoomStruct] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMH(value: Double): Self = StObject.set(x, "mH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMW(value: Double): Self = StObject.set(x, "mW", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZH(value: Double): Self = StObject.set(x, "zH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZW(value: Double): Self = StObject.set(x, "zW", value.asInstanceOf[js.Any])
  }
}
