package typingsSlinky.nodegit.mod

import typingsSlinky.nodegit.revertMod.RevertOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Revert")
@js.native
class Revert ()
  extends typingsSlinky.nodegit.revertMod.Revert

/* static members */
@JSImport("nodegit", "Revert")
@js.native
object Revert extends js.Object {
  /**
    * Reverts the given commit against the given "our" commit, producing an index that reflects the result of the revert.
    */
  def commit(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    revertCommit: typingsSlinky.nodegit.commitMod.Commit,
    ourCommit: typingsSlinky.nodegit.commitMod.Commit,
    mainline: Double
  ): js.Promise[Index] = js.native
  def commit(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    revertCommit: typingsSlinky.nodegit.commitMod.Commit,
    ourCommit: typingsSlinky.nodegit.commitMod.Commit,
    mainline: Double,
    mergeOptions: typingsSlinky.nodegit.mergeOptionsMod.MergeOptions
  ): js.Promise[Index] = js.native
  def revert(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    commit: typingsSlinky.nodegit.commitMod.Commit
  ): js.Promise[Double] = js.native
  def revert(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    commit: typingsSlinky.nodegit.commitMod.Commit,
    givenOpts: RevertOptions
  ): js.Promise[Double] = js.native
}

