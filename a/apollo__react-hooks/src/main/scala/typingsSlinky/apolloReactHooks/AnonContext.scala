package typingsSlinky.apolloReactHooks

import typingsSlinky.apolloReactCommon.apolloContextMod.ApolloContextValue
import typingsSlinky.apolloReactCommon.typesMod.MutationResult
import typingsSlinky.apolloReactHooks.typesMod.MutationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContext[TData, TVariables] extends js.Object {
  var context: ApolloContextValue = js.native
  var options: MutationOptions[TData, TVariables] = js.native
  var result: MutationResult[TData] = js.native
  def setResult(result: MutationResult[TData]): js.Any = js.native
}

object AnonContext {
  @scala.inline
  def apply[TData, TVariables](
    context: ApolloContextValue,
    options: MutationOptions[TData, TVariables],
    result: MutationResult[TData],
    setResult: MutationResult[TData] => js.Any
  ): AnonContext[TData, TVariables] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], setResult = js.Any.fromFunction1(setResult))
    __obj.asInstanceOf[AnonContext[TData, TVariables]]
  }
  @scala.inline
  implicit class AnonContextOps[Self[tdata, tvariables] <: AnonContext[tdata, tvariables], TData, TVariables] (val x: Self[TData, TVariables]) extends AnyVal {
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
    def withOptions(value: MutationOptions[TData, TVariables]): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: MutationResult[TData]): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetResult(value: MutationResult[TData] => js.Any): Self[TData, TVariables] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setResult")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

