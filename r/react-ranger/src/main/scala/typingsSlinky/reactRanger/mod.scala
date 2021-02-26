package typingsSlinky.reactRanger

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Key
import typingsSlinky.reactRanger.anon.GetPercentageForValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-ranger", "useRanger")
  @js.native
  def useRanger(options: RangerOptions): Ranger = js.native
  
  @js.native
  trait HandleProps extends StObject {
    
    var key: Key = js.native
    
    def onMouseDown(event: SyntheticMouseEvent[Element]): Unit = js.native
    
    def onTouchStart(event: SyntheticTouchEvent[Element]): Unit = js.native
    
    var style: CSSProperties = js.native
    
    var tabIndex: Double = js.native
  }
  object HandleProps {
    
    @scala.inline
    def apply(
      key: Key,
      onMouseDown: SyntheticMouseEvent[Element] => Unit,
      onTouchStart: SyntheticTouchEvent[Element] => Unit,
      style: CSSProperties,
      tabIndex: Double
    ): HandleProps = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], onMouseDown = js.Any.fromFunction1(onMouseDown), onTouchStart = js.Any.fromFunction1(onTouchStart), style = style.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[HandleProps]
    }
    
    @scala.inline
    implicit class HandlePropsMutableBuilder[Self <: HandleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMouseDown(value: SyntheticMouseEvent[Element] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchStart(value: SyntheticTouchEvent[Element] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Ranger extends StObject {
    
    var activeHandleIndex: Double | Null = js.native
    
    def getTrackProps[T](): T with TrackProps = js.native
    def getTrackProps[T](props: T): T with TrackProps = js.native
    
    var handles: js.Array[RangerHandle] = js.native
    
    var segments: js.Array[RangerSegment] = js.native
    
    var ticks: js.Array[RangerTick] = js.native
  }
  
  @js.native
  trait RangerHandle extends StObject {
    
    var active: Boolean = js.native
    
    def getHandleProps[T](): T with HandleProps = js.native
    def getHandleProps[T](props: T): T with HandleProps = js.native
    
    var value: Double = js.native
  }
  
  @js.native
  trait RangerOptions extends StObject {
    
    var interpolator: js.UndefOr[GetPercentageForValue] = js.native
    
    var max: Double = js.native
    
    var min: Double = js.native
    
    var onChange: js.UndefOr[js.Function1[/* values */ js.Array[Double], Unit]] = js.native
    
    var onDrag: js.UndefOr[js.Function1[/* values */ js.Array[Double], Unit]] = js.native
    
    var stepSize: Double = js.native
    
    var steps: js.UndefOr[js.Array[Double]] = js.native
    
    var tickSize: js.UndefOr[Double] = js.native
    
    var ticks: js.UndefOr[js.Array[Double]] = js.native
    
    var values: js.Array[Double] = js.native
  }
  object RangerOptions {
    
    @scala.inline
    def apply(max: Double, min: Double, stepSize: Double, values: js.Array[Double]): RangerOptions = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], stepSize = stepSize.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangerOptions]
    }
    
    @scala.inline
    implicit class RangerOptionsMutableBuilder[Self <: RangerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInterpolator(value: GetPercentageForValue): Self = StObject.set(x, "interpolator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterpolatorUndefined: Self = StObject.set(x, "interpolator", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChange(value: /* values */ js.Array[Double] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnDrag(value: /* values */ js.Array[Double] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      @scala.inline
      def setStepSize(value: Double): Self = StObject.set(x, "stepSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSteps(value: js.Array[Double]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
      
      @scala.inline
      def setStepsVarargs(value: Double*): Self = StObject.set(x, "steps", js.Array(value :_*))
      
      @scala.inline
      def setTickSize(value: Double): Self = StObject.set(x, "tickSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickSizeUndefined: Self = StObject.set(x, "tickSize", js.undefined)
      
      @scala.inline
      def setTicks(value: js.Array[Double]): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
      
      @scala.inline
      def setTicksVarargs(value: Double*): Self = StObject.set(x, "ticks", js.Array(value :_*))
      
      @scala.inline
      def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  @js.native
  trait RangerSegment extends StObject {
    
    def getSegmentProps[T](): T with SegmentProps = js.native
    def getSegmentProps[T](props: T): T with SegmentProps = js.native
    
    var value: Double = js.native
  }
  
  @js.native
  trait RangerTick extends StObject {
    
    def getTickProps[T](): T with TickProps = js.native
    def getTickProps[T](props: T): T with TickProps = js.native
    
    var value: Double = js.native
  }
  
  @js.native
  trait SegmentProps extends StObject {
    
    var key: Key = js.native
    
    var style: CSSProperties = js.native
  }
  object SegmentProps {
    
    @scala.inline
    def apply(key: Key, style: CSSProperties): SegmentProps = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[SegmentProps]
    }
    
    @scala.inline
    implicit class SegmentPropsMutableBuilder[Self <: SegmentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TickProps extends StObject {
    
    var key: Key = js.native
    
    var style: CSSProperties = js.native
  }
  object TickProps {
    
    @scala.inline
    def apply(key: Key, style: CSSProperties): TickProps = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[TickProps]
    }
    
    @scala.inline
    implicit class TickPropsMutableBuilder[Self <: TickProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TrackProps extends StObject {
    
    var key: Key = js.native
    
    var style: CSSProperties = js.native
  }
  object TrackProps {
    
    @scala.inline
    def apply(key: Key, style: CSSProperties): TrackProps = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrackProps]
    }
    
    @scala.inline
    implicit class TrackPropsMutableBuilder[Self <: TrackProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
}
