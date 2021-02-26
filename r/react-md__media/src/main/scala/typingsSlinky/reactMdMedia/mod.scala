package typingsSlinky.reactMdMedia

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdMedia.mediaContainerMod.MediaContainerProps
import typingsSlinky.reactMdMedia.mediaContainerMod.MediaContainerWithAspectRatioProps
import typingsSlinky.reactMdMedia.mediaOverlayMod.MediaOverlayProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/media", "MediaContainer")
  @js.native
  val MediaContainer: ForwardRefExoticComponent[
    (MediaContainerProps with RefAttributes[HTMLDivElement]) | (MediaContainerWithAspectRatioProps with RefAttributes[HTMLDivElement])
  ] = js.native
  
  @JSImport("@react-md/media", "MediaOverlay")
  @js.native
  val MediaOverlay: ForwardRefExoticComponent[MediaOverlayProps with RefAttributes[HTMLDivElement]] = js.native
}
