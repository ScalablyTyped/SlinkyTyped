package typingsSlinky.inversifyRestifyUtils

import typingsSlinky.inversifyRestifyUtils.interfacesMod.interfaces.StrOrRegex
import typingsSlinky.inversifyRestifyUtils.interfacesMod.interfaces._RouteOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPath extends _RouteOptions {
  var path: StrOrRegex = js.native
}

object AnonPath {
  @scala.inline
  def apply(path: StrOrRegex): AnonPath = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPath]
  }
  @scala.inline
  implicit class AnonPathOps[Self <: AnonPath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPathRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: StrOrRegex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

