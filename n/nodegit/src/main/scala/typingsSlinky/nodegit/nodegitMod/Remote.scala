package typingsSlinky.nodegit.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Remote")
@js.native
class Remote ()
  extends typingsSlinky.nodegit.remoteMod.Remote

/* static members */
@JSImport("nodegit", "Remote")
@js.native
object Remote extends js.Object {
  def addFetch(repo: typingsSlinky.nodegit.repositoryMod.Repository, remote: String, refspec: String): Double = js.native
  def addPush(repo: typingsSlinky.nodegit.repositoryMod.Repository, remote: String, refspec: String): Double = js.native
  def create(repo: typingsSlinky.nodegit.repositoryMod.Repository, name: String, url: String): typingsSlinky.nodegit.remoteMod.Remote = js.native
  def createAnonymous(repo: typingsSlinky.nodegit.repositoryMod.Repository, url: String): js.Promise[typingsSlinky.nodegit.remoteMod.Remote] = js.native
  def createDetached(url: String): js.Promise[typingsSlinky.nodegit.remoteMod.Remote] = js.native
  def createWithFetchspec(repo: typingsSlinky.nodegit.repositoryMod.Repository, name: String, url: String, fetch: String): js.Promise[typingsSlinky.nodegit.remoteMod.Remote] = js.native
  def delete(repo: typingsSlinky.nodegit.repositoryMod.Repository, name: String): js.Promise[Double] = js.native
  def initCallbacks(opts: typingsSlinky.nodegit.remoteDashCallbacksMod.RemoteCallbacks, version: Double): Double = js.native
  def isValidName(remoteName: String): Boolean = js.native
  def list(repo: typingsSlinky.nodegit.repositoryMod.Repository): js.Promise[js.Array[_]] = js.native
  def lookup(repo: typingsSlinky.nodegit.repositoryMod.Repository, name: String): js.Promise[typingsSlinky.nodegit.remoteMod.Remote] = js.native
  def lookup(repo: typingsSlinky.nodegit.repositoryMod.Repository, name: String, callback: js.Function): js.Promise[typingsSlinky.nodegit.remoteMod.Remote] = js.native
  def lookup(repo: typingsSlinky.nodegit.repositoryMod.Repository, name: typingsSlinky.nodegit.remoteMod.Remote): js.Promise[typingsSlinky.nodegit.remoteMod.Remote] = js.native
  def lookup(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    name: typingsSlinky.nodegit.remoteMod.Remote,
    callback: js.Function
  ): js.Promise[typingsSlinky.nodegit.remoteMod.Remote] = js.native
  def setAutotag(repo: typingsSlinky.nodegit.repositoryMod.Repository, remote: String, value: Double): Double = js.native
  def setPushurl(repo: typingsSlinky.nodegit.repositoryMod.Repository, remote: String, url: String): Double = js.native
  def setUrl(repo: typingsSlinky.nodegit.repositoryMod.Repository, remote: String, url: String): Double = js.native
}

