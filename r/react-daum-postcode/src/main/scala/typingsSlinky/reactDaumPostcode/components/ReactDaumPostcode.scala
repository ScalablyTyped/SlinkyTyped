package typingsSlinky.reactDaumPostcode.components

import typingsSlinky.reactDaumPostcode.mod.AddressData
import typingsSlinky.reactDaumPostcode.mod.DaumPostcodeProps
import typingsSlinky.reactDaumPostcode.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactDaumPostcode {
  
  @JSImport("react-daum-postcode", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: DaumPostcodeProps): SharedBuilder_DaumPostcodeProps_394541329[default] = new SharedBuilder_DaumPostcodeProps_394541329[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(onComplete: AddressData => Unit): SharedBuilder_DaumPostcodeProps_394541329[default] = {
    val __props = js.Dynamic.literal(onComplete = js.Any.fromFunction1(onComplete))
    new SharedBuilder_DaumPostcodeProps_394541329[default](js.Array(this.component, __props.asInstanceOf[DaumPostcodeProps]))
  }
}
