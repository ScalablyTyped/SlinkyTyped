package typingsSlinky.mobx.internalMod

import typingsSlinky.mobx.autorunMod.IReactionOptions
import typingsSlinky.mobx.reactionMod.IReactionDisposer
import typingsSlinky.mobx.reactionMod.IReactionPublic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx/lib/internal", "reaction")
@js.native
object reaction extends js.Object {
  
  def apply[T](
    expression: js.Function1[/* r */ IReactionPublic, T],
    effect: js.Function2[/* arg */ T, /* r */ IReactionPublic, Unit]
  ): IReactionDisposer = js.native
  def apply[T](
    expression: js.Function1[/* r */ IReactionPublic, T],
    effect: js.Function2[/* arg */ T, /* r */ IReactionPublic, Unit],
    opts: IReactionOptions
  ): IReactionDisposer = js.native
}
