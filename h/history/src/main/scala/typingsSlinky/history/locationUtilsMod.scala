package typingsSlinky.history

import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationDescriptor
import typingsSlinky.history.mod.LocationKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("history/LocationUtils", JSImport.Namespace)
@js.native
object locationUtilsMod extends js.Object {
  
  def createLocation[S](path: LocationDescriptor[S]): Location[S] = js.native
  def createLocation[S](path: LocationDescriptor[S], state: S): Location[S] = js.native
  def createLocation[S](
    path: LocationDescriptor[S],
    state: S,
    key: js.UndefOr[scala.Nothing],
    currentLocation: Location[S]
  ): Location[S] = js.native
  def createLocation[S](path: LocationDescriptor[S], state: S, key: LocationKey): Location[S] = js.native
  def createLocation[S](path: LocationDescriptor[S], state: S, key: LocationKey, currentLocation: Location[S]): Location[S] = js.native
  def createLocation[S](
    path: LocationDescriptor[S],
    state: js.UndefOr[scala.Nothing],
    key: js.UndefOr[scala.Nothing],
    currentLocation: Location[S]
  ): Location[S] = js.native
  def createLocation[S](path: LocationDescriptor[S], state: js.UndefOr[scala.Nothing], key: LocationKey): Location[S] = js.native
  def createLocation[S](
    path: LocationDescriptor[S],
    state: js.UndefOr[scala.Nothing],
    key: LocationKey,
    currentLocation: Location[S]
  ): Location[S] = js.native
  
  def locationsAreEqual[S](lv: LocationDescriptor[S], rv: LocationDescriptor[S]): Boolean = js.native
}
