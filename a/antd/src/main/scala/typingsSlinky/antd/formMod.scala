package typingsSlinky.antd

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.antd.anon.Children
import typingsSlinky.antd.anon.FnCall
import typingsSlinky.antd.anon.FnCallProps
import typingsSlinky.antd.errorListMod.ErrorListProps
import typingsSlinky.antd.formContextMod.FormProviderProps
import typingsSlinky.antd.formFormMod.FormProps
import typingsSlinky.antd.formListMod.FormListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd/lib/form", JSImport.Namespace)
@js.native
object formMod extends js.Object {
  
  val default: FormInterface = js.native
  
  @js.native
  trait FormInterface extends InternalFormType {
    
    var ErrorList: js.Function1[/* hasErrorsHelpOnDomErrorVisibleChange */ ErrorListProps, ReactElement] = js.native
    
    var Item: FnCallProps = js.native
    
    var List: ReactComponentClass[FormListProps] = js.native
    
    var Provider: ReactComponentClass[FormProviderProps] = js.native
    
    /** @deprecated Only for warning usage. Do not use. */
    def create(): Unit = js.native
    
    var useForm: FnCall = js.native
  }
  
  @js.native
  trait InternalFormType extends js.Object {
    
    def apply[Values](props: Children[Values] with FormProps[Values]): ReactElement = js.native
  }
}
