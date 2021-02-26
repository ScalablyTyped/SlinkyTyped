package typingsSlinky.raphael.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.SVGCircleElement
import org.scalajs.dom.raw.SVGEllipseElement
import org.scalajs.dom.raw.SVGImageElement
import org.scalajs.dom.raw.SVGPathElement
import org.scalajs.dom.raw.SVGRectElement
import org.scalajs.dom.raw.SVGTextElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RaphaelElementImplementationMap extends StObject {
  
  /** The elements that implement the {@link RaphaelPaper.circle} shape. */
  var circle: RaphaelElementByTechnologyMap[SVGCircleElement, Element] = js.native
  
  /** The elements that implement the {@link RaphaelPaper.ellipse} shape. */
  var ellipse: RaphaelElementByTechnologyMap[SVGEllipseElement, Element] = js.native
  
  /** The elements that implement the {@link RaphaelPaper.image} shape. */
  var image: RaphaelElementByTechnologyMap[SVGImageElement, Element] = js.native
  
  /** The elements that implement the {@link RaphaelPaper.path} shape. */
  var path: RaphaelElementByTechnologyMap[SVGPathElement, Element] = js.native
  
  /** The elements that implement the {@link RaphaelPaper.rect} shape. */
  var rect: RaphaelElementByTechnologyMap[SVGRectElement, Element] = js.native
  
  /** The elements that implement the {@link RaphaelPaper.text} shape. */
  var text: RaphaelElementByTechnologyMap[SVGTextElement, Element] = js.native
}
object RaphaelElementImplementationMap {
  
  @scala.inline
  def apply(
    circle: RaphaelElementByTechnologyMap[SVGCircleElement, Element],
    ellipse: RaphaelElementByTechnologyMap[SVGEllipseElement, Element],
    image: RaphaelElementByTechnologyMap[SVGImageElement, Element],
    path: RaphaelElementByTechnologyMap[SVGPathElement, Element],
    rect: RaphaelElementByTechnologyMap[SVGRectElement, Element],
    text: RaphaelElementByTechnologyMap[SVGTextElement, Element]
  ): RaphaelElementImplementationMap = {
    val __obj = js.Dynamic.literal(circle = circle.asInstanceOf[js.Any], ellipse = ellipse.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelElementImplementationMap]
  }
  
  @scala.inline
  implicit class RaphaelElementImplementationMapMutableBuilder[Self <: RaphaelElementImplementationMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCircle(value: RaphaelElementByTechnologyMap[SVGCircleElement, Element]): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipse(value: RaphaelElementByTechnologyMap[SVGEllipseElement, Element]): Self = StObject.set(x, "ellipse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: RaphaelElementByTechnologyMap[SVGImageElement, Element]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: RaphaelElementByTechnologyMap[SVGPathElement, Element]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRect(value: RaphaelElementByTechnologyMap[SVGRectElement, Element]): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: RaphaelElementByTechnologyMap[SVGTextElement, Element]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
