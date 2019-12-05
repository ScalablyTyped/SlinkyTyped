package typingsSlinky.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RepeatMode extends js.Object

@JSGlobal("chrome.cast.media.RepeatMode")
@js.native
object RepeatMode extends js.Object {
  @js.native
  sealed trait ALL extends RepeatMode
  
  @js.native
  sealed trait ALL_AND_SHUFFLE extends RepeatMode
  
  @js.native
  sealed trait OFF extends RepeatMode
  
  @js.native
  sealed trait SINGLE extends RepeatMode
  
  /* "REPEAT_ALL" */ val ALL: typingsSlinky.chrome.chrome.cast.media.RepeatMode.ALL with String = js.native
  /* "REPEAT_ALL_AND_SHUFFLE" */ val ALL_AND_SHUFFLE: typingsSlinky.chrome.chrome.cast.media.RepeatMode.ALL_AND_SHUFFLE with String = js.native
  /* "REPEAT_OFF" */ val OFF: typingsSlinky.chrome.chrome.cast.media.RepeatMode.OFF with String = js.native
  /* "REPEAT_SINGLE" */ val SINGLE: typingsSlinky.chrome.chrome.cast.media.RepeatMode.SINGLE with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RepeatMode with String] = js.native
}

