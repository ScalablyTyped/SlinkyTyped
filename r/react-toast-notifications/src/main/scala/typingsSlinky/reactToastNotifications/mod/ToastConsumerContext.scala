package typingsSlinky.reactToastNotifications.mod

import slinky.core.TagMod
import typingsSlinky.reactToastNotifications.AnonAppearance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToastConsumerContext extends js.Object {
  var add: AddToast = js.native
  var remove: RemoveToast = js.native
  var toasts: js.Array[AnonAppearance] = js.native
}

object ToastConsumerContext {
  @scala.inline
  def apply(
    add: (/* content */ TagMod[Any], /* options */ js.UndefOr[Options], /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => Unit,
    remove: (/* id */ String, /* callback */ js.UndefOr[js.Function0[Unit]]) => Unit,
    toasts: js.Array[AnonAppearance]
  ): ToastConsumerContext = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction3(add), remove = js.Any.fromFunction2(remove), toasts = toasts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastConsumerContext]
  }
  @scala.inline
  implicit class ToastConsumerContextOps[Self <: ToastConsumerContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(
      value: (/* content */ TagMod[Any], /* options */ js.UndefOr[Options], /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRemove(value: (/* id */ String, /* callback */ js.UndefOr[js.Function0[Unit]]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withToasts(value: js.Array[AnonAppearance]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toasts")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

