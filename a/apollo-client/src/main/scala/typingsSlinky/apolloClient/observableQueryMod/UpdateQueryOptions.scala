package typingsSlinky.apolloClient.observableQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class UpdateQueryOptionsOps[Self <: UpdateQueryOptions[_], TVariables] (val x: Self with UpdateQueryOptions[TVariables]) extends AnyVal {
    
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
    def setVariables(value: TVariables): Self = this.set("variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
}
