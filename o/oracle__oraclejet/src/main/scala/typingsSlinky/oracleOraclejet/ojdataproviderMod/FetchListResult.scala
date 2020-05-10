package typingsSlinky.oracleOraclejet.ojdataproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchListResult[K, D] extends js.Object {
  var data: js.Array[D] = js.native
  var fetchParameters: FetchListParameters[D] = js.native
  var metadata: js.Array[ItemMetadata[K]] = js.native
}

object FetchListResult {
  @scala.inline
  def apply[K, D](data: js.Array[D], fetchParameters: FetchListParameters[D], metadata: js.Array[ItemMetadata[K]]): FetchListResult[K, D] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fetchParameters = fetchParameters.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchListResult[K, D]]
  }
  @scala.inline
  implicit class FetchListResultOps[Self[k, d] <: FetchListResult[k, d], K, D] (val x: Self[K, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, D]) with Other]
    @scala.inline
    def withData(value: js.Array[D]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFetchParameters(value: FetchListParameters[D]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: js.Array[ItemMetadata[K]]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

