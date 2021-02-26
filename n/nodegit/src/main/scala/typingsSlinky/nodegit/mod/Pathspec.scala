package typingsSlinky.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Pathspec")
@js.native
class Pathspec ()
  extends typingsSlinky.nodegit.pathSpecMod.Pathspec
/* static members */
object Pathspec {
  
  @JSImport("nodegit", "Pathspec.create")
  @js.native
  def create(pathspec: String): typingsSlinky.nodegit.pathSpecMod.Pathspec = js.native
  @JSImport("nodegit", "Pathspec.create")
  @js.native
  def create(pathspec: js.Array[String]): typingsSlinky.nodegit.pathSpecMod.Pathspec = js.native
  @JSImport("nodegit", "Pathspec.create")
  @js.native
  def create(pathspec: typingsSlinky.nodegit.strArrayMod.Strarray): typingsSlinky.nodegit.pathSpecMod.Pathspec = js.native
  
  @JSImport("nodegit", "Pathspec.matchListDiffEntry")
  @js.native
  def matchListDiffEntry(m: js.Any, pos: Double): typingsSlinky.nodegit.diffDeltaMod.DiffDelta = js.native
  
  @JSImport("nodegit", "Pathspec.matchListEntry")
  @js.native
  def matchListEntry(m: js.Any, pos: Double): String = js.native
  
  @JSImport("nodegit", "Pathspec.matchListEntrycount")
  @js.native
  def matchListEntrycount(m: js.Any): Double = js.native
  
  @JSImport("nodegit", "Pathspec.matchListFailedEntry")
  @js.native
  def matchListFailedEntry(m: js.Any, pos: Double): String = js.native
  
  @JSImport("nodegit", "Pathspec.matchListFailedEntrycount")
  @js.native
  def matchListFailedEntrycount(m: js.Any): Double = js.native
}
