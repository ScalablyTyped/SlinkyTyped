package typingsSlinky.c3.mod

import typingsSlinky.c3.c3Strings.end
import typingsSlinky.c3.c3Strings.middle
import typingsSlinky.c3.c3Strings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridLineOptions extends StObject {
  
  /** Class to give the grid line for styling. */
  var `class`: js.UndefOr[String] = js.native
  
  var position: js.UndefOr[start | end | middle] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  /** Value to place the grid line at. */
  var value: String | Double | js.Date = js.native
}
object GridLineOptions {
  
  @scala.inline
  def apply(value: String | Double | js.Date): GridLineOptions = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridLineOptions]
  }
  
  @scala.inline
  implicit class GridLineOptionsMutableBuilder[Self <: GridLineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    @scala.inline
    def setPosition(value: start | end | middle): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setValue(value: String | Double | js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueDate(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
