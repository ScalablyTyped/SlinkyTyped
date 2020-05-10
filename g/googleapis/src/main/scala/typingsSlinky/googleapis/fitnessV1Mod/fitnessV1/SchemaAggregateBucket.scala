package typingsSlinky.googleapis.fitnessV1Mod.fitnessV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAggregateBucket extends js.Object {
  /**
    * Available for Bucket.Type.ACTIVITY_TYPE, Bucket.Type.ACTIVITY_SEGMENT
    */
  var activity: js.UndefOr[Double] = js.native
  /**
    * There will be one dataset per AggregateBy in the request.
    */
  var dataset: js.UndefOr[js.Array[SchemaDataset]] = js.native
  /**
    * The end time for the aggregated data, in milliseconds since epoch,
    * inclusive.
    */
  var endTimeMillis: js.UndefOr[String] = js.native
  /**
    * Available for Bucket.Type.SESSION
    */
  var session: js.UndefOr[SchemaSession] = js.native
  /**
    * The start time for the aggregated data, in milliseconds since epoch,
    * inclusive.
    */
  var startTimeMillis: js.UndefOr[String] = js.native
  /**
    * The type of a bucket signifies how the data aggregation is performed in
    * the bucket.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaAggregateBucket {
  @scala.inline
  def apply(): SchemaAggregateBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAggregateBucket]
  }
  @scala.inline
  implicit class SchemaAggregateBucketOps[Self <: SchemaAggregateBucket] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activity")(js.undefined)
        ret
    }
    @scala.inline
    def withDataset(value: js.Array[SchemaDataset]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataset")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTimeMillis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTimeMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTimeMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTimeMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withSession(value: SchemaSession): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTimeMillis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimeMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTimeMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimeMillis")(js.undefined)
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
  }
  
}

