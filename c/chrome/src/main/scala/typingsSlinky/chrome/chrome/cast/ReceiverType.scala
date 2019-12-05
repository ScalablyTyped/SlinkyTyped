package typingsSlinky.chrome.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReceiverType extends js.Object

@JSGlobal("chrome.cast.ReceiverType")
@js.native
object ReceiverType extends js.Object {
  @js.native
  sealed trait CAST extends ReceiverType
  
  @js.native
  sealed trait CUSTOM extends ReceiverType
  
  @js.native
  sealed trait DIAL extends ReceiverType
  
  @js.native
  sealed trait HANGOUT extends ReceiverType
  
  /* "cast" */ val CAST: typingsSlinky.chrome.chrome.cast.ReceiverType.CAST with String = js.native
  /* "custom" */ val CUSTOM: typingsSlinky.chrome.chrome.cast.ReceiverType.CUSTOM with String = js.native
  /* "dial" */ val DIAL: typingsSlinky.chrome.chrome.cast.ReceiverType.DIAL with String = js.native
  /* "hangout" */ val HANGOUT: typingsSlinky.chrome.chrome.cast.ReceiverType.HANGOUT with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ReceiverType with String] = js.native
}

