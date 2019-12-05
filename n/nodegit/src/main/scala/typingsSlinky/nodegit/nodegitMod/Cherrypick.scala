package typingsSlinky.nodegit.nodegitMod

import typingsSlinky.nodegit.cherryDashPickDashOptionsMod.CherrypickOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Cherrypick")
@js.native
class Cherrypick ()
  extends typingsSlinky.nodegit.cherryDashPickMod.Cherrypick

/* static members */
@JSImport("nodegit", "Cherrypick")
@js.native
object Cherrypick extends js.Object {
  /**
    * Cherrypick a commit and, changing the index and working directory
    */
  def cherrypick(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    commit: typingsSlinky.nodegit.commitMod.Commit
  ): js.Promise[Double] = js.native
  def cherrypick(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    commit: typingsSlinky.nodegit.commitMod.Commit,
    options: CherrypickOptions
  ): js.Promise[Double] = js.native
  /**
    * Cherrypicks the given commit against "our" commit, producing an index that reflects the result of the cherrypick. The index is not backed by a repo.
    */
  def commit(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    cherrypickCommit: typingsSlinky.nodegit.commitMod.Commit,
    ourCommit: typingsSlinky.nodegit.commitMod.Commit,
    mainline: Double
  ): js.Promise[Double] = js.native
  def commit(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    cherrypickCommit: typingsSlinky.nodegit.commitMod.Commit,
    ourCommit: typingsSlinky.nodegit.commitMod.Commit,
    mainline: Double,
    mergeOptions: typingsSlinky.nodegit.mergeDashOptionsMod.MergeOptions
  ): js.Promise[Double] = js.native
  def initOptions(opts: CherrypickOptions, version: Double): Double = js.native
}

