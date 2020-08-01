package typingsSlinky.rcFieldForm.components

import typingsSlinky.rcFieldForm.formContextMod.FormProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FormProvider {
  @JSImport("rc-field-form", "FormProvider")
  @js.native
  object component extends js.Object
  
  def withProps(p: FormProviderProps): SharedBuilder_FormProviderProps1295524528 = new SharedBuilder_FormProviderProps1295524528(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: FormProvider.type): SharedBuilder_FormProviderProps1295524528 = new SharedBuilder_FormProviderProps1295524528(js.Array(this.component, js.Dictionary.empty))()
}

