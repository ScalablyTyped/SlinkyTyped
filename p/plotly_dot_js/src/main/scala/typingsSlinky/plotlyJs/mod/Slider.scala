package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.anon.PartialPadding
import typingsSlinky.plotlyJs.anon.PartialSliderStep
import typingsSlinky.plotlyJs.plotlyJsStrings.auto
import typingsSlinky.plotlyJs.plotlyJsStrings.bottom
import typingsSlinky.plotlyJs.plotlyJsStrings.center
import typingsSlinky.plotlyJs.plotlyJsStrings.fraction
import typingsSlinky.plotlyJs.plotlyJsStrings.left
import typingsSlinky.plotlyJs.plotlyJsStrings.middle
import typingsSlinky.plotlyJs.plotlyJsStrings.pixels
import typingsSlinky.plotlyJs.plotlyJsStrings.right
import typingsSlinky.plotlyJs.plotlyJsStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Slider extends StObject {
  
  /**
    * Determines which button (by index starting from 0) is
    * considered active.
    */
  var active: Double = js.native
  
  /**
    * Sets the background color of the slider grip
    * while dragging.
    */
  var activebgcolor: Color = js.native
  
  /**
    * Sets the background color of the slider.
    */
  var bgcolor: Color = js.native
  
  /**
    * Sets the color of the border enclosing the slider.
    */
  var bordercolor: Color = js.native
  
  /**
    * Sets the width (in px) of the border enclosing the slider.
    */
  var borderwidth: Double = js.native
  
  var currentvalue: typingsSlinky.plotlyJs.anon.Font = js.native
  
  /**
    * Sets the font of the slider step labels.
    */
  var font: Font = js.native
  
  /**
    * Sets the length of the slider
    * This measure excludes the padding of both ends.
    * That is, the slider's length is this length minus the
    * padding on both ends.
    */
  var len: Double = js.native
  
  /**
    * Determines whether this slider length
    * is set in units of plot *fraction* or in *pixels.
    * Use `len` to set the value.
    */
  var lenmode: fraction | pixels = js.native
  
  /**
    * Sets the length in pixels of minor step tick marks
    */
  var minorticklen: Double = js.native
  
  /**
    * Set the padding of the slider component along each side.
    */
  var pad: PartialPadding = js.native
  
  var steps: js.Array[PartialSliderStep] = js.native
  
  /**
    * Sets the color of the border enclosing the slider.
    */
  var tickcolor: Color = js.native
  
  /**
    * Sets the length in pixels of step tick marks
    */
  var ticklen: Double = js.native
  
  /**
    * Sets the tick width (in px).
    */
  var tickwidth: Double = js.native
  
  var transition: Transition = js.native
  
  /**
    * Determines whether or not the slider is visible.
    */
  var visible: Boolean = js.native
  
  /**
    * Sets the x position (in normalized coordinates) of the slider.
    */
  var x: Double = js.native
  
  /**
    * Sets the slider's horizontal position anchor.
    * This anchor binds the `x` position to the *left*, *center*
    * or *right* of the range selector.
    */
  var xanchor: auto | left | center | right = js.native
  
  /**
    * Sets the y position (in normalized coordinates) of the slider.
    */
  var y: Double = js.native
  
  /**
    * Sets the slider's vertical position anchor
    * This anchor binds the `y` position to the *top*, *middle*
    * or *bottom* of the range selector.
    */
  var yanchor: auto | top | middle | bottom = js.native
}
object Slider {
  
  @scala.inline
  def apply(
    active: Double,
    activebgcolor: Color,
    bgcolor: Color,
    bordercolor: Color,
    borderwidth: Double,
    currentvalue: typingsSlinky.plotlyJs.anon.Font,
    font: Font,
    len: Double,
    lenmode: fraction | pixels,
    minorticklen: Double,
    pad: PartialPadding,
    steps: js.Array[PartialSliderStep],
    tickcolor: Color,
    ticklen: Double,
    tickwidth: Double,
    transition: Transition,
    visible: Boolean,
    x: Double,
    xanchor: auto | left | center | right,
    y: Double,
    yanchor: auto | top | middle | bottom
  ): Slider = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], activebgcolor = activebgcolor.asInstanceOf[js.Any], bgcolor = bgcolor.asInstanceOf[js.Any], bordercolor = bordercolor.asInstanceOf[js.Any], borderwidth = borderwidth.asInstanceOf[js.Any], currentvalue = currentvalue.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], len = len.asInstanceOf[js.Any], lenmode = lenmode.asInstanceOf[js.Any], minorticklen = minorticklen.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], tickcolor = tickcolor.asInstanceOf[js.Any], ticklen = ticklen.asInstanceOf[js.Any], tickwidth = tickwidth.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xanchor = xanchor.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yanchor = yanchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slider]
  }
  
  @scala.inline
  implicit class SliderMutableBuilder[Self <: Slider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Double): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivebgcolor(value: Color): Self = StObject.set(x, "activebgcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivebgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "activebgcolor", js.Array(value :_*))
    
    @scala.inline
    def setBgcolor(value: Color): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "bgcolor", js.Array(value :_*))
    
    @scala.inline
    def setBordercolor(value: Color): Self = StObject.set(x, "bordercolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBordercolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "bordercolor", js.Array(value :_*))
    
    @scala.inline
    def setBorderwidth(value: Double): Self = StObject.set(x, "borderwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentvalue(value: typingsSlinky.plotlyJs.anon.Font): Self = StObject.set(x, "currentvalue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont(value: Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLen(value: Double): Self = StObject.set(x, "len", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLenmode(value: fraction | pixels): Self = StObject.set(x, "lenmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorticklen(value: Double): Self = StObject.set(x, "minorticklen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPad(value: PartialPadding): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSteps(value: js.Array[PartialSliderStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsVarargs(value: PartialSliderStep*): Self = StObject.set(x, "steps", js.Array(value :_*))
    
    @scala.inline
    def setTickcolor(value: Color): Self = StObject.set(x, "tickcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "tickcolor", js.Array(value :_*))
    
    @scala.inline
    def setTicklen(value: Double): Self = StObject.set(x, "ticklen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickwidth(value: Double): Self = StObject.set(x, "tickwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransition(value: Transition): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXanchor(value: auto | left | center | right): Self = StObject.set(x, "xanchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYanchor(value: auto | top | middle | bottom): Self = StObject.set(x, "yanchor", value.asInstanceOf[js.Any])
  }
}
