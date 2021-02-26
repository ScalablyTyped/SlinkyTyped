package typingsSlinky.blessed.mod.Widgets

import typingsSlinky.blessed.mod.Widgets.Types.TAlign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelOptions extends StObject {
  
  var side: TAlign = js.native
  
  var text: String = js.native
}
object LabelOptions {
  
  @scala.inline
  def apply(side: TAlign, text: String): LabelOptions = {
    val __obj = js.Dynamic.literal(side = side.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelOptions]
  }
  
  @scala.inline
  implicit class LabelOptionsMutableBuilder[Self <: LabelOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSide(value: TAlign): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
