package typingsSlinky.firefoxWebextBrowser.browser.telemetry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents registration data for a Telemetry scalar. */
@js.native
trait ScalarData extends js.Object {
  /**
    * True if this scalar entry is expired. This allows recording it without error, but it will be discarded.
    */
  var expired: js.UndefOr[Boolean] = js.native
  /** True if this is a keyed scalar. */
  var keyed: js.UndefOr[Boolean] = js.native
  var kind: ScalarType = js.native
  /** True if this data should be recorded on release. */
  var record_on_release: js.UndefOr[Boolean] = js.native
}

object ScalarData {
  @scala.inline
  def apply(kind: ScalarType): ScalarData = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalarData]
  }
  @scala.inline
  implicit class ScalarDataOps[Self <: ScalarData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: ScalarType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
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
    def withKeyed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyed")(js.undefined)
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

