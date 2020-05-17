package typingsSlinky.azureSb.mpnserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.azureSb.mpnserviceMod.TileTemplate
  - typingsSlinky.azureSb.mpnserviceMod.FlipTileTemplate
  - typingsSlinky.azureSb.mpnserviceMod.ToastTemplate
*/
trait Template extends js.Object

object Template {
  @scala.inline
  implicit def apply(value: FlipTileTemplate): Template = value.asInstanceOf[Template]
  @scala.inline
  implicit def apply(value: TileTemplate): Template = value.asInstanceOf[Template]
  @scala.inline
  implicit def apply(value: ToastTemplate): Template = value.asInstanceOf[Template]
}

