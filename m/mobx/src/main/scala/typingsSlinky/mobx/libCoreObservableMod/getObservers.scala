package typingsSlinky.mobx.libCoreObservableMod

import typingsSlinky.mobx.libCoreDerivationMod.IDerivation
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/core/observable", "getObservers")
@js.native
object getObservers extends js.Object {
  def apply(observable: IObservable): Set[IDerivation] = js.native
}

