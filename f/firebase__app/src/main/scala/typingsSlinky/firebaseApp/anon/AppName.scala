package typingsSlinky.firebaseApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppName extends js.Object {
  var appName: String = js.native
}

object AppName {
  @scala.inline
  def apply(appName: String): AppName = {
    val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppName]
  }
  @scala.inline
  implicit class AppNameOps[Self <: AppName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

