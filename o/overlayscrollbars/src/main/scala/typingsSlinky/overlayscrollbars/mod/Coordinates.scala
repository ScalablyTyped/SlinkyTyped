package typingsSlinky.overlayscrollbars.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.overlayscrollbars.anon.Block
import typingsSlinky.overlayscrollbars.anon.L
import typingsSlinky.overlayscrollbars.anon.Left
import typingsSlinky.overlayscrollbars.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.overlayscrollbars.anon.X
  - typingsSlinky.overlayscrollbars.anon.L
  - typingsSlinky.overlayscrollbars.anon.Left
  - js.Tuple2[
typingsSlinky.overlayscrollbars.mod.Position, 
typingsSlinky.overlayscrollbars.mod.Position]
  - typingsSlinky.overlayscrollbars.mod.Position
  - typingsSlinky.std.HTMLElement
  - typingsSlinky.overlayscrollbars.mod.JQuery
  - typingsSlinky.overlayscrollbars.anon.Block
*/
trait Coordinates extends js.Object

object Coordinates {
  @scala.inline
  implicit def apply(value: Block): Coordinates = value.asInstanceOf[Coordinates]
  @scala.inline
  implicit def apply(value: HTMLElement): Coordinates = value.asInstanceOf[Coordinates]
  @scala.inline
  implicit def apply(value: JQuery): Coordinates = value.asInstanceOf[Coordinates]
  @scala.inline
  implicit def apply(value: L): Coordinates = value.asInstanceOf[Coordinates]
  @scala.inline
  implicit def apply(value: Left): Coordinates = value.asInstanceOf[Coordinates]
  @scala.inline
  implicit def apply(value: Position): Coordinates = value.asInstanceOf[Coordinates]
  @scala.inline
  implicit def apply(value: js.Tuple2[Position, Position]): Coordinates = value.asInstanceOf[Coordinates]
  @scala.inline
  implicit def apply(value: X): Coordinates = value.asInstanceOf[Coordinates]
}

