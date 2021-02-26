package typingsSlinky.mathjax.MathJax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatchWebFonts extends StObject {
  
  /*Initial delay before the first check for web fonts (in milliseconds).*/
  var fontCheckDelay: js.UndefOr[Double] = js.native
  
  /*How long to keep looking for fonts (in milliseconds).*/
  var fontCheckTimeout: js.UndefOr[Double] = js.native
  
  /*This block controls whether to apply font size matching for each output mode.*/
  var matchFor: js.UndefOr[MatchFor] = js.native
}
object MatchWebFonts {
  
  @scala.inline
  def apply(): MatchWebFonts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchWebFonts]
  }
  
  @scala.inline
  implicit class MatchWebFontsMutableBuilder[Self <: MatchWebFonts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFontCheckDelay(value: Double): Self = StObject.set(x, "fontCheckDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontCheckDelayUndefined: Self = StObject.set(x, "fontCheckDelay", js.undefined)
    
    @scala.inline
    def setFontCheckTimeout(value: Double): Self = StObject.set(x, "fontCheckTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontCheckTimeoutUndefined: Self = StObject.set(x, "fontCheckTimeout", js.undefined)
    
    @scala.inline
    def setMatchFor(value: MatchFor): Self = StObject.set(x, "matchFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchForUndefined: Self = StObject.set(x, "matchFor", js.undefined)
  }
}
