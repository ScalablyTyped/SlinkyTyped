package typingsSlinky.officeUiFabricReact.anon

import org.scalajs.dom.raw.Element
import slinky.core.facade.ReactRef
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.officeUiFabricReact.colorRectangleTypesMod.IColorRectangle
import typingsSlinky.officeUiFabricReact.colorRectangleTypesMod.IColorRectangleStyleProps
import typingsSlinky.officeUiFabricReact.colorRectangleTypesMod.IColorRectangleStyles
import typingsSlinky.officeUiFabricReact.interfacesMod.IColor
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAriaDescription(value: String): Self = this.set("ariaDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaDescription: Self = this.set("ariaDescription", js.undefined)
    
    @scala.inline
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    
    @scala.inline
    def setAriaValueFormat(value: String): Self = this.set("ariaValueFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaValueFormat: Self = this.set("ariaValueFormat", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setColor(value: IColor): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IColorRectangle | Null => scala.Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponentRefRefObject(value: ReactRef[IColorRectangle]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentRef(value: IRefObject[IColorRectangle]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    
    @scala.inline
    def setMinSize(value: Double): Self = this.set("minSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinSize: Self = this.set("minSize", js.undefined)
    
    @scala.inline
    def setOnChange(
      value: (/* ev */ SyntheticMouseEvent[Element] | SyntheticKeyboardEvent[Element], /* color */ IColor) => scala.Unit
    ): Self = this.set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setStylesFunction1(value: IColorRectangleStyleProps => DeepPartial[IColorRectangleStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IColorRectangleStyleProps, IColorRectangleStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
