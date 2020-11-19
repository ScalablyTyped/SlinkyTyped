package typingsSlinky.rcFieldForm

import slinky.core.ReactComponentClass
import typingsSlinky.rcFieldForm.fieldMod.FieldProps
import typingsSlinky.rcFieldForm.formContextMod.FormProviderProps
import typingsSlinky.rcFieldForm.formMod.FormProps
import typingsSlinky.rcFieldForm.interfaceMod.FormInstance
import typingsSlinky.rcFieldForm.listMod.ListProps
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-field-form", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val Field: ReactComponentClass[FieldProps] = js.native
  
  val FormProvider: ReactComponentClass[FormProviderProps] = js.native
  
  val List: ReactComponentClass[ListProps] = js.native
  
  val default: RefForm = js.native
  
  def useForm(): js.Array[FormInstance] = js.native
  def useForm(form: FormInstance): js.Array[FormInstance] = js.native
  
  @js.native
  trait RefForm extends ForwardRefExoticComponent[FormProps with RefAttributes[FormInstance]] {
    
    var Field: ReactComponentClass[FieldProps] = js.native
    
    var FormProvider: ReactComponentClass[FormProviderProps] = js.native
    
    var List: ReactComponentClass[ListProps] = js.native
    
    var useForm: js.Function1[/* form */ js.UndefOr[FormInstance], js.Array[FormInstance]] = js.native
  }
  
  type InternalForm = ForwardRefExoticComponent[FormProps with RefAttributes[FormInstance]]
}
