package typingsSlinky.rcMentions

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import typingsSlinky.rcMentions.optionMod.OptionProps
import typingsSlinky.react.mod.ConsumerProps
import typingsSlinky.react.mod.FocusEventHandler
import typingsSlinky.react.mod.ProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mentionsContextMod {
  
  @JSImport("rc-mentions/es/MentionsContext", "MentionsContextConsumer")
  @js.native
  val MentionsContextConsumer: ReactComponentClass[ConsumerProps[MentionsContextProps]] = js.native
  
  @JSImport("rc-mentions/es/MentionsContext", "MentionsContextProvider")
  @js.native
  val MentionsContextProvider: ReactComponentClass[ProviderProps[MentionsContextProps]] = js.native
  
  @js.native
  trait MentionsContextProps extends StObject {
    
    var activeIndex: Double = js.native
    
    var notFoundContent: ReactElement = js.native
    
    var onBlur: FocusEventHandler[HTMLElement] = js.native
    
    var onFocus: FocusEventHandler[HTMLElement] = js.native
    
    def selectOption(option: OptionProps): Unit = js.native
    
    def setActiveIndex(index: Double): Unit = js.native
  }
  object MentionsContextProps {
    
    @scala.inline
    def apply(
      activeIndex: Double,
      onBlur: SyntheticFocusEvent[HTMLElement] => Unit,
      onFocus: SyntheticFocusEvent[HTMLElement] => Unit,
      selectOption: OptionProps => Unit,
      setActiveIndex: Double => Unit
    ): MentionsContextProps = {
      val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1(onBlur), onFocus = js.Any.fromFunction1(onFocus), selectOption = js.Any.fromFunction1(selectOption), setActiveIndex = js.Any.fromFunction1(setActiveIndex))
      __obj.asInstanceOf[MentionsContextProps]
    }
    
    @scala.inline
    implicit class MentionsContextPropsMutableBuilder[Self <: MentionsContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotFoundContent(value: ReactElement): Self = StObject.set(x, "notFoundContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotFoundContentUndefined: Self = StObject.set(x, "notFoundContent", js.undefined)
      
      @scala.inline
      def setOnBlur(value: SyntheticFocusEvent[HTMLElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocus(value: SyntheticFocusEvent[HTMLElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSelectOption(value: OptionProps => Unit): Self = StObject.set(x, "selectOption", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetActiveIndex(value: Double => Unit): Self = StObject.set(x, "setActiveIndex", js.Any.fromFunction1(value))
    }
  }
}
