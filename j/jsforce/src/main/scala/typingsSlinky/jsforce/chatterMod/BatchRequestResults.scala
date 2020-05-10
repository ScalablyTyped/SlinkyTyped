package typingsSlinky.jsforce.chatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchRequestResults extends js.Object {
  var hasError: Boolean = js.native
  var results: js.Array[BatchRequestResult] = js.native
}

object BatchRequestResults {
  @scala.inline
  def apply(hasError: Boolean, results: js.Array[BatchRequestResult]): BatchRequestResults = {
    val __obj = js.Dynamic.literal(hasError = hasError.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchRequestResults]
  }
  @scala.inline
  implicit class BatchRequestResultsOps[Self <: BatchRequestResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResults(value: js.Array[BatchRequestResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

