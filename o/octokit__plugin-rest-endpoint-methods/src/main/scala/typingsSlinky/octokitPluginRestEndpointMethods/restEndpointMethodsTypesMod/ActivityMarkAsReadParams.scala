package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityMarkAsReadParams extends js.Object {
  /**
    * Describes the last point that notifications were checked. Anything updated since this time will not be updated. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. Default: The current timestamp.
    */
  var last_read_at: js.UndefOr[String] = js.native
}

object ActivityMarkAsReadParams {
  @scala.inline
  def apply(): ActivityMarkAsReadParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityMarkAsReadParams]
  }
  @scala.inline
  implicit class ActivityMarkAsReadParamsOps[Self <: ActivityMarkAsReadParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLast_read_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_read_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLast_read_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_read_at")(js.undefined)
        ret
    }
  }
  
}

