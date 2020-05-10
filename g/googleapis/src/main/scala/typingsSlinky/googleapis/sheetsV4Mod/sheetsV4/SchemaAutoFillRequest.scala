package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fills in more data based on existing data.
  */
@js.native
trait SchemaAutoFillRequest extends js.Object {
  /**
    * The range to autofill. This will examine the range and detect the
    * location that has data and automatically fill that data in to the rest of
    * the range.
    */
  var range: js.UndefOr[SchemaGridRange] = js.native
  /**
    * The source and destination areas to autofill. This explicitly lists the
    * source of the autofill and where to extend that data.
    */
  var sourceAndDestination: js.UndefOr[SchemaSourceAndDestination] = js.native
  /**
    * True if we should generate data with the &quot;alternate&quot; series.
    * This differs based on the type and amount of source data.
    */
  var useAlternateSeries: js.UndefOr[Boolean] = js.native
}

object SchemaAutoFillRequest {
  @scala.inline
  def apply(): SchemaAutoFillRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoFillRequest]
  }
  @scala.inline
  implicit class SchemaAutoFillRequestOps[Self <: SchemaAutoFillRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRange(value: SchemaGridRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceAndDestination(value: SchemaSourceAndDestination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceAndDestination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceAndDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceAndDestination")(js.undefined)
        ret
    }
    @scala.inline
    def withUseAlternateSeries(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAlternateSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseAlternateSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAlternateSeries")(js.undefined)
        ret
    }
  }
  
}

