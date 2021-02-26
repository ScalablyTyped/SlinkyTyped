package typingsSlinky.reactBootstrapTypeahead.mod

import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.button
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearButtonProps extends HTMLAttributes[button] {
  
  var bsSize: js.UndefOr[TypeaheadBsSizes] = js.native
  
  var label: js.UndefOr[String] = js.native
}
object ClearButtonProps {
  
  @scala.inline
  def apply(): ClearButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearButtonProps]
  }
  
  @scala.inline
  implicit class ClearButtonPropsMutableBuilder[Self <: ClearButtonProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBsSize(value: TypeaheadBsSizes): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
