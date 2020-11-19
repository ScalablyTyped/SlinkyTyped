package typingsSlinky.reduxForm.components

import typingsSlinky.reduxForm.formMod.FormProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Form {
  
  @JSImport("redux-form", "Form")
  @js.native
  object component extends js.Object
  
  def withProps[FormData, P, ErrorType](p: FormProps[FormData, P, ErrorType]): SharedBuilder_FormProps342116955[typingsSlinky.reduxForm.mod.Form[FormData, P, ErrorType], FormData, P, ErrorType] = new SharedBuilder_FormProps342116955[typingsSlinky.reduxForm.mod.Form[FormData, P, ErrorType], FormData, P, ErrorType](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply[FormData, P, ErrorType](): SharedBuilder_FormProps342116955[typingsSlinky.reduxForm.mod.Form[FormData, P, ErrorType], FormData, P, ErrorType] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_FormProps342116955[typingsSlinky.reduxForm.mod.Form[FormData, P, ErrorType], FormData, P, ErrorType](js.Array(this.component, __props.asInstanceOf[FormProps[FormData, P, ErrorType]]))
  }
  
  implicit def make[FormData, P, ErrorType](companion: Form.type): SharedBuilder_FormProps342116955[typingsSlinky.reduxForm.mod.Form[FormData, P, ErrorType], FormData, P, ErrorType] = new SharedBuilder_FormProps342116955[typingsSlinky.reduxForm.mod.Form[FormData, P, ErrorType], FormData, P, ErrorType](js.Array(this.component, js.Dictionary.empty))()
}
