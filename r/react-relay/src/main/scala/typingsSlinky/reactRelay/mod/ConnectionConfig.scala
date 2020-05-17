package typingsSlinky.reactRelay.mod

import typingsSlinky.reactRelay.anon.Count
import typingsSlinky.reactRelay.reactRelayStrings.backward
import typingsSlinky.reactRelay.reactRelayStrings.forward
import typingsSlinky.relayRuntime.readerNodeMod.ReaderFragment
import typingsSlinky.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typingsSlinky.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionConfig[Props] extends js.Object {
  var direction: js.UndefOr[backward | forward] = js.native
  var getConnectionFromProps: js.UndefOr[js.Function1[/* props */ Props, js.UndefOr[ConnectionData | Null]]] = js.native
  var getFragmentVariables: js.UndefOr[js.Function2[/* prevVars */ Variables, /* totalCount */ Double, Variables]] = js.native
  var query: GraphQLTaggedNode = js.native
  def getVariables(props: Props, paginationInfo: Count, fragmentVariables: Variables): Variables = js.native
}

object ConnectionConfig {
  @scala.inline
  def apply[Props](getVariables: (Props, Count, Variables) => Variables, query: GraphQLTaggedNode): ConnectionConfig[Props] = {
    val __obj = js.Dynamic.literal(getVariables = js.Any.fromFunction3(getVariables), query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionConfig[Props]]
  }
  @scala.inline
  implicit class ConnectionConfigOps[Self[props] <: ConnectionConfig[props], Props] (val x: Self[Props]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Props] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Props]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Props] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Props] with Other]
    @scala.inline
    def withGetVariables(value: (Props, Count, Variables) => Variables): Self[Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVariables")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withQueryFunction0(value: () => ReaderFragment | ConcreteRequest): Self[Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withQuery(value: GraphQLTaggedNode): Self[Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirection(value: backward | forward): Self[Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self[Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withGetConnectionFromProps(value: /* props */ Props => js.UndefOr[ConnectionData | Null]): Self[Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConnectionFromProps")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetConnectionFromProps: Self[Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConnectionFromProps")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFragmentVariables(value: (/* prevVars */ Variables, /* totalCount */ Double) => Variables): Self[Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFragmentVariables")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetFragmentVariables: Self[Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFragmentVariables")(js.undefined)
        ret
    }
  }
  
}

