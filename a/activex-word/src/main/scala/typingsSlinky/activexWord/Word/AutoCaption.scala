package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoCaption extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  var AutoInsert: Boolean = js.native
  var CaptionLabel: js.Any = js.native
  val Creator: Double = js.native
  val Index: Double = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  @JSName("Word.AutoCaption_typekey")
  var WordDotAutoCaption_typekey: AutoCaption = js.native
}

object AutoCaption {
  @scala.inline
  def apply(
    Application: Application,
    AutoInsert: Boolean,
    CaptionLabel: js.Any,
    Creator: Double,
    Index: Double,
    Name: String,
    Parent: js.Any,
    WordDotAutoCaption_typekey: AutoCaption
  ): AutoCaption = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoInsert = AutoInsert.asInstanceOf[js.Any], CaptionLabel = CaptionLabel.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.AutoCaption_typekey")(WordDotAutoCaption_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCaption]
  }
  @scala.inline
  implicit class AutoCaptionOps[Self <: AutoCaption] (val x: Self) extends AnyVal {
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
    def withAutoInsert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoInsert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaptionLabel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CaptionLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
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
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotAutoCaption_typekey(value: AutoCaption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.AutoCaption_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

