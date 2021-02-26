package typingsSlinky.blueprintjsCore

import typingsSlinky.blueprintjsCore.commonMod.AbstractPureComponent2
import typingsSlinky.blueprintjsCore.multiSliderMod.ISliderBaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/slider/slider", "Slider")
  @js.native
  class Slider protected ()
    extends AbstractPureComponent2[ISliderProps, js.Object, js.Object] {
    def this(props: ISliderProps) = this()
    def this(props: ISliderProps, context: js.Any) = this()
  }
  /* static members */
  object Slider {
    
    @JSImport("@blueprintjs/core/lib/esm/components/slider/slider", "Slider")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/slider/slider", "Slider.defaultProps")
    @js.native
    def defaultProps: ISliderProps = js.native
    @scala.inline
    def defaultProps_=(x: ISliderProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/slider/slider", "Slider.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ISliderProps extends ISliderBaseProps {
    
    /**
      * Initial value of the slider. This determines the other end of the
      * track fill: from `initialValue` to `value`.
      * @default 0
      */
    var initialValue: js.UndefOr[Double] = js.native
    
    /** Callback invoked when the value changes. */
    var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
    
    /** Callback invoked when the handle is released. */
    var onRelease: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
    
    /**
      * Value of slider.
      * @default 0
      */
    var value: js.UndefOr[Double] = js.native
  }
  object ISliderProps {
    
    @scala.inline
    def apply(): ISliderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISliderProps]
    }
    
    @scala.inline
    implicit class ISliderPropsMutableBuilder[Self <: ISliderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitialValue(value: Double): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ Double => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnRelease(value: /* value */ Double => Unit): Self = StObject.set(x, "onRelease", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnReleaseUndefined: Self = StObject.set(x, "onRelease", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
