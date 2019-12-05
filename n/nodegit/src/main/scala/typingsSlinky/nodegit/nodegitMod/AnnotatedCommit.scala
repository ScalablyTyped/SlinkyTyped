package typingsSlinky.nodegit.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "AnnotatedCommit")
@js.native
class AnnotatedCommit ()
  extends typingsSlinky.nodegit.annotatedDashCommitMod.AnnotatedCommit

/* static members */
@JSImport("nodegit", "AnnotatedCommit")
@js.native
object AnnotatedCommit extends js.Object {
  /**
    * @param repo - repository that contains the given commit
    * @param branchName - name of the (remote) branch
    * @param remoteUrl - 	url of the remote
    * @param id - the commit object id of the remote branch
    */
  def fromFetchhead(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    branchName: String,
    remoteUrl: String,
    id: typingsSlinky.nodegit.oidMod.Oid
  ): js.Promise[typingsSlinky.nodegit.annotatedDashCommitMod.AnnotatedCommit] = js.native
  def fromRef(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    ref: typingsSlinky.nodegit.referenceMod.Reference
  ): js.Promise[typingsSlinky.nodegit.annotatedDashCommitMod.AnnotatedCommit] = js.native
  def fromRevspec(repo: typingsSlinky.nodegit.repositoryMod.Repository, revspec: String): js.Promise[typingsSlinky.nodegit.annotatedDashCommitMod.AnnotatedCommit] = js.native
  def lookup(repo: typingsSlinky.nodegit.repositoryMod.Repository, id: typingsSlinky.nodegit.oidMod.Oid): js.Promise[typingsSlinky.nodegit.annotatedDashCommitMod.AnnotatedCommit] = js.native
}

