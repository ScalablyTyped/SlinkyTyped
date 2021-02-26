package typingsSlinky.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Remote")
@js.native
class Remote ()
  extends typingsSlinky.nodegit.remoteMod.Remote
/* static members */
object Remote {
  
  @JSImport("nodegit", "Remote.addFetch")
  @js.native
  def addFetch(repo: typingsSlinky.nodegit.repositoryMod.Repository, remote: String, refspec: String): Double = js.native
  
  @JSImport("nodegit", "Remote.addPush")
  @js.native
  def addPush(repo: typingsSlinky.nodegit.repositoryMod.Repository, remote: String, refspec: String): Double = js.native
  
  @JSImport("nodegit", "Remote.create")
  @js.native
  def create(repo: typingsSlinky.nodegit.repositoryMod.Repository, name: String, url: String): js.Promise[typingsSlinky.nodegit.remoteMod.Remote] = js.native
  
  @JSImport("nodegit", "Remote.createAnonymous")
  @js.native
  def createAnonymous(repo: typingsSlinky.nodegit.repositoryMod.Repository, url: String): js.Promise[typingsSlinky.nodegit.remoteMod.Remote] = js.native
  
  @JSImport("nodegit", "Remote.createDetached")
  @js.native
  def createDetached(url: String): js.Promise[typingsSlinky.nodegit.remoteMod.Remote] = js.native
  
  @JSImport("nodegit", "Remote.createWithFetchspec")
  @js.native
  def createWithFetchspec(repo: typingsSlinky.nodegit.repositoryMod.Repository, name: String, url: String, fetch: String): js.Promise[typingsSlinky.nodegit.remoteMod.Remote] = js.native
  
  @JSImport("nodegit", "Remote.delete")
  @js.native
  def delete(repo: typingsSlinky.nodegit.repositoryMod.Repository, name: String): js.Promise[Double] = js.native
  
  @JSImport("nodegit", "Remote.initCallbacks")
  @js.native
  def initCallbacks(opts: typingsSlinky.nodegit.remoteCallbacksMod.RemoteCallbacks, version: Double): Double = js.native
  
  @JSImport("nodegit", "Remote.isValidName")
  @js.native
  def isValidName(remoteName: String): Boolean = js.native
  
  @JSImport("nodegit", "Remote.list")
  @js.native
  def list(repo: typingsSlinky.nodegit.repositoryMod.Repository): js.Promise[js.Array[_]] = js.native
  
  @JSImport("nodegit", "Remote.lookup")
  @js.native
  def lookup(repo: typingsSlinky.nodegit.repositoryMod.Repository, name: String): js.Promise[typingsSlinky.nodegit.remoteMod.Remote] = js.native
  @JSImport("nodegit", "Remote.lookup")
  @js.native
  def lookup(repo: typingsSlinky.nodegit.repositoryMod.Repository, name: String, callback: js.Function): js.Promise[typingsSlinky.nodegit.remoteMod.Remote] = js.native
  @JSImport("nodegit", "Remote.lookup")
  @js.native
  def lookup(repo: typingsSlinky.nodegit.repositoryMod.Repository, name: typingsSlinky.nodegit.remoteMod.Remote): js.Promise[typingsSlinky.nodegit.remoteMod.Remote] = js.native
  @JSImport("nodegit", "Remote.lookup")
  @js.native
  def lookup(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    name: typingsSlinky.nodegit.remoteMod.Remote,
    callback: js.Function
  ): js.Promise[typingsSlinky.nodegit.remoteMod.Remote] = js.native
  
  @JSImport("nodegit", "Remote.setAutotag")
  @js.native
  def setAutotag(repo: typingsSlinky.nodegit.repositoryMod.Repository, remote: String, value: Double): Double = js.native
  
  @JSImport("nodegit", "Remote.setPushurl")
  @js.native
  def setPushurl(repo: typingsSlinky.nodegit.repositoryMod.Repository, remote: String, url: String): Double = js.native
  
  @JSImport("nodegit", "Remote.setUrl")
  @js.native
  def setUrl(repo: typingsSlinky.nodegit.repositoryMod.Repository, remote: String, url: String): Double = js.native
}
