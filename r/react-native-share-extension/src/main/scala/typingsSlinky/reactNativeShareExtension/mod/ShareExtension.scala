package typingsSlinky.reactNativeShareExtension.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShareExtension extends js.Object {
  def close(): Unit = js.native
  def data(): js.Promise[ShareData] = js.native
  def openURL(uri: String): Unit = js.native
}

object ShareExtension {
  @scala.inline
  def apply(close: () => Unit, data: () => js.Promise[ShareData], openURL: String => Unit): ShareExtension = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), data = js.Any.fromFunction0(data), openURL = js.Any.fromFunction1(openURL))
    __obj.asInstanceOf[ShareExtension]
  }
  @scala.inline
  implicit class ShareExtensionOps[Self <: ShareExtension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withData(value: () => js.Promise[ShareData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOpenURL(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openURL")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

