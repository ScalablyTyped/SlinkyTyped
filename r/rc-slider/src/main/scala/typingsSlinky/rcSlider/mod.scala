package typingsSlinky.rcSlider

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.rcSlider.anon.FnCall
import typingsSlinky.rcSlider.anon.Instantiable
import typingsSlinky.rcSlider.interfaceMod.GenericSliderProps
import typingsSlinky.rcSlider.rangeMod.RangeProps
import typingsSlinky.rcSlider.rangeMod.RangeState
import typingsSlinky.rcSlider.sliderMod.SliderProps
import typingsSlinky.rcTooltip.tooltipMod.TooltipProps
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rc-slider", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[SliderProps, js.Object, js.Any] {
    def this(props: SliderProps) = this()
    def this(props: SliderProps, context: js.Any) = this()
  }
  object default extends Shortcut {
    
    @JSImport("rc-slider", JSImport.Default)
    @js.native
    val ^ : CompoundedComponent = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("rc-slider", "default.Handle")
    @js.native
    class HandleCls ()
      extends typingsSlinky.rcSlider.handleMod.default
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rc-slider", "default.Range")
    @js.native
    class Range protected ()
      extends Component[RangeProps, RangeState, js.Any] {
      def this(props: RangeProps) = this()
      def this(props: RangeProps, context: js.Any) = this()
    }
    
    type _To = CompoundedComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CompoundedComponent = ^
  }
  
  @JSImport("rc-slider", "Handle")
  @js.native
  class Handle ()
    extends typingsSlinky.rcSlider.handleMod.default
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rc-slider", "Range")
  @js.native
  class Range protected ()
    extends Component[RangeProps, RangeState, js.Any] {
    def this(props: RangeProps) = this()
    def this(props: RangeProps, context: js.Any) = this()
  }
  @JSImport("rc-slider", "Range")
  @js.native
  val Range: ReactComponentClass[RangeProps] = js.native
  
  @JSImport("rc-slider", "SliderTooltip")
  @js.native
  val SliderTooltip: ForwardRefExoticComponent[TooltipProps with RefAttributes[_]] = js.native
  
  @JSImport("rc-slider", "createSliderWithTooltip")
  @js.native
  def createSliderWithTooltip[Props /* <: GenericSliderProps */](Component: ReactComponentClass[Props]): Instantiable[Props] = js.native
  
  @js.native
  trait CompoundedComponent
    extends ComponentClass[SliderProps, js.Object] {
    
    var Handle: Instantiable0[typingsSlinky.rcSlider.handleMod.default] = js.native
    
    var Range: ReactComponentClass[RangeProps] = js.native
    
    var createSliderWithTooltip: FnCall = js.native
  }
}
