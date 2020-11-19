package typingsSlinky.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Pathspec")
@js.native
class Pathspec ()
  extends typingsSlinky.nodegit.pathSpecMod.Pathspec
/* static members */
@JSImport("nodegit", "Pathspec")
@js.native
object Pathspec extends js.Object {
  
  def create(pathspec: String): typingsSlinky.nodegit.pathSpecMod.Pathspec = js.native
  def create(pathspec: js.Array[String]): typingsSlinky.nodegit.pathSpecMod.Pathspec = js.native
  def create(pathspec: typingsSlinky.nodegit.strArrayMod.Strarray): typingsSlinky.nodegit.pathSpecMod.Pathspec = js.native
  
  def matchListDiffEntry(m: js.Any, pos: Double): typingsSlinky.nodegit.diffDeltaMod.DiffDelta = js.native
  
  def matchListEntry(m: js.Any, pos: Double): String = js.native
  
  def matchListEntrycount(m: js.Any): Double = js.native
  
  def matchListFailedEntry(m: js.Any, pos: Double): String = js.native
  
  def matchListFailedEntrycount(m: js.Any): Double = js.native
}
