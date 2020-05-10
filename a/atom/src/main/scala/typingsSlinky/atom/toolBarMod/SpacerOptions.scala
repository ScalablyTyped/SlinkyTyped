package typingsSlinky.atom.toolBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpacerOptions extends js.Object {
  /** (optional) defaults to `50` */
  var priority: js.UndefOr[Double] = js.native
}

object SpacerOptions {
  @scala.inline
  def apply(): SpacerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpacerOptions]
  }
  @scala.inline
  implicit class SpacerOptionsOps[Self <: SpacerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
  }
  
}

