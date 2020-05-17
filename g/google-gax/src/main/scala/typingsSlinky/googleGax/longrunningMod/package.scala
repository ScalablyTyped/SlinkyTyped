package typingsSlinky.googleGax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object longrunningMod {
  type GetOperationCallback = js.Function4[
    /* err */ js.UndefOr[js.Error | scala.Null], 
    /* result */ js.UndefOr[js.Object], 
    /* metadata */ js.UndefOr[js.Object], 
    /* rawResponse */ js.UndefOr[typingsSlinky.googleGax.longrunningMod.LROOperation], 
    scala.Unit
  ]
  type LROOperation = typingsSlinky.googleGax.operationsMod.google.longrunning.Operation
}
