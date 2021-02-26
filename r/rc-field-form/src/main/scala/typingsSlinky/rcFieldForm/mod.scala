package typingsSlinky.rcFieldForm

import org.scalablytyped.runtime.Shortcut
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rc-field-form", JSImport.Default)
  @js.native
  val default: RefForm = js.native
  
  @JSImport("rc-field-form", "Field")
  @js.native
  def Field[Values](hasNameRestProps: FieldProps[Values]): ReactElement = js.native
  
  @JSImport("rc-field-form", "FormProvider")
  @js.native
  val FormProvider: ReactComponentClass[FormProviderProps] = js.native
  
  @JSImport("rc-field-form", "List")
  @js.native
  val List: ReactComponentClass[ListProps] = js.native
  
  @JSImport("rc-field-form", "useForm")
  @js.native
  def useForm[Values](): js.Array[FormInstance[Values]] = js.native
  @JSImport("rc-field-form", "useForm")
  @js.native
  def useForm[Values](form: FormInstance[Values]): js.Array[FormInstance[Values]] = js.native
  
  @js.native
  trait InternalForm extends StObject {
    
    def apply[Values](props: Children[Values] with FormProps[Values]): ReactElement = js.native
  }
  
  @js.native
  trait RefForm extends InternalForm {
    
    var Field: FnCall = js.native
    
    var FormProvider: ReactComponentClass[FormProviderProps] = js.native
    
    var List: ReactComponentClass[ListProps] = js.native
    
    var useForm: FnCallForm = js.native
  }
  
  type _To = RefForm
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: RefForm = default
}
