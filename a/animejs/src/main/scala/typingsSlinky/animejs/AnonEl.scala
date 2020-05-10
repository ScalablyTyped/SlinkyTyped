package typingsSlinky.animejs

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEl extends js.Object {
  var el: HTMLElement | SVGElement = js.native
  var property: String = js.native
  var totalLength: Double = js.native
}

object AnonEl {
  @scala.inline
  def apply(el: HTMLElement | SVGElement, property: String, totalLength: Double): AnonEl = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], totalLength = totalLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEl]
  }
  @scala.inline
  implicit class AnonElOps[Self <: AnonEl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElSVGElement(value: SVGElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEl(value: HTMLElement | SVGElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalLength")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

