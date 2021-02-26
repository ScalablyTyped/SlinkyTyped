package typingsSlinky.firebaseDatabase

import typingsSlinky.firebaseDatabase.nodeMod.Node
import typingsSlinky.firebaseDatabase.pathMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sparseSnapshotTreeMod {
  
  @JSImport("@firebase/database/dist/src/core/SparseSnapshotTree", "SparseSnapshotTree")
  @js.native
  class SparseSnapshotTree () extends StObject {
    
    val children: js.Any = js.native
    
    /**
      * Gets the node stored at the given path if one exists.
      *
      * @param path Path to look up snapshot for.
      * @return The retrieved node, or null.
      */
    def find(path: Path): Node | Null = js.native
    
    /**
      * Iterates through each immediate child and triggers the callback.
      *
      * @param func The function to invoke for each child.
      */
    def forEachChild(func: js.Function2[/* a */ String, /* b */ this.type, Unit]): Unit = js.native
    
    /**
      * Recursively iterates through all of the stored tree and calls the
      * callback on each one.
      *
      * @param prefixPath Path to look up node for.
      * @param func The function to invoke for each tree.
      */
    def forEachTree(prefixPath: Path, func: js.Function2[/* a */ Path, /* b */ Node, _]): Unit = js.native
    
    /**
      * Purge the data at path from the cache.
      *
      * @param path Path to look up snapshot for.
      * @return True if this node should now be removed.
      */
    def forget(path: Path): Boolean = js.native
    
    /**
      * Stores the given node at the specified path. If there is already a node
      * at a shallower path, it merges the new data into that snapshot node.
      *
      * @param path Path to look up snapshot for.
      * @param data The new data, or null.
      */
    def remember(path: Path, data: Node): Unit = js.native
    
    var value: js.Any = js.native
  }
}
