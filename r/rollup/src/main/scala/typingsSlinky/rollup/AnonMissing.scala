package typingsSlinky.rollup

import typingsSlinky.rollup.mod.DecodedSourceMapOrMissing
import typingsSlinky.rollup.rollupBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMissing extends DecodedSourceMapOrMissing {
  var missing: `true` = js.native
  var plugin: String = js.native
}

object AnonMissing {
  @scala.inline
  def apply(missing: `true`, plugin: String): AnonMissing = {
    val __obj = js.Dynamic.literal(missing = missing.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMissing]
  }
  @scala.inline
  implicit class AnonMissingOps[Self <: AnonMissing] (val x: Self) extends AnyVal {
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

