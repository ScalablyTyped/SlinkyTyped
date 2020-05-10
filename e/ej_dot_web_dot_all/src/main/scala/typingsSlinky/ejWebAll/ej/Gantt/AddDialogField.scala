package typingsSlinky.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddDialogField extends js.Object {
  /** Specifies the custom column field was displayed in General tab of add dialog or not.
    * @Default {false}
    */
  var displayInGeneralTab: js.UndefOr[Boolean] = js.native
  /** Specifies editType of fields to be included in the add dialog in Gantt
    */
  var editType: js.UndefOr[String] = js.native
  /** Specifies mapping name to include required fields in Gantt
    */
  var field: js.UndefOr[String] = js.native
}

object AddDialogField {
  @scala.inline
  def apply(): AddDialogField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddDialogField]
  }
  @scala.inline
  implicit class AddDialogFieldOps[Self <: AddDialogField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayInGeneralTab(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayInGeneralTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayInGeneralTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayInGeneralTab")(js.undefined)
        ret
    }
    @scala.inline
    def withEditType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editType")(js.undefined)
        ret
    }
    @scala.inline
    def withField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(js.undefined)
        ret
    }
  }
  
}

