package typingsSlinky.reactEasyCrop.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerClassName extends js.Object {
  var containerClassName: String = js.native
  var cropAreaClassName: String = js.native
  var imageClassName: String = js.native
}

object ContainerClassName {
  @scala.inline
  def apply(containerClassName: String, cropAreaClassName: String, imageClassName: String): ContainerClassName = {
    val __obj = js.Dynamic.literal(containerClassName = containerClassName.asInstanceOf[js.Any], cropAreaClassName = cropAreaClassName.asInstanceOf[js.Any], imageClassName = imageClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerClassName]
  }
  @scala.inline
  implicit class ContainerClassNameOps[Self <: ContainerClassName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCropAreaClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropAreaClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageClassName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

