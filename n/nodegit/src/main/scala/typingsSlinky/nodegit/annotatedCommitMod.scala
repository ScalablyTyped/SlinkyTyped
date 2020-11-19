package typingsSlinky.nodegit

import typingsSlinky.nodegit.oidMod.Oid
import typingsSlinky.nodegit.referenceMod.Reference
import typingsSlinky.nodegit.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit/annotated-commit", JSImport.Namespace)
@js.native
object annotatedCommitMod extends js.Object {
  
  @js.native
  class AnnotatedCommit () extends js.Object {
    
    def free(): Unit = js.native
    
    def id(): Oid = js.native
  }
  /* static members */
  @js.native
  object AnnotatedCommit extends js.Object {
    
    /**
      * @param repo - repository that contains the given commit
      * @param branchName - name of the (remote) branch
      * @param remoteUrl -     url of the remote
      * @param id - the commit object id of the remote branch
      */
    def fromFetchhead(repo: Repository, branchName: String, remoteUrl: String, id: Oid): js.Promise[AnnotatedCommit] = js.native
    
    def fromRef(repo: Repository, ref: Reference): js.Promise[AnnotatedCommit] = js.native
    
    def fromRevspec(repo: Repository, revspec: String): js.Promise[AnnotatedCommit] = js.native
    
    def lookup(repo: Repository, id: Oid): js.Promise[AnnotatedCommit] = js.native
  }
}
