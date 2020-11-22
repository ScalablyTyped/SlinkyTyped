package typingsSlinky.grammarkdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "Range")
@js.native
object Range extends js.Object {
  
  def clone(range: typingsSlinky.grammarkdown.typesMod.Range): typingsSlinky.grammarkdown.typesMod.Range = js.native
  
  def collapseToEnd(range: typingsSlinky.grammarkdown.typesMod.Range): typingsSlinky.grammarkdown.typesMod.Range = js.native
  
  def collapseToStart(range: typingsSlinky.grammarkdown.typesMod.Range): typingsSlinky.grammarkdown.typesMod.Range = js.native
  
  def contains(left: typingsSlinky.grammarkdown.typesMod.Range, right: typingsSlinky.grammarkdown.typesMod.Range): Boolean = js.native
  
  def containsPosition(
    range: typingsSlinky.grammarkdown.typesMod.Range,
    position: typingsSlinky.grammarkdown.typesMod.Position
  ): Boolean = js.native
  
  def create(
    start: typingsSlinky.grammarkdown.typesMod.Position,
    end: typingsSlinky.grammarkdown.typesMod.Position
  ): typingsSlinky.grammarkdown.typesMod.Range = js.native
  
  def equals(left: typingsSlinky.grammarkdown.typesMod.Range, right: typingsSlinky.grammarkdown.typesMod.Range): Boolean = js.native
  
  def intersects(left: typingsSlinky.grammarkdown.typesMod.Range, right: typingsSlinky.grammarkdown.typesMod.Range): Boolean = js.native
  
  def isCollapsed(range: typingsSlinky.grammarkdown.typesMod.Range): Boolean = js.native
}
