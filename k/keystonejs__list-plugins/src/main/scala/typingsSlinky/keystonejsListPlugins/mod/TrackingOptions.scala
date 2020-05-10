package typingsSlinky.keystonejsListPlugins.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrackingOptions extends js.Object {
  var access: js.Any = js.native
  var createdAtField: js.UndefOr[String] = js.native
   // TODO: insert fields here
  var updatedAtField: js.UndefOr[String] = js.native
}

object TrackingOptions {
  @scala.inline
  def apply(access: js.Any): TrackingOptions = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackingOptions]
  }
  @scala.inline
  implicit class TrackingOptionsOps[Self <: TrackingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccess(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedAtField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAtField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAtField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAtField")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatedAtField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedAtField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedAtField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedAtField")(js.undefined)
        ret
    }
  }
  
}

