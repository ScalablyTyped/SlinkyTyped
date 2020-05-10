package typingsSlinky.oracleOraclejet.ojdataproviderMod

import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchByKeysResults[K, D] extends js.Object {
  var fetchParameters: FetchByKeysParameters[K] = js.native
  var results: Map[K, Item[K, D]] = js.native
}

object FetchByKeysResults {
  @scala.inline
  def apply[K, D](fetchParameters: FetchByKeysParameters[K], results: Map[K, Item[K, D]]): FetchByKeysResults[K, D] = {
    val __obj = js.Dynamic.literal(fetchParameters = fetchParameters.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchByKeysResults[K, D]]
  }
  @scala.inline
  implicit class FetchByKeysResultsOps[Self[k, d] <: FetchByKeysResults[k, d], K, D] (val x: Self[K, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, D]) with Other]
    @scala.inline
    def withFetchParameters(value: FetchByKeysParameters[K]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResults(value: Map[K, Item[K, D]]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

