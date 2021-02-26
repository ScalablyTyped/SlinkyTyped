package typingsSlinky.rcProgress

import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfaceMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.rcProgress.rcProgressStrings.top
    - typingsSlinky.rcProgress.rcProgressStrings.right
    - typingsSlinky.rcProgress.rcProgressStrings.bottom
    - typingsSlinky.rcProgress.rcProgressStrings.left
  */
  trait GapPositionType extends StObject
  object GapPositionType {
    
    @scala.inline
    def bottom: typingsSlinky.rcProgress.rcProgressStrings.bottom = "bottom".asInstanceOf[typingsSlinky.rcProgress.rcProgressStrings.bottom]
    
    @scala.inline
    def left: typingsSlinky.rcProgress.rcProgressStrings.left = "left".asInstanceOf[typingsSlinky.rcProgress.rcProgressStrings.left]
    
    @scala.inline
    def right: typingsSlinky.rcProgress.rcProgressStrings.right = "right".asInstanceOf[typingsSlinky.rcProgress.rcProgressStrings.right]
    
    @scala.inline
    def top: typingsSlinky.rcProgress.rcProgressStrings.top = "top".asInstanceOf[typingsSlinky.rcProgress.rcProgressStrings.top]
  }
  
  @js.native
  trait ProgressProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var gapDegree: js.UndefOr[Double] = js.native
    
    var gapPosition: js.UndefOr[GapPositionType] = js.native
    
    var percent: js.UndefOr[Double | js.Array[Double]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var strokeColor: js.UndefOr[StrokeColorType] = js.native
    
    var strokeLinecap: js.UndefOr[StrokeLinecapType] = js.native
    
    var strokeWidth: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var trailColor: js.UndefOr[String] = js.native
    
    var trailWidth: js.UndefOr[Double] = js.native
    
    var transition: js.UndefOr[String] = js.native
  }
  object ProgressProps {
    
    @scala.inline
    def apply(): ProgressProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProgressProps]
    }
    
    @scala.inline
    implicit class ProgressPropsMutableBuilder[Self <: ProgressProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setGapDegree(value: Double): Self = StObject.set(x, "gapDegree", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapDegreeUndefined: Self = StObject.set(x, "gapDegree", js.undefined)
      
      @scala.inline
      def setGapPosition(value: GapPositionType): Self = StObject.set(x, "gapPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapPositionUndefined: Self = StObject.set(x, "gapPosition", js.undefined)
      
      @scala.inline
      def setPercent(value: Double | js.Array[Double]): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
      
      @scala.inline
      def setPercentVarargs(value: Double*): Self = StObject.set(x, "percent", js.Array(value :_*))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStrokeColor(value: StrokeColorType): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
      
      @scala.inline
      def setStrokeColorVarargs(value: String*): Self = StObject.set(x, "strokeColor", js.Array(value :_*))
      
      @scala.inline
      def setStrokeLinecap(value: StrokeLinecapType): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
      
      @scala.inline
      def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTrailColor(value: String): Self = StObject.set(x, "trailColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrailColorUndefined: Self = StObject.set(x, "trailColor", js.undefined)
      
      @scala.inline
      def setTrailWidth(value: Double): Self = StObject.set(x, "trailWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrailWidthUndefined: Self = StObject.set(x, "trailWidth", js.undefined)
      
      @scala.inline
      def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    }
  }
  
  type StrokeColorType = String | js.Array[String] | js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.rcProgress.rcProgressStrings.round
    - typingsSlinky.rcProgress.rcProgressStrings.butt
    - typingsSlinky.rcProgress.rcProgressStrings.square
  */
  trait StrokeLinecapType extends StObject
  object StrokeLinecapType {
    
    @scala.inline
    def butt: typingsSlinky.rcProgress.rcProgressStrings.butt = "butt".asInstanceOf[typingsSlinky.rcProgress.rcProgressStrings.butt]
    
    @scala.inline
    def round: typingsSlinky.rcProgress.rcProgressStrings.round = "round".asInstanceOf[typingsSlinky.rcProgress.rcProgressStrings.round]
    
    @scala.inline
    def square: typingsSlinky.rcProgress.rcProgressStrings.square = "square".asInstanceOf[typingsSlinky.rcProgress.rcProgressStrings.square]
  }
}
