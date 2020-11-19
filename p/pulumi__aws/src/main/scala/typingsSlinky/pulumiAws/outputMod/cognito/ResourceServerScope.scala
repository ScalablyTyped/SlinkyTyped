package typingsSlinky.pulumiAws.outputMod.cognito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceServerScope extends js.Object {
  
  /**
    * The scope description.
    */
  var scopeDescription: String = js.native
  
  /**
    * The scope name.
    */
  var scopeName: String = js.native
}
object ResourceServerScope {
  
  @scala.inline
  def apply(scopeDescription: String, scopeName: String): ResourceServerScope = {
    val __obj = js.Dynamic.literal(scopeDescription = scopeDescription.asInstanceOf[js.Any], scopeName = scopeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceServerScope]
  }
  
  @scala.inline
  implicit class ResourceServerScopeOps[Self <: ResourceServerScope] (val x: Self) extends AnyVal {
    
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
    def setScopeDescription(value: String): Self = this.set("scopeDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeName(value: String): Self = this.set("scopeName", value.asInstanceOf[js.Any])
  }
}
