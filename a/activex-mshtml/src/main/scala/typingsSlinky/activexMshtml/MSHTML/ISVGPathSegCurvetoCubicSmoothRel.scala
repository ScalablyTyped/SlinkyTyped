package typingsSlinky.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISVGPathSegCurvetoCubicSmoothRel extends StObject {
  
  @JSName("MSHTML.ISVGPathSegCurvetoCubicSmoothRel_typekey")
  var MSHTMLDotISVGPathSegCurvetoCubicSmoothRel_typekey: ISVGPathSegCurvetoCubicSmoothRel = js.native
  
  var x: Double = js.native
  
  var x2: Double = js.native
  
  var y: Double = js.native
  
  var y2: Double = js.native
}
object ISVGPathSegCurvetoCubicSmoothRel {
  
  @scala.inline
  def apply(
    MSHTMLDotISVGPathSegCurvetoCubicSmoothRel_typekey: ISVGPathSegCurvetoCubicSmoothRel,
    x: Double,
    x2: Double,
    y: Double,
    y2: Double
  ): ISVGPathSegCurvetoCubicSmoothRel = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegCurvetoCubicSmoothRel_typekey")(MSHTMLDotISVGPathSegCurvetoCubicSmoothRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegCurvetoCubicSmoothRel]
  }
  
  @scala.inline
  implicit class ISVGPathSegCurvetoCubicSmoothRelMutableBuilder[Self <: ISVGPathSegCurvetoCubicSmoothRel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSHTMLDotISVGPathSegCurvetoCubicSmoothRel_typekey(value: ISVGPathSegCurvetoCubicSmoothRel): Self = StObject.set(x, "MSHTML.ISVGPathSegCurvetoCubicSmoothRel_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
  }
}
