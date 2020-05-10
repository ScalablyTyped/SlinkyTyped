package typingsSlinky.neteaseCaptcha

import typingsSlinky.neteaseCaptcha.NeteaseCaptcha.Config
import typingsSlinky.neteaseCaptcha.NeteaseCaptcha.InitFunction
import typingsSlinky.neteaseCaptcha.NeteaseCaptcha.onError
import typingsSlinky.neteaseCaptcha.NeteaseCaptcha.onLoad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  var initNECaptcha: js.UndefOr[InitFunction] = js.native
}

object Window {
  @scala.inline
  def apply(): Window = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Window]
  }
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitNECaptcha(
      value: (/* config */ Config, /* onLoad */ js.UndefOr[onLoad], /* onError */ js.UndefOr[onError]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initNECaptcha")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutInitNECaptcha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initNECaptcha")(js.undefined)
        ret
    }
  }
  
}

