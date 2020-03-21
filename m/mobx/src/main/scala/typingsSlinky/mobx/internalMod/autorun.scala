package typingsSlinky.mobx.internalMod

import typingsSlinky.mobx.autorunMod.IAutorunOptions
import typingsSlinky.mobx.reactionMod.IReactionDisposer
import typingsSlinky.mobx.reactionMod.IReactionPublic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/internal", "autorun")
@js.native
object autorun extends js.Object {
  def apply(view: js.Function1[/* r */ IReactionPublic, _]): IReactionDisposer = js.native
  def apply(view: js.Function1[/* r */ IReactionPublic, _], opts: IAutorunOptions): IReactionDisposer = js.native
}

