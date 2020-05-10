package typingsSlinky.peerDial.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Delegate extends js.Object {
  def getApp(appName: String): App = js.native
  def launchApp(appName: String, launchData: String, callback: js.Function1[/* data */ String, Unit]): Unit = js.native
  def stopApp(appName: String, pid: String, callback: js.Function1[/* data */ Boolean, Unit]): Unit = js.native
}

object Delegate {
  @scala.inline
  def apply(
    getApp: String => App,
    launchApp: (String, String, js.Function1[/* data */ String, Unit]) => Unit,
    stopApp: (String, String, js.Function1[/* data */ Boolean, Unit]) => Unit
  ): Delegate = {
    val __obj = js.Dynamic.literal(getApp = js.Any.fromFunction1(getApp), launchApp = js.Any.fromFunction3(launchApp), stopApp = js.Any.fromFunction3(stopApp))
    __obj.asInstanceOf[Delegate]
  }
  @scala.inline
  implicit class DelegateOps[Self <: Delegate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetApp(value: String => App): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getApp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLaunchApp(value: (String, String, js.Function1[/* data */ String, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchApp")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withStopApp(value: (String, String, js.Function1[/* data */ Boolean, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopApp")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

