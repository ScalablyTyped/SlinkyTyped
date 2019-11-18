package typingsSlinky.expoDashLocation.expoDashLocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GeofencingRegionState extends js.Object

@JSImport("expo-location", "GeofencingRegionState")
@js.native
object GeofencingRegionState extends js.Object {
  @js.native
  sealed trait Inside extends GeofencingRegionState
  
  @js.native
  sealed trait Outside extends GeofencingRegionState
  
  @js.native
  sealed trait Unknown extends GeofencingRegionState
  
  /* 1 */ val Inside: typingsSlinky.expoDashLocation.expoDashLocationMod.GeofencingRegionState.Inside with Double = js.native
  /* 2 */ val Outside: typingsSlinky.expoDashLocation.expoDashLocationMod.GeofencingRegionState.Outside with Double = js.native
  /* 0 */ val Unknown: typingsSlinky.expoDashLocation.expoDashLocationMod.GeofencingRegionState.Unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GeofencingRegionState with Double] = js.native
}

