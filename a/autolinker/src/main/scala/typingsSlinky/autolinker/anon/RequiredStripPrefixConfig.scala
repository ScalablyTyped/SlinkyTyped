package typingsSlinky.autolinker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<autolinker.autolinker/dist/commonjs/autolinker.StripPrefixConfigObj> */
@js.native
trait RequiredStripPrefixConfig extends js.Object {
  var scheme: Boolean = js.native
  var www: Boolean = js.native
}

object RequiredStripPrefixConfig {
  @scala.inline
  def apply(scheme: Boolean, www: Boolean): RequiredStripPrefixConfig = {
    val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any], www = www.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredStripPrefixConfig]
  }
  @scala.inline
  implicit class RequiredStripPrefixConfigOps[Self <: RequiredStripPrefixConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScheme(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWww(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("www")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

