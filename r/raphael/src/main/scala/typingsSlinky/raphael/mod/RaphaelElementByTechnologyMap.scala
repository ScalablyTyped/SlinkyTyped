package typingsSlinky.raphael.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RaphaelElementByTechnologyMap[TSvg /* <: SVGElement */, TVml /* <: Element */] extends js.Object {
  
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
  implicit class RaphaelElementByTechnologyMapOps[Self <: RaphaelElementByTechnologyMap[_, _], TSvg /* <: SVGElement */, TVml /* <: Element */] (val x: Self with (RaphaelElementByTechnologyMap[TSvg, TVml])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSVG(value: TSvg): Self = this.set("SVG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVML(value: TVml): Self = this.set("VML", value.asInstanceOf[js.Any])
  }
}
