package typingsSlinky.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGPathSegMovetoAbs extends StObject {
  
  @JSName("MSHTML.SVGPathSegMovetoAbs_typekey")
  var MSHTMLDotSVGPathSegMovetoAbs_typekey: SVGPathSegMovetoAbs = js.native
  
  var pathSegType: Double = js.native
  
  val pathSegTypeAsLetter: String = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object SVGPathSegMovetoAbs {
  
  @scala.inline
  def apply(
    MSHTMLDotSVGPathSegMovetoAbs_typekey: SVGPathSegMovetoAbs,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    x: Double,
    y: Double
  ): SVGPathSegMovetoAbs = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegMovetoAbs_typekey")(MSHTMLDotSVGPathSegMovetoAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegMovetoAbs]
  }
  
  @scala.inline
  implicit class SVGPathSegMovetoAbsMutableBuilder[Self <: SVGPathSegMovetoAbs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSHTMLDotSVGPathSegMovetoAbs_typekey(value: SVGPathSegMovetoAbs): Self = StObject.set(x, "MSHTML.SVGPathSegMovetoAbs_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathSegType(value: Double): Self = StObject.set(x, "pathSegType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathSegTypeAsLetter(value: String): Self = StObject.set(x, "pathSegTypeAsLetter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
