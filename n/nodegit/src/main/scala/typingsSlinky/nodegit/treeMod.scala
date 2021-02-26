package typingsSlinky.nodegit

import typingsSlinky.nodegit.anon.EventEmitterstartvoid
import typingsSlinky.nodegit.diffMod.Diff
import typingsSlinky.nodegit.nodegitNumbers.`0`
import typingsSlinky.nodegit.nodegitNumbers.`1`
import typingsSlinky.nodegit.objectMod.Object
import typingsSlinky.nodegit.oidMod.Oid
import typingsSlinky.nodegit.repositoryMod.Repository
import typingsSlinky.nodegit.treeBuilderMod.Treebuilder
import typingsSlinky.nodegit.treeEntryMod.TreeEntry
import typingsSlinky.nodegit.treeUpdateMod.TreeUpdate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeMod {
  
  @JSImport("nodegit/tree", "Tree")
  @js.native
  class Tree () extends StObject {
    
    def _entryByIndex(idx: Double): TreeEntry = js.native
    
    def _entryByName(filename: String): TreeEntry = js.native
    
    /**
      * Make builder. This is helpful for modifying trees.
      */
    def builder(): Treebuilder = js.native
    
    def createUpdated(repo: Repository, nUpdates: Double, updates: TreeUpdate): js.Promise[Oid] = js.native
    
    /**
      * Diff two trees
      */
    def diff(tree: Tree): js.Promise[Diff] = js.native
    def diff(tree: Tree, callback: js.Function): js.Promise[Diff] = js.native
    
    /**
      * Diff two trees with options
      */
    def diffWithOptions(tree: Tree): js.Promise[Diff] = js.native
    def diffWithOptions(tree: Tree, options: js.UndefOr[scala.Nothing], callback: js.Function): js.Promise[Diff] = js.native
    def diffWithOptions(tree: Tree, options: Object): js.Promise[Diff] = js.native
    def diffWithOptions(tree: Tree, options: Object, callback: js.Function): js.Promise[Diff] = js.native
    
    def dup(): js.Promise[Tree] = js.native
    
    /**
      * Return an array of the entries in this tree (excluding its children).
      */
    def entries(): js.Array[TreeEntry] = js.native
    
    def entryById(id: Oid): TreeEntry = js.native
    
    /**
      * Get an entry at the ith position.
      */
    def entryByIndex(i: Double): TreeEntry = js.native
    
    /**
      * Get an entry by name; if the tree is a directory, the name is the filename.
      */
    def entryByName(name: String): TreeEntry = js.native
    
    def entryByPath(path: String): js.Promise[TreeEntry] = js.native
    
    def entryCount(): Double = js.native
    
    def free(): Unit = js.native
    
    /**
      * Get an entry at a path. Unlike by name, this takes a fully qualified path, like /foo/bar/baz.javascript
      */
    def getEntry(filePath: String): js.Promise[TreeEntry] = js.native
    
    def id(): Oid = js.native
    
    def owner(): Repository = js.native
    
    /**
      * Return the path of this tree, like /lib/foo/bar
      *
      *
      */
    def path(): String = js.native
    
    /**
      * Recursively walk the tree in breadth-first order. Fires an event for each entry.
      */
    def walk(): EventEmitterstartvoid = js.native
    def walk(blobsOnly: Boolean): EventEmitterstartvoid = js.native
  }
  /* static members */
  object Tree {
    
    @JSImport("nodegit/tree", "Tree.entryCmp")
    @js.native
    def entryCmp(tree1: TreeEntry, tree2: TreeEntry): Double = js.native
    
    @JSImport("nodegit/tree", "Tree.entryDup")
    @js.native
    def entryDup(dest: TreeEntry, source: TreeEntry): Double = js.native
    
    /**
      * Retrieves the tree pointed to by the oid
      */
    @JSImport("nodegit/tree", "Tree.lookup")
    @js.native
    def lookup(repo: Repository, id: String): js.Promise[Tree] = js.native
    @JSImport("nodegit/tree", "Tree.lookup")
    @js.native
    def lookup(repo: Repository, id: String, callback: js.Function): js.Promise[Tree] = js.native
    @JSImport("nodegit/tree", "Tree.lookup")
    @js.native
    def lookup(repo: Repository, id: Oid): js.Promise[Tree] = js.native
    @JSImport("nodegit/tree", "Tree.lookup")
    @js.native
    def lookup(repo: Repository, id: Oid, callback: js.Function): js.Promise[Tree] = js.native
    @JSImport("nodegit/tree", "Tree.lookup")
    @js.native
    def lookup(repo: Repository, id: Tree): js.Promise[Tree] = js.native
    @JSImport("nodegit/tree", "Tree.lookup")
    @js.native
    def lookup(repo: Repository, id: Tree, callback: js.Function): js.Promise[Tree] = js.native
    
    @JSImport("nodegit/tree", "Tree.lookupPrefix")
    @js.native
    def lookupPrefix(repo: Repository, id: Oid, len: Double): js.Promise[Tree] = js.native
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.nodegit.nodegitNumbers.`0`
      - typingsSlinky.nodegit.nodegitNumbers.`1`
    */
    trait WALK_MODE extends StObject
    object WALK_MODE {
      
      @scala.inline
      def WALK_POST: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def WALK_PRE: `0` = 0.asInstanceOf[`0`]
    }
  }
}
