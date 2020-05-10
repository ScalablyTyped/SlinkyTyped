package typingsSlinky.emberComponent.textSupportMod

import typingsSlinky.emberComponent.targetActionSupportMod.TargetActionSupport
import typingsSlinky.emberComponent.targetActionSupportMod.TriggerActionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `TextSupport` is a shared mixin used by both `Ember.TextField` and
  * `Ember.TextArea`. `TextSupport` adds a number of methods that allow you to
  * specify a controller action to invoke when a certain event is fired on your
  * text field or textarea. The specifed controller action would get the current
  * value of the field passed in as the only argument unless the value of
  * the field is empty. In that case, the instance of the field itself is passed
  * in as the only argument.
  */
@js.native
trait TextSupport extends TargetActionSupport {
  var action: String = js.native
  var bubbles: Boolean = js.native
  var onEvent: String = js.native
  // tslint:disable-next-line:ban-types
  def cancel(event: js.Function): Unit = js.native
  // tslint:disable-next-line:ban-types
  def focusIn(event: js.Function): Unit = js.native
  // tslint:disable-next-line:ban-types
  def focusOut(event: js.Function): Unit = js.native
  // tslint:disable-next-line:ban-types
  def insertNewLine(event: js.Function): Unit = js.native
  // tslint:disable-next-line:ban-types
  def keyPress(event: js.Function): Unit = js.native
}

object TextSupport {
  @scala.inline
  def apply(
    action: String,
    bubbles: Boolean,
    cancel: js.Function => Unit,
    focusIn: js.Function => Unit,
    focusOut: js.Function => Unit,
    insertNewLine: js.Function => Unit,
    keyPress: js.Function => Unit,
    onEvent: String,
    triggerAction: TriggerActionOptions => Boolean
  ): TextSupport = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancel = js.Any.fromFunction1(cancel), focusIn = js.Any.fromFunction1(focusIn), focusOut = js.Any.fromFunction1(focusOut), insertNewLine = js.Any.fromFunction1(insertNewLine), keyPress = js.Any.fromFunction1(keyPress), onEvent = onEvent.asInstanceOf[js.Any], triggerAction = js.Any.fromFunction1(triggerAction))
    __obj.asInstanceOf[TextSupport]
  }
  @scala.inline
  implicit class TextSupportOps[Self <: TextSupport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBubbles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancel(value: js.Function => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFocusIn(value: js.Function => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusIn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFocusOut(value: js.Function => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsertNewLine(value: js.Function => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertNewLine")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKeyPress(value: js.Function => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnEvent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEvent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

