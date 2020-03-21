package typingsSlinky.reduxSagaCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type END = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EndType */ js.Any
  type EffectMiddleware = js.Function1[
    /* next */ js.Function1[/* effect */ js.Any, scala.Unit], 
    js.Function1[/* effect */ js.Any, scala.Unit]
  ]
  type Subscribe[T] = js.Function1[
    /* cb */ js.Function1[/* input */ T | typingsSlinky.reduxSagaCore.typesMod.END, scala.Unit], 
    typingsSlinky.reduxSagaCore.typesMod.Unsubscribe
  ]
  type Unsubscribe = js.Function0[scala.Unit]
}
