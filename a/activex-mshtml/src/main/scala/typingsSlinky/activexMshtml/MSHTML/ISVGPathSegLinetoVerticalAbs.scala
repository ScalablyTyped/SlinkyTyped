package typingsSlinky.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISVGPathSegLinetoVerticalAbs extends StObject {
  
  @JSName("MSHTML.ISVGPathSegLinetoVerticalAbs_typekey")
  var MSHTMLDotISVGPathSegLinetoVerticalAbs_typekey: ISVGPathSegLinetoVerticalAbs = js.native
  
  var y: Double = js.native
}
object ISVGPathSegLinetoVerticalAbs {
  
  @scala.inline
  def apply(MSHTMLDotISVGPathSegLinetoVerticalAbs_typekey: ISVGPathSegLinetoVerticalAbs, y: Double): ISVGPathSegLinetoVerticalAbs = {
    val __obj = js.Dynamic.literal(y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegLinetoVerticalAbs_typekey")(MSHTMLDotISVGPathSegLinetoVerticalAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegLinetoVerticalAbs]
  }
  
  @scala.inline
  implicit class ISVGPathSegLinetoVerticalAbsMutableBuilder[Self <: ISVGPathSegLinetoVerticalAbs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSHTMLDotISVGPathSegLinetoVerticalAbs_typekey(value: ISVGPathSegLinetoVerticalAbs): Self = StObject.set(x, "MSHTML.ISVGPathSegLinetoVerticalAbs_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
