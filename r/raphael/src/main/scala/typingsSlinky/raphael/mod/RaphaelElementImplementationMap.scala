package typingsSlinky.raphael.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.SVGCircleElement
import org.scalajs.dom.raw.SVGEllipseElement
import org.scalajs.dom.raw.SVGImageElement
import org.scalajs.dom.raw.SVGPathElement
import org.scalajs.dom.raw.SVGRectElement
import org.scalajs.dom.raw.SVGTextElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaphaelElementImplementationMap extends js.Object {
  /** The elements that implement the {@link RaphaelPaper.circle} shape. */
  var circle: RaphaelElementByTechnologyMap[SVGCircleElement, Element]
  /** The elements that implement the {@link RaphaelPaper.ellipse} shape. */
  var ellipse: RaphaelElementByTechnologyMap[SVGEllipseElement, Element]
  /** The elements that implement the {@link RaphaelPaper.image} shape. */
  var image: RaphaelElementByTechnologyMap[SVGImageElement, Element]
  /** The elements that implement the {@link RaphaelPaper.path} shape. */
  var path: RaphaelElementByTechnologyMap[SVGPathElement, Element]
  /** The elements that implement the {@link RaphaelPaper.rect} shape. */
  var rect: RaphaelElementByTechnologyMap[SVGRectElement, Element]
  /** The elements that implement the {@link RaphaelPaper.text} shape. */
  var text: RaphaelElementByTechnologyMap[SVGTextElement, Element]
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
}

