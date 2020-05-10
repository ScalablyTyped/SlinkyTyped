package typingsSlinky.kineticjs.Kinetic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerConfig extends ObjectOptionsConfig {
  var clearBeforeDraw: js.UndefOr[Boolean] = js.native
}

object LayerConfig {
  @scala.inline
  def apply(): LayerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerConfig]
  }
  @scala.inline
  implicit class LayerConfigOps[Self <: LayerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearBeforeDraw(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearBeforeDraw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearBeforeDraw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearBeforeDraw")(js.undefined)
        ret
    }
  }
  
}

