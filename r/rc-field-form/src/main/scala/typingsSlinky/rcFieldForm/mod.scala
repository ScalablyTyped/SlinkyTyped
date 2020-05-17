package typingsSlinky.rcFieldForm

import slinky.core.ReactComponentClass
import typingsSlinky.rcFieldForm.anon.Trigger
import typingsSlinky.rcFieldForm.anon.TypeofField
import typingsSlinky.rcFieldForm.formContextMod.FormProviderProps
import typingsSlinky.rcFieldForm.formMod.FormProps
import typingsSlinky.rcFieldForm.interfaceMod.FormInstance
import typingsSlinky.rcFieldForm.interfaceMod.InternalFormInstance
import typingsSlinky.rcFieldForm.listMod.ListProps
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-field-form/lib", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Field ()
    extends typingsSlinky.rcFieldForm.fieldMod.default
  
  @js.native
  trait RefForm extends ForwardRefExoticComponent[FormProps with RefAttributes[FormInstance]] {
    var Field: TypeofField = js.native
    var FormProvider: ReactComponentClass[FormProviderProps] = js.native
    var List: ReactComponentClass[ListProps] = js.native
    var useForm: js.Function1[/* form */ js.UndefOr[FormInstance], js.Array[FormInstance]] = js.native
  }
  
  val FormProvider: ReactComponentClass[FormProviderProps] = js.native
  val List: ReactComponentClass[ListProps] = js.native
  val default: RefForm = js.native
  def useForm(): js.Array[FormInstance] = js.native
  def useForm(form: FormInstance): js.Array[FormInstance] = js.native
  /* static members */
  @js.native
  object Field extends js.Object {
    var contextType: Context[InternalFormInstance] = js.native
    var defaultProps: Trigger = js.native
  }
  
  type InternalForm = ForwardRefExoticComponent[FormProps with RefAttributes[FormInstance]]
}

