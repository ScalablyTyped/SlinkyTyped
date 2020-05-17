package typingsSlinky.nodeGcm.mod

import typingsSlinky.nodeGcm.anon.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResponseBody extends js.Object {
  var canonical_ids: Double = js.native
  var failure: Double = js.native
  var multicast_id: js.UndefOr[Double] = js.native
  var results: js.UndefOr[js.Array[Error]] = js.native
  var success: Double = js.native
}

object IResponseBody {
  @scala.inline
  def apply(canonical_ids: Double, failure: Double, success: Double): IResponseBody = {
    val __obj = js.Dynamic.literal(canonical_ids = canonical_ids.asInstanceOf[js.Any], failure = failure.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResponseBody]
  }
  @scala.inline
  implicit class IResponseBodyOps[Self <: IResponseBody] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanonical_ids(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canonical_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailure(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMulticast_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multicast_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMulticast_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multicast_id")(js.undefined)
        ret
    }
    @scala.inline
    def withResults(value: js.Array[Error]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(js.undefined)
        ret
    }
  }
  
}

