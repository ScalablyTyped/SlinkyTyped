package typingsSlinky.primereact

import org.scalajs.dom.raw.Event
import slinky.core.facade.ReactElement
import typingsSlinky.primereact.anon.Target
import typingsSlinky.primereact.anon.Value
import typingsSlinky.primereact.tooltipOptionsMod.TooltipOptions
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chipsChipsMod {
  
  @JSImport("primereact/components/chips/Chips", "Chips")
  @js.native
  class Chips protected ()
    extends Component[ChipsProps, js.Any, js.Any] {
    def this(props: ChipsProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ChipsProps, context: js.Any) = this()
  }
  
  @js.native
  trait ChipsProps extends StObject {
    
    var allowDuplicate: js.UndefOr[Boolean] = js.native
    
    var ariaLabelledBy: js.UndefOr[String] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var itemTemplate: js.UndefOr[js.Function1[/* item */ js.Any, js.UndefOr[ReactElement]]] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var onAdd: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.native
    
    var onBlur: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* e */ Target, Unit]] = js.native
    
    var onFocus: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
    
    var onRemove: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var separator: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[js.Object] = js.native
    
    var tooltip: js.UndefOr[js.Any] = js.native
    
    var tooltipOptions: js.UndefOr[TooltipOptions] = js.native
    
    var value: js.UndefOr[js.Array[_]] = js.native
  }
  object ChipsProps {
    
    @scala.inline
    def apply(): ChipsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChipsProps]
    }
    
    @scala.inline
    implicit class ChipsPropsMutableBuilder[Self <: ChipsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowDuplicate(value: Boolean): Self = StObject.set(x, "allowDuplicate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowDuplicateUndefined: Self = StObject.set(x, "allowDuplicate", js.undefined)
      
      @scala.inline
      def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setItemTemplate(value: /* item */ js.Any => js.UndefOr[ReactElement]): Self = StObject.set(x, "itemTemplate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setItemTemplateUndefined: Self = StObject.set(x, "itemTemplate", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnAdd(value: /* e */ Value => Unit): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
      
      @scala.inline
      def setOnBlur(value: /* event */ Event => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* e */ Target => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnFocus(value: /* event */ Event => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnRemove(value: /* e */ Value => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTooltip(value: js.Any): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipOptions(value: TooltipOptions): Self = StObject.set(x, "tooltipOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipOptionsUndefined: Self = StObject.set(x, "tooltipOptions", js.undefined)
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setValue(value: js.Array[_]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
}
