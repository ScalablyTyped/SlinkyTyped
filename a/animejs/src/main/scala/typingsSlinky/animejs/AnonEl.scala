package typingsSlinky.animejs

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEl extends js.Object {
  var el: HTMLElement | SVGElement
  var property: String
  var totalLength: Double
}

object AnonEl {
  @scala.inline
  def apply(el: HTMLElement | SVGElement, property: String, totalLength: Double): AnonEl = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], totalLength = totalLength.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEl]
  }
}

