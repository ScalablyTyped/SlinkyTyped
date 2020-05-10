package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an Image. */
@js.native
trait IImage extends js.Object {
  /** Image accessibilityText */
  var accessibilityText: js.UndefOr[String | Null] = js.native
  /** Image imageUri */
  var imageUri: js.UndefOr[String | Null] = js.native
}

object IImage {
  @scala.inline
  def apply(): IImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IImage]
  }
  @scala.inline
  implicit class IImageOps[Self <: IImage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessibilityText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilityText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityText")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibilityTextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityText")(null)
        ret
    }
    @scala.inline
    def withImageUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUri")(js.undefined)
        ret
    }
    @scala.inline
    def withImageUriNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUri")(null)
        ret
    }
  }
  
}

