package typingsSlinky.nodegit.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Reflog")
@js.native
class Reflog ()
  extends typingsSlinky.nodegit.refDashLogMod.Reflog

/* static members */
@JSImport("nodegit", "Reflog")
@js.native
object Reflog extends js.Object {
  def delete(repo: typingsSlinky.nodegit.repositoryMod.Repository, name: String): Double = js.native
  def read(repo: typingsSlinky.nodegit.repositoryMod.Repository, name: String): js.Promise[typingsSlinky.nodegit.refDashLogMod.Reflog] = js.native
  def rename(repo: typingsSlinky.nodegit.repositoryMod.Repository, oldName: String, name: String): Double = js.native
}

