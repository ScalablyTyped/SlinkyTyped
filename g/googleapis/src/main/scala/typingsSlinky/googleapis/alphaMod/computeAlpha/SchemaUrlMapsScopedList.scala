package typingsSlinky.googleapis.alphaMod.computeAlpha

import typingsSlinky.googleapis.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaUrlMapsScopedList extends js.Object {
  /**
    * A list of UrlMaps contained in this scope.
    */
  var urlMaps: js.UndefOr[js.Array[SchemaUrlMap]] = js.native
  /**
    * Informational warning which replaces the list of backend services when
    * the list is empty.
    */
  var warning: js.UndefOr[AnonCode] = js.native
}

object SchemaUrlMapsScopedList {
  @scala.inline
  def apply(): SchemaUrlMapsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlMapsScopedList]
  }
  @scala.inline
  implicit class SchemaUrlMapsScopedListOps[Self <: SchemaUrlMapsScopedList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrlMaps(value: js.Array[SchemaUrlMap]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlMaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlMaps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlMaps")(js.undefined)
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

