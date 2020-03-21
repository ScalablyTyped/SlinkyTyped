package typingsSlinky.mobx.mod

import typingsSlinky.mobx.derivationMod.IDerivation
import typingsSlinky.mobx.utilsMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx", "onReactionError")
@js.native
object onReactionError extends js.Object {
  def apply(handler: js.Function2[/* error */ js.Any, /* derivation */ IDerivation, Unit]): Lambda = js.native
}

