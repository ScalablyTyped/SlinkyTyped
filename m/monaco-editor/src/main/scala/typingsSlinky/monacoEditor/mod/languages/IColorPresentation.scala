package typingsSlinky.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColorPresentation extends js.Object {
  /**
    * An optional array of additional [text edits](#TextEdit) that are applied when
    * selecting this color presentation.
    */
  var additionalTextEdits: js.UndefOr[js.Array[TextEdit]] = js.native
  /**
    * The label of this color presentation. It will be shown on the color
    * picker header. By default this is also the text that is inserted when selecting
    * this color presentation.
    */
  var label: String = js.native
  /**
    * An [edit](#TextEdit) which is applied to a document when selecting
    * this presentation for the color.
    */
  var textEdit: js.UndefOr[TextEdit] = js.native
}

object IColorPresentation {
  @scala.inline
  def apply(label: String): IColorPresentation = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColorPresentation]
  }
  @scala.inline
  implicit class IColorPresentationOps[Self <: IColorPresentation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdditionalTextEdits(value: js.Array[TextEdit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalTextEdits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalTextEdits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalTextEdits")(js.undefined)
        ret
    }
    @scala.inline
    def withTextEdit(value: TextEdit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textEdit")(js.undefined)
        ret
    }
  }
  
}

