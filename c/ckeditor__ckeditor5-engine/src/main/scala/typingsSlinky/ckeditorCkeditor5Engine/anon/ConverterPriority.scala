package typingsSlinky.ckeditorCkeditor5Engine.anon

import typingsSlinky.ckeditorCkeditor5Utils.mod.PriorityString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConverterPriority extends StObject {
  
  var converterPriority: js.UndefOr[PriorityString] = js.native
  
  var model: String | Value = js.native
  
  var view: String | Key = js.native
}
object ConverterPriority {
  
  @scala.inline
  def apply(model: String | Value, view: String | Key): ConverterPriority = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConverterPriority]
  }
  
  @scala.inline
  implicit class ConverterPriorityMutableBuilder[Self <: ConverterPriority] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConverterPriority(value: PriorityString): Self = StObject.set(x, "converterPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConverterPriorityUndefined: Self = StObject.set(x, "converterPriority", js.undefined)
    
    @scala.inline
    def setModel(value: String | Value): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: String | Key): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
