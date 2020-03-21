package typingsSlinky.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Clone")
@js.native
class Clone ()
  extends typingsSlinky.nodegit.cloneMod.Clone

/* static members */
@JSImport("nodegit", "Clone")
@js.native
object Clone extends js.Object {
  /**
    * Patch repository cloning to automatically coerce objects.
    */
  def clone(url: String, localPath: String): js.Promise[typingsSlinky.nodegit.repositoryMod.Repository] = js.native
  def clone(url: String, localPath: String, options: typingsSlinky.nodegit.cloneOptionsMod.CloneOptions): js.Promise[typingsSlinky.nodegit.repositoryMod.Repository] = js.native
  def initOptions(opts: typingsSlinky.nodegit.cloneOptionsMod.CloneOptions, version: Double): Double = js.native
}

