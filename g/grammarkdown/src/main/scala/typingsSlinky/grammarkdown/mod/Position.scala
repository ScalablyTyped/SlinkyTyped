package typingsSlinky.grammarkdown.mod

import typingsSlinky.grammarkdown.grammarkdownNumbers.`-1`
import typingsSlinky.grammarkdown.grammarkdownNumbers.`0`
import typingsSlinky.grammarkdown.grammarkdownNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "Position")
@js.native
object Position extends js.Object {
  
  def clone(position: typingsSlinky.grammarkdown.coreMod.Position): typingsSlinky.grammarkdown.coreMod.Position = js.native
  
  def compare(
    left: typingsSlinky.grammarkdown.coreMod.Position,
    right: typingsSlinky.grammarkdown.coreMod.Position
  ): `1` | `0` | `-1` = js.native
  
  def create(line: Double, character: Double): typingsSlinky.grammarkdown.coreMod.Position = js.native
  
  def equals(
    left: typingsSlinky.grammarkdown.coreMod.Position,
    right: typingsSlinky.grammarkdown.coreMod.Position
  ): Boolean = js.native
}
