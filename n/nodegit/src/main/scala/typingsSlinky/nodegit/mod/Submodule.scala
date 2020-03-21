package typingsSlinky.nodegit.mod

import typingsSlinky.nodegit.submoduleUpdateOptionsMod.SubmoduleUpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Submodule")
@js.native
class Submodule ()
  extends typingsSlinky.nodegit.submoduleMod.Submodule

/* static members */
@JSImport("nodegit", "Submodule")
@js.native
object Submodule extends js.Object {
  def addSetup(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    url: String,
    path: String,
    useGitLink: Double
  ): js.Promise[typingsSlinky.nodegit.submoduleMod.Submodule] = js.native
  def foreach(repo: typingsSlinky.nodegit.repositoryMod.Repository): js.Promise[Double] = js.native
  def foreach(repo: typingsSlinky.nodegit.repositoryMod.Repository, callback: js.Function): js.Promise[Double] = js.native
  def lookup(repo: typingsSlinky.nodegit.repositoryMod.Repository, name: String): js.Promise[typingsSlinky.nodegit.submoduleMod.Submodule] = js.native
  def resolveUrl(repo: typingsSlinky.nodegit.repositoryMod.Repository, url: String): js.Promise[typingsSlinky.nodegit.bufMod.Buf] = js.native
  def setBranch(repo: typingsSlinky.nodegit.repositoryMod.Repository, name: String, branch: String): Double = js.native
  def setFetchRecurseSubmodules(repo: typingsSlinky.nodegit.repositoryMod.Repository, name: String, fetchRecurseSubmodules: Double): Double = js.native
  def setIgnore(repo: typingsSlinky.nodegit.repositoryMod.Repository, name: String, ignore: Double): js.Promise[Double] = js.native
  def setUpdate(repo: typingsSlinky.nodegit.repositoryMod.Repository, name: String, update: Double): js.Promise[Double] = js.native
  def setUrl(repo: typingsSlinky.nodegit.repositoryMod.Repository, name: String, url: String): js.Promise[Double] = js.native
  def status(repo: typingsSlinky.nodegit.repositoryMod.Repository, name: String, ignore: Double): js.Promise[Double] = js.native
  def updateInitOptions(opts: SubmoduleUpdateOptions, version: Double): Double = js.native
}

