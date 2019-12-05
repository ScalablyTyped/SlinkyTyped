package typingsSlinky.playerframework.PlayerFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReadyState extends js.Object

@JSGlobal("PlayerFramework.ReadyState")
@js.native
object ReadyState extends js.Object {
  /**
  		* The player has data for the current playback position, but not enough data to play the next frame.
  		**/
  @js.native
  sealed trait currentData extends ReadyState
  
  /**
  		* The player has enough data available to start playing.
  		**/
  @js.native
  sealed trait enoughData extends ReadyState
  
  /**
  		* The player has data for the current playback position and at least the next frame.
  		**/
  @js.native
  sealed trait futureData extends ReadyState
  
  /**
  		* The player has metadata for the audio/video.
  		**/
  @js.native
  sealed trait metadata extends ReadyState
  
  /**
  		* The player has no information for the audio/video
  		**/
  @js.native
  sealed trait nothing extends ReadyState
  
  /* 2 */ val currentData: typingsSlinky.playerframework.PlayerFramework.ReadyState.currentData with Double = js.native
  /* 4 */ val enoughData: typingsSlinky.playerframework.PlayerFramework.ReadyState.enoughData with Double = js.native
  /* 3 */ val futureData: typingsSlinky.playerframework.PlayerFramework.ReadyState.futureData with Double = js.native
  /* 1 */ val metadata: typingsSlinky.playerframework.PlayerFramework.ReadyState.metadata with Double = js.native
  /* 0 */ val nothing: typingsSlinky.playerframework.PlayerFramework.ReadyState.nothing with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReadyState with Double] = js.native
}

