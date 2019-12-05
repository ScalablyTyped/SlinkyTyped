package typingsSlinky.reactDashIcons.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashIcons.Anon_Attr
import typingsSlinky.reactDashIcons.libEsmIconBaseMod.IconBaseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object IconBase
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("react-icons", "IconBase")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = IconBaseProps with Anon_Attr
}

