package typingsSlinky.emberObject.actionHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Ember.ActionHandler is available on some familiar classes including Ember.Route,
  * Ember.Component, and Ember.Controller. (Internally the mixin is used by Ember.CoreView,
  * Ember.ControllerMixin, and Ember.Route and available to the above classes through inheritance.)
  */
@js.native
trait ActionHandler extends js.Object {
  /**
    * The collection of functions, keyed by name, available on this ActionHandler as action targets.
    */
  var actions: ActionsHash = js.native
  /**
    * Triggers a named action on the ActionHandler. Any parameters supplied after the actionName
    * string will be passed as arguments to the action target function.
    *
    * If the ActionHandler has its target property set, actions may bubble to the target.
    * Bubbling happens when an actionName can not be found in the ActionHandler's actions
    * hash or if the action target function returns true.
    */
  def send(actionName: String, args: js.Any*): Unit = js.native
}

object ActionHandler {
  @scala.inline
  def apply(actions: ActionsHash, send: (String, /* repeated */ js.Any) => Unit): ActionHandler = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], send = js.Any.fromFunction2(send))
    __obj.asInstanceOf[ActionHandler]
  }
  @scala.inline
  implicit class ActionHandlerOps[Self <: ActionHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: ActionsHash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSend(value: (String, /* repeated */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

