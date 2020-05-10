package typingsSlinky.puppeteer.mod

import typingsSlinky.puppeteer.AnonDeviceScaleFactor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserOptions extends js.Object {
  /**
    * Sets a consistent viewport for each page. Defaults to an 800x600 viewport. null disables the default viewport.
    */
  var defaultViewport: js.UndefOr[AnonDeviceScaleFactor | Null] = js.native
  /**
    * Whether to ignore HTTPS errors during navigation.
    * @default false
    */
  var ignoreHTTPSErrors: js.UndefOr[Boolean] = js.native
  /**
    * Slows down Puppeteer operations by the specified amount of milliseconds.
    * Useful so that you can see what is going on.
    */
  var slowMo: js.UndefOr[Double] = js.native
}

object BrowserOptions {
  @scala.inline
  def apply(): BrowserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserOptions]
  }
  @scala.inline
  implicit class BrowserOptionsOps[Self <: BrowserOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultViewport(value: AnonDeviceScaleFactor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultViewport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultViewport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultViewport")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultViewportNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultViewport")(null)
        ret
    }
    @scala.inline
    def withIgnoreHTTPSErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreHTTPSErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreHTTPSErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreHTTPSErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withSlowMo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slowMo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlowMo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slowMo")(js.undefined)
        ret
    }
  }
  
}

