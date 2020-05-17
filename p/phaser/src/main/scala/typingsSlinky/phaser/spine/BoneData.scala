package typingsSlinky.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoneData extends js.Object {
  var color: Color = js.native
  var index: Double = js.native
  var length: Double = js.native
  var name: String = js.native
  var parent: BoneData = js.native
  var rotation: Double = js.native
  var scaleX: Double = js.native
  var scaleY: Double = js.native
  var shearX: Double = js.native
  var shearY: Double = js.native
  var skinRequired: Boolean = js.native
  var transformMode: TransformMode = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object BoneData {
  @scala.inline
  def apply(
    color: Color,
    index: Double,
    length: Double,
    name: String,
    parent: BoneData,
    rotation: Double,
    scaleX: Double,
    scaleY: Double,
    shearX: Double,
    shearY: Double,
    skinRequired: Boolean,
    transformMode: TransformMode,
    x: Double,
    y: Double
  ): BoneData = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], shearX = shearX.asInstanceOf[js.Any], shearY = shearY.asInstanceOf[js.Any], skinRequired = skinRequired.asInstanceOf[js.Any], transformMode = transformMode.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoneData]
  }
  @scala.inline
  implicit class BoneDataOps[Self <: BoneData] (val x: Self) extends AnyVal {
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
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: BoneData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
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
    def withShearX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shearX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShearY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shearY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkinRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skinRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransformMode(value: TransformMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformMode")(value.asInstanceOf[js.Any])
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

