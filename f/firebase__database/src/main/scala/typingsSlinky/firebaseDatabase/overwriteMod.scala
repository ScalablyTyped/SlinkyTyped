package typingsSlinky.firebaseDatabase

import typingsSlinky.firebaseDatabase.nodeMod.Node
import typingsSlinky.firebaseDatabase.operationMod.Operation
import typingsSlinky.firebaseDatabase.operationMod.OperationSource
import typingsSlinky.firebaseDatabase.pathMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overwriteMod {
  
  @JSImport("@firebase/database/dist/src/core/operation/Overwrite", "Overwrite")
  @js.native
  class Overwrite protected () extends Operation {
    def this(source: OperationSource, path: Path, snap: Node) = this()
    
    var snap: Node = js.native
  }
}
