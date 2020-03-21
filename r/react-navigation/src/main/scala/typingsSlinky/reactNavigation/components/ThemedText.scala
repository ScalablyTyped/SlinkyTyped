package typingsSlinky.reactNavigation.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactNavigation.mod.Themed.Text
import typingsSlinky.reactNavigation.mod.ThemedTextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. Not a trait, Could't extract props from TypeRef(QualifiedName(IArray(Name(scala), Name(scalajs), Name(js), Name(Any))),IArray(),Comments(1)) because couldn't resolve ClassTree. */
object ThemedText
  extends ExternalComponentWithAttributesWithRefType[tag.type, Text] {
  @JSImport("react-navigation", "Themed.Text")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = ThemedTextProps
}

