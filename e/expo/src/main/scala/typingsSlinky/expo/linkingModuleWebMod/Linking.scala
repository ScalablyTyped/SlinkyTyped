package typingsSlinky.expo.linkingModuleWebMod

import typingsSlinky.expo.expoStrings.url
import typingsSlinky.expo.linkingTypesMod.URLListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Linking extends js.Object {
  @JSName("addEventListener")
  def addEventListener_url(`type`: url, listener: URLListener): Unit
  def canOpenURL(url: String): js.Promise[Boolean]
  def getInitialURL(): js.Promise[String]
  def openURL(url: String): js.Promise[Unit]
  @JSName("removeEventListener")
  def removeEventListener_url(`type`: url, listener: URLListener): Unit
}

object Linking {
  @scala.inline
  def apply(
    addEventListener: (url, URLListener) => Unit,
    canOpenURL: String => js.Promise[Boolean],
    getInitialURL: () => js.Promise[String],
    openURL: String => js.Promise[Unit],
    removeEventListener: (url, URLListener) => Unit
  ): Linking = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), canOpenURL = js.Any.fromFunction1(canOpenURL), getInitialURL = js.Any.fromFunction0(getInitialURL), openURL = js.Any.fromFunction1(openURL), removeEventListener = js.Any.fromFunction2(removeEventListener))
    __obj.asInstanceOf[Linking]
  }
  @scala.inline
  implicit class LinkingOps[Self <: Linking] (val x: Self) extends AnyVal {
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
    def setAddEventListener(value: (url, URLListener) => Unit): Self = this.set("addEventListener", js.Any.fromFunction2(value))
    @scala.inline
    def setCanOpenURL(value: String => js.Promise[Boolean]): Self = this.set("canOpenURL", js.Any.fromFunction1(value))
    @scala.inline
    def setGetInitialURL(value: () => js.Promise[String]): Self = this.set("getInitialURL", js.Any.fromFunction0(value))
    @scala.inline
    def setOpenURL(value: String => js.Promise[Unit]): Self = this.set("openURL", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveEventListener(value: (url, URLListener) => Unit): Self = this.set("removeEventListener", js.Any.fromFunction2(value))
  }
  
}

