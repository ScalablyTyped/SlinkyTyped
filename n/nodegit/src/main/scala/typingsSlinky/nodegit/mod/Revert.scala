package typingsSlinky.nodegit.mod

import typingsSlinky.nodegit.revertMod.RevertOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Revert")
@js.native
class Revert ()
  extends typingsSlinky.nodegit.revertMod.Revert
/* static members */
object Revert {
  
  /**
    * Reverts the given commit against the given "our" commit, producing an index that reflects the result of the revert.
    */
  @JSImport("nodegit", "Revert.commit")
  @js.native
  def commit(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    revertCommit: typingsSlinky.nodegit.commitMod.Commit,
    ourCommit: typingsSlinky.nodegit.commitMod.Commit,
    mainline: Double
  ): js.Promise[Index] = js.native
  @JSImport("nodegit", "Revert.commit")
  @js.native
  def commit(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    revertCommit: typingsSlinky.nodegit.commitMod.Commit,
    ourCommit: typingsSlinky.nodegit.commitMod.Commit,
    mainline: Double,
    mergeOptions: typingsSlinky.nodegit.mergeOptionsMod.MergeOptions
  ): js.Promise[Index] = js.native
  
  @JSImport("nodegit", "Revert.revert")
  @js.native
  def revert(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    commit: typingsSlinky.nodegit.commitMod.Commit
  ): js.Promise[Double] = js.native
  @JSImport("nodegit", "Revert.revert")
  @js.native
  def revert(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    commit: typingsSlinky.nodegit.commitMod.Commit,
    givenOpts: RevertOptions
  ): js.Promise[Double] = js.native
}
