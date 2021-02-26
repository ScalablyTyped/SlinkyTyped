package typingsSlinky.baseui

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.baseui.baseuiStrings.change_
import typingsSlinky.react.mod.Component
import typingsSlinky.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderMod {
  
  @js.native
  trait STATE_CHANGE_TYPE extends StObject {
    
    var change: change_ = js.native
  }
  object STATE_CHANGE_TYPE {
    
    @JSImport("baseui/slider", "STATE_CHANGE_TYPE")
    @js.native
    val ^ : STATE_CHANGE_TYPE = js.native
    
    @scala.inline
    implicit class STATE_CHANGE_TYPEMutableBuilder[Self <: STATE_CHANGE_TYPE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChange(value: change_): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/slider", "Slider")
  @js.native
  val Slider: ReactComponentClass[SliderProps] = js.native
  
  @JSImport("baseui/slider", "StatefulContainer")
  @js.native
  class StatefulContainer protected ()
    extends Component[StatefulContainerProps, State, js.Any] {
    def this(props: StatefulContainerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: StatefulContainerProps, context: js.Any) = this()
    
    @JSName("internalSetState")
    def internalSetState_change(`type`: change_, hasValue: State): Unit = js.native
    
    def onChange(params: State): js.Any = js.native
    
    var onFinalChange: js.UndefOr[js.Function1[/* params */ State, _]] = js.native
  }
  
  @JSImport("baseui/slider", "StatefulSlider")
  @js.native
  val StatefulSlider: ReactComponentClass[StatefulSliderProps] = js.native
  
  @JSImport("baseui/slider", "StyledInnerThumb")
  @js.native
  val StyledInnerThumb: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/slider", "StyledInnerTrack")
  @js.native
  val StyledInnerTrack: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/slider", "StyledMark")
  @js.native
  val StyledMark: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/slider", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/slider", "StyledThumb")
  @js.native
  val StyledThumb: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/slider", "StyledTick")
  @js.native
  val StyledTick: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/slider", "StyledTickBar")
  @js.native
  val StyledTickBar: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/slider", "StyledTrack")
  @js.native
  val StyledTrack: StyletronComponent[js.Any] = js.native
  
  @js.native
  trait SharedProps extends StObject {
    
    @JSName("$disabled")
    var $disabled: Boolean = js.native
    
    @JSName("$isDragged")
    var $isDragged: Boolean = js.native
    
    @JSName("$marks")
    var $marks: Boolean = js.native
    
    @JSName("$max")
    var $max: Double = js.native
    
    @JSName("$min")
    var $min: Double = js.native
    
    @JSName("$thumbIndex")
    var $thumbIndex: Double = js.native
    
    @JSName("$value")
    var $value: js.Array[Double] = js.native
  }
  object SharedProps {
    
    @scala.inline
    def apply(
      $disabled: Boolean,
      $isDragged: Boolean,
      $marks: Boolean,
      $max: Double,
      $min: Double,
      $thumbIndex: Double,
      $value: js.Array[Double]
    ): SharedProps = {
      val __obj = js.Dynamic.literal($disabled = $disabled.asInstanceOf[js.Any], $isDragged = $isDragged.asInstanceOf[js.Any], $marks = $marks.asInstanceOf[js.Any], $max = $max.asInstanceOf[js.Any], $min = $min.asInstanceOf[js.Any], $thumbIndex = $thumbIndex.asInstanceOf[js.Any], $value = $value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SharedProps]
    }
    
    @scala.inline
    implicit class SharedPropsMutableBuilder[Self <: SharedProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$disabled(value: Boolean): Self = StObject.set(x, "$disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$isDragged(value: Boolean): Self = StObject.set(x, "$isDragged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$marks(value: Boolean): Self = StObject.set(x, "$marks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$max(value: Double): Self = StObject.set(x, "$max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$min(value: Double): Self = StObject.set(x, "$min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$thumbIndex(value: Double): Self = StObject.set(x, "$thumbIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$value(value: js.Array[Double]): Self = StObject.set(x, "$value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$valueVarargs(value: Double*): Self = StObject.set(x, "$value", js.Array(value :_*))
    }
  }
  
  @js.native
  trait SliderOverrides extends StObject {
    
    var InnerThumb: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ] = js.native
    
    var InnerTrack: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ] = js.native
    
    var Mark: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ] = js.native
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ] = js.native
    
    var Thumb: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ] = js.native
    
    var ThumbValue: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ] = js.native
    
    var Tick: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ] = js.native
    
    var TickBar: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ] = js.native
    
    var Track: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ] = js.native
  }
  object SliderOverrides {
    
    @scala.inline
    def apply(): SliderOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliderOverrides]
    }
    
    @scala.inline
    implicit class SliderOverridesMutableBuilder[Self <: SliderOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInnerThumb(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ): Self = StObject.set(x, "InnerThumb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerThumbUndefined: Self = StObject.set(x, "InnerThumb", js.undefined)
      
      @scala.inline
      def setInnerTrack(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ): Self = StObject.set(x, "InnerTrack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerTrackUndefined: Self = StObject.set(x, "InnerTrack", js.undefined)
      
      @scala.inline
      def setMark(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ): Self = StObject.set(x, "Mark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkUndefined: Self = StObject.set(x, "Mark", js.undefined)
      
      @scala.inline
      def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      @scala.inline
      def setThumb(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ): Self = StObject.set(x, "Thumb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbUndefined: Self = StObject.set(x, "Thumb", js.undefined)
      
      @scala.inline
      def setThumbValue(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ): Self = StObject.set(x, "ThumbValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbValueUndefined: Self = StObject.set(x, "ThumbValue", js.undefined)
      
      @scala.inline
      def setTick(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ): Self = StObject.set(x, "Tick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickBar(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ): Self = StObject.set(x, "TickBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickBarUndefined: Self = StObject.set(x, "TickBar", js.undefined)
      
      @scala.inline
      def setTickUndefined: Self = StObject.set(x, "Tick", js.undefined)
      
      @scala.inline
      def setTrack(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
      ): Self = StObject.set(x, "Track", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackUndefined: Self = StObject.set(x, "Track", js.undefined)
    }
  }
  
  @js.native
  trait SliderProps extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var marks: js.UndefOr[Boolean] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* e */ State, _]] = js.native
    
    var onFinalChange: js.UndefOr[js.Function1[/* e */ State, _]] = js.native
    
    var overrides: js.UndefOr[SliderOverrides] = js.native
    
    var step: js.UndefOr[Double] = js.native
    
    var value: js.Array[Double] = js.native
  }
  object SliderProps {
    
    @scala.inline
    def apply(value: js.Array[Double]): SliderProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliderProps]
    }
    
    @scala.inline
    implicit class SliderPropsMutableBuilder[Self <: SliderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setMarks(value: Boolean): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarksUndefined: Self = StObject.set(x, "marks", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* e */ State => _): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnFinalChange(value: /* e */ State => _): Self = StObject.set(x, "onFinalChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFinalChangeUndefined: Self = StObject.set(x, "onFinalChange", js.undefined)
      
      @scala.inline
      def setOverrides(value: SliderOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setValue(value: js.Array[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  @js.native
  trait State extends StObject {
    
    var value: js.Array[Double] = js.native
  }
  object State {
    
    @scala.inline
    def apply(value: js.Array[Double]): State = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: js.Array[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  type StateReducer = js.Function3[/* stateType */ String, /* nextState */ State, /* currentState */ State, State]
  
  @js.native
  trait StatefulContainerProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var initialState: js.UndefOr[State] = js.native
    
    var marks: js.UndefOr[Boolean] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* e */ State, _]] = js.native
    
    var onFinalChange: js.UndefOr[js.Function1[/* e */ State, _]] = js.native
    
    var overrides: js.UndefOr[SliderOverrides] = js.native
    
    var stateReducer: js.UndefOr[StateReducer] = js.native
    
    var step: js.UndefOr[Double] = js.native
  }
  object StatefulContainerProps {
    
    @scala.inline
    def apply(): StatefulContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatefulContainerProps]
    }
    
    @scala.inline
    implicit class StatefulContainerPropsMutableBuilder[Self <: StatefulContainerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      @scala.inline
      def setMarks(value: Boolean): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarksUndefined: Self = StObject.set(x, "marks", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* e */ State => _): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnFinalChange(value: /* e */ State => _): Self = StObject.set(x, "onFinalChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFinalChangeUndefined: Self = StObject.set(x, "onFinalChange", js.undefined)
      
      @scala.inline
      def setOverrides(value: SliderOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setStateReducer(value: (/* stateType */ String, /* nextState */ State, /* currentState */ State) => State): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
      
      @scala.inline
      def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
  
  @js.native
  trait StatefulSliderProps extends StObject {
    
    var initialState: js.UndefOr[State] = js.native
    
    var marks: js.UndefOr[Boolean] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* e */ State, _]] = js.native
    
    var onFinalChange: js.UndefOr[js.Function1[/* e */ State, _]] = js.native
    
    var overrides: js.UndefOr[SliderOverrides] = js.native
    
    var step: js.UndefOr[Double] = js.native
  }
  object StatefulSliderProps {
    
    @scala.inline
    def apply(): StatefulSliderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatefulSliderProps]
    }
    
    @scala.inline
    implicit class StatefulSliderPropsMutableBuilder[Self <: StatefulSliderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      @scala.inline
      def setMarks(value: Boolean): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarksUndefined: Self = StObject.set(x, "marks", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* e */ State => _): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnFinalChange(value: /* e */ State => _): Self = StObject.set(x, "onFinalChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFinalChangeUndefined: Self = StObject.set(x, "onFinalChange", js.undefined)
      
      @scala.inline
      def setOverrides(value: SliderOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
}
