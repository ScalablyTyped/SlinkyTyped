package typingsSlinky.rcSlider

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.rcSlider.anon.Instantiable
import typingsSlinky.rcSlider.anon.Overlay
import typingsSlinky.rcSlider.interfaceMod.GenericSliderProps
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createSliderWithTooltipMod {
  
  @JSImport("rc-slider/lib/createSliderWithTooltip", JSImport.Default)
  @js.native
  def default[Props /* <: GenericSliderProps */](Component: ReactComponentClass[Props]): Instantiable[Props] = js.native
  
  @js.native
  trait ComponentWrapperProps extends StObject {
    
    var getTooltipContainer: js.UndefOr[js.Function0[HTMLElement]] = js.native
    
    var tipFormatter: js.UndefOr[js.Function1[/* value */ Double, ReactElement]] = js.native
    
    var tipProps: js.UndefOr[Overlay] = js.native
  }
  object ComponentWrapperProps {
    
    @scala.inline
    def apply(): ComponentWrapperProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentWrapperProps]
    }
    
    @scala.inline
    implicit class ComponentWrapperPropsMutableBuilder[Self <: ComponentWrapperProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetTooltipContainer(value: () => HTMLElement): Self = StObject.set(x, "getTooltipContainer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTooltipContainerUndefined: Self = StObject.set(x, "getTooltipContainer", js.undefined)
      
      @scala.inline
      def setTipFormatter(value: /* value */ Double => ReactElement): Self = StObject.set(x, "tipFormatter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTipFormatterUndefined: Self = StObject.set(x, "tipFormatter", js.undefined)
      
      @scala.inline
      def setTipProps(value: Overlay): Self = StObject.set(x, "tipProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTipPropsUndefined: Self = StObject.set(x, "tipProps", js.undefined)
    }
  }
  
  @js.native
  trait ComponentWrapperState extends StObject {
    
    var visibles: Record[Double, Boolean] = js.native
  }
  object ComponentWrapperState {
    
    @scala.inline
    def apply(visibles: Record[Double, Boolean]): ComponentWrapperState = {
      val __obj = js.Dynamic.literal(visibles = visibles.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentWrapperState]
    }
    
    @scala.inline
    implicit class ComponentWrapperStateMutableBuilder[Self <: ComponentWrapperState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVisibles(value: Record[Double, Boolean]): Self = StObject.set(x, "visibles", value.asInstanceOf[js.Any])
    }
  }
}
