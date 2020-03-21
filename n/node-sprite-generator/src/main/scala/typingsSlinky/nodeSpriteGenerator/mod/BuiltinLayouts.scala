package typingsSlinky.nodeSpriteGenerator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.packed
  - typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.vertical
  - typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.horizontal
  - typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.diagonal
*/
trait BuiltinLayouts extends js.Object

object BuiltinLayouts {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def diagonal: typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.diagonal = this.cast("diagonal")
  @scala.inline
  def horizontal: typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.horizontal = this.cast("horizontal")
  @scala.inline
  def packed: typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.packed = this.cast("packed")
  @scala.inline
  def vertical: typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.vertical = this.cast("vertical")
}

