package typingsSlinky.apolloClient.observableQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateQueryOptions[TVariables] extends js.Object {
  var variables: js.UndefOr[TVariables] = js.native
}

object UpdateQueryOptions {
  @scala.inline
  def apply[TVariables](): UpdateQueryOptions[TVariables] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateQueryOptions[TVariables]]
  }
  @scala.inline
  implicit class UpdateQueryOptionsOps[Self[tvariables] <: UpdateQueryOptions[tvariables], TVariables] (val x: Self[TVariables]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TVariables] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TVariables]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TVariables] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TVariables] with Other]
    @scala.inline
    def withVariables(value: TVariables): Self[TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariables: Self[TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(js.undefined)
        ret
    }
  }
  
}

