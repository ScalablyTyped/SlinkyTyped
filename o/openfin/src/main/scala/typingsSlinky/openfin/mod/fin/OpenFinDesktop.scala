package typingsSlinky.openfin.mod.fin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenFinDesktop extends js.Object {
  var Application: OpenFinApplicationStatic = js.native
  var ExternalApp: OpenFinExternalApplicationStatic = js.native
  var ExternalWin: OpenFinExternalWindowStatic = js.native
  var Frame: OpenFinFrameStatic = js.native
  var GlobalHotkey: OpenFinGlobalHotkey = js.native
  var InterApplicationBus: OpenFinInterApplicationBus = js.native
  var Notification: OpenFinNotificationStatic = js.native
  var Platform: OpenFinPlatformStatic = js.native
  var System: OpenFinSystem = js.native
  var View: OpenFinViewStatic = js.native
  var Window: OpenFinWindowStatic = js.native
  def main(f: js.Function0[_]): Unit = js.native
}

object OpenFinDesktop {
  @scala.inline
  def apply(
    Application: OpenFinApplicationStatic,
    ExternalApp: OpenFinExternalApplicationStatic,
    ExternalWin: OpenFinExternalWindowStatic,
    Frame: OpenFinFrameStatic,
    GlobalHotkey: OpenFinGlobalHotkey,
    InterApplicationBus: OpenFinInterApplicationBus,
    Notification: OpenFinNotificationStatic,
    Platform: OpenFinPlatformStatic,
    System: OpenFinSystem,
    View: OpenFinViewStatic,
    Window: OpenFinWindowStatic,
    main: js.Function0[_] => Unit
  ): OpenFinDesktop = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ExternalApp = ExternalApp.asInstanceOf[js.Any], ExternalWin = ExternalWin.asInstanceOf[js.Any], Frame = Frame.asInstanceOf[js.Any], GlobalHotkey = GlobalHotkey.asInstanceOf[js.Any], InterApplicationBus = InterApplicationBus.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any], Platform = Platform.asInstanceOf[js.Any], System = System.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], Window = Window.asInstanceOf[js.Any], main = js.Any.fromFunction1(main))
    __obj.asInstanceOf[OpenFinDesktop]
  }
  @scala.inline
  implicit class OpenFinDesktopOps[Self <: OpenFinDesktop] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: OpenFinApplicationStatic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternalApp(value: OpenFinExternalApplicationStatic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExternalApp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternalWin(value: OpenFinExternalWindowStatic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExternalWin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrame(value: OpenFinFrameStatic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Frame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobalHotkey(value: OpenFinGlobalHotkey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalHotkey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterApplicationBus(value: OpenFinInterApplicationBus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InterApplicationBus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotification(value: OpenFinNotificationStatic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Notification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatform(value: OpenFinPlatformStatic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystem(value: OpenFinSystem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("System")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withView(value: OpenFinViewStatic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("View")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindow(value: OpenFinWindowStatic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Window")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMain(value: js.Function0[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("main")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

