package typingsSlinky.nodegit.treeMod.Tree

import typingsSlinky.nodegit.oidMod.Oid
import typingsSlinky.nodegit.repositoryMod.Repository
import typingsSlinky.nodegit.treeDashEntryMod.TreeEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/tree", "Tree")
@js.native
object ^ extends js.Object {
  def entryCmp(tree1: TreeEntry, tree2: TreeEntry): Double = js.native
  def entryDup(dest: TreeEntry, source: TreeEntry): Double = js.native
  /**
    * Retrieves the tree pointed to by the oid
    */
  def lookup(repo: Repository, id: String): js.Promise[typingsSlinky.nodegit.treeMod.Tree] = js.native
  def lookup(repo: Repository, id: String, callback: js.Function): js.Promise[typingsSlinky.nodegit.treeMod.Tree] = js.native
  def lookup(repo: Repository, id: Oid): js.Promise[typingsSlinky.nodegit.treeMod.Tree] = js.native
  def lookup(repo: Repository, id: Oid, callback: js.Function): js.Promise[typingsSlinky.nodegit.treeMod.Tree] = js.native
  def lookup(repo: Repository, id: typingsSlinky.nodegit.treeMod.Tree): js.Promise[typingsSlinky.nodegit.treeMod.Tree] = js.native
  def lookup(repo: Repository, id: typingsSlinky.nodegit.treeMod.Tree, callback: js.Function): js.Promise[typingsSlinky.nodegit.treeMod.Tree] = js.native
  def lookupPrefix(repo: Repository, id: Oid, len: Double): js.Promise[typingsSlinky.nodegit.treeMod.Tree] = js.native
}

