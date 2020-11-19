package typingsSlinky.nodegit

import typingsSlinky.nodegit.cherryPickOptionsMod.CherrypickOptions
import typingsSlinky.nodegit.commitMod.Commit
import typingsSlinky.nodegit.mergeOptionsMod.MergeOptions
import typingsSlinky.nodegit.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit/cherry-pick", JSImport.Namespace)
@js.native
object cherryPickMod extends js.Object {
  
  @js.native
  class Cherrypick () extends js.Object
  /* static members */
  @js.native
  object Cherrypick extends js.Object {
    
    /**
      * Cherrypick a commit and, changing the index and working directory
      */
    def cherrypick(repo: Repository, commit: Commit): js.Promise[Double] = js.native
    def cherrypick(repo: Repository, commit: Commit, options: CherrypickOptions): js.Promise[Double] = js.native
    
    /**
      * Cherrypicks the given commit against "our" commit, producing an index that reflects the result of the cherrypick. The index is not backed by a repo.
      */
    def commit(repo: Repository, cherrypickCommit: Commit, ourCommit: Commit, mainline: Double): js.Promise[Double] = js.native
    def commit(
      repo: Repository,
      cherrypickCommit: Commit,
      ourCommit: Commit,
      mainline: Double,
      mergeOptions: MergeOptions
    ): js.Promise[Double] = js.native
    
    def initOptions(opts: CherrypickOptions, version: Double): Double = js.native
  }
}
