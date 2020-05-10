package typingsSlinky.officeUiFabricReact.selectedPeopleListMod

import slinky.core.facade.ReactElement
import typingsSlinky.officeUiFabricReact.baseSelectedItemsListTypesMod.ISelectedItemProps
import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaProps
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISelectedPeopleItemProps extends ISelectedItemProps[IExtendedPersonaProps] {
  var onExpandItem: js.UndefOr[js.Function0[Unit]] = js.native
  var renderPersonaCoin: js.UndefOr[IRenderFunction[IPersonaProps]] = js.native
  var renderPrimaryText: js.UndefOr[IRenderFunction[IPersonaProps]] = js.native
}

object ISelectedPeopleItemProps {
  @scala.inline
  def apply(ISelectedItemProps: ISelectedItemProps[IExtendedPersonaProps]): ISelectedPeopleItemProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ISelectedItemProps)
    __obj.asInstanceOf[ISelectedPeopleItemProps]
  }
  @scala.inline
  implicit class ISelectedPeopleItemPropsOps[Self <: ISelectedPeopleItemProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnExpandItem(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExpandItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnExpandItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExpandItem")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderPersonaCoin(
      value: (/* props */ js.UndefOr[IPersonaProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderPersonaCoin")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRenderPersonaCoin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderPersonaCoin")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderPrimaryText(
      value: (/* props */ js.UndefOr[IPersonaProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderPrimaryText")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRenderPrimaryText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderPrimaryText")(js.undefined)
        ret
    }
  }
  
}

