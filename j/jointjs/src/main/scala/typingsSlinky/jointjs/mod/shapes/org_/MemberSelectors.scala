package typingsSlinky.jointjs.mod.shapes.org_

import typingsSlinky.jointjs.mod.attributes.SVGImageAttributes
import typingsSlinky.jointjs.mod.attributes.SVGRectAttributes
import typingsSlinky.jointjs.mod.attributes.SVGTextAttributes
import typingsSlinky.jointjs.mod.dia.Cell.Selectors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberSelectors extends Selectors {
  @JSName(".card")
  var Dotcard: js.UndefOr[SVGRectAttributes] = js.native
  @JSName(".name")
  var Dotname: js.UndefOr[SVGTextAttributes] = js.native
  @JSName(".rank")
  var Dotrank: js.UndefOr[SVGTextAttributes] = js.native
  var image: js.UndefOr[SVGImageAttributes] = js.native
}

object MemberSelectors {
  @scala.inline
  def apply(): MemberSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemberSelectors]
  }
  @scala.inline
  implicit class MemberSelectorsOps[Self <: MemberSelectors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDotcard(value: SVGRectAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".card")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotcard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".card")(js.undefined)
        ret
    }
    @scala.inline
    def withDotname(value: SVGTextAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".name")(js.undefined)
        ret
    }
    @scala.inline
    def withDotrank(value: SVGTextAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".rank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotrank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".rank")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: SVGImageAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
  }
  
}

