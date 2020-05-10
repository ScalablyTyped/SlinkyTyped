package typingsSlinky.monacoEditor

import typingsSlinky.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonModel extends js.Object {
  val model: ITextModel = js.native
  val oldLanguage: String = js.native
}

object AnonModel {
  @scala.inline
  def apply(model: ITextModel, oldLanguage: String): AnonModel = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], oldLanguage = oldLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonModel]
  }
  @scala.inline
  implicit class AnonModelOps[Self <: AnonModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModel(value: ITextModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldLanguage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

