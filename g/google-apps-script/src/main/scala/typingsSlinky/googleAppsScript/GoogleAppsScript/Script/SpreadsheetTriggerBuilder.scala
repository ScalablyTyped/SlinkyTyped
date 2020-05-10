package typingsSlinky.googleAppsScript.GoogleAppsScript.Script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Builder for spreadsheet triggers.
  */
@js.native
trait SpreadsheetTriggerBuilder extends js.Object {
  def create(): Trigger = js.native
  def onChange(): SpreadsheetTriggerBuilder = js.native
  def onEdit(): SpreadsheetTriggerBuilder = js.native
  def onFormSubmit(): SpreadsheetTriggerBuilder = js.native
  def onOpen(): SpreadsheetTriggerBuilder = js.native
}

object SpreadsheetTriggerBuilder {
  @scala.inline
  def apply(
    create: () => Trigger,
    onChange: () => SpreadsheetTriggerBuilder,
    onEdit: () => SpreadsheetTriggerBuilder,
    onFormSubmit: () => SpreadsheetTriggerBuilder,
    onOpen: () => SpreadsheetTriggerBuilder
  ): SpreadsheetTriggerBuilder = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create), onChange = js.Any.fromFunction0(onChange), onEdit = js.Any.fromFunction0(onEdit), onFormSubmit = js.Any.fromFunction0(onFormSubmit), onOpen = js.Any.fromFunction0(onOpen))
    __obj.asInstanceOf[SpreadsheetTriggerBuilder]
  }
  @scala.inline
  implicit class SpreadsheetTriggerBuilderOps[Self <: SpreadsheetTriggerBuilder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: () => Trigger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnChange(value: () => SpreadsheetTriggerBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnEdit(value: () => SpreadsheetTriggerBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEdit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnFormSubmit(value: () => SpreadsheetTriggerBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFormSubmit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnOpen(value: () => SpreadsheetTriggerBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

