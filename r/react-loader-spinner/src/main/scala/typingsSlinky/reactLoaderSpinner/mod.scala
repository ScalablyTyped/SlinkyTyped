package typingsSlinky.reactLoaderSpinner

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-loader-spinner", JSImport.Default)
  @js.native
  val default: ReactComponentClass[LoaderProps] = js.native
  
  @js.native
  trait LoaderProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var radius: js.UndefOr[Double] = js.native
    
    var secondaryColor: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    // in milliseconds
    var `type`: js.UndefOr[Types] = js.native
    
    var visible: js.UndefOr[Boolean | String] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object LoaderProps {
    
    @scala.inline
    def apply(): LoaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoaderProps]
    }
    
    @scala.inline
    implicit class LoaderPropsMutableBuilder[Self <: LoaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      @scala.inline
      def setSecondaryColor(value: String): Self = StObject.set(x, "secondaryColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryColorUndefined: Self = StObject.set(x, "secondaryColor", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setType(value: Types): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean | String): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.Audio
    - typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.BallTriangle
    - typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.Bars
    - typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.Circles
    - typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.Grid
    - typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.Hearts
    - typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.MutatingDots
    - typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.None
    - typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.NotSpecified
    - typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.Oval
    - typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.Plane
    - typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.Puff
    - typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.RevolvingDot
    - typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.Rings
    - typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.TailSpin
    - typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.ThreeDots
    - typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.Triangle
    - typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.Watch
  */
  trait Types extends StObject
  object Types {
    
    @scala.inline
    def Audio: typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.Audio = "Audio".asInstanceOf[typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.Audio]
    
    @scala.inline
    def BallTriangle: typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.BallTriangle = "BallTriangle".asInstanceOf[typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.BallTriangle]
    
    @scala.inline
    def Bars: typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.Bars = "Bars".asInstanceOf[typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.Bars]
    
    @scala.inline
    def Circles: typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.Circles = "Circles".asInstanceOf[typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.Circles]
    
    @scala.inline
    def Grid: typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.Grid = "Grid".asInstanceOf[typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.Grid]
    
    @scala.inline
    def Hearts: typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.Hearts = "Hearts".asInstanceOf[typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.Hearts]
    
    @scala.inline
    def MutatingDots: typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.MutatingDots = "MutatingDots".asInstanceOf[typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.MutatingDots]
    
    @scala.inline
    def None: typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.None = "None".asInstanceOf[typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.None]
    
    @scala.inline
    def NotSpecified: typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.NotSpecified = "NotSpecified".asInstanceOf[typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.NotSpecified]
    
    @scala.inline
    def Oval: typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.Oval = "Oval".asInstanceOf[typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.Oval]
    
    @scala.inline
    def Plane: typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.Plane = "Plane".asInstanceOf[typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.Plane]
    
    @scala.inline
    def Puff: typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.Puff = "Puff".asInstanceOf[typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.Puff]
    
    @scala.inline
    def RevolvingDot: typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.RevolvingDot = "RevolvingDot".asInstanceOf[typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.RevolvingDot]
    
    @scala.inline
    def Rings: typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.Rings = "Rings".asInstanceOf[typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.Rings]
    
    @scala.inline
    def TailSpin: typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.TailSpin = "TailSpin".asInstanceOf[typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.TailSpin]
    
    @scala.inline
    def ThreeDots: typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.ThreeDots = "ThreeDots".asInstanceOf[typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.ThreeDots]
    
    @scala.inline
    def Triangle: typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.Triangle = "Triangle".asInstanceOf[typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.Triangle]
    
    @scala.inline
    def Watch: typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.Watch = "Watch".asInstanceOf[typingsSlinky.reactLoaderSpinner.reactLoaderSpinnerStrings.Watch]
  }
  
  type _To = ReactComponentClass[LoaderProps]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ReactComponentClass[LoaderProps] = default
}
