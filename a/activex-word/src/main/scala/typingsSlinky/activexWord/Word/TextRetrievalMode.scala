package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextRetrievalMode extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val Duplicate: TextRetrievalMode = js.native
  var IncludeFieldCodes: Boolean = js.native
  var IncludeHiddenText: Boolean = js.native
  val Parent: js.Any = js.native
  var ViewType: WdViewType = js.native
  @JSName("Word.TextRetrievalMode_typekey")
  var WordDotTextRetrievalMode_typekey: TextRetrievalMode = js.native
}

object TextRetrievalMode {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Duplicate: TextRetrievalMode,
    IncludeFieldCodes: Boolean,
    IncludeHiddenText: Boolean,
    Parent: js.Any,
    ViewType: WdViewType,
    WordDotTextRetrievalMode_typekey: TextRetrievalMode
  ): TextRetrievalMode = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Duplicate = Duplicate.asInstanceOf[js.Any], IncludeFieldCodes = IncludeFieldCodes.asInstanceOf[js.Any], IncludeHiddenText = IncludeHiddenText.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ViewType = ViewType.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.TextRetrievalMode_typekey")(WordDotTextRetrievalMode_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextRetrievalMode]
  }
  @scala.inline
  implicit class TextRetrievalModeOps[Self <: TextRetrievalMode] (val x: Self) extends AnyVal {
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
    def withDuplicate(value: TextRetrievalMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Duplicate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeFieldCodes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeFieldCodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeHiddenText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeHiddenText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewType(value: WdViewType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotTextRetrievalMode_typekey(value: TextRetrievalMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.TextRetrievalMode_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

