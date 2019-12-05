package typingsSlinky.reactDashScroll.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashScroll.modulesComponentsLinkMod.LinkProps
import typingsSlinky.reactDashScroll.modulesComponentsLinkMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(reactDashScroll), Name(modulesComponentsLinkMod), Name(LinkProps))) was not a @ScalaJSDefined trait */
object Link
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-scroll/modules/components/Link", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = LinkProps
}

