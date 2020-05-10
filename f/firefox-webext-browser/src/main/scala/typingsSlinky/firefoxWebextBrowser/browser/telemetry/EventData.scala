package typingsSlinky.firefoxWebextBrowser.browser.telemetry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents registration data for a Telemetry event. */
@js.native
trait EventData extends js.Object {
  /**
    * True if this event entry is expired. This allows recording it without error, but it will be discarded.
    */
  var expired: js.UndefOr[Boolean] = js.native
  /** List of allowed extra keys for this event entry. */
  var extra_keys: js.Array[String] = js.native
  /** List of methods for this event entry. */
  var methods: js.Array[String] = js.native
  /** List of objects for this event entry. */
  var objects: js.Array[String] = js.native
  /** True if this data should be recorded on release. */
  var record_on_release: js.UndefOr[Boolean] = js.native
}

object EventData {
  @scala.inline
  def apply(extra_keys: js.Array[String], methods: js.Array[String], objects: js.Array[String]): EventData = {
    val __obj = js.Dynamic.literal(extra_keys = extra_keys.asInstanceOf[js.Any], methods = methods.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventData]
  }
  @scala.inline
  implicit class EventDataOps[Self <: EventData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtra_keys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra_keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethods(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjects(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expired")(js.undefined)
        ret
    }
    @scala.inline
    def withRecord_on_release(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("record_on_release")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecord_on_release: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("record_on_release")(js.undefined)
        ret
    }
  }
  
}

