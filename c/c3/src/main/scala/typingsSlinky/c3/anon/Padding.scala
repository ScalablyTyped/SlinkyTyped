package typingsSlinky.c3.anon

import typingsSlinky.c3.c3Strings.center
import typingsSlinky.c3.c3Strings.left
import typingsSlinky.c3.c3Strings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Padding extends StObject {
  
  /**
    * Spacing around the title.
    */
  var padding: js.UndefOr[typingsSlinky.c3.mod.Padding] = js.native
  
  /**
    * Chart title text.
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    * Position the title relative to the chart.
    */
  var title_position: js.UndefOr[right | center | left] = js.native
}
object Padding {
  
  @scala.inline
  def apply(): Padding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Padding]
  }
  
  @scala.inline
  implicit class PaddingMutableBuilder[Self <: Padding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPadding(value: typingsSlinky.c3.mod.Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTitle_position(value: right | center | left): Self = StObject.set(x, "title_position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle_positionUndefined: Self = StObject.set(x, "title_position", js.undefined)
  }
}
