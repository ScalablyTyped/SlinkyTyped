package typingsSlinky.ionicCore.anon

import org.scalajs.dom.raw.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Android extends js.Object {
  def android(win: Window): Boolean = js.native
  def capacitor(win: js.Any): Boolean = js.native
  def cordova(win: js.Any): Boolean = js.native
  def desktop(win: Window): Boolean = js.native
  def electron(win: Window): Boolean = js.native
  def hybrid(win: Window): Boolean = js.native
  def ios(win: Window): Boolean = js.native
  def ipad(win: Window): Boolean = js.native
  def iphone(win: Window): Boolean = js.native
  def mobile(win: Window): Boolean = js.native
  def mobileweb(win: Window): Boolean = js.native
  def phablet(win: Window): Boolean = js.native
  def pwa(win: Window): Boolean = js.native
  def tablet(win: Window): Boolean = js.native
}

object Android {
  @scala.inline
  def apply(
    android: Window => Boolean,
    capacitor: js.Any => Boolean,
    cordova: js.Any => Boolean,
    desktop: Window => Boolean,
    electron: Window => Boolean,
    hybrid: Window => Boolean,
    ios: Window => Boolean,
    ipad: Window => Boolean,
    iphone: Window => Boolean,
    mobile: Window => Boolean,
    mobileweb: Window => Boolean,
    phablet: Window => Boolean,
    pwa: Window => Boolean,
    tablet: Window => Boolean
  ): Android = {
    val __obj = js.Dynamic.literal(android = js.Any.fromFunction1(android), capacitor = js.Any.fromFunction1(capacitor), cordova = js.Any.fromFunction1(cordova), desktop = js.Any.fromFunction1(desktop), electron = js.Any.fromFunction1(electron), hybrid = js.Any.fromFunction1(hybrid), ios = js.Any.fromFunction1(ios), ipad = js.Any.fromFunction1(ipad), iphone = js.Any.fromFunction1(iphone), mobile = js.Any.fromFunction1(mobile), mobileweb = js.Any.fromFunction1(mobileweb), phablet = js.Any.fromFunction1(phablet), pwa = js.Any.fromFunction1(pwa), tablet = js.Any.fromFunction1(tablet))
    __obj.asInstanceOf[Android]
  }
  @scala.inline
  implicit class AndroidOps[Self <: Android] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroid(value: Window => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("android")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCapacitor(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacitor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCordova(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cordova")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDesktop(value: Window => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withElectron(value: Window => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electron")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHybrid(value: Window => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hybrid")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIos(value: Window => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ios")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIpad(value: Window => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIphone(value: Window => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iphone")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMobile(value: Window => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMobileweb(value: Window => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileweb")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPhablet(value: Window => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phablet")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPwa(value: Window => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pwa")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTablet(value: Window => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tablet")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

