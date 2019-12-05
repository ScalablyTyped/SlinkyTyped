package typingsSlinky.reactDashShare.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashShare.Anon_DescriptionImage
import typingsSlinky.reactDashShare.reactDashShareMod.CommonShareButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object OKShareButton
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("react-share", "OKShareButton")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = CommonShareButtonProps with Anon_DescriptionImage
}

