package typingsSlinky.reduxForm.components

import typingsSlinky.reduxForm.formMod.FormProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GenericForm {
  @JSImport("redux-form", "GenericForm")
  @js.native
  object component extends js.Object
  
  def withProps[FormData, P, ErrorType](p: FormProps[FormData, P, ErrorType]): SharedBuilder_FormProps302896858[
    typingsSlinky.reduxForm.mod.GenericForm[js.Any, js.Any, js.Any], 
    FormData, 
    P, 
    ErrorType
  ] = new SharedBuilder_FormProps302896858[
    typingsSlinky.reduxForm.mod.GenericForm[js.Any, js.Any, js.Any], 
    FormData, 
    P, 
    ErrorType
  ](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[FormData, P, ErrorType](companion: GenericForm.type): SharedBuilder_FormProps302896858[
    typingsSlinky.reduxForm.mod.GenericForm[js.Any, js.Any, js.Any], 
    FormData, 
    P, 
    ErrorType
  ] = new SharedBuilder_FormProps302896858[
    typingsSlinky.reduxForm.mod.GenericForm[js.Any, js.Any, js.Any], 
    FormData, 
    P, 
    ErrorType
  ](js.Array(this.component, js.Dictionary.empty))()
}

