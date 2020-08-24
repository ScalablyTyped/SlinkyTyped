package typingsSlinky.reactMdChip

import org.scalajs.dom.raw.HTMLButtonElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdChip.chipMod.ChipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/chip", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * A chip is a simplified and condensed button component that be used to create
    * compact radio groups, checkboxes, and trigger actions. The chip only has a
    * `"solid"` and `"outline"` theme but can be raisable once clicked or
    * selectable with an inline icon. A chip also supports rendering icons, avatars,
    * or circular progress bars to the left and right of the children.
    */
  val Chip: ForwardRefExoticComponent[ChipProps with RefAttributes[HTMLButtonElement]] = js.native
}

