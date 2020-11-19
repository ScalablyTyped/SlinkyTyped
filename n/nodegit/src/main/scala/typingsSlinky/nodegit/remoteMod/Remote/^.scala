package typingsSlinky.nodegit.remoteMod.Remote

import typingsSlinky.nodegit.remoteCallbacksMod.RemoteCallbacks
import typingsSlinky.nodegit.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit/remote", "Remote")
@js.native
object ^ extends js.Object {
  
  def addFetch(repo: Repository, remote: String, refspec: String): Double = js.native
  
  def addPush(repo: Repository, remote: String, refspec: String): Double = js.native
  
  def create(repo: Repository, name: String, url: String): js.Promise[typingsSlinky.nodegit.remoteMod.Remote] = js.native
  
  def createAnonymous(repo: Repository, url: String): js.Promise[typingsSlinky.nodegit.remoteMod.Remote] = js.native
  
  def createDetached(url: String): js.Promise[typingsSlinky.nodegit.remoteMod.Remote] = js.native
  
  def createWithFetchspec(repo: Repository, name: String, url: String, fetch: String): js.Promise[typingsSlinky.nodegit.remoteMod.Remote] = js.native
  
  def delete(repo: Repository, name: String): js.Promise[Double] = js.native
  
  def initCallbacks(opts: RemoteCallbacks, version: Double): Double = js.native
  
  def isValidName(remoteName: String): Boolean = js.native
  
  def list(repo: Repository): js.Promise[js.Array[_]] = js.native
  
  def lookup(repo: Repository, name: String): js.Promise[typingsSlinky.nodegit.remoteMod.Remote] = js.native
  def lookup(repo: Repository, name: String, callback: js.Function): js.Promise[typingsSlinky.nodegit.remoteMod.Remote] = js.native
  def lookup(repo: Repository, name: typingsSlinky.nodegit.remoteMod.Remote): js.Promise[typingsSlinky.nodegit.remoteMod.Remote] = js.native
  def lookup(repo: Repository, name: typingsSlinky.nodegit.remoteMod.Remote, callback: js.Function): js.Promise[typingsSlinky.nodegit.remoteMod.Remote] = js.native
  
  def setAutotag(repo: Repository, remote: String, value: Double): Double = js.native
  
  def setPushurl(repo: Repository, remote: String, url: String): Double = js.native
  
  def setUrl(repo: Repository, remote: String, url: String): Double = js.native
}
