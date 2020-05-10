package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.panelBaseMod.PanelVisibilityState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<office-ui-fabric-react.office-ui-fabric-react/lib/components/Panel/Panel.base.IPanelState> */
@js.native
trait ReadonlyIPanelState extends js.Object {
  val id: js.UndefOr[String] = js.native
  val isFooterSticky: js.UndefOr[Boolean] = js.native
  val visibility: PanelVisibilityState = js.native
}

object ReadonlyIPanelState {
  @scala.inline
  def apply(visibility: PanelVisibilityState): ReadonlyIPanelState = {
    val __obj = js.Dynamic.literal(visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyIPanelState]
  }
  @scala.inline
  implicit class ReadonlyIPanelStateOps[Self <: ReadonlyIPanelState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVisibility(value: PanelVisibilityState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFooterSticky(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFooterSticky")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFooterSticky: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFooterSticky")(js.undefined)
        ret
    }
  }
  
}

