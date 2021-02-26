package typingsSlinky.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Watermark extends StObject {
  
  /** angle of text rotation (minimal version: 0.1.60) */
  var angle: js.UndefOr[Double] = js.native
  
  /** bold style of text */
  var bold: js.UndefOr[Boolean] = js.native
  
  /** color of text */
  var color: js.UndefOr[String] = js.native
  
  var font: js.UndefOr[String] = js.native
  
  /** own font size of text (ideal size is calculated automatically) (minimal version: 0.1.60) */
  var fontSize: js.UndefOr[Double] = js.native
  
  /** italics style of text */
  var italics: js.UndefOr[Boolean] = js.native
  
  /** opacity of text */
  var opacity: js.UndefOr[Double] = js.native
  
  /** watermark text */
  var text: String = js.native
}
object Watermark {
  
  @scala.inline
  def apply(text: String): Watermark = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Watermark]
  }
  
  @scala.inline
  implicit class WatermarkMutableBuilder[Self <: Watermark] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    @scala.inline
    def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setItalics(value: Boolean): Self = StObject.set(x, "italics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItalicsUndefined: Self = StObject.set(x, "italics", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
