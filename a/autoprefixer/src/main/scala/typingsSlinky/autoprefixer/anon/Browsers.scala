package typingsSlinky.autoprefixer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Browsers extends js.Object {
  var browsers: js.Any = js.native
  var prefixes: js.Any = js.native
}

object Browsers {
  @scala.inline
  def apply(browsers: js.Any, prefixes: js.Any): Browsers = {
    val __obj = js.Dynamic.literal(browsers = browsers.asInstanceOf[js.Any], prefixes = prefixes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Browsers]
  }
  @scala.inline
  implicit class BrowsersOps[Self <: Browsers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrowsers(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browsers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefixes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

