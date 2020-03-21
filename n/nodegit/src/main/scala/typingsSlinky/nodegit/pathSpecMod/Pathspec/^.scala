package typingsSlinky.nodegit.pathSpecMod.Pathspec

import typingsSlinky.nodegit.diffDeltaMod.DiffDelta
import typingsSlinky.nodegit.strArrayMod.Strarray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/path-spec", "Pathspec")
@js.native
object ^ extends js.Object {
  def create(pathspec: String): typingsSlinky.nodegit.pathSpecMod.Pathspec = js.native
  def create(pathspec: js.Array[String]): typingsSlinky.nodegit.pathSpecMod.Pathspec = js.native
  def create(pathspec: Strarray): typingsSlinky.nodegit.pathSpecMod.Pathspec = js.native
  def matchListDiffEntry(m: js.Any, pos: Double): DiffDelta = js.native
  def matchListEntry(m: js.Any, pos: Double): String = js.native
  def matchListEntrycount(m: js.Any): Double = js.native
  def matchListFailedEntry(m: js.Any, pos: Double): String = js.native
  def matchListFailedEntrycount(m: js.Any): Double = js.native
}

