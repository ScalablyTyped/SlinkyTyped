package typingsSlinky.rcSelect

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.rcSelect.anon.Selected
import typingsSlinky.rcSelect.generatorMod.FlattenOptionsType
import typingsSlinky.rcSelect.generatorMod.RawValueType
import typingsSlinky.rcSelect.interfaceMod.OnActiveValue
import typingsSlinky.rcSelect.interfaceMod.OptionsType
import typingsSlinky.rcSelect.interfaceMod.RenderNode
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.react.mod.UIEventHandler
import typingsSlinky.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionListMod extends Shortcut {
  
  @JSImport("rc-select/lib/OptionList", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[OptionListProps[OptionsType] with RefAttributes[RefOptionListProps]] = js.native
  
  @js.native
  trait OptionListProps[OptionsType /* <: js.Array[js.Object] */] extends StObject {
    
    var childrenAsData: Boolean = js.native
    
    var defaultActiveFirstOption: js.UndefOr[Boolean] = js.native
    
    var flattenOptions: FlattenOptionsType[OptionsType] = js.native
    
    var height: Double = js.native
    
    var id: String = js.native
    
    var itemHeight: Double = js.native
    
    var menuItemSelectedIcon: js.UndefOr[RenderNode] = js.native
    
    var multiple: Boolean = js.native
    
    var notFoundContent: js.UndefOr[ReactElement] = js.native
    
    /** Tell Select that some value is now active to make accessibility work */
    var onActiveValue: OnActiveValue = js.native
    
    /** Tell Select that mouse enter the popup to force re-render */
    var onMouseEnter: js.UndefOr[MouseEventHandler[Element]] = js.native
    
    var onScroll: UIEventHandler[HTMLDivElement] = js.native
    
    def onSelect(value: RawValueType, option: Selected): Unit = js.native
    
    def onToggleOpen(): Unit = js.native
    def onToggleOpen(open: Boolean): Unit = js.native
    
    var open: Boolean = js.native
    
    var options: OptionsType = js.native
    
    var prefixCls: String = js.native
    
    var searchValue: String = js.native
    
    var values: Set[RawValueType] = js.native
    
    var virtual: Boolean = js.native
  }
  
  @js.native
  trait RefOptionListProps extends StObject {
    
    var onKeyDown: KeyboardEventHandler[Element] = js.native
    
    var onKeyUp: KeyboardEventHandler[Element] = js.native
    
    var scrollTo: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
  }
  object RefOptionListProps {
    
    @scala.inline
    def apply(
      onKeyDown: SyntheticKeyboardEvent[Element] => Unit,
      onKeyUp: SyntheticKeyboardEvent[Element] => Unit
    ): RefOptionListProps = {
      val __obj = js.Dynamic.literal(onKeyDown = js.Any.fromFunction1(onKeyDown), onKeyUp = js.Any.fromFunction1(onKeyUp))
      __obj.asInstanceOf[RefOptionListProps]
    }
    
    @scala.inline
    implicit class RefOptionListPropsMutableBuilder[Self <: RefOptionListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnKeyDown(value: SyntheticKeyboardEvent[Element] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyUp(value: SyntheticKeyboardEvent[Element] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScrollTo(value: /* index */ Double => Unit): Self = StObject.set(x, "scrollTo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScrollToUndefined: Self = StObject.set(x, "scrollTo", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[OptionListProps[OptionsType] with RefAttributes[RefOptionListProps]]
  
  /* This means you don't have to write `default`, but can instead just say `optionListMod.foo` */
  override def _to: ForwardRefExoticComponent[OptionListProps[OptionsType] with RefAttributes[RefOptionListProps]] = default
}
