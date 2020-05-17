package typingsSlinky.reactEasyCrop.anon

import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerStyle extends js.Object {
  var containerStyle: CSSProperties = js.native
  var cropAreaStyle: CSSProperties = js.native
  var imageStyle: CSSProperties = js.native
}

object ContainerStyle {
  @scala.inline
  def apply(containerStyle: CSSProperties, cropAreaStyle: CSSProperties, imageStyle: CSSProperties): ContainerStyle = {
    val __obj = js.Dynamic.literal(containerStyle = containerStyle.asInstanceOf[js.Any], cropAreaStyle = cropAreaStyle.asInstanceOf[js.Any], imageStyle = imageStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerStyle]
  }
  @scala.inline
  implicit class ContainerStyleOps[Self <: ContainerStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCropAreaStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropAreaStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageStyle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

