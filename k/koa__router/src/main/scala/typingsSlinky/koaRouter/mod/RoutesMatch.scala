package typingsSlinky.koaRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoutesMatch extends js.Object {
  var path: js.Array[Layer] = js.native
  var pathAndMethod: js.Array[Layer] = js.native
  var route: Boolean = js.native
}

object RoutesMatch {
  @scala.inline
  def apply(path: js.Array[Layer], pathAndMethod: js.Array[Layer], route: Boolean): RoutesMatch = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], pathAndMethod = pathAndMethod.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoutesMatch]
  }
  @scala.inline
  implicit class RoutesMatchOps[Self <: RoutesMatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: js.Array[Layer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathAndMethod(value: js.Array[Layer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathAndMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoute(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("route")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

