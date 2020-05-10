package typingsSlinky.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxRecurrenceEditorOptions extends EditorOptions[dxRecurrenceEditor] {
  /** Specifies the widget's value. */
  @JSName("value")
  var value_dxRecurrenceEditorOptions: js.UndefOr[String] = js.native
}

object dxRecurrenceEditorOptions {
  @scala.inline
  def apply(): dxRecurrenceEditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxRecurrenceEditorOptions]
  }
  @scala.inline
  implicit class dxRecurrenceEditorOptionsOps[Self <: dxRecurrenceEditorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

