package typingsSlinky.apolloReactCommon.apolloProviderMod

import slinky.core.facade.ReactElement
import typingsSlinky.apolloClient.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApolloProviderProps[TCache] extends js.Object {
  
  var children: ReactElement | js.Array[ReactElement] | Null = js.native
  
  var client: default[TCache] = js.native
}
object ApolloProviderProps {
  
  @scala.inline
  def apply[TCache](client: default[TCache]): ApolloProviderProps[TCache] = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApolloProviderProps[TCache]]
  }
  
  @scala.inline
  implicit class ApolloProviderPropsOps[Self <: ApolloProviderProps[_], TCache] (val x: Self with ApolloProviderProps[TCache]) extends AnyVal {
    
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
    def setClient(value: default[TCache]): Self = this.set("client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: ReactElement*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: ReactElement | js.Array[ReactElement]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setChildrenNull: Self = this.set("children", null)
  }
}
