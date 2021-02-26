package typingsSlinky.plotlyJs.anon

import typingsSlinky.plotlyJs.plotlyJsStrings.auto
import typingsSlinky.plotlyJs.plotlyJsStrings.left
import typingsSlinky.plotlyJs.plotlyJsStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.HoverLabel> */
@js.native
trait PartialHoverLabel extends StObject {
  
  var align: js.UndefOr[left | right | auto] = js.native
  
  var bgcolor: js.UndefOr[String] = js.native
  
  var bordercolor: js.UndefOr[String] = js.native
  
  var font: js.UndefOr[PartialFont] = js.native
  
  var namelength: js.UndefOr[Double] = js.native
}
object PartialHoverLabel {
  
  @scala.inline
  def apply(): PartialHoverLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialHoverLabel]
  }
  
  @scala.inline
  implicit class PartialHoverLabelMutableBuilder[Self <: PartialHoverLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: left | right | auto): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setBgcolor(value: String): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
    
    @scala.inline
    def setBordercolor(value: String): Self = StObject.set(x, "bordercolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBordercolorUndefined: Self = StObject.set(x, "bordercolor", js.undefined)
    
    @scala.inline
    def setFont(value: PartialFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setNamelength(value: Double): Self = StObject.set(x, "namelength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamelengthUndefined: Self = StObject.set(x, "namelength", js.undefined)
  }
}
