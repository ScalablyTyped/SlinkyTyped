package typingsSlinky.reactMdMedia

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdMedia.mediaContainerMod.MediaContainerProps
import typingsSlinky.reactMdMedia.mediaContainerMod.MediaContainerWithAspectRatioProps
import typingsSlinky.reactMdMedia.mediaOverlayMod.MediaOverlayProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/media", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val MediaContainer: ForwardRefExoticComponent[
    (MediaContainerProps with RefAttributes[HTMLDivElement]) | (MediaContainerWithAspectRatioProps with RefAttributes[HTMLDivElement])
  ] = js.native
  
  val MediaOverlay: ForwardRefExoticComponent[MediaOverlayProps with RefAttributes[HTMLDivElement]] = js.native
}
