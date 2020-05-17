package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomLabel extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val DotMatrix: Boolean = js.native
  var Height: Double = js.native
  var HorizontalPitch: Double = js.native
  val Index: Double = js.native
  var Name: String = js.native
  var NumberAcross: Double = js.native
  var NumberDown: Double = js.native
  var PageSize: WdCustomLabelPageSize = js.native
  val Parent: js.Any = js.native
  var SideMargin: Double = js.native
  var TopMargin: Double = js.native
  val Valid: Boolean = js.native
  var VerticalPitch: Double = js.native
  var Width: Double = js.native
  @JSName("Word.CustomLabel_typekey")
  var WordDotCustomLabel_typekey: CustomLabel = js.native
  def Delete(): Unit = js.native
}

object CustomLabel {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    DotMatrix: Boolean,
    Height: Double,
    HorizontalPitch: Double,
    Index: Double,
    Name: String,
    NumberAcross: Double,
    NumberDown: Double,
    PageSize: WdCustomLabelPageSize,
    Parent: js.Any,
    SideMargin: Double,
    TopMargin: Double,
    Valid: Boolean,
    VerticalPitch: Double,
    Width: Double,
    WordDotCustomLabel_typekey: CustomLabel
  ): CustomLabel = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), DotMatrix = DotMatrix.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], HorizontalPitch = HorizontalPitch.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NumberAcross = NumberAcross.asInstanceOf[js.Any], NumberDown = NumberDown.asInstanceOf[js.Any], PageSize = PageSize.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SideMargin = SideMargin.asInstanceOf[js.Any], TopMargin = TopMargin.asInstanceOf[js.Any], Valid = Valid.asInstanceOf[js.Any], VerticalPitch = VerticalPitch.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.CustomLabel_typekey")(WordDotCustomLabel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomLabel]
  }
  @scala.inline
  implicit class CustomLabelOps[Self <: CustomLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withDelete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDotMatrix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DotMatrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHorizontalPitch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HorizontalPitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberAcross(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberAcross")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberDown(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageSize(value: WdCustomLabelPageSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSideMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SideMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Valid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerticalPitch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VerticalPitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotCustomLabel_typekey(value: CustomLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.CustomLabel_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

