package typingsSlinky.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShippingsettingsCustomBatchResponseEntry extends js.Object {
  /** The ID of the request entry to which this entry responds. */
  var batchId: js.UndefOr[Double] = js.native
  /** A list of errors defined if, and only if, the request failed. */
  var errors: js.UndefOr[Errors] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "content#shippingsettingsCustomBatchResponseEntry". */
  var kind: js.UndefOr[String] = js.native
  /** The retrieved or updated account shipping settings. */
  var shippingSettings: js.UndefOr[ShippingSettings] = js.native
}

object ShippingsettingsCustomBatchResponseEntry {
  @scala.inline
  def apply(): ShippingsettingsCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShippingsettingsCustomBatchResponseEntry]
  }
  @scala.inline
  implicit class ShippingsettingsCustomBatchResponseEntryOps[Self <: ShippingsettingsCustomBatchResponseEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchId")(js.undefined)
        ret
    }
    @scala.inline
    def withErrors(value: Errors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingSettings(value: ShippingSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingSettings")(js.undefined)
        ret
    }
  }
  
}

