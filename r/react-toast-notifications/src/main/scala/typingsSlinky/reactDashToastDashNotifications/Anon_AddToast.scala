package typingsSlinky.reactDashToastDashNotifications

import slinky.core.TagMod
import typingsSlinky.reactDashToastDashNotifications.reactDashToastDashNotificationsMod.AddToast
import typingsSlinky.reactDashToastDashNotifications.reactDashToastDashNotificationsMod.Options
import typingsSlinky.reactDashToastDashNotifications.reactDashToastDashNotificationsMod.RemoveToast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddToast extends js.Object {
  var addToast: AddToast
  var removeToast: RemoveToast
  var toastStack: js.Array[Anon_Appearance]
}

object Anon_AddToast {
  @scala.inline
  def apply(
    addToast: (/* content */ TagMod[Any], /* options */ js.UndefOr[Options], /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => Unit,
    removeToast: (/* id */ String, /* callback */ js.Function0[Unit]) => Unit,
    toastStack: js.Array[Anon_Appearance]
  ): Anon_AddToast = {
    val __obj = js.Dynamic.literal(addToast = js.Any.fromFunction3(addToast), removeToast = js.Any.fromFunction2(removeToast), toastStack = toastStack.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AddToast]
  }
}

