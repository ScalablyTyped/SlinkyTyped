package typingsSlinky.polyfillService.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPolyfillStringOptions extends GetPolyfillsOptions {
  var minify: js.UndefOr[Boolean] = js.native
  var unknown: js.UndefOr[Unknown] = js.native
}

object GetPolyfillStringOptions {
  @scala.inline
  def apply(uaString: String): GetPolyfillStringOptions = {
    val __obj = js.Dynamic.literal(uaString = uaString.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPolyfillStringOptions]
  }
  @scala.inline
  implicit class GetPolyfillStringOptionsOps[Self <: GetPolyfillStringOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMinify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minify")(js.undefined)
        ret
    }
    @scala.inline
    def withUnknown(value: Unknown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnknown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknown")(js.undefined)
        ret
    }
  }
  
}

