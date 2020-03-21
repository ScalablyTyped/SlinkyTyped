package typingsSlinky.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Tree")
@js.native
class Tree ()
  extends typingsSlinky.nodegit.treeMod.Tree

/* static members */
@JSImport("nodegit", "Tree")
@js.native
object Tree extends js.Object {
  def entryCmp(
    tree1: typingsSlinky.nodegit.treeEntryMod.TreeEntry,
    tree2: typingsSlinky.nodegit.treeEntryMod.TreeEntry
  ): Double = js.native
  def entryDup(
    dest: typingsSlinky.nodegit.treeEntryMod.TreeEntry,
    source: typingsSlinky.nodegit.treeEntryMod.TreeEntry
  ): Double = js.native
  /**
    * Retrieves the tree pointed to by the oid
    */
  def lookup(repo: typingsSlinky.nodegit.repositoryMod.Repository, id: String): js.Promise[typingsSlinky.nodegit.treeMod.Tree] = js.native
  def lookup(repo: typingsSlinky.nodegit.repositoryMod.Repository, id: String, callback: js.Function): js.Promise[typingsSlinky.nodegit.treeMod.Tree] = js.native
  def lookup(repo: typingsSlinky.nodegit.repositoryMod.Repository, id: typingsSlinky.nodegit.oidMod.Oid): js.Promise[typingsSlinky.nodegit.treeMod.Tree] = js.native
  def lookup(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    id: typingsSlinky.nodegit.oidMod.Oid,
    callback: js.Function
  ): js.Promise[typingsSlinky.nodegit.treeMod.Tree] = js.native
  def lookup(repo: typingsSlinky.nodegit.repositoryMod.Repository, id: typingsSlinky.nodegit.treeMod.Tree): js.Promise[typingsSlinky.nodegit.treeMod.Tree] = js.native
  def lookup(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    id: typingsSlinky.nodegit.treeMod.Tree,
    callback: js.Function
  ): js.Promise[typingsSlinky.nodegit.treeMod.Tree] = js.native
  def lookupPrefix(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    id: typingsSlinky.nodegit.oidMod.Oid,
    len: Double
  ): js.Promise[typingsSlinky.nodegit.treeMod.Tree] = js.native
}

