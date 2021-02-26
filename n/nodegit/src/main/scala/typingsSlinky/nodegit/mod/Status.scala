package typingsSlinky.nodegit.mod

import typingsSlinky.nodegit.statusOptionsMod.StatusOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Status")
@js.native
class Status ()
  extends typingsSlinky.nodegit.statusMod.Status
/* static members */
object Status {
  
  @JSImport("nodegit", "Status.byIndex")
  @js.native
  def byIndex(statuslist: typingsSlinky.nodegit.statusListMod.StatusList, idx: Double): typingsSlinky.nodegit.statusEntryMod.StatusEntry = js.native
  
  @JSImport("nodegit", "Status.file")
  @js.native
  def file(repo: typingsSlinky.nodegit.repositoryMod.Repository, path: String): Double = js.native
  
  @JSImport("nodegit", "Status.foreach")
  @js.native
  def foreach(repo: typingsSlinky.nodegit.repositoryMod.Repository): js.Promise[Double] = js.native
  @JSImport("nodegit", "Status.foreach")
  @js.native
  def foreach(repo: typingsSlinky.nodegit.repositoryMod.Repository, callback: js.Function): js.Promise[Double] = js.native
  
  @JSImport("nodegit", "Status.foreachExt")
  @js.native
  def foreachExt(repo: typingsSlinky.nodegit.repositoryMod.Repository): js.Promise[Double] = js.native
  @JSImport("nodegit", "Status.foreachExt")
  @js.native
  def foreachExt(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    opts: js.UndefOr[scala.Nothing],
    callback: js.Function
  ): js.Promise[Double] = js.native
  @JSImport("nodegit", "Status.foreachExt")
  @js.native
  def foreachExt(repo: typingsSlinky.nodegit.repositoryMod.Repository, opts: StatusOptions): js.Promise[Double] = js.native
  @JSImport("nodegit", "Status.foreachExt")
  @js.native
  def foreachExt(repo: typingsSlinky.nodegit.repositoryMod.Repository, opts: StatusOptions, callback: js.Function): js.Promise[Double] = js.native
  
  @JSImport("nodegit", "Status.shouldIgnore")
  @js.native
  def shouldIgnore(ignored: Double, repo: typingsSlinky.nodegit.repositoryMod.Repository, path: String): Double = js.native
}
