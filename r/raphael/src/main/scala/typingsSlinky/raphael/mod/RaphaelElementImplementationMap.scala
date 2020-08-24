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

@js.native
trait RaphaelElementImplementationMap extends js.Object {
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
  implicit class RaphaelElementImplementationMapOps[Self <: RaphaelElementImplementationMap] (val x: Self) extends AnyVal {
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
    def setCircle(value: RaphaelElementByTechnologyMap[SVGCircleElement, Element]): Self = this.set("circle", value.asInstanceOf[js.Any])
    @scala.inline
    def setEllipse(value: RaphaelElementByTechnologyMap[SVGEllipseElement, Element]): Self = this.set("ellipse", value.asInstanceOf[js.Any])
    @scala.inline
    def setImage(value: RaphaelElementByTechnologyMap[SVGImageElement, Element]): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: RaphaelElementByTechnologyMap[SVGPathElement, Element]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setRect(value: RaphaelElementByTechnologyMap[SVGRectElement, Element]): Self = this.set("rect", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: RaphaelElementByTechnologyMap[SVGTextElement, Element]): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

