package typingsSlinky.fastJsonPatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object coreMod {
  type Validator_[T] = js.Function4[
    /* operation */ typingsSlinky.fastJsonPatch.coreMod.Operation, 
    /* index */ scala.Double, 
    /* document */ T, 
    /* existingPathFragment */ java.lang.String, 
    scala.Unit
  ]
}
