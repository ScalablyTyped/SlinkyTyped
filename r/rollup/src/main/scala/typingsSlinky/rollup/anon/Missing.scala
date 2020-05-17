package typingsSlinky.rollup.anon

import typingsSlinky.rollup.mod.DecodedSourceMapOrMissing
import typingsSlinky.rollup.rollupBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Missing extends DecodedSourceMapOrMissing {
  var missing: `true` = js.native
  var plugin: String = js.native
}

object Missing {
  @scala.inline
  def apply(missing: `true`, plugin: String): Missing = {
    val __obj = js.Dynamic.literal(missing = missing.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Missing]
  }
  @scala.inline
  implicit class MissingOps[Self <: Missing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMissing(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlugin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugin")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

