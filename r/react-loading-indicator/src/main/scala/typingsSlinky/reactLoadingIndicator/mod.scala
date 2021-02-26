package typingsSlinky.reactLoadingIndicator

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-loading-indicator", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[LoadingIndicatorProps, js.Object, js.Any]
  
  type LoadingIndicator = ReactComponentClass[LoadingIndicatorProps]
  
  @js.native
  trait LoadingIndicatorColor extends StObject {
    
    // value between 0 and 255, inclusive
    var alpha: Double = js.native
    
    // value between 0 and 255, inclusive
    var blue: Double = js.native
    
    // value between 0 and 255, inclusive
    var green: Double = js.native
    
    var red: Double = js.native
  }
  object LoadingIndicatorColor {
    
    @scala.inline
    def apply(alpha: Double, blue: Double, green: Double, red: Double): LoadingIndicatorColor = {
      val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadingIndicatorColor]
    }
    
    @scala.inline
    implicit class LoadingIndicatorColorMutableBuilder[Self <: LoadingIndicatorColor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LoadingIndicatorProps extends StObject {
    
    /*
      The color of the most solid segment—what we call each spoke of the loading indicator.
      The color prop is an object with four keys: red, green, blue, and alpha.
      The first three color components are values between 0 and 255, inclusive.
      The alpha component is a value between 0 and 1, inclusive.
      */
    var color: js.UndefOr[LoadingIndicatorColor] = js.native
    
    /*
      The number of steps between segments from the boldest segment to the faintest segments.
      If fadeSteps is segments - 1 then only the last segment will be the faintest,
      multiplied by fadeTo.
      If fadeSteps is a lower value, then several of the last segments will all have the faintest opacity.
      */
    var fadeSteps: js.UndefOr[Double] = js.native
    
    // Extra spacing to pad the distance between the center of the loading indicator and each segment, in logical pixels.
    /*
      The alpha multiplier of the faintest segments.
      Each segment's color is determined by multiplying the alpha channel of the color
      prop by a gradually decreasing alpha multiplier that starts at 1 and linearly
      decreases to the fadeTo prop.
      */
    var fadeTo: js.UndefOr[Double] = js.native
    
    // The width of each segment, in logical pixels.
    var segmentLength: js.UndefOr[Double] = js.native
    
    // The number of segments, evenly spaced from each other.
    var segmentWidth: js.UndefOr[Double] = js.native
    
    var segments: js.UndefOr[Double] = js.native
    
    // The length of each segment, in logical pixels.
    var spacing: js.UndefOr[Double] = js.native
  }
  object LoadingIndicatorProps {
    
    @scala.inline
    def apply(): LoadingIndicatorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadingIndicatorProps]
    }
    
    @scala.inline
    implicit class LoadingIndicatorPropsMutableBuilder[Self <: LoadingIndicatorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: LoadingIndicatorColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFadeSteps(value: Double): Self = StObject.set(x, "fadeSteps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFadeStepsUndefined: Self = StObject.set(x, "fadeSteps", js.undefined)
      
      @scala.inline
      def setFadeTo(value: Double): Self = StObject.set(x, "fadeTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFadeToUndefined: Self = StObject.set(x, "fadeTo", js.undefined)
      
      @scala.inline
      def setSegmentLength(value: Double): Self = StObject.set(x, "segmentLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentLengthUndefined: Self = StObject.set(x, "segmentLength", js.undefined)
      
      @scala.inline
      def setSegmentWidth(value: Double): Self = StObject.set(x, "segmentWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentWidthUndefined: Self = StObject.set(x, "segmentWidth", js.undefined)
      
      @scala.inline
      def setSegments(value: Double): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
      
      @scala.inline
      def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    }
  }
}
