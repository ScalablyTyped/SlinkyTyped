package typingsSlinky.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGPathSegLinetoRel extends StObject {
  
  @JSName("MSHTML.SVGPathSegLinetoRel_typekey")
  var MSHTMLDotSVGPathSegLinetoRel_typekey: SVGPathSegLinetoRel = js.native
  
  var pathSegType: Double = js.native
  
  val pathSegTypeAsLetter: String = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object SVGPathSegLinetoRel {
  
  @scala.inline
  def apply(
    MSHTMLDotSVGPathSegLinetoRel_typekey: SVGPathSegLinetoRel,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    x: Double,
    y: Double
  ): SVGPathSegLinetoRel = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegLinetoRel_typekey")(MSHTMLDotSVGPathSegLinetoRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegLinetoRel]
  }
  
  @scala.inline
  implicit class SVGPathSegLinetoRelMutableBuilder[Self <: SVGPathSegLinetoRel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSHTMLDotSVGPathSegLinetoRel_typekey(value: SVGPathSegLinetoRel): Self = StObject.set(x, "MSHTML.SVGPathSegLinetoRel_typekey", value.asInstanceOf[js.Any])
    
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
