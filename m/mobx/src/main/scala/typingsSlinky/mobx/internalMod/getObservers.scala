package typingsSlinky.mobx.internalMod

import typingsSlinky.mobx.coreObservableMod.IObservable
import typingsSlinky.mobx.derivationMod.IDerivation
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/internal", "getObservers")
@js.native
object getObservers extends js.Object {
  def apply(observable: IObservable): Set[IDerivation] = js.native
}

