package typingsSlinky.expo.aRMod

import typingsSlinky.expo.aRMod.AnchorType.Image
import typingsSlinky.expo.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined expo.expo/build/AR.BaseAnchor & {  type :expo.expo/build/AR.AnchorType.Image,   image :{  name :string | null,   size :expo.expo/build/AR.Size} | undefined} */
trait ImageAnchor extends Anchor {
  var id: String
  var image: js.UndefOr[Name] = js.undefined
  var transform: Matrix
  var `type`: AnchorType with Image
}

object ImageAnchor {
  @scala.inline
  def apply(id: String, transform: Matrix, `type`: AnchorType with Image): ImageAnchor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageAnchor]
  }
  @scala.inline
  implicit class ImageAnchorOps[Self <: ImageAnchor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransform(value: Matrix): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: AnchorType with Image): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setImage(value: Name): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
  }
  
}

