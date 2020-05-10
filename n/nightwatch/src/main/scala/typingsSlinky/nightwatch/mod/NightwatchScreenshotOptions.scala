package typingsSlinky.nightwatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NightwatchScreenshotOptions extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.native
  var on_error: js.UndefOr[Boolean] = js.native
  var on_failure: js.UndefOr[Boolean] = js.native
  var path: js.UndefOr[String] = js.native
}

object NightwatchScreenshotOptions {
  @scala.inline
  def apply(): NightwatchScreenshotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NightwatchScreenshotOptions]
  }
  @scala.inline
  implicit class NightwatchScreenshotOptionsOps[Self <: NightwatchScreenshotOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withOn_error(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on_error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOn_error: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on_error")(js.undefined)
        ret
    }
    @scala.inline
    def withOn_failure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on_failure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOn_failure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on_failure")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
  }
  
}

