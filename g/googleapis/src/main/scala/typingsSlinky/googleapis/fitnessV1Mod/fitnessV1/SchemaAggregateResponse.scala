package typingsSlinky.googleapis.fitnessV1Mod.fitnessV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAggregateResponse extends js.Object {
  /**
    * A list of buckets containing the aggregated data.
    */
  var bucket: js.UndefOr[js.Array[SchemaAggregateBucket]] = js.native
}

object SchemaAggregateResponse {
  @scala.inline
  def apply(): SchemaAggregateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAggregateResponse]
  }
  @scala.inline
  implicit class SchemaAggregateResponseOps[Self <: SchemaAggregateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucket(value: js.Array[SchemaAggregateBucket]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucket")(js.undefined)
        ret
    }
  }
  
}

