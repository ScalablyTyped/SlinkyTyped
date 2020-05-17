package typingsSlinky.ivViewer.anon

import org.scalajs.dom.raw.Element
import typingsSlinky.ivViewer.mod.IVImage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Container extends js.Object {
  var container: Element | Null = js.native
  var domElement: Element | Null = js.native
  var hiResImageSrc: IVImage = js.native
  var imageSrc: IVImage = js.native
}

object Container {
  @scala.inline
  def apply(): Container = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Container]
  }
  @scala.inline
  implicit class ContainerOps[Self <: Container] (val x: Self) extends AnyVal {
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
    def withHiResImageSrc(value: IVImage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiResImageSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHiResImageSrcNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiResImageSrc")(null)
        ret
    }
    @scala.inline
    def withImageSrc(value: IVImage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageSrcNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageSrc")(null)
        ret
    }
  }
  
}

