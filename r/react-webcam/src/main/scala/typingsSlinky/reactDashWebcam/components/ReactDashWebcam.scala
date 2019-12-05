package typingsSlinky.reactDashWebcam.components

import org.scalajs.dom.raw.HTMLVideoElement
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.HTMLAttributes
import typingsSlinky.reactDashWebcam.reactDashWebcamMod.WebcamProps
import typingsSlinky.reactDashWebcam.reactDashWebcamMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object ReactDashWebcam
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-webcam", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = WebcamProps with HTMLAttributes[HTMLVideoElement]
}

