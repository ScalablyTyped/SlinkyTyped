package typingsSlinky.reactMosaicComponent.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnabledResizeOptions extends ResizeOptions {
  var minimumPaneSizePercentage: js.UndefOr[Double] = js.native
}

object EnabledResizeOptions {
  @scala.inline
  def apply(): EnabledResizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnabledResizeOptions]
  }
  @scala.inline
  implicit class EnabledResizeOptionsOps[Self <: EnabledResizeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMinimumPaneSizePercentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumPaneSizePercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumPaneSizePercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumPaneSizePercentage")(js.undefined)
        ret
    }
  }
  
}

