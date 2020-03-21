package typingsSlinky.fastJsonPatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object coreMod {
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.fastJsonPatch.coreMod.AddOperation[js.Any]
    - typingsSlinky.fastJsonPatch.coreMod.RemoveOperation
    - typingsSlinky.fastJsonPatch.coreMod.ReplaceOperation[js.Any]
    - typingsSlinky.fastJsonPatch.coreMod.MoveOperation
    - typingsSlinky.fastJsonPatch.coreMod.CopyOperation
    - typingsSlinky.fastJsonPatch.coreMod.TestOperation[js.Any]
    - typingsSlinky.fastJsonPatch.coreMod.GetOperation[js.Any]
  */
  type Operation = typingsSlinky.fastJsonPatch.coreMod._Operation | typingsSlinky.fastJsonPatch.coreMod.AddOperation[js.Any] | typingsSlinky.fastJsonPatch.coreMod.ReplaceOperation[js.Any] | typingsSlinky.fastJsonPatch.coreMod.TestOperation[js.Any] | typingsSlinky.fastJsonPatch.coreMod.GetOperation[js.Any]
  type Validator_[T] = js.Function4[
    /* operation */ typingsSlinky.fastJsonPatch.coreMod.Operation, 
    /* index */ scala.Double, 
    /* document */ T, 
    /* existingPathFragment */ java.lang.String, 
    scala.Unit
  ]
}
