package typingsSlinky.googleapis.computeV1Mod.computeV1

import typingsSlinky.googleapis.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaBackendServicesScopedList extends js.Object {
  /**
    * A list of BackendServices contained in this scope.
    */
  var backendServices: js.UndefOr[js.Array[SchemaBackendService]] = js.native
  /**
    * Informational warning which replaces the list of backend services when
    * the list is empty.
    */
  var warning: js.UndefOr[AnonCode] = js.native
}

object SchemaBackendServicesScopedList {
  @scala.inline
  def apply(): SchemaBackendServicesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackendServicesScopedList]
  }
  @scala.inline
  implicit class SchemaBackendServicesScopedListOps[Self <: SchemaBackendServicesScopedList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackendServices(value: js.Array[SchemaBackendService]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backendServices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackendServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backendServices")(js.undefined)
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

