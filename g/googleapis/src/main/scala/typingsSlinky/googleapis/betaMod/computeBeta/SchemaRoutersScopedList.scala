package typingsSlinky.googleapis.betaMod.computeBeta

import typingsSlinky.googleapis.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaRoutersScopedList extends js.Object {
  /**
    * A list of routers contained in this scope.
    */
  var routers: js.UndefOr[js.Array[SchemaRouter]] = js.native
  /**
    * Informational warning which replaces the list of routers when the list is
    * empty.
    */
  var warning: js.UndefOr[AnonCode] = js.native
}

object SchemaRoutersScopedList {
  @scala.inline
  def apply(): SchemaRoutersScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoutersScopedList]
  }
  @scala.inline
  implicit class SchemaRoutersScopedListOps[Self <: SchemaRoutersScopedList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRouters(value: js.Array[SchemaRouter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routers")(js.undefined)
        ret
    }
    @scala.inline
    def withWarning(value: AnonCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(js.undefined)
        ret
    }
  }
  
}

