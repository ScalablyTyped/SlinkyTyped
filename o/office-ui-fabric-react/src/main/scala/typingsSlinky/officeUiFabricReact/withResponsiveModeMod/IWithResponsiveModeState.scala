package typingsSlinky.officeUiFabricReact.withResponsiveModeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWithResponsiveModeState extends js.Object {
  var responsiveMode: js.UndefOr[ResponsiveMode] = js.native
}

object IWithResponsiveModeState {
  @scala.inline
  def apply(): IWithResponsiveModeState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWithResponsiveModeState]
  }
  @scala.inline
  implicit class IWithResponsiveModeStateOps[Self <: IWithResponsiveModeState] (val x: Self) extends AnyVal {
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

