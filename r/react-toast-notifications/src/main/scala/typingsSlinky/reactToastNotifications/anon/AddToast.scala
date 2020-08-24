package typingsSlinky.reactToastNotifications.anon

import slinky.core.facade.ReactElement
import typingsSlinky.reactToastNotifications.mod.Options
import typingsSlinky.reactToastNotifications.mod.RemoveAllToasts
import typingsSlinky.reactToastNotifications.mod.RemoveToast
import typingsSlinky.reactToastNotifications.mod.UpdateToast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddToast extends js.Object {
  var addToast: typingsSlinky.reactToastNotifications.mod.AddToast = js.native
  var removeAllToasts: RemoveAllToasts = js.native
  var removeToast: RemoveToast = js.native
  var toastStack: js.Array[Appearance] = js.native
  var updateToast: UpdateToast = js.native
}

object AddToast {
  @scala.inline
  def apply(
    addToast: (/* content */ ReactElement, /* options */ js.UndefOr[Options], /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => Unit,
    removeAllToasts: () => Unit,
    removeToast: (/* id */ String, /* callback */ js.UndefOr[js.Function0[Unit]]) => Unit,
    toastStack: js.Array[Appearance],
    updateToast: (/* id */ String, /* options */ js.UndefOr[Options], /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => Unit
  ): AddToast = {
    val __obj = js.Dynamic.literal(addToast = js.Any.fromFunction3(addToast), removeAllToasts = js.Any.fromFunction0(removeAllToasts), removeToast = js.Any.fromFunction2(removeToast), toastStack = toastStack.asInstanceOf[js.Any], updateToast = js.Any.fromFunction3(updateToast))
    __obj.asInstanceOf[AddToast]
  }
  @scala.inline
  implicit class AddToastOps[Self <: AddToast] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddToast(
      value: (/* content */ ReactElement, /* options */ js.UndefOr[Options], /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => Unit
    ): Self = this.set("addToast", js.Any.fromFunction3(value))
    @scala.inline
    def setRemoveAllToasts(value: () => Unit): Self = this.set("removeAllToasts", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveToast(value: (/* id */ String, /* callback */ js.UndefOr[js.Function0[Unit]]) => Unit): Self = this.set("removeToast", js.Any.fromFunction2(value))
    @scala.inline
    def setToastStackVarargs(value: Appearance*): Self = this.set("toastStack", js.Array(value :_*))
    @scala.inline
    def setToastStack(value: js.Array[Appearance]): Self = this.set("toastStack", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateToast(
      value: (/* id */ String, /* options */ js.UndefOr[Options], /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => Unit
    ): Self = this.set("updateToast", js.Any.fromFunction3(value))
  }
  
}

