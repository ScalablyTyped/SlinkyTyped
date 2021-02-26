package typingsSlinky.nivoSlider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.nivoSlider.nivoSliderStrings.sliceDown
    - typingsSlinky.nivoSlider.nivoSliderStrings.sliceDownLeft
    - typingsSlinky.nivoSlider.nivoSliderStrings.sliceUp
    - typingsSlinky.nivoSlider.nivoSliderStrings.sliceUpLeft
    - typingsSlinky.nivoSlider.nivoSliderStrings.sliceUpDown
    - typingsSlinky.nivoSlider.nivoSliderStrings.sliceUpDownLeft
    - typingsSlinky.nivoSlider.nivoSliderStrings.fold
    - typingsSlinky.nivoSlider.nivoSliderStrings.fade
    - typingsSlinky.nivoSlider.nivoSliderStrings.random
    - typingsSlinky.nivoSlider.nivoSliderStrings.slideInRight
    - typingsSlinky.nivoSlider.nivoSliderStrings.slideInLeft
    - typingsSlinky.nivoSlider.nivoSliderStrings.boxRandom
    - typingsSlinky.nivoSlider.nivoSliderStrings.boxRain
    - typingsSlinky.nivoSlider.nivoSliderStrings.boxRainReverse
    - typingsSlinky.nivoSlider.nivoSliderStrings.boxRainGrow
    - typingsSlinky.nivoSlider.nivoSliderStrings.boxRainGrowReverse
  */
  trait EffectType extends StObject
  object EffectType {
    
    @scala.inline
    def boxRain: typingsSlinky.nivoSlider.nivoSliderStrings.boxRain = "boxRain".asInstanceOf[typingsSlinky.nivoSlider.nivoSliderStrings.boxRain]
    
    @scala.inline
    def boxRainGrow: typingsSlinky.nivoSlider.nivoSliderStrings.boxRainGrow = "boxRainGrow".asInstanceOf[typingsSlinky.nivoSlider.nivoSliderStrings.boxRainGrow]
    
    @scala.inline
    def boxRainGrowReverse: typingsSlinky.nivoSlider.nivoSliderStrings.boxRainGrowReverse = "boxRainGrowReverse".asInstanceOf[typingsSlinky.nivoSlider.nivoSliderStrings.boxRainGrowReverse]
    
    @scala.inline
    def boxRainReverse: typingsSlinky.nivoSlider.nivoSliderStrings.boxRainReverse = "boxRainReverse".asInstanceOf[typingsSlinky.nivoSlider.nivoSliderStrings.boxRainReverse]
    
    @scala.inline
    def boxRandom: typingsSlinky.nivoSlider.nivoSliderStrings.boxRandom = "boxRandom".asInstanceOf[typingsSlinky.nivoSlider.nivoSliderStrings.boxRandom]
    
    @scala.inline
    def fade: typingsSlinky.nivoSlider.nivoSliderStrings.fade = "fade".asInstanceOf[typingsSlinky.nivoSlider.nivoSliderStrings.fade]
    
    @scala.inline
    def fold: typingsSlinky.nivoSlider.nivoSliderStrings.fold = "fold".asInstanceOf[typingsSlinky.nivoSlider.nivoSliderStrings.fold]
    
    @scala.inline
    def random: typingsSlinky.nivoSlider.nivoSliderStrings.random = "random".asInstanceOf[typingsSlinky.nivoSlider.nivoSliderStrings.random]
    
    @scala.inline
    def sliceDown: typingsSlinky.nivoSlider.nivoSliderStrings.sliceDown = "sliceDown".asInstanceOf[typingsSlinky.nivoSlider.nivoSliderStrings.sliceDown]
    
    @scala.inline
    def sliceDownLeft: typingsSlinky.nivoSlider.nivoSliderStrings.sliceDownLeft = "sliceDownLeft".asInstanceOf[typingsSlinky.nivoSlider.nivoSliderStrings.sliceDownLeft]
    
    @scala.inline
    def sliceUp: typingsSlinky.nivoSlider.nivoSliderStrings.sliceUp = "sliceUp".asInstanceOf[typingsSlinky.nivoSlider.nivoSliderStrings.sliceUp]
    
    @scala.inline
    def sliceUpDown: typingsSlinky.nivoSlider.nivoSliderStrings.sliceUpDown = "sliceUpDown".asInstanceOf[typingsSlinky.nivoSlider.nivoSliderStrings.sliceUpDown]
    
    @scala.inline
    def sliceUpDownLeft: typingsSlinky.nivoSlider.nivoSliderStrings.sliceUpDownLeft = "sliceUpDownLeft".asInstanceOf[typingsSlinky.nivoSlider.nivoSliderStrings.sliceUpDownLeft]
    
    @scala.inline
    def sliceUpLeft: typingsSlinky.nivoSlider.nivoSliderStrings.sliceUpLeft = "sliceUpLeft".asInstanceOf[typingsSlinky.nivoSlider.nivoSliderStrings.sliceUpLeft]
    
    @scala.inline
    def slideInLeft: typingsSlinky.nivoSlider.nivoSliderStrings.slideInLeft = "slideInLeft".asInstanceOf[typingsSlinky.nivoSlider.nivoSliderStrings.slideInLeft]
    
    @scala.inline
    def slideInRight: typingsSlinky.nivoSlider.nivoSliderStrings.slideInRight = "slideInRight".asInstanceOf[typingsSlinky.nivoSlider.nivoSliderStrings.slideInRight]
  }
  
  @js.native
  trait Options extends StObject {
    
    var afterChange: js.UndefOr[js.Function0[Unit]] = js.native
    
    var afterLoad: js.UndefOr[js.Function0[Unit]] = js.native
    
    var animSpeed: js.UndefOr[Double] = js.native
    
    var beforeChange: js.UndefOr[js.Function0[Unit]] = js.native
    
    var boxCols: js.UndefOr[Double] = js.native
    
    var boxRows: js.UndefOr[Double] = js.native
    
    var controlNav: js.UndefOr[Boolean] = js.native
    
    var controlNavThumbs: js.UndefOr[Boolean] = js.native
    
    var directionNav: js.UndefOr[Boolean] = js.native
    
    var effect: js.UndefOr[EffectType] = js.native
    
    var lastSlide: js.UndefOr[js.Function0[Unit]] = js.native
    
    var manualAdvance: js.UndefOr[Boolean] = js.native
    
    var nextText: js.UndefOr[String] = js.native
    
    var pauseOnHover: js.UndefOr[Boolean] = js.native
    
    var pauseTime: js.UndefOr[Double] = js.native
    
    var prevText: js.UndefOr[String] = js.native
    
    var randomStart: js.UndefOr[Boolean] = js.native
    
    var slices: js.UndefOr[Double] = js.native
    
    var slideshowEnd: js.UndefOr[js.Function0[Unit]] = js.native
    
    var startSlide: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterChange(value: () => Unit): Self = StObject.set(x, "afterChange", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAfterChangeUndefined: Self = StObject.set(x, "afterChange", js.undefined)
      
      @scala.inline
      def setAfterLoad(value: () => Unit): Self = StObject.set(x, "afterLoad", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAfterLoadUndefined: Self = StObject.set(x, "afterLoad", js.undefined)
      
      @scala.inline
      def setAnimSpeed(value: Double): Self = StObject.set(x, "animSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimSpeedUndefined: Self = StObject.set(x, "animSpeed", js.undefined)
      
      @scala.inline
      def setBeforeChange(value: () => Unit): Self = StObject.set(x, "beforeChange", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforeChangeUndefined: Self = StObject.set(x, "beforeChange", js.undefined)
      
      @scala.inline
      def setBoxCols(value: Double): Self = StObject.set(x, "boxCols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxColsUndefined: Self = StObject.set(x, "boxCols", js.undefined)
      
      @scala.inline
      def setBoxRows(value: Double): Self = StObject.set(x, "boxRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxRowsUndefined: Self = StObject.set(x, "boxRows", js.undefined)
      
      @scala.inline
      def setControlNav(value: Boolean): Self = StObject.set(x, "controlNav", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlNavThumbs(value: Boolean): Self = StObject.set(x, "controlNavThumbs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlNavThumbsUndefined: Self = StObject.set(x, "controlNavThumbs", js.undefined)
      
      @scala.inline
      def setControlNavUndefined: Self = StObject.set(x, "controlNav", js.undefined)
      
      @scala.inline
      def setDirectionNav(value: Boolean): Self = StObject.set(x, "directionNav", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionNavUndefined: Self = StObject.set(x, "directionNav", js.undefined)
      
      @scala.inline
      def setEffect(value: EffectType): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
      
      @scala.inline
      def setLastSlide(value: () => Unit): Self = StObject.set(x, "lastSlide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLastSlideUndefined: Self = StObject.set(x, "lastSlide", js.undefined)
      
      @scala.inline
      def setManualAdvance(value: Boolean): Self = StObject.set(x, "manualAdvance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManualAdvanceUndefined: Self = StObject.set(x, "manualAdvance", js.undefined)
      
      @scala.inline
      def setNextText(value: String): Self = StObject.set(x, "nextText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTextUndefined: Self = StObject.set(x, "nextText", js.undefined)
      
      @scala.inline
      def setPauseOnHover(value: Boolean): Self = StObject.set(x, "pauseOnHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPauseOnHoverUndefined: Self = StObject.set(x, "pauseOnHover", js.undefined)
      
      @scala.inline
      def setPauseTime(value: Double): Self = StObject.set(x, "pauseTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPauseTimeUndefined: Self = StObject.set(x, "pauseTime", js.undefined)
      
      @scala.inline
      def setPrevText(value: String): Self = StObject.set(x, "prevText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevTextUndefined: Self = StObject.set(x, "prevText", js.undefined)
      
      @scala.inline
      def setRandomStart(value: Boolean): Self = StObject.set(x, "randomStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRandomStartUndefined: Self = StObject.set(x, "randomStart", js.undefined)
      
      @scala.inline
      def setSlices(value: Double): Self = StObject.set(x, "slices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlicesUndefined: Self = StObject.set(x, "slices", js.undefined)
      
      @scala.inline
      def setSlideshowEnd(value: () => Unit): Self = StObject.set(x, "slideshowEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSlideshowEndUndefined: Self = StObject.set(x, "slideshowEnd", js.undefined)
      
      @scala.inline
      def setStartSlide(value: Double): Self = StObject.set(x, "startSlide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartSlideUndefined: Self = StObject.set(x, "startSlide", js.undefined)
    }
  }
  
  object global {
    
    @js.native
    trait JQuery extends StObject {
      
      def nivoSlider(): JQuery = js.native
      def nivoSlider(options: Options): JQuery = js.native
    }
  }
}
