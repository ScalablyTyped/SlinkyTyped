package typingsSlinky.rmcDashDrawer.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.rmcDashDrawer.rmcDashDrawerMod.DrawerProps
import typingsSlinky.rmcDashDrawer.rmcDashDrawerMod.^
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(std), Name(Partial))) was not a @ScalaJSDefined trait */
object RmcDashDrawer
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^] {
  @JSImport("rmc-drawer", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = Partial[DrawerProps]
}

