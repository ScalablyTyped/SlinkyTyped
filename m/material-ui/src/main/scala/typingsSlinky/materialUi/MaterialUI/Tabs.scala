package typingsSlinky.materialUi.MaterialUI

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tabs {
  
  @js.native
  trait Tab
    extends Component[TabProps, js.Object, js.Any]
  
  @js.native
  trait TabProps extends SharedEnhancedButtonProps[Tab] {
    
    var buttonStyle: js.UndefOr[CSSProperties] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var icon: js.UndefOr[ReactElement] = js.native
    
    var label: js.UndefOr[ReactElement] = js.native
    
    var onActive: js.UndefOr[js.Function1[/* tab */ Tab, Unit]] = js.native
    
    var value: js.UndefOr[js.Any] = js.native
  }
  object TabProps {
    
    @scala.inline
    def apply(): TabProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabProps]
    }
    
    @scala.inline
    implicit class TabPropsMutableBuilder[Self <: TabProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtonStyle(value: CSSProperties): Self = StObject.set(x, "buttonStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonStyleUndefined: Self = StObject.set(x, "buttonStyle", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconReactElement(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelReactElement(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setOnActive(value: /* tab */ Tab => Unit): Self = StObject.set(x, "onActive", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnActiveUndefined: Self = StObject.set(x, "onActive", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type Tabs = ReactComponentClass[TabsProps]
  
  @js.native
  trait TabsProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var contentContainerClassName: js.UndefOr[String] = js.native
    
    var contentContainerStyle: js.UndefOr[CSSProperties] = js.native
    
    var initialSelectedIndex: js.UndefOr[Double] = js.native
    
    var inkBarStyle: js.UndefOr[CSSProperties] = js.native
    
    var onChange: js.UndefOr[
        js.Function3[
          /* value */ js.Any, 
          SyntheticEvent[EventTarget with js.Object, Event], 
          /* tab */ Tab, 
          Unit
        ]
      ] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var tabItemContainerStyle: js.UndefOr[CSSProperties] = js.native
    
    var tabTemplate: js.UndefOr[ReactComponentClass[_]] = js.native
    
    var tabTemplateStyle: js.UndefOr[CSSProperties] = js.native
    
    var value: js.UndefOr[js.Any] = js.native
  }
  object TabsProps {
    
    @scala.inline
    def apply(): TabsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabsProps]
    }
    
    @scala.inline
    implicit class TabsPropsMutableBuilder[Self <: TabsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContentContainerClassName(value: String): Self = StObject.set(x, "contentContainerClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentContainerClassNameUndefined: Self = StObject.set(x, "contentContainerClassName", js.undefined)
      
      @scala.inline
      def setContentContainerStyle(value: CSSProperties): Self = StObject.set(x, "contentContainerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentContainerStyleUndefined: Self = StObject.set(x, "contentContainerStyle", js.undefined)
      
      @scala.inline
      def setInitialSelectedIndex(value: Double): Self = StObject.set(x, "initialSelectedIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialSelectedIndexUndefined: Self = StObject.set(x, "initialSelectedIndex", js.undefined)
      
      @scala.inline
      def setInkBarStyle(value: CSSProperties): Self = StObject.set(x, "inkBarStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInkBarStyleUndefined: Self = StObject.set(x, "inkBarStyle", js.undefined)
      
      @scala.inline
      def setOnChange(
        value: (/* value */ js.Any, SyntheticEvent[EventTarget with js.Object, Event], /* tab */ Tab) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTabItemContainerStyle(value: CSSProperties): Self = StObject.set(x, "tabItemContainerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabItemContainerStyleUndefined: Self = StObject.set(x, "tabItemContainerStyle", js.undefined)
      
      @scala.inline
      def setTabTemplate(value: ReactComponentClass[_]): Self = StObject.set(x, "tabTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabTemplateStyle(value: CSSProperties): Self = StObject.set(x, "tabTemplateStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabTemplateStyleUndefined: Self = StObject.set(x, "tabTemplateStyle", js.undefined)
      
      @scala.inline
      def setTabTemplateUndefined: Self = StObject.set(x, "tabTemplate", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
