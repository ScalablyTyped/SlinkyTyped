package typingsSlinky.playerframework.PlayerFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AdvertisingState extends js.Object

// Enumerations
@JSGlobal("PlayerFramework.AdvertisingState")
@js.native
object AdvertisingState extends js.Object {
  /**
  		* A linear ad is playing.
  		**/
  @js.native
  sealed trait linear extends AdvertisingState
  
  /**
  		* An ad is loading.
  		**/
  @js.native
  sealed trait loading extends AdvertisingState
  
  /**
  		* A non-linear ad is playing.
  		**/
  @js.native
  sealed trait nonLinear extends AdvertisingState
  
  /**
  		* No ad is loading or playing.
  		**/
  @js.native
  sealed trait none extends AdvertisingState
  
  /* 2 */ val linear: typingsSlinky.playerframework.PlayerFramework.AdvertisingState.linear with Double = js.native
  /* 1 */ val loading: typingsSlinky.playerframework.PlayerFramework.AdvertisingState.loading with Double = js.native
  /* 3 */ val nonLinear: typingsSlinky.playerframework.PlayerFramework.AdvertisingState.nonLinear with Double = js.native
  /* 0 */ val none: typingsSlinky.playerframework.PlayerFramework.AdvertisingState.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AdvertisingState with Double] = js.native
}

