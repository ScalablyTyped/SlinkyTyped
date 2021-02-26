package typingsSlinky.plotlyJs.anon

import typingsSlinky.plotlyJs.mod.XAxisName
import typingsSlinky.plotlyJs.mod.YAxisName
import typingsSlinky.plotlyJs.plotlyJsStrings.above
import typingsSlinky.plotlyJs.plotlyJsStrings.below
import typingsSlinky.plotlyJs.plotlyJsStrings.bottom
import typingsSlinky.plotlyJs.plotlyJsStrings.center
import typingsSlinky.plotlyJs.plotlyJsStrings.contain
import typingsSlinky.plotlyJs.plotlyJsStrings.fill
import typingsSlinky.plotlyJs.plotlyJsStrings.left
import typingsSlinky.plotlyJs.plotlyJsStrings.middle
import typingsSlinky.plotlyJs.plotlyJsStrings.paper
import typingsSlinky.plotlyJs.plotlyJsStrings.right
import typingsSlinky.plotlyJs.plotlyJsStrings.stretch
import typingsSlinky.plotlyJs.plotlyJsStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.Image> */
@js.native
trait PartialImage extends StObject {
  
  var layer: js.UndefOr[above | below] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var sizex: js.UndefOr[Double] = js.native
  
  var sizey: js.UndefOr[Double] = js.native
  
  var sizing: js.UndefOr[fill | contain | stretch] = js.native
  
  var source: js.UndefOr[String] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
  
  var x: js.UndefOr[Double | String] = js.native
  
  var xanchor: js.UndefOr[left | center | right] = js.native
  
  var xref: js.UndefOr[paper | XAxisName] = js.native
  
  var y: js.UndefOr[Double | String] = js.native
  
  var yanchor: js.UndefOr[top | middle | bottom] = js.native
  
  var yref: js.UndefOr[paper | YAxisName] = js.native
}
object PartialImage {
  
  @scala.inline
  def apply(): PartialImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialImage]
  }
  
  @scala.inline
  implicit class PartialImageMutableBuilder[Self <: PartialImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayer(value: above | below): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setSizex(value: Double): Self = StObject.set(x, "sizex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizexUndefined: Self = StObject.set(x, "sizex", js.undefined)
    
    @scala.inline
    def setSizey(value: Double): Self = StObject.set(x, "sizey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeyUndefined: Self = StObject.set(x, "sizey", js.undefined)
    
    @scala.inline
    def setSizing(value: fill | contain | stretch): Self = StObject.set(x, "sizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizingUndefined: Self = StObject.set(x, "sizing", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setXanchor(value: left | center | right): Self = StObject.set(x, "xanchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXanchorUndefined: Self = StObject.set(x, "xanchor", js.undefined)
    
    @scala.inline
    def setXref(value: paper | XAxisName): Self = StObject.set(x, "xref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXrefUndefined: Self = StObject.set(x, "xref", js.undefined)
    
    @scala.inline
    def setY(value: Double | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    @scala.inline
    def setYanchor(value: top | middle | bottom): Self = StObject.set(x, "yanchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYanchorUndefined: Self = StObject.set(x, "yanchor", js.undefined)
    
    @scala.inline
    def setYref(value: paper | YAxisName): Self = StObject.set(x, "yref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYrefUndefined: Self = StObject.set(x, "yref", js.undefined)
  }
}
