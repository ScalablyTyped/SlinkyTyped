package typingsSlinky.googleAppsScript.GoogleAppsScript.Script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A builder for document triggers.
  */
@js.native
trait DocumentTriggerBuilder extends js.Object {
  def create(): Trigger = js.native
  def onOpen(): DocumentTriggerBuilder = js.native
}

object DocumentTriggerBuilder {
  @scala.inline
  def apply(create: () => Trigger, onOpen: () => DocumentTriggerBuilder): DocumentTriggerBuilder = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create), onOpen = js.Any.fromFunction0(onOpen))
    __obj.asInstanceOf[DocumentTriggerBuilder]
  }
  @scala.inline
  implicit class DocumentTriggerBuilderOps[Self <: DocumentTriggerBuilder] (val x: Self) extends AnyVal {
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
    def withOnOpen(value: () => DocumentTriggerBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

