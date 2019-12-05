package typingsSlinky.nodegit.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Pathspec")
@js.native
class Pathspec ()
  extends typingsSlinky.nodegit.pathDashSpecMod.Pathspec

/* static members */
@JSImport("nodegit", "Pathspec")
@js.native
object Pathspec extends js.Object {
  def create(pathspec: String): typingsSlinky.nodegit.pathDashSpecMod.Pathspec = js.native
  def create(pathspec: js.Array[String]): typingsSlinky.nodegit.pathDashSpecMod.Pathspec = js.native
  def create(pathspec: typingsSlinky.nodegit.strDashArrayMod.Strarray): typingsSlinky.nodegit.pathDashSpecMod.Pathspec = js.native
  def matchListDiffEntry(m: js.Any, pos: Double): typingsSlinky.nodegit.diffDashDeltaMod.DiffDelta = js.native
  def matchListEntry(m: js.Any, pos: Double): String = js.native
  def matchListEntrycount(m: js.Any): Double = js.native
  def matchListFailedEntry(m: js.Any, pos: Double): String = js.native
  def matchListFailedEntrycount(m: js.Any): Double = js.native
}

