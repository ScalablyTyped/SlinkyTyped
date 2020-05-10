package typingsSlinky.gapiClientFitness.gapi.client.fitness

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AggregateResponse extends js.Object {
  /** A list of buckets containing the aggregated data. */
  var bucket: js.UndefOr[js.Array[AggregateBucket]] = js.native
}

object AggregateResponse {
  @scala.inline
  def apply(): AggregateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregateResponse]
  }
  @scala.inline
  implicit class AggregateResponseOps[Self <: AggregateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucket(value: js.Array[AggregateBucket]): Self = {
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

