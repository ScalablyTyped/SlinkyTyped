package typingsSlinky.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachmentLoader extends js.Object {
  def newBoundingBoxAttachment(skin: Skin, name: String): BoundingBoxAttachment = js.native
  def newClippingAttachment(skin: Skin, name: String): ClippingAttachment = js.native
  def newMeshAttachment(skin: Skin, name: String, path: String): MeshAttachment = js.native
  def newPathAttachment(skin: Skin, name: String): PathAttachment = js.native
  def newPointAttachment(skin: Skin, name: String): PointAttachment = js.native
  def newRegionAttachment(skin: Skin, name: String, path: String): RegionAttachment = js.native
}

object AttachmentLoader {
  @scala.inline
  def apply(
    newBoundingBoxAttachment: (Skin, String) => BoundingBoxAttachment,
    newClippingAttachment: (Skin, String) => ClippingAttachment,
    newMeshAttachment: (Skin, String, String) => MeshAttachment,
    newPathAttachment: (Skin, String) => PathAttachment,
    newPointAttachment: (Skin, String) => PointAttachment,
    newRegionAttachment: (Skin, String, String) => RegionAttachment
  ): AttachmentLoader = {
    val __obj = js.Dynamic.literal(newBoundingBoxAttachment = js.Any.fromFunction2(newBoundingBoxAttachment), newClippingAttachment = js.Any.fromFunction2(newClippingAttachment), newMeshAttachment = js.Any.fromFunction3(newMeshAttachment), newPathAttachment = js.Any.fromFunction2(newPathAttachment), newPointAttachment = js.Any.fromFunction2(newPointAttachment), newRegionAttachment = js.Any.fromFunction3(newRegionAttachment))
    __obj.asInstanceOf[AttachmentLoader]
  }
  @scala.inline
  implicit class AttachmentLoaderOps[Self <: AttachmentLoader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewBoundingBoxAttachment(value: (Skin, String) => BoundingBoxAttachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newBoundingBoxAttachment")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNewClippingAttachment(value: (Skin, String) => ClippingAttachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newClippingAttachment")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNewMeshAttachment(value: (Skin, String, String) => MeshAttachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newMeshAttachment")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withNewPathAttachment(value: (Skin, String) => PathAttachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPathAttachment")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNewPointAttachment(value: (Skin, String) => PointAttachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPointAttachment")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNewRegionAttachment(value: (Skin, String, String) => RegionAttachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRegionAttachment")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

