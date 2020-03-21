package typingsSlinky.inversifyRestifyUtils

import typingsSlinky.inversifyRestifyUtils.interfacesMod.interfaces.StrOrRegex
import typingsSlinky.inversifyRestifyUtils.interfacesMod.interfaces._RouteOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPath extends _RouteOptions {
  var path: StrOrRegex
}

object AnonPath {
  @scala.inline
  def apply(path: StrOrRegex): AnonPath = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPath]
  }
}

