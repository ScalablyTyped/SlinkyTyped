package typingsSlinky.amcharts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object amBalloonMod {
  
  @JSImport("amcharts/AmBalloon", JSImport.Default)
  @js.native
  class default () extends AmBalloon
  
  @js.native
  trait AmBalloon extends StObject {
    
    /**
      * If this is set to true, border color instead of background color will be changed
      * when user rolls-over the slice, graph, etc.
      */
    var adjustBorderColor: Boolean = js.native
    
    /**
      * Balloon border opacity. Value range is 0 - 1.
      * @default 1
      */
    var borderAlpha: Double = js.native
    
    /**
      * Balloon border color. #FFFFFF
      */
    var borderColor: String = js.native
    
    /**
      * Balloon border thickness.
      * @default 2
      */
    var borderThickness: Double = js.native
    
    /**
      * Color of text in the balloon. #FFFFFF
      */
    var color: String = js.native
    
    /**
      * Balloon corner radius.
      * @default 6
      */
    var cornerRadius: Double = js.native
    
    /**
      * Balloon background opacity.
      * @default 1
      */
    var fillAlpha: Double = js.native
    
    /**
      * Balloon background color. Usually balloon background color is set by the chart.
      * Only if "adjustBorderColor" is "true" this color will be used.
      * @default "#CC0000"
      */
    var fillColor: String = js.native
    
    /**
      * Size of text in the balloon. Chart's fontSize is used by default.
      */
    var fontSize: String = js.native
    
    /**
      * Hides balloon.
      */
    def hide(): Unit = js.native
    
    /**
      * Horizontal padding of the balloon.
      * @default 8
      */
    var horizontalPadding: Double = js.native
    
    /**
      * The width of the pointer (arrow) "root". Only used if cornerRadius is 0.
      * @default 10
      */
    var pointerWidth: Double = js.native
    
    /**
      * Defines a square within which the balloon should appear.
      * Bounds are set by chart class, you don't need to call this method yourself.
      */
    def setBounds(left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
    
    /**
      * Sets coordinates the balloon should point to.
      */
    def setPosition(x: Double, y: Double): Unit = js.native
    
    /**
      * Specifies the text which should be displayed.
      */
    def show(value: String): Unit = js.native
    
    /**
      * If cornerRadius of a balloon is >0, showBullet is set to true for value balloons when ChartCursor is used.
      * If you don't want the bullet near the balloon, set it to false: chart.balloon.showBullet = false
      */
    var showBullet: Boolean = js.native
    
    /**
      * Text alignment, possible values "left", "middle" and "right" middle
      */
    var textAlign: String = js.native
    
    /**
      * Color of the text shadow. #000000
      */
    var textShadowColor: String = js.native
    
    /**
      * Vertical padding of the balloon.
      * @default 5
      */
    var verticalPadding: Double = js.native
  }
  object AmBalloon {
    
    @scala.inline
    def apply(
      adjustBorderColor: Boolean,
      borderAlpha: Double,
      borderColor: String,
      borderThickness: Double,
      color: String,
      cornerRadius: Double,
      fillAlpha: Double,
      fillColor: String,
      fontSize: String,
      hide: () => Unit,
      horizontalPadding: Double,
      pointerWidth: Double,
      setBounds: (Double, Double, Double, Double) => Unit,
      setPosition: (Double, Double) => Unit,
      show: String => Unit,
      showBullet: Boolean,
      textAlign: String,
      textShadowColor: String,
      verticalPadding: Double
    ): AmBalloon = {
      val __obj = js.Dynamic.literal(adjustBorderColor = adjustBorderColor.asInstanceOf[js.Any], borderAlpha = borderAlpha.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderThickness = borderThickness.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], cornerRadius = cornerRadius.asInstanceOf[js.Any], fillAlpha = fillAlpha.asInstanceOf[js.Any], fillColor = fillColor.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), horizontalPadding = horizontalPadding.asInstanceOf[js.Any], pointerWidth = pointerWidth.asInstanceOf[js.Any], setBounds = js.Any.fromFunction4(setBounds), setPosition = js.Any.fromFunction2(setPosition), show = js.Any.fromFunction1(show), showBullet = showBullet.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any], textShadowColor = textShadowColor.asInstanceOf[js.Any], verticalPadding = verticalPadding.asInstanceOf[js.Any])
      __obj.asInstanceOf[AmBalloon]
    }
    
    @scala.inline
    implicit class AmBalloonMutableBuilder[Self <: AmBalloon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdjustBorderColor(value: Boolean): Self = StObject.set(x, "adjustBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderAlpha(value: Double): Self = StObject.set(x, "borderAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderThickness(value: Double): Self = StObject.set(x, "borderThickness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillAlpha(value: Double): Self = StObject.set(x, "fillAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHorizontalPadding(value: Double): Self = StObject.set(x, "horizontalPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerWidth(value: Double): Self = StObject.set(x, "pointerWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetBounds(value: (Double, Double, Double, Double) => Unit): Self = StObject.set(x, "setBounds", js.Any.fromFunction4(value))
      
      @scala.inline
      def setSetPosition(value: (Double, Double) => Unit): Self = StObject.set(x, "setPosition", js.Any.fromFunction2(value))
      
      @scala.inline
      def setShow(value: String => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShowBullet(value: Boolean): Self = StObject.set(x, "showBullet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextShadowColor(value: String): Self = StObject.set(x, "textShadowColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalPadding(value: Double): Self = StObject.set(x, "verticalPadding", value.asInstanceOf[js.Any])
    }
  }
}
