package typingsSlinky.grommet.components

import org.scalajs.dom.raw.HTMLVideoElement
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.grommet.componentsVideoMod.VideoProps
import typingsSlinky.grommet.grommetStrings.controls
import typingsSlinky.grommet.utilsMod.Omit
import typingsSlinky.react.reactMod.DetailedHTMLProps
import typingsSlinky.react.reactMod.VideoHTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object Video
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.grommet.grommetMod.Video] {
  @JSImport("grommet", "Video")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = VideoProps with (DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement]) with (Omit[
    DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement], 
    controls
  ])
}

