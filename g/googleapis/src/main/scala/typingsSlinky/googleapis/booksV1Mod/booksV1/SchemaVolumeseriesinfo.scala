package typingsSlinky.googleapis.booksV1Mod.booksV1

import typingsSlinky.googleapis.AnonIssue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaVolumeseriesinfo extends js.Object {
  /**
    * The display number string. This should be used only for display purposes
    * and the actual sequence should be inferred from the below orderNumber.
    */
  var bookDisplayNumber: js.UndefOr[String] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Short book title in the context of the series.
    */
  var shortSeriesBookTitle: js.UndefOr[String] = js.native
  var volumeSeries: js.UndefOr[js.Array[AnonIssue]] = js.native
}

object SchemaVolumeseriesinfo {
  @scala.inline
  def apply(): SchemaVolumeseriesinfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVolumeseriesinfo]
  }
  @scala.inline
  implicit class SchemaVolumeseriesinfoOps[Self <: SchemaVolumeseriesinfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBookDisplayNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookDisplayNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBookDisplayNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookDisplayNumber")(js.undefined)
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
    def withShortSeriesBookTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortSeriesBookTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortSeriesBookTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortSeriesBookTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeSeries(value: js.Array[AnonIssue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeSeries")(js.undefined)
        ret
    }
  }
  
}

