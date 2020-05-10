package typingsSlinky.pulumiAws.outputMod.cloudtrail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrailEventSelector extends js.Object {
  /**
    * Specifies logging data events. Fields documented below.
    */
  var dataResources: js.UndefOr[js.Array[TrailEventSelectorDataResource]] = js.native
  /**
    * Specify if you want your event selector to include management events for your trail.
    */
  var includeManagementEvents: js.UndefOr[Boolean] = js.native
  /**
    * Specify if you want your trail to log read-only events, write-only events, or all. By default, the value is All. You can specify only the following value: "ReadOnly", "WriteOnly", "All". Defaults to `All`.
    */
  var readWriteType: js.UndefOr[String] = js.native
}

object TrailEventSelector {
  @scala.inline
  def apply(): TrailEventSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrailEventSelector]
  }
  @scala.inline
  implicit class TrailEventSelectorOps[Self <: TrailEventSelector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataResources(value: js.Array[TrailEventSelectorDataResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataResources")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeManagementEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeManagementEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeManagementEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeManagementEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withReadWriteType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readWriteType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadWriteType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readWriteType")(js.undefined)
        ret
    }
  }
  
}

