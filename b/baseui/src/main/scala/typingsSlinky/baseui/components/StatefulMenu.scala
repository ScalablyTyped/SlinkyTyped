package typingsSlinky.baseui.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.baseui.menuMod.StatefulMenuProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(baseui), Name(menuMod), Name(StatefulMenuProps))) was not a @ScalaJSDefined trait */
object StatefulMenu
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.baseui.menuMod.StatefulMenu] {
  @JSImport("baseui/menu", "StatefulMenu")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = StatefulMenuProps
}

