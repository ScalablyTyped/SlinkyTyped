package typingsSlinky.grammarkdown.grammarkdownMod

import typingsSlinky.grammarkdown.grammarkdownNumbers.`-1`
import typingsSlinky.grammarkdown.grammarkdownNumbers.`0`
import typingsSlinky.grammarkdown.grammarkdownNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Position")
@js.native
object Position extends js.Object {
  def clone(position: typingsSlinky.grammarkdown.distCoreMod.Position): typingsSlinky.grammarkdown.distCoreMod.Position = js.native
  def compare(
    left: typingsSlinky.grammarkdown.distCoreMod.Position,
    right: typingsSlinky.grammarkdown.distCoreMod.Position
  ): `1` | `0` | `-1` = js.native
  def create(line: Double, character: Double): typingsSlinky.grammarkdown.distCoreMod.Position = js.native
  def equals(
    left: typingsSlinky.grammarkdown.distCoreMod.Position,
    right: typingsSlinky.grammarkdown.distCoreMod.Position
  ): Boolean = js.native
}

