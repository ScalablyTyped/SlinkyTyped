package typingsSlinky.jointjs.mod.shapes.standard

import typingsSlinky.jointjs.mod.attributes.SVGAttributes
import typingsSlinky.jointjs.mod.attributes.SVGImageAttributes
import typingsSlinky.jointjs.mod.attributes.SVGTextAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageSelectors extends js.Object {
  var image: js.UndefOr[SVGImageAttributes] = js.native
  var label: js.UndefOr[SVGTextAttributes] = js.native
  var root: js.UndefOr[SVGAttributes] = js.native
}

object ImageSelectors {
  @scala.inline
  def apply(): ImageSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageSelectors]
  }
  @scala.inline
  implicit class ImageSelectorsOps[Self <: ImageSelectors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withLabel(value: SVGTextAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
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

