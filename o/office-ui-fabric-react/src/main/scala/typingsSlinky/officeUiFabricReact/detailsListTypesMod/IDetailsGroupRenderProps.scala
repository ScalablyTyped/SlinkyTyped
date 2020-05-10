package typingsSlinky.officeUiFabricReact.detailsListTypesMod

import slinky.core.facade.ReactElement
import typingsSlinky.officeUiFabricReact.groupedListTypesMod.IGroupRenderProps
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDetailsGroupRenderProps extends IGroupRenderProps {
  @JSName("onRenderFooter")
  var onRenderFooter_IDetailsGroupRenderProps: js.UndefOr[IRenderFunction[IDetailsGroupDividerProps]] = js.native
  @JSName("onRenderHeader")
  var onRenderHeader_IDetailsGroupRenderProps: js.UndefOr[IRenderFunction[IDetailsGroupDividerProps]] = js.native
}

object IDetailsGroupRenderProps {
  @scala.inline
  def apply(): IDetailsGroupRenderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDetailsGroupRenderProps]
  }
  @scala.inline
  implicit class IDetailsGroupRenderPropsOps[Self <: IDetailsGroupRenderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnRenderFooter(
      value: (/* props */ js.UndefOr[IDetailsGroupDividerProps], /* defaultRender */ js.UndefOr[
          js.Function1[/* props */ js.UndefOr[IDetailsGroupDividerProps], ReactElement | Null]
        ]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderFooter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderHeader(
      value: (/* props */ js.UndefOr[IDetailsGroupDividerProps], /* defaultRender */ js.UndefOr[
          js.Function1[/* props */ js.UndefOr[IDetailsGroupDividerProps], ReactElement | Null]
        ]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderHeader")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderHeader")(js.undefined)
        ret
    }
  }
  
}

