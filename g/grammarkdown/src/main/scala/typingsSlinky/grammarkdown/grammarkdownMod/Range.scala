package typingsSlinky.grammarkdown.grammarkdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Range")
@js.native
object Range extends js.Object {
  def clone(range: typingsSlinky.grammarkdown.distCoreMod.Range): typingsSlinky.grammarkdown.distCoreMod.Range = js.native
  def collapseToEnd(range: typingsSlinky.grammarkdown.distCoreMod.Range): typingsSlinky.grammarkdown.distCoreMod.Range = js.native
  def collapseToStart(range: typingsSlinky.grammarkdown.distCoreMod.Range): typingsSlinky.grammarkdown.distCoreMod.Range = js.native
  def contains(
    left: typingsSlinky.grammarkdown.distCoreMod.Range,
    right: typingsSlinky.grammarkdown.distCoreMod.Range
  ): Boolean = js.native
  def containsPosition(
    range: typingsSlinky.grammarkdown.distCoreMod.Range,
    position: typingsSlinky.grammarkdown.distCoreMod.Position
  ): Boolean = js.native
  def create(
    start: typingsSlinky.grammarkdown.distCoreMod.Position,
    end: typingsSlinky.grammarkdown.distCoreMod.Position
  ): typingsSlinky.grammarkdown.distCoreMod.Range = js.native
  def equals(
    left: typingsSlinky.grammarkdown.distCoreMod.Range,
    right: typingsSlinky.grammarkdown.distCoreMod.Range
  ): Boolean = js.native
  def intersects(
    left: typingsSlinky.grammarkdown.distCoreMod.Range,
    right: typingsSlinky.grammarkdown.distCoreMod.Range
  ): Boolean = js.native
  def isCollapsed(range: typingsSlinky.grammarkdown.distCoreMod.Range): Boolean = js.native
}

