package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonResponsiveMode extends js.Object {
  var responsiveMode: js.UndefOr[ResponsiveMode] = js.native
}

object AnonResponsiveMode {
  @scala.inline
  def apply(): AnonResponsiveMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonResponsiveMode]
  }
  @scala.inline
  implicit class AnonResponsiveModeOps[Self <: AnonResponsiveMode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResponsiveMode(value: ResponsiveMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsiveMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveMode")(js.undefined)
        ret
    }
  }
  
}

