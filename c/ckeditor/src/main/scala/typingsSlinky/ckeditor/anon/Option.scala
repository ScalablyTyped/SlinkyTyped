package typingsSlinky.ckeditor.anon

import typingsSlinky.ckeditor.CKEDITOR.htmlParser.fragment
import typingsSlinky.ckeditor.CKEDITOR.htmlParser.node
import typingsSlinky.ckeditor.CKEDITOR.htmlParser.rule
import typingsSlinky.ckeditor.CKEDITOR.htmlParser.ruleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Option extends StObject {
  
  var option: ruleOptions = js.native
  
  var priority: Double = js.native
  
  var value: rule = js.native
}
object Option {
  
  @scala.inline
  def apply(option: ruleOptions, priority: Double, value: rule): Option = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
  
  @scala.inline
  implicit class OptionMutableBuilder[Self <: Option] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOption(value: ruleOptions): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: rule): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueFunction1(value: /* value */ node | fragment | String => Boolean): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
  }
}
