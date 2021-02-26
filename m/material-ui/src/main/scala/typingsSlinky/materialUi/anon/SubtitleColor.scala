package typingsSlinky.materialUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubtitleColor extends StObject {
  
  var fontWeight: js.UndefOr[Double] = js.native
  
  var subtitleColor: js.UndefOr[String] = js.native
  
  var titleColor: js.UndefOr[String] = js.native
}
object SubtitleColor {
  
  @scala.inline
  def apply(): SubtitleColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubtitleColor]
  }
  
  @scala.inline
  implicit class SubtitleColorMutableBuilder[Self <: SubtitleColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFontWeight(value: Double): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    @scala.inline
    def setSubtitleColor(value: String): Self = StObject.set(x, "subtitleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleColorUndefined: Self = StObject.set(x, "subtitleColor", js.undefined)
    
    @scala.inline
    def setTitleColor(value: String): Self = StObject.set(x, "titleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleColorUndefined: Self = StObject.set(x, "titleColor", js.undefined)
  }
}
