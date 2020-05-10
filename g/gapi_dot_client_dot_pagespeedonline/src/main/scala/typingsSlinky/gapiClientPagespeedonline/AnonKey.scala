package typingsSlinky.gapiClientPagespeedonline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonKey extends js.Object {
  /** The placeholder key for this arg, as a string. */
  var key: js.UndefOr[String] = js.native
  /**
    * The screen rectangles being referred to, with dimensions measured in CSS pixels. This is only ever used for SNAPSHOT_RECT arguments. If this is absent
    * for a SNAPSHOT_RECT argument, it means that that argument refers to the entire snapshot.
    */
  var rects: js.UndefOr[js.Array[AnonHeight]] = js.native
  /** Secondary screen rectangles being referred to, with dimensions measured in CSS pixels. This is only ever used for SNAPSHOT_RECT arguments. */
  var secondary_rects: js.UndefOr[js.Array[AnonHeight]] = js.native
  /** Type of argument. One of URL, STRING_LITERAL, INT_LITERAL, BYTES, DURATION, VERBATIM_STRING, PERCENTAGE, HYPERLINK, or SNAPSHOT_RECT. */
  var `type`: js.UndefOr[String] = js.native
  /** Argument value, as a localized string. */
  var value: js.UndefOr[String] = js.native
}

object AnonKey {
  @scala.inline
  def apply(): AnonKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonKey]
  }
  @scala.inline
  implicit class AnonKeyOps[Self <: AnonKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withRects(value: js.Array[AnonHeight]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rects")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondary_rects(value: js.Array[AnonHeight]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondary_rects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondary_rects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondary_rects")(js.undefined)
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
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

