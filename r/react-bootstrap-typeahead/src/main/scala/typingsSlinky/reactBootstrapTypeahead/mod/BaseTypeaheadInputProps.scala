package typingsSlinky.reactBootstrapTypeahead.mod

import typingsSlinky.react.mod.InputHTMLAttributes
import typingsSlinky.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.input
import typingsSlinky.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseTypeaheadInputProps extends InputHTMLAttributes[input] {
  
  @JSName("type")
  var type_BaseTypeaheadInputProps: text = js.native
}
object BaseTypeaheadInputProps {
  
  @scala.inline
  def apply(`type`: text): BaseTypeaheadInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseTypeaheadInputProps]
  }
  
  @scala.inline
  implicit class BaseTypeaheadInputPropsMutableBuilder[Self <: BaseTypeaheadInputProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
