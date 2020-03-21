package typingsSlinky.rotJs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rotJs.rotJsStrings.hex
  - typingsSlinky.rotJs.rotJsStrings.rect
  - typingsSlinky.rotJs.rotJsStrings.tile
  - typingsSlinky.rotJs.rotJsStrings.`tile-gl`
  - typingsSlinky.rotJs.rotJsStrings.term
*/
trait LayoutType extends js.Object

object LayoutType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hex: typingsSlinky.rotJs.rotJsStrings.hex = this.cast("hex")
  @scala.inline
  def rect: typingsSlinky.rotJs.rotJsStrings.rect = this.cast("rect")
  @scala.inline
  def term: typingsSlinky.rotJs.rotJsStrings.term = this.cast("term")
  @scala.inline
  def tile: typingsSlinky.rotJs.rotJsStrings.tile = this.cast("tile")
  @scala.inline
  def `tile-gl`: typingsSlinky.rotJs.rotJsStrings.`tile-gl` = this.cast("tile-gl")
}

