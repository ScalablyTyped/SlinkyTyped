package typingsSlinky.oracleOraclejet.ojdataproviderMod

import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainsKeysResults[K] extends js.Object {
  var containsParameters: FetchByKeysParameters[K] = js.native
  var results: Set[K] = js.native
}

object ContainsKeysResults {
  @scala.inline
  def apply[K](containsParameters: FetchByKeysParameters[K], results: Set[K]): ContainsKeysResults[K] = {
    val __obj = js.Dynamic.literal(containsParameters = containsParameters.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainsKeysResults[K]]
  }
  @scala.inline
  implicit class ContainsKeysResultsOps[Self[k] <: ContainsKeysResults[k], K] (val x: Self[K]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[K] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[K] with Other]
    @scala.inline
    def withContainsParameters(value: FetchByKeysParameters[K]): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResults(value: Set[K]): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

