package typingsSlinky.apolloClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptimisticResponse extends js.Object {
  var mutationId: String = js.native
  var optimisticResponse: js.UndefOr[js.Any] = js.native
}

object OptimisticResponse {
  @scala.inline
  def apply(mutationId: String): OptimisticResponse = {
    val __obj = js.Dynamic.literal(mutationId = mutationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptimisticResponse]
  }
  @scala.inline
  implicit class OptimisticResponseOps[Self <: OptimisticResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMutationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptimisticResponse(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimisticResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimisticResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimisticResponse")(js.undefined)
        ret
    }
  }
  
}

