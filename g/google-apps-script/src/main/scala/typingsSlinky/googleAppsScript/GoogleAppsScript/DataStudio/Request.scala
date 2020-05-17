package typingsSlinky.googleAppsScript.GoogleAppsScript.DataStudio

import typingsSlinky.googleAppsScript.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * function getData(request: GoogleAppsScript.Data_Studio.Request<YourConnectorParams>)
  *
  * See https://developers.google.com/datastudio/connector/reference#getdata
  */
@js.native
trait Request[T] extends js.Object {
  /** An object containing the user provided values for the config parameters defined by the connector. */
  var configParams: T = js.native
  /**
    * By default, the date range provided will be the last 28 days excluding today.
    * If a user applies a date range filter for a report, then the date range provided will reflect the user selection.
    * When sampleExtraction is set to true, the date two days earlier than today is given as both the start and end date.
    */
  var dateRange: DateRange = js.native
  /**
    * A nested array of the user selected filters.
    * The innermost arrays should be ORed together, the outermost arrays should be ANDed together.
    */
  var dimensionsFilters: js.Array[js.Array[DimensionsFilters]] = js.native
  /** The names of the requested fields. */
  var fields: js.Array[Name] = js.native
  /** An object containing information relevant to connector execution. */
  var scriptParams: ScriptParams = js.native
}

object Request {
  @scala.inline
  def apply[T](
    configParams: T,
    dateRange: DateRange,
    dimensionsFilters: js.Array[js.Array[DimensionsFilters]],
    fields: js.Array[Name],
    scriptParams: ScriptParams
  ): Request[T] = {
    val __obj = js.Dynamic.literal(configParams = configParams.asInstanceOf[js.Any], dateRange = dateRange.asInstanceOf[js.Any], dimensionsFilters = dimensionsFilters.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], scriptParams = scriptParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request[T]]
  }
  @scala.inline
  implicit class RequestOps[Self[t] <: Request[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withConfigParams(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateRange(value: DateRange): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDimensionsFilters(value: js.Array[js.Array[DimensionsFilters]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionsFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFields(value: js.Array[Name]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScriptParams(value: ScriptParams): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptParams")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

