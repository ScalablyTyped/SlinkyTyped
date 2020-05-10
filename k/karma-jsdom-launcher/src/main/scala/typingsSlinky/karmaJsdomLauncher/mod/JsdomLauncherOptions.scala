package typingsSlinky.karmaJsdomLauncher.mod

import typingsSlinky.jsdom.mod.ConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsdomLauncherOptions extends js.Object {
  /**
    * You can pass options directly to jsdom as shown below.
    * See jsdom's own documentation for all supported options.
    */
  var jsdom: ConstructorOptions = js.native
}

object JsdomLauncherOptions {
  @scala.inline
  def apply(jsdom: ConstructorOptions): JsdomLauncherOptions = {
    val __obj = js.Dynamic.literal(jsdom = jsdom.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsdomLauncherOptions]
  }
  @scala.inline
  implicit class JsdomLauncherOptionsOps[Self <: JsdomLauncherOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJsdom(value: ConstructorOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsdom")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

