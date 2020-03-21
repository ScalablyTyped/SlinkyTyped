package typingsSlinky.pulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lambdaMixinsMod {
  type BaseCallbackFunctionArgs = typingsSlinky.pulumiAws.utilsMod.Overwrite[
    typingsSlinky.pulumiAws.lambdaFunctionMod.FunctionArgs, 
    typingsSlinky.pulumiAws.AnonCodePathOptions
  ]
  type Callback[E, R] = js.Function3[
    /* event */ E, 
    /* context */ typingsSlinky.pulumiAws.lambdaMixinsMod.Context, 
    /* callback */ js.Function2[/* error */ js.UndefOr[js.Any], /* result */ js.UndefOr[R], scala.Unit], 
    js.Promise[R] | scala.Unit
  ]
  type CallbackFactory[E, R] = js.Function0[typingsSlinky.pulumiAws.lambdaMixinsMod.Callback[E, R]]
  type EventHandler[E, R] = (typingsSlinky.pulumiAws.lambdaMixinsMod.Callback[E, R]) | typingsSlinky.pulumiAws.lambdaFunctionMod.Function
}
