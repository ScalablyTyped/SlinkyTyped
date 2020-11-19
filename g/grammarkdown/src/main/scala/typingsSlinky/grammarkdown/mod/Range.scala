package typingsSlinky.grammarkdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "Range")
@js.native
object Range extends js.Object {
  
  def clone(range: typingsSlinky.grammarkdown.coreMod.Range): typingsSlinky.grammarkdown.coreMod.Range = js.native
  
  def collapseToEnd(range: typingsSlinky.grammarkdown.coreMod.Range): typingsSlinky.grammarkdown.coreMod.Range = js.native
  
  def collapseToStart(range: typingsSlinky.grammarkdown.coreMod.Range): typingsSlinky.grammarkdown.coreMod.Range = js.native
  
  def contains(left: typingsSlinky.grammarkdown.coreMod.Range, right: typingsSlinky.grammarkdown.coreMod.Range): Boolean = js.native
  
  def containsPosition(
    range: typingsSlinky.grammarkdown.coreMod.Range,
    position: typingsSlinky.grammarkdown.coreMod.Position
  ): Boolean = js.native
  
  def create(
    start: typingsSlinky.grammarkdown.coreMod.Position,
    end: typingsSlinky.grammarkdown.coreMod.Position
  ): typingsSlinky.grammarkdown.coreMod.Range = js.native
  
  def equals(left: typingsSlinky.grammarkdown.coreMod.Range, right: typingsSlinky.grammarkdown.coreMod.Range): Boolean = js.native
  
  def intersects(left: typingsSlinky.grammarkdown.coreMod.Range, right: typingsSlinky.grammarkdown.coreMod.Range): Boolean = js.native
  
  def isCollapsed(range: typingsSlinky.grammarkdown.coreMod.Range): Boolean = js.native
}
