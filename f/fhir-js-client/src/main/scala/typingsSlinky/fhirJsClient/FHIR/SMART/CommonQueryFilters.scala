package typingsSlinky.fhirJsClient.FHIR.SMART

import typingsSlinky.fhirJsClient.anon.DictpropName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonQueryFilters extends js.Object {
  /**
    * Number of return records requested. The server is not bound to return the number requested, but cannot return more
    */
  var count: js.UndefOr[Double] = js.native
  /**
    * Addition filters to be applied on the history query. The object will be converted into query string parameters.
    */
  var params: js.UndefOr[DictpropName] = js.native
  /**
    * Only include resource versions that were created at or after the given instant in time
    *
    * Type: instant An instant in time - known at least to the second and always includes a time zone.
    * Note: This is intended for precisely observed times (typically system logs etc.), and not human-reported times - for them,
    * use date and dateTime. instant is a more constrained dateTime xs:dateTime A JSON string - an xs:dateTime
    * Note: This type is for system times, not human times (see date and dateTime below).
    */
  var since: js.UndefOr[String] = js.native
}

object CommonQueryFilters {
  @scala.inline
  def apply(): CommonQueryFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonQueryFilters]
  }
  @scala.inline
  implicit class CommonQueryFiltersOps[Self <: CommonQueryFilters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(value: DictpropName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withSince(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("since")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSince: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("since")(js.undefined)
        ret
    }
  }
  
}

