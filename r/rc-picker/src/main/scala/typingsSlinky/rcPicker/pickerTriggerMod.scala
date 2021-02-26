package typingsSlinky.rcPicker

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.rcPicker.rcPickerStrings.ltr
import typingsSlinky.rcPicker.rcPickerStrings.rtl
import typingsSlinky.rcTrigger.interfaceMod.AlignType
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickerTriggerMod {
  
  @JSImport("rc-picker/es/PickerTrigger", JSImport.Default)
  @js.native
  def default(
    hasPrefixClsPopupElementPopupStyleVisibleDropdownClassNameDropdownAlignTransitionNameGetPopupContainerChildrenRangePopupPlacementDirection: PickerTriggerProps
  ): ReactElement = js.native
  
  @js.native
  trait PickerTriggerProps extends StObject {
    
    var children: ReactElement = js.native
    
    var direction: js.UndefOr[ltr | rtl] = js.native
    
    var dropdownAlign: js.UndefOr[AlignType] = js.native
    
    var dropdownClassName: js.UndefOr[String] = js.native
    
    var getPopupContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.native
    
    var popupElement: ReactElement = js.native
    
    var popupPlacement: js.UndefOr[Placement] = js.native
    
    var popupStyle: js.UndefOr[CSSProperties] = js.native
    
    var prefixCls: String = js.native
    
    var range: js.UndefOr[Boolean] = js.native
    
    var transitionName: js.UndefOr[String] = js.native
    
    var visible: Boolean = js.native
  }
  object PickerTriggerProps {
    
    @scala.inline
    def apply(children: ReactElement, popupElement: ReactElement, prefixCls: String, visible: Boolean): PickerTriggerProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], popupElement = popupElement.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickerTriggerProps]
    }
    
    @scala.inline
    implicit class PickerTriggerPropsMutableBuilder[Self <: PickerTriggerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDropdownAlign(value: AlignType): Self = StObject.set(x, "dropdownAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownAlignUndefined: Self = StObject.set(x, "dropdownAlign", js.undefined)
      
      @scala.inline
      def setDropdownClassName(value: String): Self = StObject.set(x, "dropdownClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownClassNameUndefined: Self = StObject.set(x, "dropdownClassName", js.undefined)
      
      @scala.inline
      def setGetPopupContainer(value: /* node */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      @scala.inline
      def setPopupElement(value: ReactElement): Self = StObject.set(x, "popupElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupPlacement(value: Placement): Self = StObject.set(x, "popupPlacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupPlacementUndefined: Self = StObject.set(x, "popupPlacement", js.undefined)
      
      @scala.inline
      def setPopupStyle(value: CSSProperties): Self = StObject.set(x, "popupStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupStyleUndefined: Self = StObject.set(x, "popupStyle", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRange(value: Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      @scala.inline
      def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.rcPicker.rcPickerStrings.bottomLeft
    - typingsSlinky.rcPicker.rcPickerStrings.bottomRight
    - typingsSlinky.rcPicker.rcPickerStrings.topLeft
    - typingsSlinky.rcPicker.rcPickerStrings.topRight
  */
  trait Placement extends StObject
  object Placement {
    
    @scala.inline
    def bottomLeft: typingsSlinky.rcPicker.rcPickerStrings.bottomLeft = "bottomLeft".asInstanceOf[typingsSlinky.rcPicker.rcPickerStrings.bottomLeft]
    
    @scala.inline
    def bottomRight: typingsSlinky.rcPicker.rcPickerStrings.bottomRight = "bottomRight".asInstanceOf[typingsSlinky.rcPicker.rcPickerStrings.bottomRight]
    
    @scala.inline
    def topLeft: typingsSlinky.rcPicker.rcPickerStrings.topLeft = "topLeft".asInstanceOf[typingsSlinky.rcPicker.rcPickerStrings.topLeft]
    
    @scala.inline
    def topRight: typingsSlinky.rcPicker.rcPickerStrings.topRight = "topRight".asInstanceOf[typingsSlinky.rcPicker.rcPickerStrings.topRight]
  }
}
