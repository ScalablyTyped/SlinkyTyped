package typingsSlinky.reactNative.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppConfig extends js.Object {
  var appKey: String
  var component: js.UndefOr[ComponentProvider] = js.undefined
  var run: js.UndefOr[Runnable] = js.undefined
}

object AppConfig {
  @scala.inline
  def apply(appKey: String): AppConfig = {
    val __obj = js.Dynamic.literal(appKey = appKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppConfig]
  }
  @scala.inline
  implicit class AppConfigOps[Self <: AppConfig] (val x: Self) extends AnyVal {
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
    def setAppKey(value: String): Self = this.set("appKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponent(value: () => ReactComponentClass[js.Any]): Self = this.set("component", js.Any.fromFunction0(value))
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setRun(value: /* appParameters */ js.Any => Unit): Self = this.set("run", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRun: Self = this.set("run", js.undefined)
  }
  
}

