package typingsSlinky.reactAdaptiveHooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HasMediaConfig extends js.Object {
  var hasMediaConfig: Boolean = js.native
  var supported: Boolean = js.native
}

object HasMediaConfig {
  @scala.inline
  def apply(hasMediaConfig: Boolean, supported: Boolean): HasMediaConfig = {
    val __obj = js.Dynamic.literal(hasMediaConfig = hasMediaConfig.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasMediaConfig]
  }
  @scala.inline
  implicit class HasMediaConfigOps[Self <: HasMediaConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasMediaConfig(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasMediaConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supported")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

