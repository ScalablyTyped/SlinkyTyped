package typingsSlinky.koPlus

import typingsSlinky.knockout.KnockoutBindingHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//
// declare new binding handlers in ko.plus
//
@js.native
trait KnockoutBindingHandlers extends js.Object {
  var command: KnockoutBindingHandler[_, _, _] = js.native
  var loadingWhen: KnockoutBindingHandler[_, _, _] = js.native
  var sortBy: KnockoutBindingHandler[_, _, _] = js.native
}

object KnockoutBindingHandlers {
  @scala.inline
  def apply(
    command: KnockoutBindingHandler[_, _, _],
    loadingWhen: KnockoutBindingHandler[_, _, _],
    sortBy: KnockoutBindingHandler[_, _, _]
  ): KnockoutBindingHandlers = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], loadingWhen = loadingWhen.asInstanceOf[js.Any], sortBy = sortBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutBindingHandlers]
  }
  @scala.inline
  implicit class KnockoutBindingHandlersOps[Self <: KnockoutBindingHandlers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommand(value: KnockoutBindingHandler[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadingWhen(value: KnockoutBindingHandler[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingWhen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortBy(value: KnockoutBindingHandler[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortBy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

