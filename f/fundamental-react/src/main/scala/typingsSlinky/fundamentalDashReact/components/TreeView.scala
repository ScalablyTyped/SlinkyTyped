package typingsSlinky.fundamentalDashReact.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.fundamentalDashReact.libTreeViewTreeViewMod.TreeViewProps
import typingsSlinky.fundamentalDashReact.libTreeViewTreeViewMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(fundamentalDashReact), Name(libTreeViewTreeViewMod), Name(TreeViewProps))) was not a @ScalaJSDefined trait */
object TreeView
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("fundamental-react/lib/TreeView/TreeView", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = TreeViewProps
}

