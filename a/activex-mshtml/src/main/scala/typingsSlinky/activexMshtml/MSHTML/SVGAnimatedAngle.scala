package typingsSlinky.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGAnimatedAngle extends StObject {
  
  @JSName("MSHTML.SVGAnimatedAngle_typekey")
  var MSHTMLDotSVGAnimatedAngle_typekey: SVGAnimatedAngle = js.native
  
  var animVal: SVGAngle = js.native
  
  var baseVal: SVGAngle = js.native
}
object SVGAnimatedAngle {
  
  @scala.inline
  def apply(MSHTMLDotSVGAnimatedAngle_typekey: SVGAnimatedAngle, animVal: SVGAngle, baseVal: SVGAngle): SVGAnimatedAngle = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGAnimatedAngle_typekey")(MSHTMLDotSVGAnimatedAngle_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedAngle]
  }
  
  @scala.inline
  implicit class SVGAnimatedAngleMutableBuilder[Self <: SVGAnimatedAngle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimVal(value: SVGAngle): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseVal(value: SVGAngle): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotSVGAnimatedAngle_typekey(value: SVGAnimatedAngle): Self = StObject.set(x, "MSHTML.SVGAnimatedAngle_typekey", value.asInstanceOf[js.Any])
  }
}
