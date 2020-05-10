package typingsSlinky.ivViewer.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Elements extends js.Object {
  var container: Element | Null = js.native
  var domElement: Element | Null = js.native
  var image: js.UndefOr[Element | Null] = js.native
  var imageWrap: js.UndefOr[Element | Null] = js.native
  var snapHandle: js.UndefOr[Element | Null] = js.native
  var snapImage: js.UndefOr[Element | Null] = js.native
  var snapImageWrap: js.UndefOr[Element | Null] = js.native
  var snapView: js.UndefOr[Element | Null] = js.native
  var zoomHandle: js.UndefOr[Element | Null] = js.native
}

object Elements {
  @scala.inline
  def apply(): Elements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Elements]
  }
  @scala.inline
  implicit class ElementsOps[Self <: Elements] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainer(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(null)
        ret
    }
    @scala.inline
    def withDomElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomElementNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domElement")(null)
        ret
    }
    @scala.inline
    def withImage(value: Element): Self = {
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
    def withImageNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(null)
        ret
    }
    @scala.inline
    def withImageWrap(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageWrap")(js.undefined)
        ret
    }
    @scala.inline
    def withImageWrapNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageWrap")(null)
        ret
    }
    @scala.inline
    def withSnapHandle(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapHandle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapHandle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapHandle")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapHandleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapHandle")(null)
        ret
    }
    @scala.inline
    def withSnapImage(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapImage")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapImageNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapImage")(null)
        ret
    }
    @scala.inline
    def withSnapImageWrap(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapImageWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapImageWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapImageWrap")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapImageWrapNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapImageWrap")(null)
        ret
    }
    @scala.inline
    def withSnapView(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapView")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapViewNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapView")(null)
        ret
    }
    @scala.inline
    def withZoomHandle(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomHandle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomHandle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomHandle")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomHandleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomHandle")(null)
        ret
    }
  }
  
}

