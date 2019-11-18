package typingsSlinky.history

import typingsSlinky.history.historyMod.Location
import typingsSlinky.history.historyMod.LocationDescriptor
import typingsSlinky.history.historyMod.LocationKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CurrentLocation extends js.Object {
  def apply[S](path: LocationDescriptor[S]): Location[S] = js.native
  def apply[S](path: LocationDescriptor[S], state: S): Location[S] = js.native
  def apply[S](path: LocationDescriptor[S], state: S, key: LocationKey): Location[S] = js.native
  def apply[S](path: LocationDescriptor[S], state: S, key: LocationKey, currentLocation: Location[S]): Location[S] = js.native
}

