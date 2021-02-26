package typingsSlinky.ckeditorCkeditor5Engine.anon

import org.scalajs.dom.raw.Element
import typingsSlinky.ckeditorCkeditor5Engine.mod.view.MatcherPattern
import typingsSlinky.ckeditorCkeditor5Utils.mod.PriorityString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConverterPriorityModel extends StObject {
  
  var converterPriority: js.UndefOr[PriorityString] = js.native
  
  var model: String | Element | js.Function = js.native
  
  var view: MatcherPattern = js.native
}
object ConverterPriorityModel {
  
  @scala.inline
  def apply(model: String | Element | js.Function, view: MatcherPattern): ConverterPriorityModel = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConverterPriorityModel]
  }
  
  @scala.inline
  implicit class ConverterPriorityModelMutableBuilder[Self <: ConverterPriorityModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConverterPriority(value: PriorityString): Self = StObject.set(x, "converterPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConverterPriorityUndefined: Self = StObject.set(x, "converterPriority", js.undefined)
    
    @scala.inline
    def setModel(value: String | Element | js.Function): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelElement(value: Element): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: MatcherPattern): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewFunction1(value: /* element */ typingsSlinky.ckeditorCkeditor5Engine.mod.view.Element => Null | Attribute): Self = StObject.set(x, "view", js.Any.fromFunction1(value))
    
    @scala.inline
    def setViewRegExp(value: js.RegExp): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
