package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConversionsBatchInsertResponse extends js.Object {
  /** Indicates that some or all conversions failed to insert. */
  var hasFailures: js.UndefOr[Boolean] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#conversionsBatchInsertResponse". */
  var kind: js.UndefOr[String] = js.native
  /** The insert status of each conversion. Statuses are returned in the same order that conversions are inserted. */
  var status: js.UndefOr[js.Array[ConversionStatus]] = js.native
}

object ConversionsBatchInsertResponse {
  @scala.inline
  def apply(): ConversionsBatchInsertResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversionsBatchInsertResponse]
  }
  @scala.inline
  implicit class ConversionsBatchInsertResponseOps[Self <: ConversionsBatchInsertResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasFailures(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasFailures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasFailures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasFailures")(js.undefined)
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
    def withStatus(value: js.Array[ConversionStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

