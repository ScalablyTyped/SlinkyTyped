package typingsSlinky.materialUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TapHighlightColor extends StObject {
  
  var tapHighlightColor: js.UndefOr[String] = js.native
}
object TapHighlightColor {
  
  @scala.inline
  def apply(): TapHighlightColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TapHighlightColor]
  }
  
  @scala.inline
  implicit class TapHighlightColorMutableBuilder[Self <: TapHighlightColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTapHighlightColor(value: String): Self = StObject.set(x, "tapHighlightColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapHighlightColorUndefined: Self = StObject.set(x, "tapHighlightColor", js.undefined)
  }
}
