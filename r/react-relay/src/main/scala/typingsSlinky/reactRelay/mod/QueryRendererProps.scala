package typingsSlinky.reactRelay.mod

import slinky.core.TagMod
import typingsSlinky.reactRelay.anon.Error
import typingsSlinky.relayRuntime.readerNodeMod.ReaderFragment
import typingsSlinky.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typingsSlinky.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryRendererProps[TOperation /* <: OperationType */] extends js.Object {
  var environment: typingsSlinky.relayRuntime.relayStoreTypesMod.Environment = js.native
  var query: js.UndefOr[GraphQLTaggedNode | Null] = js.native
  var variables: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['variables'] */ js.Any = js.native
  def render(renderProps: Error[TOperation]): TagMod[Any] = js.native
}

object QueryRendererProps {
  @scala.inline
  def apply[TOperation](
    environment: typingsSlinky.relayRuntime.relayStoreTypesMod.Environment,
    render: Error[TOperation] => TagMod[Any],
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['variables'] */ js.Any
  ): QueryRendererProps[TOperation] = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], render = js.Any.fromFunction1(render), variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryRendererProps[TOperation]]
  }
  @scala.inline
  implicit class QueryRendererPropsOps[Self[toperation] <: QueryRendererProps[toperation], TOperation] (val x: Self[TOperation]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TOperation] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TOperation]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TOperation] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TOperation] with Other]
    @scala.inline
    def withEnvironment(value: typingsSlinky.relayRuntime.relayStoreTypesMod.Environment): Self[TOperation] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRender(value: Error[TOperation] => TagMod[Any]): Self[TOperation] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVariables(
      value: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['variables'] */ js.Any
    ): Self[TOperation] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryFunction0(value: () => ReaderFragment | ConcreteRequest): Self[TOperation] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withQuery(value: GraphQLTaggedNode): Self[TOperation] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self[TOperation] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryNull: Self[TOperation] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(null)
        ret
    }
  }
  
}

