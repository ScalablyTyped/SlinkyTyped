package typingsSlinky.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Crop extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  @JSName("Office.Crop_typekey")
  var OfficeDotCrop_typekey: Crop = js.native
  var PictureHeight: Double = js.native
  var PictureOffsetX: Double = js.native
  var PictureOffsetY: Double = js.native
  var PictureWidth: Double = js.native
  var ShapeHeight: Double = js.native
  var ShapeLeft: Double = js.native
  var ShapeTop: Double = js.native
  var ShapeWidth: Double = js.native
}

object Crop {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    OfficeDotCrop_typekey: Crop,
    PictureHeight: Double,
    PictureOffsetX: Double,
    PictureOffsetY: Double,
    PictureWidth: Double,
    ShapeHeight: Double,
    ShapeLeft: Double,
    ShapeTop: Double,
    ShapeWidth: Double
  ): Crop = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], PictureHeight = PictureHeight.asInstanceOf[js.Any], PictureOffsetX = PictureOffsetX.asInstanceOf[js.Any], PictureOffsetY = PictureOffsetY.asInstanceOf[js.Any], PictureWidth = PictureWidth.asInstanceOf[js.Any], ShapeHeight = ShapeHeight.asInstanceOf[js.Any], ShapeLeft = ShapeLeft.asInstanceOf[js.Any], ShapeTop = ShapeTop.asInstanceOf[js.Any], ShapeWidth = ShapeWidth.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.Crop_typekey")(OfficeDotCrop_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Crop]
  }
  @scala.inline
  implicit class CropOps[Self <: Crop] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfficeDotCrop_typekey(value: Crop): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Office.Crop_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPictureHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PictureHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPictureOffsetX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PictureOffsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPictureOffsetY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PictureOffsetY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPictureWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PictureWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShapeHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShapeHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShapeLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShapeLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShapeTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShapeTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShapeWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShapeWidth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

