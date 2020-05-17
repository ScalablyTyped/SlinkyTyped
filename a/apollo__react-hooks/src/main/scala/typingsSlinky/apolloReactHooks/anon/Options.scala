package typingsSlinky.apolloReactHooks.anon

import typingsSlinky.apolloReactCommon.apolloContextMod.ApolloContextValue
import typingsSlinky.apolloReactHooks.typesMod.SubscriptionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[TData, TVariables] extends js.Object {
  var context: ApolloContextValue = js.native
  var options: SubscriptionOptions[TData, TVariables] = js.native
  var setResult: js.Any = js.native
}

object Options {
  @scala.inline
  def apply[TData, TVariables](context: ApolloContextValue, options: SubscriptionOptions[TData, TVariables], setResult: js.Any): Options[TData, TVariables] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], setResult = setResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[TData, TVariables]]
  }
  @scala.inline
  implicit class OptionsOps[Self[tdata, tvariables] <: Options[tdata, tvariables], TData, TVariables] (val x: Self[TData, TVariables]) extends AnyVal {
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
    def withOptions(value: SubscriptionOptions[TData, TVariables]): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetResult(value: js.Any): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setResult")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

