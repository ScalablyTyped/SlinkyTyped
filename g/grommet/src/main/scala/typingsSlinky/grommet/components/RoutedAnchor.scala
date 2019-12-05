package typingsSlinky.grommet.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.grommet.componentsAnchorMod.AnchorProps
import typingsSlinky.grommet.componentsRoutedAnchorMod.RoutedAnchorProps
import typingsSlinky.grommet.grommetStrings.href
import typingsSlinky.grommet.utilsMod.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object RoutedAnchor
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.grommet.grommetMod.RoutedAnchor] {
  @JSImport("grommet", "RoutedAnchor")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = RoutedAnchorProps with (Omit[AnchorProps, href])
}

