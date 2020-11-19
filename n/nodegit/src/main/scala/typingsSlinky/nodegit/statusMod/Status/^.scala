package typingsSlinky.nodegit.statusMod.Status

import typingsSlinky.nodegit.repositoryMod.Repository
import typingsSlinky.nodegit.statusEntryMod.StatusEntry
import typingsSlinky.nodegit.statusListMod.StatusList
import typingsSlinky.nodegit.statusOptionsMod.StatusOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit/status", "Status")
@js.native
object ^ extends js.Object {
  
  def byIndex(statuslist: StatusList, idx: Double): StatusEntry = js.native
  
  def file(repo: Repository, path: String): Double = js.native
  
  def foreach(repo: Repository): js.Promise[Double] = js.native
  def foreach(repo: Repository, callback: js.Function): js.Promise[Double] = js.native
  
  def foreachExt(repo: Repository): js.Promise[Double] = js.native
  def foreachExt(repo: Repository, opts: js.UndefOr[scala.Nothing], callback: js.Function): js.Promise[Double] = js.native
  def foreachExt(repo: Repository, opts: StatusOptions): js.Promise[Double] = js.native
  def foreachExt(repo: Repository, opts: StatusOptions, callback: js.Function): js.Promise[Double] = js.native
  
  def shouldIgnore(ignored: Double, repo: Repository, path: String): Double = js.native
}
