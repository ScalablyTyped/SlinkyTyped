package typingsSlinky.reactDashToastDashNotifications

import slinky.core.TagMod
import typingsSlinky.reactDashToastDashNotifications.reactDashToastDashNotificationsMod.AddToast
import typingsSlinky.reactDashToastDashNotifications.reactDashToastDashNotificationsMod.Options
import typingsSlinky.reactDashToastDashNotifications.reactDashToastDashNotificationsMod.RemoveAllToasts
import typingsSlinky.reactDashToastDashNotifications.reactDashToastDashNotificationsMod.RemoveToast
import typingsSlinky.reactDashToastDashNotifications.reactDashToastDashNotificationsMod.UpdateToast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddToast extends js.Object {
  var addToast: AddToast
  var removeAllToasts: RemoveAllToasts
  var removeToast: RemoveToast
  var toastStack: js.Array[Anon_Appearance]
  var updateToast: UpdateToast
}

object Anon_AddToast {
  @scala.inline
  def apply(
    addToast: (/* content */ TagMod[Any], /* options */ js.UndefOr[Options], /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => Unit,
    removeAllToasts: () => Unit,
    removeToast: (/* id */ String, /* callback */ js.UndefOr[js.Function0[Unit]]) => Unit,
    toastStack: js.Array[Anon_Appearance],
    updateToast: (/* id */ String, /* options */ js.UndefOr[Options], /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => Unit
  ): Anon_AddToast = {
    val __obj = js.Dynamic.literal(addToast = js.Any.fromFunction3(addToast), removeAllToasts = js.Any.fromFunction0(removeAllToasts), removeToast = js.Any.fromFunction2(removeToast), toastStack = toastStack.asInstanceOf[js.Any], updateToast = js.Any.fromFunction3(updateToast))
  
    __obj.asInstanceOf[Anon_AddToast]
  }
}

