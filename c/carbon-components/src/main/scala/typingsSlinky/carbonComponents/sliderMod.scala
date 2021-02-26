package typingsSlinky.carbonComponents

import typingsSlinky.carbonComponents.anon.Max
import typingsSlinky.carbonComponents.anon.NewValue
import typingsSlinky.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderMod {
  
  @JSImport("carbon-components/components/slider/slider", JSImport.Default)
  @js.native
  class default protected () extends Slider {
    def this(element: js.Any, options: js.Any) = this()
  }
  object default {
    
    @JSImport("carbon-components/components/slider/slider", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/slider/slider", "default.components")
    @js.native
    def components: WeakMap[js.Object, js.Any] = js.native
    @scala.inline
    def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @js.native
  trait Slider extends StObject {
    
    def _calcValue(evt: js.Any): NewValue = js.native
    
    def _changeState(state: js.Any, detail: js.Any, callback: js.Any): Unit = js.native
    
    def _updateInput(): Unit = js.native
    
    def _updatePosition(evt: js.Any): Unit = js.native
    
    def getInputProps(): Max = js.native
    
    def setValue(value: js.Any): Unit = js.native
    
    def stepDown(): Unit = js.native
    
    def stepUp(): Unit = js.native
  }
  object Slider {
    
    @scala.inline
    def apply(
      _calcValue: js.Any => NewValue,
      _changeState: (js.Any, js.Any, js.Any) => Unit,
      _updateInput: () => Unit,
      _updatePosition: js.Any => Unit,
      getInputProps: () => Max,
      setValue: js.Any => Unit,
      stepDown: () => Unit,
      stepUp: () => Unit
    ): Slider = {
      val __obj = js.Dynamic.literal(_calcValue = js.Any.fromFunction1(_calcValue), _changeState = js.Any.fromFunction3(_changeState), _updateInput = js.Any.fromFunction0(_updateInput), _updatePosition = js.Any.fromFunction1(_updatePosition), getInputProps = js.Any.fromFunction0(getInputProps), setValue = js.Any.fromFunction1(setValue), stepDown = js.Any.fromFunction0(stepDown), stepUp = js.Any.fromFunction0(stepUp))
      __obj.asInstanceOf[Slider]
    }
    
    @scala.inline
    implicit class SliderMutableBuilder[Self <: Slider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetInputProps(value: () => Max): Self = StObject.set(x, "getInputProps", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetValue(value: js.Any => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStepDown(value: () => Unit): Self = StObject.set(x, "stepDown", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStepUp(value: () => Unit): Self = StObject.set(x, "stepUp", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_calcValue(value: js.Any => NewValue): Self = StObject.set(x, "_calcValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_changeState(value: (js.Any, js.Any, js.Any) => Unit): Self = StObject.set(x, "_changeState", js.Any.fromFunction3(value))
      
      @scala.inline
      def set_updateInput(value: () => Unit): Self = StObject.set(x, "_updateInput", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_updatePosition(value: js.Any => Unit): Self = StObject.set(x, "_updatePosition", js.Any.fromFunction1(value))
    }
  }
}
