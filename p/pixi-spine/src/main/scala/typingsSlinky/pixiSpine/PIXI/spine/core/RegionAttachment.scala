package typingsSlinky.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegionAttachment extends Attachment {
  var color: Color = js.native
  var height: Double = js.native
  var offset: ArrayLike[Double] = js.native
  var path: String = js.native
  var region: TextureRegion = js.native
  var rendererObject: js.Any = js.native
  var rotation: Double = js.native
  var scaleX: Double = js.native
  var scaleY: Double = js.native
  var tempColor: Color = js.native
  var uvs: ArrayLike[Double] = js.native
  var width: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def computeWorldVertices(bone: Bone, worldVertices: ArrayLike[Double], offset: Double, stride: Double): Unit = js.native
  def setRegion(region: TextureRegion): Unit = js.native
  def updateOffset(): Unit = js.native
}

object RegionAttachment {
  @scala.inline
  def apply(
    color: Color,
    computeWorldVertices: (Bone, ArrayLike[Double], Double, Double) => Unit,
    copy: () => Attachment,
    height: Double,
    name: String,
    offset: ArrayLike[Double],
    path: String,
    region: TextureRegion,
    rendererObject: js.Any,
    rotation: Double,
    scaleX: Double,
    scaleY: Double,
    setRegion: TextureRegion => Unit,
    tempColor: Color,
    updateOffset: () => Unit,
    uvs: ArrayLike[Double],
    width: Double,
    x: Double,
    y: Double
  ): RegionAttachment = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], computeWorldVertices = js.Any.fromFunction4(computeWorldVertices), copy = js.Any.fromFunction0(copy), height = height.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], rendererObject = rendererObject.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], setRegion = js.Any.fromFunction1(setRegion), tempColor = tempColor.asInstanceOf[js.Any], updateOffset = js.Any.fromFunction0(updateOffset), uvs = uvs.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegionAttachment]
  }
  @scala.inline
  implicit class RegionAttachmentOps[Self <: RegionAttachment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComputeWorldVertices(value: (Bone, ArrayLike[Double], Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeWorldVertices")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: ArrayLike[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegion(value: TextureRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRendererObject(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendererObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaleX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaleY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetRegion(value: TextureRegion => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRegion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTempColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateOffset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOffset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUvs(value: ArrayLike[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uvs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

