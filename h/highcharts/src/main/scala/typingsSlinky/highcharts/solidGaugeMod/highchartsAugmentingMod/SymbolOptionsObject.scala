package typingsSlinky.highcharts.solidGaugeMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SymbolOptionsObject extends js.Object {
  /**
    * Whether to draw rounded edges.
    */
  var rounded: js.UndefOr[Boolean] = js.native
}

object SymbolOptionsObject {
  @scala.inline
  def apply(): SymbolOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SymbolOptionsObject]
  }
  @scala.inline
  implicit class SymbolOptionsObjectOps[Self <: SymbolOptionsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRounded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rounded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRounded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rounded")(js.undefined)
        ret
    }
  }
  
}

