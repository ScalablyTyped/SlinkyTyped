package typingsSlinky.expoLocation.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GeofencingRegionState extends js.Object
@JSImport("expo-location", "GeofencingRegionState")
@js.native
object GeofencingRegionState extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GeofencingRegionState with Double] = js.native
  
  @js.native
  sealed trait Inside extends GeofencingRegionState
  /* 1 */ @js.native
  object Inside extends TopLevel[Inside with Double]
  
  @js.native
  sealed trait Outside extends GeofencingRegionState
  /* 2 */ @js.native
  object Outside extends TopLevel[Outside with Double]
  
  @js.native
  sealed trait Unknown extends GeofencingRegionState
  /* 0 */ @js.native
  object Unknown extends TopLevel[Unknown with Double]
}
