package typingsSlinky.raphael.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RaphaelElementByTechnologyMap[TSvg /* <: SVGElement */, TVml /* <: Element */] extends StObject {
  
  var SVG: TSvg = js.native
  
  var VML: TVml = js.native
}
object RaphaelElementByTechnologyMap {
  
  @scala.inline
  def apply[TSvg /* <: SVGElement */, TVml /* <: Element */](SVG: TSvg, VML: TVml): RaphaelElementByTechnologyMap[TSvg, TVml] = {
    val __obj = js.Dynamic.literal(SVG = SVG.asInstanceOf[js.Any], VML = VML.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelElementByTechnologyMap[TSvg, TVml]]
  }
  
  @scala.inline
  implicit class RaphaelElementByTechnologyMapMutableBuilder[Self <: RaphaelElementByTechnologyMap[_, _], TSvg /* <: SVGElement */, TVml /* <: Element */] (val x: Self with (RaphaelElementByTechnologyMap[TSvg, TVml])) extends AnyVal {
    
    @scala.inline
    def setSVG(value: TSvg): Self = StObject.set(x, "SVG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVML(value: TVml): Self = StObject.set(x, "VML", value.asInstanceOf[js.Any])
  }
}
