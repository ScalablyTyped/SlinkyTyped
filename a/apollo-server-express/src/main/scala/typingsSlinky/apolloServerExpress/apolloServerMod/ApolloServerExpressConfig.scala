package typingsSlinky.apolloServerExpress.apolloServerMod

import typingsSlinky.apolloServerCore.typesMod.Config
import typingsSlinky.apolloServerCore.typesMod.Context
import typingsSlinky.apolloServerCore.typesMod.ContextFunction
import typingsSlinky.apolloServerTypes.mod.ValueOrPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApolloServerExpressConfig extends Config {
  @JSName("context")
  var context_ApolloServerExpressConfig: js.UndefOr[(ContextFunction[ExpressContext, Context[js.Object]]) | Context[js.Object]] = js.native
}

object ApolloServerExpressConfig {
  @scala.inline
  def apply(): ApolloServerExpressConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApolloServerExpressConfig]
  }
  @scala.inline
  implicit class ApolloServerExpressConfigOps[Self <: ApolloServerExpressConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContextFunction1(value: ExpressContext => ValueOrPromise[Context[Context[js.Object]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContext(value: (ContextFunction[ExpressContext, Context[js.Object]]) | Context[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
  }
  
}

