package typingsSlinky.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGPathSeg extends StObject {
  
  @JSName("MSHTML.SVGPathSeg_typekey")
  var MSHTMLDotSVGPathSeg_typekey: SVGPathSeg = js.native
  
  var pathSegType: Double = js.native
  
  val pathSegTypeAsLetter: String = js.native
}
object SVGPathSeg {
  
  @scala.inline
  def apply(MSHTMLDotSVGPathSeg_typekey: SVGPathSeg, pathSegType: Double, pathSegTypeAsLetter: String): SVGPathSeg = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSeg_typekey")(MSHTMLDotSVGPathSeg_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSeg]
  }
  
  @scala.inline
  implicit class SVGPathSegMutableBuilder[Self <: SVGPathSeg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSHTMLDotSVGPathSeg_typekey(value: SVGPathSeg): Self = StObject.set(x, "MSHTML.SVGPathSeg_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathSegType(value: Double): Self = StObject.set(x, "pathSegType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathSegTypeAsLetter(value: String): Self = StObject.set(x, "pathSegTypeAsLetter", value.asInstanceOf[js.Any])
  }
}
