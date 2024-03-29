package typingsSlinky.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Tree")
@js.native
class Tree ()
  extends typingsSlinky.nodegit.treeMod.Tree
/* static members */
object Tree {
  
  @JSImport("nodegit", "Tree.entryCmp")
  @js.native
  def entryCmp(
    tree1: typingsSlinky.nodegit.treeEntryMod.TreeEntry,
    tree2: typingsSlinky.nodegit.treeEntryMod.TreeEntry
  ): Double = js.native
  
  @JSImport("nodegit", "Tree.entryDup")
  @js.native
  def entryDup(
    dest: typingsSlinky.nodegit.treeEntryMod.TreeEntry,
    source: typingsSlinky.nodegit.treeEntryMod.TreeEntry
  ): Double = js.native
  
  /**
    * Retrieves the tree pointed to by the oid
    */
  @JSImport("nodegit", "Tree.lookup")
  @js.native
  def lookup(repo: typingsSlinky.nodegit.repositoryMod.Repository, id: String): js.Promise[typingsSlinky.nodegit.treeMod.Tree] = js.native
  @JSImport("nodegit", "Tree.lookup")
  @js.native
  def lookup(repo: typingsSlinky.nodegit.repositoryMod.Repository, id: String, callback: js.Function): js.Promise[typingsSlinky.nodegit.treeMod.Tree] = js.native
  @JSImport("nodegit", "Tree.lookup")
  @js.native
  def lookup(repo: typingsSlinky.nodegit.repositoryMod.Repository, id: typingsSlinky.nodegit.oidMod.Oid): js.Promise[typingsSlinky.nodegit.treeMod.Tree] = js.native
  @JSImport("nodegit", "Tree.lookup")
  @js.native
  def lookup(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    id: typingsSlinky.nodegit.oidMod.Oid,
    callback: js.Function
  ): js.Promise[typingsSlinky.nodegit.treeMod.Tree] = js.native
  @JSImport("nodegit", "Tree.lookup")
  @js.native
  def lookup(repo: typingsSlinky.nodegit.repositoryMod.Repository, id: typingsSlinky.nodegit.treeMod.Tree): js.Promise[typingsSlinky.nodegit.treeMod.Tree] = js.native
  @JSImport("nodegit", "Tree.lookup")
  @js.native
  def lookup(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    id: typingsSlinky.nodegit.treeMod.Tree,
    callback: js.Function
  ): js.Promise[typingsSlinky.nodegit.treeMod.Tree] = js.native
  
  @JSImport("nodegit", "Tree.lookupPrefix")
  @js.native
  def lookupPrefix(
    repo: typingsSlinky.nodegit.repositoryMod.Repository,
    id: typingsSlinky.nodegit.oidMod.Oid,
    len: Double
  ): js.Promise[typingsSlinky.nodegit.treeMod.Tree] = js.native
}
