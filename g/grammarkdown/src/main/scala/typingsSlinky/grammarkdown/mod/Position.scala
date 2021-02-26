package typingsSlinky.grammarkdown.mod

import typingsSlinky.grammarkdown.grammarkdownNumbers.`-1`
import typingsSlinky.grammarkdown.grammarkdownNumbers.`0`
import typingsSlinky.grammarkdown.grammarkdownNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Position {
  
  @JSImport("grammarkdown", "Position.clone")
  @js.native
  def clone_(position: typingsSlinky.grammarkdown.typesMod.Position): typingsSlinky.grammarkdown.typesMod.Position = js.native
  
  @JSImport("grammarkdown", "Position.compare")
  @js.native
  def compare(
    left: typingsSlinky.grammarkdown.typesMod.Position,
    right: typingsSlinky.grammarkdown.typesMod.Position
  ): `1` | `0` | `-1` = js.native
  
  @JSImport("grammarkdown", "Position.create")
  @js.native
  def create(line: Double, character: Double): typingsSlinky.grammarkdown.typesMod.Position = js.native
  
  @JSImport("grammarkdown", "Position.equals")
  @js.native
  def equals_(
    left: typingsSlinky.grammarkdown.typesMod.Position,
    right: typingsSlinky.grammarkdown.typesMod.Position
  ): Boolean = js.native
}
