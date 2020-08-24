package typingsSlinky.reactMdDialog

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/dialog/types/DialogHeader", JSImport.Namespace)
@js.native
object dialogHeaderMod extends js.Object {
  /**
    * This component doesn't do anything to complex. It really just applies custom
    * styles so that when the `DialogContent` component is used, the header will be
    * "fixed" to the top of the dialog while the content scrolls. It also applies
    * some minimal padding.
    */
  val default: ForwardRefExoticComponent[DialogHeaderProps with RefAttributes[HTMLDivElement]] = js.native
  type DialogHeaderProps = HTMLAttributes[HTMLDivElement]
}

