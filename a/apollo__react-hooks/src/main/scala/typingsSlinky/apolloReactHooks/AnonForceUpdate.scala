package typingsSlinky.apolloReactHooks

import typingsSlinky.apolloReactCommon.apolloContextMod.ApolloContextValue
import typingsSlinky.apolloReactHooks.typesMod.QueryOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonForceUpdate[TData, TVariables] extends js.Object {
  var context: ApolloContextValue = js.native
  var forceUpdate: js.Any = js.native
  var options: QueryOptions[TData, TVariables] = js.native
}

object AnonForceUpdate {
  @scala.inline
  def apply[TData, TVariables](context: ApolloContextValue, forceUpdate: js.Any, options: QueryOptions[TData, TVariables]): AnonForceUpdate[TData, TVariables] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], forceUpdate = forceUpdate.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonForceUpdate[TData, TVariables]]
  }
  @scala.inline
  implicit class AnonForceUpdateOps[Self[tdata, tvariables] <: AnonForceUpdate[tdata, tvariables], TData, TVariables] (val x: Self[TData, TVariables]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TData, TVariables] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TData, TVariables]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TData, TVariables]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TData, TVariables]) with Other]
    @scala.inline
    def withContext(value: ApolloContextValue): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForceUpdate(value: js.Any): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: QueryOptions[TData, TVariables]): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

