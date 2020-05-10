package typingsSlinky.expo.linkingModuleWebMod

import typingsSlinky.expo.expoStrings.url
import typingsSlinky.expo.linkingTypesMod.URLListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Linking extends js.Object {
  @JSName("addEventListener")
  def addEventListener_url(`type`: url, listener: URLListener): Unit = js.native
  def canOpenURL(url: String): js.Promise[Boolean] = js.native
  def getInitialURL(): js.Promise[String] = js.native
  def openURL(url: String): js.Promise[Unit] = js.native
  @JSName("removeEventListener")
  def removeEventListener_url(`type`: url, listener: URLListener): Unit = js.native
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
    def withAddEventListener(value: (url, URLListener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCanOpenURL(value: String => js.Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canOpenURL")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetInitialURL(value: () => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInitialURL")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOpenURL(value: String => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openURL")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveEventListener(value: (url, URLListener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

