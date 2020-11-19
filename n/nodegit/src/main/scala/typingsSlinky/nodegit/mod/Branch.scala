package typingsSlinky.nodegit.mod

import typingsSlinky.nodegit.branchMod.Branch.BRANCH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Branch")
@js.native
class Branch ()
  extends typingsSlinky.nodegit.branchMod.Branch
/* static members */
@JSImport("nodegit", "Branch")
@js.native
object Branch extends js.Object {
  
  def create(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    branchName: String,
    target: typingsSlinky.nodegit.commitMod.Commit,
    force: Double
  ): js.Promise[typingsSlinky.nodegit.referenceMod.Reference] = js.native
  
  def createFromAnnotated(
    repository: typingsSlinky.nodegit.repositoryMod.Repository,
    branchName: String,
    commit: typingsSlinky.nodegit.annotatedCommitMod.AnnotatedCommit,
    force: Double
  ): typingsSlinky.nodegit.referenceMod.Reference = js.native
  
  def delete(branch: typingsSlinky.nodegit.referenceMod.Reference): Double = js.native
  
  def isHead(branch: typingsSlinky.nodegit.referenceMod.Reference): Double = js.native
  
  def iteratorNew(repo: typingsSlinky.nodegit.repositoryMod.Repository, listFlags: Double): js.Promise[_] = js.native
  
  def lookup(repo: typingsSlinky.nodegit.repositoryMod.Repository, branchName: String, branchType: BRANCH): js.Promise[typingsSlinky.nodegit.referenceMod.Reference] = js.native
  
  def move(branch: typingsSlinky.nodegit.referenceMod.Reference, newBranchName: String, force: Double): js.Promise[typingsSlinky.nodegit.referenceMod.Reference] = js.native
  
  def name(ref: typingsSlinky.nodegit.referenceMod.Reference): js.Promise[String] = js.native
  
  def setUpstream(branch: typingsSlinky.nodegit.referenceMod.Reference, upstreamName: String): js.Promise[Double] = js.native
  
  def upstream(branch: typingsSlinky.nodegit.referenceMod.Reference): js.Promise[typingsSlinky.nodegit.referenceMod.Reference] = js.native
}
