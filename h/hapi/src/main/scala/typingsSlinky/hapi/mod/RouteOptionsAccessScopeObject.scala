package typingsSlinky.hapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteOptionsAccessScopeObject extends RouteOptionsAccessObject {
  var scope: RouteOptionsAccessScope = js.native
}

object RouteOptionsAccessScopeObject {
  @scala.inline
  def apply(scope: RouteOptionsAccessScope): RouteOptionsAccessScopeObject = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteOptionsAccessScopeObject]
  }
  @scala.inline
  implicit class RouteOptionsAccessScopeObjectOps[Self <: RouteOptionsAccessScopeObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScope(value: RouteOptionsAccessScope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

