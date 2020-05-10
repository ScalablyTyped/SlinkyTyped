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
    def withCircle(value: RaphaelElementByTechnologyMap[SVGCircleElement, Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEllipse(value: RaphaelElementByTechnologyMap[SVGEllipseElement, Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: RaphaelElementByTechnologyMap[SVGImageElement, Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: RaphaelElementByTechnologyMap[SVGPathElement, Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRect(value: RaphaelElementByTechnologyMap[SVGRectElement, Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: RaphaelElementByTechnologyMap[SVGTextElement, Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

