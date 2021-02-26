package typingsSlinky.plotlyJs.anon

import typingsSlinky.plotlyJs.mod.Transition
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

/* Inlined std.Partial<plotly.js.plotly.js.Slider> */
@js.native
trait PartialSlider extends StObject {
  
  var active: js.UndefOr[Double] = js.native
  
  var activebgcolor: js.UndefOr[typingsSlinky.plotlyJs.mod.Color] = js.native
  
  var bgcolor: js.UndefOr[typingsSlinky.plotlyJs.mod.Color] = js.native
  
  var bordercolor: js.UndefOr[typingsSlinky.plotlyJs.mod.Color] = js.native
  
  var borderwidth: js.UndefOr[Double] = js.native
  
  var currentvalue: js.UndefOr[Font] = js.native
  
  var font: js.UndefOr[typingsSlinky.plotlyJs.mod.Font] = js.native
  
  var len: js.UndefOr[Double] = js.native
  
  var lenmode: js.UndefOr[fraction | pixels] = js.native
  
  var minorticklen: js.UndefOr[Double] = js.native
  
  var pad: js.UndefOr[PartialPadding] = js.native
  
  var steps: js.UndefOr[js.Array[PartialSliderStep]] = js.native
  
  var tickcolor: js.UndefOr[typingsSlinky.plotlyJs.mod.Color] = js.native
  
  var ticklen: js.UndefOr[Double] = js.native
  
  var tickwidth: js.UndefOr[Double] = js.native
  
  var transition: js.UndefOr[Transition] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
  
  var x: js.UndefOr[Double] = js.native
  
  var xanchor: js.UndefOr[auto | left | center | right] = js.native
  
  var y: js.UndefOr[Double] = js.native
  
  var yanchor: js.UndefOr[auto | top | middle | bottom] = js.native
}
object PartialSlider {
  
  @scala.inline
  def apply(): PartialSlider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSlider]
  }
  
  @scala.inline
  implicit class PartialSliderMutableBuilder[Self <: PartialSlider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Double): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setActivebgcolor(value: typingsSlinky.plotlyJs.mod.Color): Self = StObject.set(x, "activebgcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivebgcolorUndefined: Self = StObject.set(x, "activebgcolor", js.undefined)
    
    @scala.inline
    def setActivebgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "activebgcolor", js.Array(value :_*))
    
    @scala.inline
    def setBgcolor(value: typingsSlinky.plotlyJs.mod.Color): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
    
    @scala.inline
    def setBgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "bgcolor", js.Array(value :_*))
    
    @scala.inline
    def setBordercolor(value: typingsSlinky.plotlyJs.mod.Color): Self = StObject.set(x, "bordercolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBordercolorUndefined: Self = StObject.set(x, "bordercolor", js.undefined)
    
    @scala.inline
    def setBordercolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "bordercolor", js.Array(value :_*))
    
    @scala.inline
    def setBorderwidth(value: Double): Self = StObject.set(x, "borderwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderwidthUndefined: Self = StObject.set(x, "borderwidth", js.undefined)
    
    @scala.inline
    def setCurrentvalue(value: Font): Self = StObject.set(x, "currentvalue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentvalueUndefined: Self = StObject.set(x, "currentvalue", js.undefined)
    
    @scala.inline
    def setFont(value: typingsSlinky.plotlyJs.mod.Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setLen(value: Double): Self = StObject.set(x, "len", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLenUndefined: Self = StObject.set(x, "len", js.undefined)
    
    @scala.inline
    def setLenmode(value: fraction | pixels): Self = StObject.set(x, "lenmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLenmodeUndefined: Self = StObject.set(x, "lenmode", js.undefined)
    
    @scala.inline
    def setMinorticklen(value: Double): Self = StObject.set(x, "minorticklen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorticklenUndefined: Self = StObject.set(x, "minorticklen", js.undefined)
    
    @scala.inline
    def setPad(value: PartialPadding): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
    
    @scala.inline
    def setSteps(value: js.Array[PartialSliderStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    @scala.inline
    def setStepsVarargs(value: PartialSliderStep*): Self = StObject.set(x, "steps", js.Array(value :_*))
    
    @scala.inline
    def setTickcolor(value: typingsSlinky.plotlyJs.mod.Color): Self = StObject.set(x, "tickcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickcolorUndefined: Self = StObject.set(x, "tickcolor", js.undefined)
    
    @scala.inline
    def setTickcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "tickcolor", js.Array(value :_*))
    
    @scala.inline
    def setTicklen(value: Double): Self = StObject.set(x, "ticklen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicklenUndefined: Self = StObject.set(x, "ticklen", js.undefined)
    
    @scala.inline
    def setTickwidth(value: Double): Self = StObject.set(x, "tickwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickwidthUndefined: Self = StObject.set(x, "tickwidth", js.undefined)
    
    @scala.inline
    def setTransition(value: Transition): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setXanchor(value: auto | left | center | right): Self = StObject.set(x, "xanchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXanchorUndefined: Self = StObject.set(x, "xanchor", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    @scala.inline
    def setYanchor(value: auto | top | middle | bottom): Self = StObject.set(x, "yanchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYanchorUndefined: Self = StObject.set(x, "yanchor", js.undefined)
  }
}
