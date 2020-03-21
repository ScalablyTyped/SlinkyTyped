package typingsSlinky.durandal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCallback extends js.Object {
  var routePattern: js.RegExp
  def callback(fragment: String): Unit
}

object AnonCallback {
  @scala.inline
  def apply(callback: String => Unit, routePattern: js.RegExp): AnonCallback = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), routePattern = routePattern.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCallback]
  }
}

