package typingsSlinky.fastJsonPatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object moduleCoreMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.fastJsonPatch.moduleCoreMod.AddOperation[js.Any]
    - typingsSlinky.fastJsonPatch.moduleCoreMod.RemoveOperation
    - typingsSlinky.fastJsonPatch.moduleCoreMod.ReplaceOperation[js.Any]
    - typingsSlinky.fastJsonPatch.moduleCoreMod.MoveOperation
    - typingsSlinky.fastJsonPatch.moduleCoreMod.CopyOperation
    - typingsSlinky.fastJsonPatch.moduleCoreMod.TestOperation[js.Any]
    - typingsSlinky.fastJsonPatch.moduleCoreMod.GetOperation[js.Any]
  */
  type Operation = typingsSlinky.fastJsonPatch.moduleCoreMod._Operation | typingsSlinky.fastJsonPatch.moduleCoreMod.AddOperation[js.Any] | typingsSlinky.fastJsonPatch.moduleCoreMod.ReplaceOperation[js.Any] | typingsSlinky.fastJsonPatch.moduleCoreMod.TestOperation[js.Any] | typingsSlinky.fastJsonPatch.moduleCoreMod.GetOperation[js.Any]
  
  type Validator_[T] = js.Function4[
    /* operation */ typingsSlinky.fastJsonPatch.moduleCoreMod.Operation, 
    /* index */ scala.Double, 
    /* document */ T, 
    /* existingPathFragment */ java.lang.String, 
    scala.Unit
  ]
}
