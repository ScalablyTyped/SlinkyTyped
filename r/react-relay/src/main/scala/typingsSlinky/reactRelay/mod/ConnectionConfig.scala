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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionConfig[Props] extends js.Object {
  
  var direction: js.UndefOr[backward | forward] = js.native
  
  var getConnectionFromProps: js.UndefOr[js.Function1[/* props */ Props, js.UndefOr[ConnectionData | Null]]] = js.native
  
  var getFragmentVariables: js.UndefOr[js.Function2[/* prevVars */ Variables, /* totalCount */ Double, Variables]] = js.native
  
  def getVariables(props: Props, paginationInfo: Count, fragmentVariables: Variables): Variables = js.native
  
  var query: GraphQLTaggedNode = js.native
}
object ConnectionConfig {
  
  @scala.inline
  def apply[Props](getVariables: (Props, Count, Variables) => Variables, query: GraphQLTaggedNode): ConnectionConfig[Props] = {
    val __obj = js.Dynamic.literal(getVariables = js.Any.fromFunction3(getVariables), query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionConfig[Props]]
  }
  
  @scala.inline
  implicit class ConnectionConfigOps[Self <: ConnectionConfig[_], Props] (val x: Self with ConnectionConfig[Props]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetVariables(value: (Props, Count, Variables) => Variables): Self = this.set("getVariables", js.Any.fromFunction3(value))
    
    @scala.inline
    def setQueryFunction0(value: () => ReaderFragment | ConcreteRequest): Self = this.set("query", js.Any.fromFunction0(value))
    
    @scala.inline
    def setQuery(value: GraphQLTaggedNode): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection(value: backward | forward): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setGetConnectionFromProps(value: /* props */ Props => js.UndefOr[ConnectionData | Null]): Self = this.set("getConnectionFromProps", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetConnectionFromProps: Self = this.set("getConnectionFromProps", js.undefined)
    
    @scala.inline
    def setGetFragmentVariables(value: (/* prevVars */ Variables, /* totalCount */ Double) => Variables): Self = this.set("getFragmentVariables", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetFragmentVariables: Self = this.set("getFragmentVariables", js.undefined)
  }
}
