package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClientCompute.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackendServicesScopedList extends js.Object {
  /** List of BackendServices contained in this scope. */
  var backendServices: js.UndefOr[js.Array[BackendService]] = js.native
  /** Informational warning which replaces the list of backend services when the list is empty. */
  var warning: js.UndefOr[Code] = js.native
}

object BackendServicesScopedList {
  @scala.inline
  def apply(): BackendServicesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackendServicesScopedList]
  }
  @scala.inline
  implicit class BackendServicesScopedListOps[Self <: BackendServicesScopedList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackendServices(value: js.Array[BackendService]): Self = {
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
    def withWarning(value: Code): Self = {
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

