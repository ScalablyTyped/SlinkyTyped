package typingsSlinky.reactMdOverlay

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdOverlay.overlayMod.OverlayProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/overlay", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * The `Overlay` component is a simple component used to render a full page
    * overlay in the page with an enter and exit animation. If there are overflow
    * issues or you need to portal the overlay to a different area within your app,
    * you should use the `OverlayPortal` component instead.
    */
  val Overlay: ForwardRefExoticComponent[OverlayProps with RefAttributes[HTMLDivElement]] = js.native
}

