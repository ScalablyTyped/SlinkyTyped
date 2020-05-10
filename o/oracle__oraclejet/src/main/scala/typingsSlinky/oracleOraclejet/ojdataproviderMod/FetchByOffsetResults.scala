package typingsSlinky.oracleOraclejet.ojdataproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchByOffsetResults[K, D] extends js.Object {
  var done: Boolean = js.native
  var fetchParameters: FetchByOffsetParameters[D] = js.native
  var results: js.Array[Item[K, D]] = js.native
}

object FetchByOffsetResults {
  @scala.inline
  def apply[K, D](done: Boolean, fetchParameters: FetchByOffsetParameters[D], results: js.Array[Item[K, D]]): FetchByOffsetResults[K, D] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], fetchParameters = fetchParameters.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchByOffsetResults[K, D]]
  }
  @scala.inline
  implicit class FetchByOffsetResultsOps[Self[k, d] <: FetchByOffsetResults[k, d], K, D] (val x: Self[K, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, D]) with Other]
    @scala.inline
    def withDone(value: Boolean): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFetchParameters(value: FetchByOffsetParameters[D]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResults(value: js.Array[Item[K, D]]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

