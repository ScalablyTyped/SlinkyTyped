package typingsSlinky.jqueryEditableSelect.JQueryEditableSelect

import typingsSlinky.jqueryEditableSelect.JQuery
import typingsSlinky.jqueryEditableSelect.jqueryEditableSelectStrings.default
import typingsSlinky.jqueryEditableSelect.jqueryEditableSelectStrings.fade
import typingsSlinky.jqueryEditableSelect.jqueryEditableSelectStrings.fast
import typingsSlinky.jqueryEditableSelect.jqueryEditableSelectStrings.focus
import typingsSlinky.jqueryEditableSelect.jqueryEditableSelectStrings.manual
import typingsSlinky.jqueryEditableSelect.jqueryEditableSelectStrings.slide
import typingsSlinky.jqueryEditableSelect.jqueryEditableSelectStrings.slow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditableSelectOptions extends js.Object {
  /**
    * Where to append the dropdown list in the DOM.
    */
  var appendTo: js.UndefOr[String | JQuery] = js.native
  /**
    * Duration of the easings (in milliseconds).
    */
  var duration: js.UndefOr[Double | fast | slow] = js.native
  /**
    * Easing used for showing and hiding the dropdown list.
    */
  var effects: js.UndefOr[default | slide | fade] = js.native
  /**
    * Filter (or not) items in list while typing.
    */
  var filter: js.UndefOr[Boolean] = js.native
  /**
    * How dropdown list is triggered.
    */
  var trigger: js.UndefOr[focus | manual] = js.native
}

object EditableSelectOptions {
  @scala.inline
  def apply(): EditableSelectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditableSelectOptions]
  }
  @scala.inline
  implicit class EditableSelectOptionsOps[Self <: EditableSelectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppendTo(value: String | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendTo")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double | fast | slow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withEffects(value: default | slide | fade): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effects")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withTrigger(value: focus | manual): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(js.undefined)
        ret
    }
  }
  
}

