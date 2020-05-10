package typingsSlinky.firebaseAnalytics.mod.firebaseAppTypesAugmentingMod

import typingsSlinky.firebaseAnalyticsTypes.mod.FirebaseAnalytics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirebaseApp extends js.Object {
  def analytics(): FirebaseAnalytics = js.native
}

object FirebaseApp {
  @scala.inline
  def apply(analytics: () => FirebaseAnalytics): FirebaseApp = {
    val __obj = js.Dynamic.literal(analytics = js.Any.fromFunction0(analytics))
    __obj.asInstanceOf[FirebaseApp]
  }
  @scala.inline
  implicit class FirebaseAppOps[Self <: FirebaseApp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnalytics(value: () => FirebaseAnalytics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analytics")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

