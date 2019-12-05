package typingsSlinky.grommetDashIcons.components

import org.scalajs.dom.raw.SVGSVGElement
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.grommetDashIcons.iconsMod.IconProps
import typingsSlinky.react.reactMod.SVGProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object FolderCycle
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.grommetDashIcons.iconsMod.FolderCycle] {
  @JSImport("grommet-icons/icons", "FolderCycle")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = IconProps with SVGProps[SVGSVGElement]
}

