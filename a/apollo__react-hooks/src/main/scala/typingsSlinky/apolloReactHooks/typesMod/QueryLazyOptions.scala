package typingsSlinky.apolloReactHooks.typesMod

import typingsSlinky.apolloReactCommon.typesMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryLazyOptions[TVariables] extends js.Object {
  var context: js.UndefOr[Context] = js.native
  var variables: js.UndefOr[TVariables] = js.native
}

object QueryLazyOptions {
  @scala.inline
  def apply[TVariables](): QueryLazyOptions[TVariables] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryLazyOptions[TVariables]]
  }
  @scala.inline
  implicit class QueryLazyOptionsOps[Self[tvariables] <: QueryLazyOptions[tvariables], TVariables] (val x: Self[TVariables]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TVariables] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TVariables]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TVariables] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TVariables] with Other]
    @scala.inline
    def withContext(value: Context): Self[TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self[TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
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

