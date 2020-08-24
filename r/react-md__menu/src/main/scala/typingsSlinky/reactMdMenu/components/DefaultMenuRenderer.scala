package typingsSlinky.reactMdMenu.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactMdMenu.defaultMenuRendererMod.AllInjectedMenuProps
import typingsSlinky.reactMdUtils.typesTypesMod.LabelRequiredForA11y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.reactMdUtils.typesTypesMod.LabelRequiredForA11y[typingsSlinky.reactMdMenu.defaultMenuRendererMod.AllInjectedMenuProps] because: IArray(Could't extract props from / * import warning: importer.ImportType#apply Failed type conversion: {[ K in Keys ]: -? std.Required<std.Pick<T, K>>}[Keys] * / js.Any because couldn't resolve ClassTree.) */
object DefaultMenuRenderer {
  @JSImport("@react-md/menu/types/defaultMenuRenderer", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def apply(p: LabelRequiredForA11y[AllInjectedMenuProps]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: DefaultMenuRenderer.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}

