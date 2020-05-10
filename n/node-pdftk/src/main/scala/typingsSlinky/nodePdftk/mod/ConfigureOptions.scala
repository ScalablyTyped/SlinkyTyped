package typingsSlinky.nodePdftk.mod

import typingsSlinky.nodePdftk.nodePdftkBooleans.`true`
import typingsSlinky.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigureOptions extends js.Object {
  var Promise: PromiseConstructor = js.native
  var bin: String = js.native
  var ignoreWarnings: `true` = js.native
  var tempDir: String = js.native
}

object ConfigureOptions {
  @scala.inline
  def apply(Promise: PromiseConstructor, bin: String, ignoreWarnings: `true`, tempDir: String): ConfigureOptions = {
    val __obj = js.Dynamic.literal(Promise = Promise.asInstanceOf[js.Any], bin = bin.asInstanceOf[js.Any], ignoreWarnings = ignoreWarnings.asInstanceOf[js.Any], tempDir = tempDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigureOptions]
  }
  @scala.inline
  implicit class ConfigureOptionsOps[Self <: ConfigureOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPromise(value: PromiseConstructor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Promise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnoreWarnings(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreWarnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTempDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempDir")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

