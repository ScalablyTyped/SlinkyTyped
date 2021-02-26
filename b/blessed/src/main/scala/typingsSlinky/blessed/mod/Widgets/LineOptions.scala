package typingsSlinky.blessed.mod.Widgets

import typingsSlinky.blessed.blessedStrings.horizontal
import typingsSlinky.blessed.blessedStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A simple line which can be line or bg styled.
  */
@js.native
trait LineOptions extends BoxOptions {
  
  /**
    * Can be vertical or horizontal.
    */
  var orientation: js.UndefOr[vertical | horizontal] = js.native
  
  /**
    * Treated the same as a border object. (attributes can be contained in style).
    */
  var `type`: js.UndefOr[String] = js.native
}
object LineOptions {
  
  @scala.inline
  def apply(): LineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineOptions]
  }
  
  @scala.inline
  implicit class LineOptionsMutableBuilder[Self <: LineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrientation(value: vertical | horizontal): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
