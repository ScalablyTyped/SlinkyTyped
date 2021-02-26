package typingsSlinky.reactDaumPostcode.components

import typingsSlinky.reactDaumPostcode.mod.AddressData
import typingsSlinky.reactDaumPostcode.mod.DaumPostcodeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DaumPostcode {
  
  @scala.inline
  def apply(onComplete: AddressData => Unit): SharedBuilder_DaumPostcodeProps_394541329[typingsSlinky.reactDaumPostcode.mod.DaumPostcode] = {
    val __props = js.Dynamic.literal(onComplete = js.Any.fromFunction1(onComplete))
    new SharedBuilder_DaumPostcodeProps_394541329[typingsSlinky.reactDaumPostcode.mod.DaumPostcode](js.Array(this.component, __props.asInstanceOf[DaumPostcodeProps]))
  }
  
  @JSImport("react-daum-postcode", "DaumPostcode")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: DaumPostcodeProps): SharedBuilder_DaumPostcodeProps_394541329[typingsSlinky.reactDaumPostcode.mod.DaumPostcode] = new SharedBuilder_DaumPostcodeProps_394541329[typingsSlinky.reactDaumPostcode.mod.DaumPostcode](js.Array(this.component, p.asInstanceOf[js.Any]))
}
