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
  
  /**
    * The `MediaContainer` component is used to make responsive images and videos
    * within your app. This component also allows for focing a specific aspect
    * ratio for these elements with both the `height` and `width` props are
    * provided.
    */
  val MediaContainer: ForwardRefExoticComponent[
    (MediaContainerProps with RefAttributes[HTMLDivElement]) | (MediaContainerWithAspectRatioProps with RefAttributes[HTMLDivElement])
  ] = js.native
  
  /**
    * The `MediaOverlay` component is used to create an overlay over specific media
    * items within the `MediaContainer` component. You will need to apply most of
    * your own styles as this is really just used for positioning.
    */
  val MediaOverlay: ForwardRefExoticComponent[MediaOverlayProps with RefAttributes[HTMLDivElement]] = js.native
}
