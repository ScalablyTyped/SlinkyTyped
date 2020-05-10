package typingsSlinky.officeUiFabricReact.personaTypesMod

import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPersonaProps extends IPersonaSharedProps {
  /**
    * Optional callback to access the IPersona interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IPersona]] = js.native
  /**
    * Optional custom renderer for the optional text.
    */
  var onRenderOptionalText: js.UndefOr[IRenderFunction[IPersonaProps]] = js.native
  /**
    * Optional custom renderer for the primary text.
    */
  var onRenderPrimaryText: js.UndefOr[IRenderFunction[IPersonaProps]] = js.native
  /**
    * Optional custom renderer for the secondary text.
    */
  var onRenderSecondaryText: js.UndefOr[IRenderFunction[IPersonaProps]] = js.native
  /**
    * Optional custom renderer for the tertiary text.
    */
  var onRenderTertiaryText: js.UndefOr[IRenderFunction[IPersonaProps]] = js.native
  /**
    * Call to provide customized styling that will layer on top of variant rules
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IPersonaStyleProps, IPersonaStyles]] = js.native
}

object IPersonaProps {
  @scala.inline
  def apply(): IPersonaProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPersonaProps]
  }
  @scala.inline
  implicit class IPersonaPropsOps[Self <: IPersonaProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentRefFunction1(value: /* ref */ IPersona | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[IPersona]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[IPersona]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderOptionalText(
      value: (/* props */ js.UndefOr[IPersonaProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderOptionalText")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderOptionalText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderOptionalText")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderPrimaryText(
      value: (/* props */ js.UndefOr[IPersonaProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderPrimaryText")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderPrimaryText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderPrimaryText")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderSecondaryText(
      value: (/* props */ js.UndefOr[IPersonaProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderSecondaryText")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderSecondaryText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderSecondaryText")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderTertiaryText(
      value: (/* props */ js.UndefOr[IPersonaProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderTertiaryText")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderTertiaryText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderTertiaryText")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: IPersonaStyleProps => Partial[IPersonaStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[IPersonaStyleProps, IPersonaStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
  }
  
}

