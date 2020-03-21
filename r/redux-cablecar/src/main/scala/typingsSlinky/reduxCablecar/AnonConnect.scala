package typingsSlinky.reduxCablecar

import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Store
import typingsSlinky.reduxCablecar.mod.CableCar
import typingsSlinky.reduxCablecar.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConnect extends js.Object {
  def connect(store: Store[_, AnyAction], channel: String): CableCar = js.native
  def connect(store: Store[_, AnyAction], channel: String, options: Options): CableCar = js.native
  def setProvider(actionCableProvider: String): Unit = js.native
}

