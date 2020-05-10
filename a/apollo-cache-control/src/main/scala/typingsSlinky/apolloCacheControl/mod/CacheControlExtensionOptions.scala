package typingsSlinky.apolloCacheControl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheControlExtensionOptions extends js.Object {
  var calculateHttpHeaders: js.UndefOr[Boolean] = js.native
  var defaultMaxAge: js.UndefOr[Double] = js.native
  var stripFormattedExtensions: js.UndefOr[Boolean] = js.native
}

object CacheControlExtensionOptions {
  @scala.inline
  def apply(): CacheControlExtensionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheControlExtensionOptions]
  }
  @scala.inline
  implicit class CacheControlExtensionOptionsOps[Self <: CacheControlExtensionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalculateHttpHeaders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateHttpHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalculateHttpHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateHttpHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultMaxAge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultMaxAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultMaxAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultMaxAge")(js.undefined)
        ret
    }
    @scala.inline
    def withStripFormattedExtensions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripFormattedExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripFormattedExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripFormattedExtensions")(js.undefined)
        ret
    }
  }
  
}

