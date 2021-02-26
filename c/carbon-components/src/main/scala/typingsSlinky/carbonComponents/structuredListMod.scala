package typingsSlinky.carbonComponents

import typingsSlinky.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object structuredListMod {
  
  @JSImport("carbon-components/components/structured-list/structured-list", JSImport.Default)
  @js.native
  class default protected () extends StructuredList {
    def this(element: js.Any, options: js.Any) = this()
  }
  object default {
    
    @JSImport("carbon-components/components/structured-list/structured-list", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/structured-list/structured-list", "default.components")
    @js.native
    def components: WeakMap[js.Object, js.Any] = js.native
    @scala.inline
    def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @js.native
  trait StructuredList extends StObject {
    
    def _direction(evt: js.Any): js.Any = js.native
    
    def _getInput(index: js.Any): js.Any = js.native
    
    def _handleClick(evt: js.Any): Unit = js.native
    
    def _handleInputChecked(index: js.Any): Unit = js.native
    
    def _handleKeydownArrow(evt: js.Any): Unit = js.native
    
    def _handleKeydownChecked(evt: js.Any): Unit = js.native
    
    def _nextIndex(array: js.Any, arrayItem: js.Any, direction: js.Any): js.Any = js.native
  }
  object StructuredList {
    
    @scala.inline
    def apply(
      _direction: js.Any => js.Any,
      _getInput: js.Any => js.Any,
      _handleClick: js.Any => Unit,
      _handleInputChecked: js.Any => Unit,
      _handleKeydownArrow: js.Any => Unit,
      _handleKeydownChecked: js.Any => Unit,
      _nextIndex: (js.Any, js.Any, js.Any) => js.Any
    ): StructuredList = {
      val __obj = js.Dynamic.literal(_direction = js.Any.fromFunction1(_direction), _getInput = js.Any.fromFunction1(_getInput), _handleClick = js.Any.fromFunction1(_handleClick), _handleInputChecked = js.Any.fromFunction1(_handleInputChecked), _handleKeydownArrow = js.Any.fromFunction1(_handleKeydownArrow), _handleKeydownChecked = js.Any.fromFunction1(_handleKeydownChecked), _nextIndex = js.Any.fromFunction3(_nextIndex))
      __obj.asInstanceOf[StructuredList]
    }
    
    @scala.inline
    implicit class StructuredListMutableBuilder[Self <: StructuredList] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_direction(value: js.Any => js.Any): Self = StObject.set(x, "_direction", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_getInput(value: js.Any => js.Any): Self = StObject.set(x, "_getInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_handleClick(value: js.Any => Unit): Self = StObject.set(x, "_handleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_handleInputChecked(value: js.Any => Unit): Self = StObject.set(x, "_handleInputChecked", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_handleKeydownArrow(value: js.Any => Unit): Self = StObject.set(x, "_handleKeydownArrow", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_handleKeydownChecked(value: js.Any => Unit): Self = StObject.set(x, "_handleKeydownChecked", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_nextIndex(value: (js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "_nextIndex", js.Any.fromFunction3(value))
    }
  }
}
