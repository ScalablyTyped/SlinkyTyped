package typingsSlinky.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGAnimatedRect extends StObject {
  
  @JSName("MSHTML.SVGAnimatedRect_typekey")
  var MSHTMLDotSVGAnimatedRect_typekey: SVGAnimatedRect = js.native
  
  var animVal: SVGRect = js.native
  
  var baseVal: SVGRect = js.native
}
object SVGAnimatedRect {
  
  @scala.inline
  def apply(MSHTMLDotSVGAnimatedRect_typekey: SVGAnimatedRect, animVal: SVGRect, baseVal: SVGRect): SVGAnimatedRect = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGAnimatedRect_typekey")(MSHTMLDotSVGAnimatedRect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedRect]
  }
  
  @scala.inline
  implicit class SVGAnimatedRectMutableBuilder[Self <: SVGAnimatedRect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimVal(value: SVGRect): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseVal(value: SVGRect): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotSVGAnimatedRect_typekey(value: SVGAnimatedRect): Self = StObject.set(x, "MSHTML.SVGAnimatedRect_typekey", value.asInstanceOf[js.Any])
  }
}
