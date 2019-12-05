package typingsSlinky.reactDashShare.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashShare.Anon_Title
import typingsSlinky.reactDashShare.reactDashShareMod.CommonShareButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object TelegramShareButton
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("react-share", "TelegramShareButton")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = CommonShareButtonProps with Anon_Title
}

