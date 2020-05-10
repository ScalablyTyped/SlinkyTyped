package typingsSlinky.reactToastNotifications

import slinky.core.TagMod
import typingsSlinky.reactToastNotifications.mod.AddToast
import typingsSlinky.reactToastNotifications.mod.Options
import typingsSlinky.reactToastNotifications.mod.RemoveAllToasts
import typingsSlinky.reactToastNotifications.mod.RemoveToast
import typingsSlinky.reactToastNotifications.mod.UpdateToast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddToast extends js.Object {
  var addToast: AddToast = js.native
  var removeAllToasts: RemoveAllToasts = js.native
  var removeToast: RemoveToast = js.native
  var toastStack: js.Array[AnonAppearance] = js.native
  var updateToast: UpdateToast = js.native
}

object AnonAddToast {
  @scala.inline
  def apply(
    addToast: (/* content */ TagMod[Any], /* options */ js.UndefOr[Options], /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => Unit,
    removeAllToasts: () => Unit,
    removeToast: (/* id */ String, /* callback */ js.UndefOr[js.Function0[Unit]]) => Unit,
    toastStack: js.Array[AnonAppearance],
    updateToast: (/* id */ String, /* options */ js.UndefOr[Options], /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => Unit
  ): AnonAddToast = {
    val __obj = js.Dynamic.literal(addToast = js.Any.fromFunction3(addToast), removeAllToasts = js.Any.fromFunction0(removeAllToasts), removeToast = js.Any.fromFunction2(removeToast), toastStack = toastStack.asInstanceOf[js.Any], updateToast = js.Any.fromFunction3(updateToast))
    __obj.asInstanceOf[AnonAddToast]
  }
  @scala.inline
  implicit class AnonAddToastOps[Self <: AnonAddToast] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddToast(
      value: (/* content */ TagMod[Any], /* options */ js.UndefOr[Options], /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addToast")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRemoveAllToasts(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAllToasts")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveToast(value: (/* id */ String, /* callback */ js.UndefOr[js.Function0[Unit]]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeToast")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withToastStack(value: js.Array[AnonAppearance]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toastStack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateToast(
      value: (/* id */ String, /* options */ js.UndefOr[Options], /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateToast")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

