package typingsSlinky.gapiClientMonitoring.gapi.client.monitoring

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectdPayload extends js.Object {
  /** The end time of the interval. */
  var endTime: js.UndefOr[String] = js.native
  /** The measurement metadata. Example: "process_id" -> 12345 */
  var metadata: js.UndefOr[Record[String, TypedValue]] = js.native
  /** The name of the plugin. Example: "disk". */
  var plugin: js.UndefOr[String] = js.native
  /** The instance name of the plugin Example: "hdcl". */
  var pluginInstance: js.UndefOr[String] = js.native
  /** The start time of the interval. */
  var startTime: js.UndefOr[String] = js.native
  /** The measurement type. Example: "memory". */
  var `type`: js.UndefOr[String] = js.native
  /** The measurement type instance. Example: "used". */
  var typeInstance: js.UndefOr[String] = js.native
  /** The measured values during this time interval. Each value must have a different dataSourceName. */
  var values: js.UndefOr[js.Array[CollectdValue]] = js.native
}

object CollectdPayload {
  @scala.inline
  def apply(): CollectdPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectdPayload]
  }
  @scala.inline
  implicit class CollectdPayloadOps[Self <: CollectdPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: Record[String, TypedValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugin")(js.undefined)
        ret
    }
    @scala.inline
    def withPluginInstance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPluginInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginInstance")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeInstance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeInstance")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: js.Array[CollectdValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

