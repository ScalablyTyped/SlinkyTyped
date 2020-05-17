package typingsSlinky.officeUiFabricReact.anon

import org.scalajs.dom.raw.Element
import slinky.core.facade.ReactRef
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.officeUiFabricReact.colorRectangleTypesMod.IColorRectangle
import typingsSlinky.officeUiFabricReact.colorRectangleTypesMod.IColorRectangleStyleProps
import typingsSlinky.officeUiFabricReact.colorRectangleTypesMod.IColorRectangleStyles
import typingsSlinky.officeUiFabricReact.interfacesMod.IColor
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<office-ui-fabric-react.office-ui-fabric-react/lib/components/ColorPicker/ColorRectangle/ColorRectangle.types.IColorRectangleProps> */
@js.native
trait PartialIColorRectanglePro extends js.Object {
  var ariaDescription: js.UndefOr[String] = js.native
  var ariaLabel: js.UndefOr[String] = js.native
  var ariaValueFormat: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  var color: js.UndefOr[IColor] = js.native
  var componentRef: js.UndefOr[IRefObject[IColorRectangle]] = js.native
  var minSize: js.UndefOr[Double] = js.native
  var onChange: js.UndefOr[
    js.Function2[
      /* ev */ SyntheticMouseEvent[Element] | SyntheticKeyboardEvent[Element], 
      /* color */ IColor, 
      scala.Unit
    ]
  ] = js.native
  var styles: js.UndefOr[IStyleFunctionOrObject[IColorRectangleStyleProps, IColorRectangleStyles]] = js.native
  var theme: js.UndefOr[ITheme] = js.native
}

object PartialIColorRectanglePro {
  @scala.inline
  def apply(): PartialIColorRectanglePro = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIColorRectanglePro]
  }
  @scala.inline
  implicit class PartialIColorRectangleProOps[Self <: PartialIColorRectanglePro] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAriaDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaValueFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaValueFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaValueFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaValueFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: IColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentRefFunction1(value: /* ref */ IColorRectangle | Null => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[IColorRectangle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[IColorRectangle]): Self = {
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
    def withMinSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(
      value: (/* ev */ SyntheticMouseEvent[Element] | SyntheticKeyboardEvent[Element], /* color */ IColor) => scala.Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: IColorRectangleStyleProps => Partial[IColorRectangleStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[IColorRectangleStyleProps, IColorRectangleStyles]): Self = {
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
    @scala.inline
    def withTheme(value: ITheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

