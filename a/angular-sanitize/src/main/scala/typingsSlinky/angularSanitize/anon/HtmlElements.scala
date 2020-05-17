package typingsSlinky.angularSanitize.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HtmlElements extends js.Object {
  var htmlElements: js.UndefOr[js.Array[String]] = js.native
  var htmlVoidElements: js.UndefOr[js.Array[String]] = js.native
  var svgElements: js.UndefOr[js.Array[String]] = js.native
}

object HtmlElements {
  @scala.inline
  def apply(): HtmlElements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HtmlElements]
  }
  @scala.inline
  implicit class HtmlElementsOps[Self <: HtmlElements] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHtmlElements(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlElements")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlVoidElements(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlVoidElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlVoidElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlVoidElements")(js.undefined)
        ret
    }
    @scala.inline
    def withSvgElements(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSvgElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgElements")(js.undefined)
        ret
    }
  }
  
}

