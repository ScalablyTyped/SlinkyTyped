package typingsSlinky.officeUiFabricReact.anon

import org.scalajs.dom.raw.Element
import slinky.core.facade.ReactRef
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.officeUiFabricReact.colorRectangleTypesMod.IColorRectangle
import typingsSlinky.officeUiFabricReact.colorRectangleTypesMod.IColorRectangleStyleProps
import typingsSlinky.officeUiFabricReact.colorRectangleTypesMod.IColorRectangleStyles
import typingsSlinky.officeUiFabricReact.interfacesMod.IColor
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<office-ui-fabric-react.office-ui-fabric-react/lib/components/ColorPicker/ColorRectangle/ColorRectangle.types.IColorRectangleProps> */
@js.native
trait ReadonlyIColorRectanglePr extends StObject {
  
  val ariaDescription: js.UndefOr[String] = js.native
  
  val ariaLabel: js.UndefOr[String] = js.native
  
  val ariaValueFormat: js.UndefOr[String] = js.native
  
  val className: js.UndefOr[String] = js.native
  
  val color: IColor = js.native
  
  val componentRef: js.UndefOr[IRefObject[IColorRectangle]] = js.native
  
  val minSize: js.UndefOr[Double] = js.native
  
  val onChange: js.UndefOr[
    js.Function2[
      /* ev */ SyntheticMouseEvent[Element] | SyntheticKeyboardEvent[Element], 
      /* color */ IColor, 
      scala.Unit
    ]
  ] = js.native
  
  val styles: js.UndefOr[IStyleFunctionOrObject[IColorRectangleStyleProps, IColorRectangleStyles]] = js.native
  
  val theme: js.UndefOr[ITheme] = js.native
}
object ReadonlyIColorRectanglePr {
  
  @scala.inline
  def apply(color: IColor): ReadonlyIColorRectanglePr = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyIColorRectanglePr]
  }
  
  @scala.inline
  implicit class ReadonlyIColorRectanglePrMutableBuilder[Self <: ReadonlyIColorRectanglePr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAriaDescription(value: String): Self = StObject.set(x, "ariaDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaDescriptionUndefined: Self = StObject.set(x, "ariaDescription", js.undefined)
    
    @scala.inline
    def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
    
    @scala.inline
    def setAriaValueFormat(value: String): Self = StObject.set(x, "ariaValueFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaValueFormatUndefined: Self = StObject.set(x, "ariaValueFormat", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setColor(value: IColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentRef(value: IRefObject[IColorRectangle]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IColorRectangle | Null => scala.Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponentRefRefObject(value: ReactRef[IColorRectangle]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
    
    @scala.inline
    def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
    
    @scala.inline
    def setOnChange(
      value: (/* ev */ SyntheticMouseEvent[Element] | SyntheticKeyboardEvent[Element], /* color */ IColor) => scala.Unit
    ): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IColorRectangleStyleProps, IColorRectangleStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesFunction1(value: IColorRectangleStyleProps => DeepPartial[IColorRectangleStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
