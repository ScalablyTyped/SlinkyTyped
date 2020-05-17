package typingsSlinky.exceljs.anon

import typingsSlinky.exceljs.exceljsStrings.image
import typingsSlinky.exceljs.mod.ImageRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageId extends js.Object {
  var imageId: String = js.native
  var range: ImageRange = js.native
  var `type`: image = js.native
}

object ImageId {
  @scala.inline
  def apply(imageId: String, range: ImageRange, `type`: image): ImageId = {
    val __obj = js.Dynamic.literal(imageId = imageId.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageId]
  }
  @scala.inline
  implicit class ImageIdOps[Self <: ImageId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRange(value: ImageRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: image): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

