package typingsSlinky.antd.components

import typingsSlinky.antd.formContextMod.FormProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormProvider {
  
  @JSImport("antd/lib/form/context", "FormProvider")
  @js.native
  object component extends js.Object
  
  def withProps(p: FormProviderProps): SharedBuilder_FormProviderProps461694305 = new SharedBuilder_FormProviderProps461694305(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: FormProvider.type): SharedBuilder_FormProviderProps461694305 = new SharedBuilder_FormProviderProps461694305(js.Array(this.component, js.Dictionary.empty))()
}
