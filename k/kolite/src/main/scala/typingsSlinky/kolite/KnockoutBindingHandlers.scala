package typingsSlinky.kolite

import typingsSlinky.knockout.KnockoutBindingHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutBindingHandlers extends js.Object {
  var activity: KoLiteActivityBindingHandler = js.native
  var command: KnockoutBindingHandler[_, _, _] = js.native
}

object KnockoutBindingHandlers {
  @scala.inline
  def apply(activity: KoLiteActivityBindingHandler, command: KnockoutBindingHandler[_, _, _]): KnockoutBindingHandlers = {
    val __obj = js.Dynamic.literal(activity = activity.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutBindingHandlers]
  }
  @scala.inline
  implicit class KnockoutBindingHandlersOps[Self <: KnockoutBindingHandlers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivity(value: KoLiteActivityBindingHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommand(value: KnockoutBindingHandler[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

