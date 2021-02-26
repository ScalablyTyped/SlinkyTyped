package typingsSlinky.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "AnnotatedCommit")
@js.native
class AnnotatedCommit ()
  extends typingsSlinky.nodegit.annotatedCommitMod.AnnotatedCommit
/* static members */
object AnnotatedCommit {
  
  /**
    * @param repo - repository that contains the given commit
    * @param branchName - name of the (remote) branch
    * @param remoteUrl -     url of the remote
    * @param id - the commit object id of the remote branch
    */
  @JSImport("nodegit", "AnnotatedCommit.fromFetchhead")
  @js.native
  def fromFetchhead(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    branchName: String,
    remoteUrl: String,
    id: typingsSlinky.nodegit.oidMod.Oid
  ): js.Promise[typingsSlinky.nodegit.annotatedCommitMod.AnnotatedCommit] = js.native
  
  @JSImport("nodegit", "AnnotatedCommit.fromRef")
  @js.native
  def fromRef(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    ref: typingsSlinky.nodegit.referenceMod.Reference
  ): js.Promise[typingsSlinky.nodegit.annotatedCommitMod.AnnotatedCommit] = js.native
  
  @JSImport("nodegit", "AnnotatedCommit.fromRevspec")
  @js.native
  def fromRevspec(repo: typingsSlinky.nodegit.repositoryMod.Repository, revspec: String): js.Promise[typingsSlinky.nodegit.annotatedCommitMod.AnnotatedCommit] = js.native
  
  @JSImport("nodegit", "AnnotatedCommit.lookup")
  @js.native
  def lookup(repo: typingsSlinky.nodegit.repositoryMod.Repository, id: typingsSlinky.nodegit.oidMod.Oid): js.Promise[typingsSlinky.nodegit.annotatedCommitMod.AnnotatedCommit] = js.native
}
