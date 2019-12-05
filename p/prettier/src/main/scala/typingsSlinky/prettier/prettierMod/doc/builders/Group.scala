package typingsSlinky.prettier.prettierMod.doc.builders

import typingsSlinky.prettier.Anon_ShouldBreak
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends _Doc {
  var break: Boolean
  var contents: typingsSlinky.prettier.prettierMod.doc.builders.Doc
  var expandedStates: js.Array[typingsSlinky.prettier.prettierMod.doc.builders.Doc]
  var `type`: typingsSlinky.prettier.prettierStrings.group
}

object Group {
  @scala.inline
  def apply(
    break: Boolean,
    contents: typingsSlinky.prettier.prettierMod.doc.builders.Doc,
    expandedStates: js.Array[typingsSlinky.prettier.prettierMod.doc.builders.Doc],
    `type`: typingsSlinky.prettier.prettierStrings.group
  ): Group = {
    val __obj = js.Dynamic.literal(break = break.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any], expandedStates = expandedStates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
}

@JSImport("prettier", "doc.builders.group")
@js.native
object group extends js.Object {
  def apply(contents: typingsSlinky.prettier.prettierMod.doc.builders.Doc): Group = js.native
  def apply(contents: typingsSlinky.prettier.prettierMod.doc.builders.Doc, opts: Anon_ShouldBreak): Group = js.native
}

