package typingsSlinky.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChromeArgOptions extends js.Object {
  /**
    * Additional arguments to pass to the browser instance.
    * The list of Chromium flags can be found here.
    */
  var args: js.UndefOr[js.Array[String]] = js.native
  /**
    * Whether to auto-open a DevTools panel for each tab.
    * If this option is true, the headless option will be set false.
    */
  var devtools: js.UndefOr[Boolean] = js.native
  /**
    * Whether to run browser in headless mode.
    * @default true unless the devtools option is true.
    */
  var headless: js.UndefOr[Boolean] = js.native
  /**
    * Path to a User Data Directory.
    */
  var userDataDir: js.UndefOr[String] = js.native
}

object ChromeArgOptions {
  @scala.inline
  def apply(): ChromeArgOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChromeArgOptions]
  }
  @scala.inline
  implicit class ChromeArgOptionsOps[Self <: ChromeArgOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
    @scala.inline
    def withDevtools(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devtools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevtools: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devtools")(js.undefined)
        ret
    }
    @scala.inline
    def withHeadless(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headless")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadless: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headless")(js.undefined)
        ret
    }
    @scala.inline
    def withUserDataDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDataDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserDataDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDataDir")(js.undefined)
        ret
    }
  }
  
}

