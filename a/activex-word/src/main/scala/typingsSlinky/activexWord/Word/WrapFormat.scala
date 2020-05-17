package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrapFormat extends js.Object {
  var AllowOverlap: Double = js.native
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  var DistanceBottom: Double = js.native
  var DistanceLeft: Double = js.native
  var DistanceRight: Double = js.native
  var DistanceTop: Double = js.native
  val Parent: js.Any = js.native
  var Side: WdWrapSideType = js.native
  var Type: WdWrapType = js.native
  @JSName("Word.WrapFormat_typekey")
  var WordDotWrapFormat_typekey: WrapFormat = js.native
}

object WrapFormat {
  @scala.inline
  def apply(
    AllowOverlap: Double,
    Application: Application,
    Creator: Double,
    DistanceBottom: Double,
    DistanceLeft: Double,
    DistanceRight: Double,
    DistanceTop: Double,
    Parent: js.Any,
    Side: WdWrapSideType,
    Type: WdWrapType,
    WordDotWrapFormat_typekey: WrapFormat
  ): WrapFormat = {
    val __obj = js.Dynamic.literal(AllowOverlap = AllowOverlap.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DistanceBottom = DistanceBottom.asInstanceOf[js.Any], DistanceLeft = DistanceLeft.asInstanceOf[js.Any], DistanceRight = DistanceRight.asInstanceOf[js.Any], DistanceTop = DistanceTop.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Side = Side.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.WrapFormat_typekey")(WordDotWrapFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrapFormat]
  }
  @scala.inline
  implicit class WrapFormatOps[Self <: WrapFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowOverlap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowOverlap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
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
    def withDistanceBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DistanceBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistanceLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DistanceLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistanceRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DistanceRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistanceTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DistanceTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSide(value: WdWrapSideType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Side")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: WdWrapType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotWrapFormat_typekey(value: WrapFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.WrapFormat_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

