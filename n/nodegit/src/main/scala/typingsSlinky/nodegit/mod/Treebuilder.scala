package typingsSlinky.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Treebuilder")
@js.native
class Treebuilder ()
  extends typingsSlinky.nodegit.treeBuilderMod.Treebuilder

/* static members */
@JSImport("nodegit", "Treebuilder")
@js.native
object Treebuilder extends js.Object {
  def create(repo: typingsSlinky.nodegit.repositoryMod.Repository): js.Promise[typingsSlinky.nodegit.treeBuilderMod.Treebuilder] = js.native
  def create(repo: typingsSlinky.nodegit.repositoryMod.Repository, source: typingsSlinky.nodegit.treeMod.Tree): js.Promise[typingsSlinky.nodegit.treeBuilderMod.Treebuilder] = js.native
}

