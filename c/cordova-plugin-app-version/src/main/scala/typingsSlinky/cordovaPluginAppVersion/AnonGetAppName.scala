package typingsSlinky.cordovaPluginAppVersion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGetAppName extends js.Object {
  def getAppName(): js.Promise[String] = js.native
  def getPackageName(): js.Promise[String] = js.native
  def getVersionCode(): js.Promise[String] = js.native
  def getVersionNumber(): js.Promise[String] = js.native
}

object AnonGetAppName {
  @scala.inline
  def apply(
    getAppName: () => js.Promise[String],
    getPackageName: () => js.Promise[String],
    getVersionCode: () => js.Promise[String],
    getVersionNumber: () => js.Promise[String]
  ): AnonGetAppName = {
    val __obj = js.Dynamic.literal(getAppName = js.Any.fromFunction0(getAppName), getPackageName = js.Any.fromFunction0(getPackageName), getVersionCode = js.Any.fromFunction0(getVersionCode), getVersionNumber = js.Any.fromFunction0(getVersionNumber))
    __obj.asInstanceOf[AnonGetAppName]
  }
  @scala.inline
  implicit class AnonGetAppNameOps[Self <: AnonGetAppName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAppName(value: () => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAppName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPackageName(value: () => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPackageName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetVersionCode(value: () => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVersionCode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetVersionNumber(value: () => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVersionNumber")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

