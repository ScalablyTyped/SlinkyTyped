package typingsSlinky.reactNativeVectorIcons.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactNativeVectorIcons.fontAwesome5Mod.FontAwesome5IconProps
import typingsSlinky.reactNativeVectorIcons.fontAwesome5Mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.reactNativeVectorIcons.fontAwesome5Mod.FontAwesome5IconProps because: IArray(Could't extract props from / * import warning: importer.ImportType#apply Failed type conversion: {[ K in Keys ]: -? std.Partial<std.Pick<T, K>> & std.Partial<std.Record<std.Exclude<Keys, K>, undefined>>}[Keys] * / js.Any because couldn't resolve ClassTree.) */
object FontAwesome5 {
  @JSImport("react-native-vector-icons/FontAwesome5", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def apply(p: FontAwesome5IconProps): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: FontAwesome5.type): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, js.Dictionary.empty))()
}

