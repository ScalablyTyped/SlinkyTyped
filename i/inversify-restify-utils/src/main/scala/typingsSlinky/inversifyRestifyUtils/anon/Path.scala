package typingsSlinky.inversifyRestifyUtils.anon

import typingsSlinky.inversifyRestifyUtils.interfacesMod.interfaces.StrOrRegex
import typingsSlinky.inversifyRestifyUtils.interfacesMod.interfaces._RouteOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Path extends _RouteOptions {
  var path: StrOrRegex
}

object Path {
  @scala.inline
  def apply(path: StrOrRegex): Path = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
}

