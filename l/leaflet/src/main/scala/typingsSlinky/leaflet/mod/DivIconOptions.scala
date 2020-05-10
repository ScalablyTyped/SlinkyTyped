package typingsSlinky.leaflet.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.leaflet.leafletBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DivIconOptions extends BaseIconOptions {
  var bgPos: js.UndefOr[PointExpression] = js.native
  var html: js.UndefOr[String | HTMLElement | `false`] = js.native
}

object DivIconOptions {
  @scala.inline
  def apply(): DivIconOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DivIconOptions]
  }
  @scala.inline
  implicit class DivIconOptionsOps[Self <: DivIconOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBgPos(value: PointExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgPos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgPos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgPos")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml(value: String | HTMLElement | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(js.undefined)
        ret
    }
  }
  
}

