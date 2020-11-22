package typingsSlinky.fsJetpack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type AppendData = java.lang.String | typingsSlinky.node.Buffer
  
  type OverwriteFunction = js.Function2[
    /* srcInspectData */ typingsSlinky.fsJetpack.typesMod.InspectResult, 
    /* destInspectData */ typingsSlinky.fsJetpack.typesMod.InspectResult, 
    scala.Boolean | js.Promise[scala.Boolean]
  ]
  
  type WritableData = java.lang.String | js.Object | js.Array[js.Any] | typingsSlinky.node.Buffer
}
