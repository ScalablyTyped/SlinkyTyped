package typingsSlinky.antd

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.antd.formContextMod.FormProviderProps
import typingsSlinky.antd.formFormMod.FormProps
import typingsSlinky.antd.formItemMod.FormItemProps
import typingsSlinky.antd.formListMod.FormListProps
import typingsSlinky.antd.useFormMod.FormInstance
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd/lib/form", JSImport.Namespace)
@js.native
object formMod extends js.Object {
  
  val default: Form = js.native
  
  @js.native
  trait Form extends ForwardRefExoticComponent[FormProps with RefAttributes[FormInstance]] {
    
    var Item: js.Function1[/* props */ FormItemProps, ReactElement] = js.native
    
    var List: ReactComponentClass[FormListProps] = js.native
    
    var Provider: ReactComponentClass[FormProviderProps] = js.native
    
    /** @deprecated Only for warning usage. Do not use. */
    def create(): Unit = js.native
    
    var useForm: js.Function1[/* form */ js.UndefOr[FormInstance], js.Array[FormInstance]] = js.native
  }
  
  type InternalForm = ForwardRefExoticComponent[FormProps with RefAttributes[FormInstance]]
}
