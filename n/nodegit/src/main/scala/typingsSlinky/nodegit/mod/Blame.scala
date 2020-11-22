package typingsSlinky.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Blame")
@js.native
class Blame ()
  extends typingsSlinky.nodegit.blameMod.Blame
/* static members */
@JSImport("nodegit", "Blame")
@js.native
object Blame extends js.Object {
  
  /**
    * Retrieve the blame of a file
    *
    * @param repo - Repository that contains the file
    * @param path - to the file to get the blame of
    * @param [options] - Options for the blame
    */
  def file(repo: typingsSlinky.nodegit.repositoryMod.Repository, path: String): js.Promise[typingsSlinky.nodegit.blameMod.Blame] = js.native
  def file(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    path: String,
    options: typingsSlinky.nodegit.blameOptionsMod.BlameOptions
  ): js.Promise[typingsSlinky.nodegit.blameMod.Blame] = js.native
  
  /**
    * @param opts - The git_blame_options struct to initialize
    * @param version - Version of struct; pass GIT_BLAME_OPTIONS_VERSION
    */
  def initOptions(opts: typingsSlinky.nodegit.blameOptionsMod.BlameOptions, version: Double): Double = js.native
}
