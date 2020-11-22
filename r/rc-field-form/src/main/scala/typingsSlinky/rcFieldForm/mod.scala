package typingsSlinky.rcFieldForm

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.rcFieldForm.anon.Children
import typingsSlinky.rcFieldForm.anon.FnCall
import typingsSlinky.rcFieldForm.anon.FnCallForm
import typingsSlinky.rcFieldForm.fieldMod.FieldProps
import typingsSlinky.rcFieldForm.formContextMod.FormProviderProps
import typingsSlinky.rcFieldForm.formMod.FormProps
import typingsSlinky.rcFieldForm.interfaceMod.FormInstance
import typingsSlinky.rcFieldForm.listMod.ListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-field-form", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def Field[Values](hasNameRestProps: FieldProps[Values]): ReactElement = js.native
  
  val FormProvider: ReactComponentClass[FormProviderProps] = js.native
  
  val List: ReactComponentClass[ListProps] = js.native
  
  val default: RefForm = js.native
  
  def useForm[Values](): js.Array[FormInstance[Values]] = js.native
  def useForm[Values](form: FormInstance[Values]): js.Array[FormInstance[Values]] = js.native
  
  @js.native
  trait InternalForm extends js.Object {
    
    def apply[Values](props: Children[Values] with FormProps[Values]): ReactElement = js.native
  }
  
  @js.native
  trait RefForm extends InternalForm {
    
    var Field: FnCall = js.native
    
    var FormProvider: ReactComponentClass[FormProviderProps] = js.native
    
    var List: ReactComponentClass[ListProps] = js.native
    
    var useForm: FnCallForm = js.native
  }
}
