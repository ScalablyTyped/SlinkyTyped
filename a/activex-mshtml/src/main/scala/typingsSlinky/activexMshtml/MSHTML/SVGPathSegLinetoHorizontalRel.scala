package typingsSlinky.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGPathSegLinetoHorizontalRel extends StObject {
  
  @JSName("MSHTML.SVGPathSegLinetoHorizontalRel_typekey")
  var MSHTMLDotSVGPathSegLinetoHorizontalRel_typekey: SVGPathSegLinetoHorizontalRel = js.native
  
  var pathSegType: Double = js.native
  
  val pathSegTypeAsLetter: String = js.native
  
  var x: Double = js.native
}
object SVGPathSegLinetoHorizontalRel {
  
  @scala.inline
  def apply(
    MSHTMLDotSVGPathSegLinetoHorizontalRel_typekey: SVGPathSegLinetoHorizontalRel,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    x: Double
  ): SVGPathSegLinetoHorizontalRel = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegLinetoHorizontalRel_typekey")(MSHTMLDotSVGPathSegLinetoHorizontalRel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegLinetoHorizontalRel]
  }
  
  @scala.inline
  implicit class SVGPathSegLinetoHorizontalRelMutableBuilder[Self <: SVGPathSegLinetoHorizontalRel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSHTMLDotSVGPathSegLinetoHorizontalRel_typekey(value: SVGPathSegLinetoHorizontalRel): Self = StObject.set(x, "MSHTML.SVGPathSegLinetoHorizontalRel_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathSegType(value: Double): Self = StObject.set(x, "pathSegType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathSegTypeAsLetter(value: String): Self = StObject.set(x, "pathSegTypeAsLetter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
  }
}
