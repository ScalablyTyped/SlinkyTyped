package typingsSlinky.grammarkdown.coreMod

import typingsSlinky.grammarkdown.grammarkdownNumbers.`-1`
import typingsSlinky.grammarkdown.grammarkdownNumbers.`0`
import typingsSlinky.grammarkdown.grammarkdownNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Position extends js.Object {
  var character: Double = js.native
  var line: Double = js.native
}

@JSImport("grammarkdown/dist/core", "Position")
@js.native
object Position extends js.Object {
  def clone(position: Position): Position = js.native
  def compare(left: Position, right: Position): `1` | `0` | `-1` = js.native
  def create(line: Double, character: Double): Position = js.native
  def equals(left: Position, right: Position): Boolean = js.native
}

