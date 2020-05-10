package typingsSlinky.gapiClientFitness.gapi.client.fitness

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AggregateBy extends js.Object {
  /**
    * A data source ID to aggregate. Mutually exclusive of dataTypeName. Only data from the specified data source ID will be included in the aggregation. The
    * dataset in the response will have the same data source ID.
    */
  var dataSourceId: js.UndefOr[String] = js.native
  /**
    * The data type to aggregate. All data sources providing this data type will contribute data to the aggregation. The response will contain a single
    * dataset for this data type name. The dataset will have a data source ID of derived:com.google.:com.google.android.gms:aggregated
    */
  var dataTypeName: js.UndefOr[String] = js.native
}

object AggregateBy {
  @scala.inline
  def apply(): AggregateBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregateBy]
  }
  @scala.inline
  implicit class AggregateByOps[Self <: AggregateBy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSourceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withDataTypeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTypeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataTypeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTypeName")(js.undefined)
        ret
    }
  }
  
}

