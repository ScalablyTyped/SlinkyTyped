package typingsSlinky.karmaBrowserify.mod

import typingsSlinky.browserify.mod.BrowserifyObject
import typingsSlinky.browserify.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserifyOptions extends Options {
  /**
    * You may perform additional configuration in a function passed as the configure option
    * and that receives the browserify instance as an argument.
    * See {@link https://github.com/nikku/karma-browserify#additional-bundle-configuration}
    */
  var configure: js.UndefOr[js.Function1[/* bundle */ BrowserifyObject, Unit]] = js.native
}

object BrowserifyOptions {
  @scala.inline
  def apply(): BrowserifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserifyOptions]
  }
  @scala.inline
  implicit class BrowserifyOptionsOps[Self <: BrowserifyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigure(value: /* bundle */ BrowserifyObject => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configure")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutConfigure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configure")(js.undefined)
        ret
    }
  }
  
}

