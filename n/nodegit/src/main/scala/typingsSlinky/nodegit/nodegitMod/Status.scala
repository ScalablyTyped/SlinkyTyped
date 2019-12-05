package typingsSlinky.nodegit.nodegitMod

import typingsSlinky.nodegit.statusDashOptionsMod.StatusOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Status")
@js.native
class Status ()
  extends typingsSlinky.nodegit.statusMod.Status

/* static members */
@JSImport("nodegit", "Status")
@js.native
object Status extends js.Object {
  def byIndex(statuslist: typingsSlinky.nodegit.statusDashListMod.StatusList, idx: Double): typingsSlinky.nodegit.statusDashEntryMod.StatusEntry = js.native
  def file(repo: typingsSlinky.nodegit.repositoryMod.Repository, path: String): Double = js.native
  def foreach(repo: typingsSlinky.nodegit.repositoryMod.Repository): js.Promise[Double] = js.native
  def foreach(repo: typingsSlinky.nodegit.repositoryMod.Repository, callback: js.Function): js.Promise[Double] = js.native
  def foreachExt(repo: typingsSlinky.nodegit.repositoryMod.Repository): js.Promise[Double] = js.native
  def foreachExt(repo: typingsSlinky.nodegit.repositoryMod.Repository, opts: StatusOptions): js.Promise[Double] = js.native
  def foreachExt(repo: typingsSlinky.nodegit.repositoryMod.Repository, opts: StatusOptions, callback: js.Function): js.Promise[Double] = js.native
  def shouldIgnore(ignored: Double, repo: typingsSlinky.nodegit.repositoryMod.Repository, path: String): Double = js.native
}

