package typingsSlinky.jointjs.mod.shapes.standard

import typingsSlinky.jointjs.mod.attributes.SVGAttributes
import typingsSlinky.jointjs.mod.attributes.SVGRectAttributes
import typingsSlinky.jointjs.mod.attributes.SVGTextAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeaderedRectangleSelectors extends js.Object {
  var body: js.UndefOr[SVGRectAttributes] = js.native
  var bodyText: js.UndefOr[SVGTextAttributes] = js.native
  var header: js.UndefOr[SVGRectAttributes] = js.native
  var headerText: js.UndefOr[SVGTextAttributes] = js.native
  var root: js.UndefOr[SVGAttributes] = js.native
}

object HeaderedRectangleSelectors {
  @scala.inline
  def apply(): HeaderedRectangleSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderedRectangleSelectors]
  }
  @scala.inline
  implicit class HeaderedRectangleSelectorsOps[Self <: HeaderedRectangleSelectors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: SVGRectAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyText(value: SVGTextAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyText")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: SVGRectAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderText(value: SVGTextAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerText")(js.undefined)
        ret
    }
    @scala.inline
    def withRoot(value: SVGAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
  }
  
}

