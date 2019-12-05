package typingsSlinky.reduxDashCablecar

import typingsSlinky.redux.reduxMod.AnyAction
import typingsSlinky.redux.reduxMod.Store
import typingsSlinky.reduxDashCablecar.reduxDashCablecarMod.CableCar
import typingsSlinky.reduxDashCablecar.reduxDashCablecarMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ActionCableProvider extends js.Object {
  def connect(store: Store[_, AnyAction], channel: String): CableCar = js.native
  def connect(store: Store[_, AnyAction], channel: String, options: Options): CableCar = js.native
  def setProvider(actionCableProvider: String): Unit = js.native
}

