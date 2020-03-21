package typingsSlinky.expo.aRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DidFailWithErrorEvent extends js.Object {
  var error: js.Error
}

object DidFailWithErrorEvent {
  @scala.inline
  def apply(error: js.Error): DidFailWithErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DidFailWithErrorEvent]
  }
}

