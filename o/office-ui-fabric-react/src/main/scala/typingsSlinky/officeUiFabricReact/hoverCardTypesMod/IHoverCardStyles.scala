package typingsSlinky.officeUiFabricReact.hoverCardTypesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHoverCardStyles extends js.Object {
  /**
    * Style for the host element in the default enabled, non-toggled state.
    */
  var host: js.UndefOr[IStyle] = js.native
}

object IHoverCardStyles {
  @scala.inline
  def apply(): IHoverCardStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHoverCardStyles]
  }
  @scala.inline
  implicit class IHoverCardStylesOps[Self <: IHoverCardStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHost(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withHostNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(null)
        ret
    }
  }
  
}

