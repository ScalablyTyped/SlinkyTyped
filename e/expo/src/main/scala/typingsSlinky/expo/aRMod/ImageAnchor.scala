package typingsSlinky.expo.aRMod

import typingsSlinky.expo.AnonName
import typingsSlinky.expo.aRMod.AnchorType.Image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined expo.expo/build/AR.BaseAnchor & {  type  :expo.expo/build/AR.AnchorType.Image,   image ? :{  name  :string | null,   size  :expo.expo/build/AR.Size}} */
@js.native
trait ImageAnchor extends Anchor {
  var id: String = js.native
  var image: js.UndefOr[AnonName] = js.native
  var transform: Matrix = js.native
  var `type`: AnchorType with Image = js.native
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
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransform(value: Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: AnchorType with Image): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: AnonName): Self = {
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

