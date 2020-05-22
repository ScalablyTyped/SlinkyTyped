package typingsSlinky.antd.components

import slinky.web.html.`*`.tag
import typingsSlinky.antd.formContextMod.FormProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.antd.formContextMod.FormProviderProps because: IArray(Could't extract props from / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RcFormProviderProps * / js.Any because couldn't resolve ClassTree.) */
object FormProvider {
  @JSImport("antd/lib/form/context", "FormProvider")
  @js.native
  object component extends js.Object
  
  def apply(p: FormProviderProps): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: FormProvider.type): typingsSlinky.StBuildingComponent.Default[tag.type, js.Object] = new typingsSlinky.StBuildingComponent.Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}

