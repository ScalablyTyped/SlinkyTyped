package typingsSlinky.reactOtpInput.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactOtpInput.mod.OTPInputProps
import typingsSlinky.reactOtpInput.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactOtpInput {
  
  @JSImport("react-otp-input", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def containerStyle(value: String | CSSProperties): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabledStyle(value: String | CSSProperties): this.type = set("disabledStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def errorStyle(value: String | CSSProperties): this.type = set("errorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def focusStyle(value: String | CSSProperties): this.type = set("focusStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hasErrored(value: Boolean): this.type = set("hasErrored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputStyle(value: String | CSSProperties): this.type = set("inputStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isDisabled(value: Boolean): this.type = set("isDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isInputNum(value: Boolean): this.type = set("isInputNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def separator(value: ReactElement): this.type = set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shouldAutoFocus(value: Boolean): this.type = set("shouldAutoFocus", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: OTPInputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(numInputs: Double, onChange: js.Any, value: Double | String): Builder = {
    val __props = js.Dynamic.literal(numInputs = numInputs.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[OTPInputProps]))
  }
}
