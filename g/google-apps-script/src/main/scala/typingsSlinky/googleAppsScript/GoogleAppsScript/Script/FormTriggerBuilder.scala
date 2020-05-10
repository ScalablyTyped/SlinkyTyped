package typingsSlinky.googleAppsScript.GoogleAppsScript.Script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A builder for form triggers.
  */
@js.native
trait FormTriggerBuilder extends js.Object {
  def create(): Trigger = js.native
  def onFormSubmit(): FormTriggerBuilder = js.native
  def onOpen(): FormTriggerBuilder = js.native
}

object FormTriggerBuilder {
  @scala.inline
  def apply(create: () => Trigger, onFormSubmit: () => FormTriggerBuilder, onOpen: () => FormTriggerBuilder): FormTriggerBuilder = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create), onFormSubmit = js.Any.fromFunction0(onFormSubmit), onOpen = js.Any.fromFunction0(onOpen))
    __obj.asInstanceOf[FormTriggerBuilder]
  }
  @scala.inline
  implicit class FormTriggerBuilderOps[Self <: FormTriggerBuilder] (val x: Self) extends AnyVal {
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
    def withOnFormSubmit(value: () => FormTriggerBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFormSubmit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnOpen(value: () => FormTriggerBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

