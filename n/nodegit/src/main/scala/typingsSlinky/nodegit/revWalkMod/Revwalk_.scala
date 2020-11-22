package typingsSlinky.nodegit.revWalkMod

import typingsSlinky.nodegit.commitMod.Commit
import typingsSlinky.nodegit.oidMod.Oid
import typingsSlinky.nodegit.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit/rev-walk", "Revwalk")
@js.native
class Revwalk_ () extends js.Object {
  
  def fastWalk(maxCount: Double): js.Promise[_] = js.native
  
  def fileHistoryWalk(filePath: String, maxCount: Double): js.Promise[js.Array[_]] = js.native
  
  def getCommits(count: Double): js.Promise[js.Array[Commit]] = js.native
  
  /**
    * Walk the history grabbing commits until the checkFn called with the current commit returns false.
    */
  def getCommitsUntil(checkFn: js.Function): js.Promise[js.Array[Commit]] = js.native
  
  def hide(commitId: Oid): Double = js.native
  
  def hideGlob(glob: String): Double = js.native
  
  def hideHead(): Double = js.native
  
  def hideRef(refname: String): Double = js.native
  
  def next(): js.Promise[Oid] = js.native
  
  def push(id: Oid): Double = js.native
  
  def pushGlob(glob: String): Double = js.native
  
  def pushHead(): Double = js.native
  
  def pushRange(range: String): Double = js.native
  
  def pushRef(refname: String): Double = js.native
  
  def repository(): Repository = js.native
  
  def reset(): Unit = js.native
  
  def simplifyFirstParent(): Unit = js.native
  
  /**
    * Set the sort order for the revwalk. This function takes variable arguments like revwalk.sorting(NodeGit.RevWalk.Topological, NodeGit.RevWalk.Reverse).
    */
  def sorting(sort: Double*): Unit = js.native
  
  /**
    * Walk the history from the given oid. The callback is invoked for each commit; When the walk is over, the callback is invoked with (null, null).
    */
  def walk(oid: Oid): Commit = js.native
  def walk(oid: Oid, callback: js.Function): Commit = js.native
}
