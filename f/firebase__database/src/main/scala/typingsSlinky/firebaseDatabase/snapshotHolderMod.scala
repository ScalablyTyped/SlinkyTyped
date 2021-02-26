package typingsSlinky.firebaseDatabase

import typingsSlinky.firebaseDatabase.nodeMod.Node
import typingsSlinky.firebaseDatabase.pathMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snapshotHolderMod {
  
  @JSImport("@firebase/database/dist/src/core/SnapshotHolder", "SnapshotHolder")
  @js.native
  class SnapshotHolder () extends StObject {
    
    def getNode(path: Path): Node = js.native
    
    var rootNode_ : js.Any = js.native
    
    def updateSnapshot(path: Path, newSnapshotNode: Node): Unit = js.native
  }
}
