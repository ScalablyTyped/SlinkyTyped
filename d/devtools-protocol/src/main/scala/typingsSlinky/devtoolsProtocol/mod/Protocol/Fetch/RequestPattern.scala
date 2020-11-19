package typingsSlinky.devtoolsProtocol.mod.Protocol.Fetch

import typingsSlinky.devtoolsProtocol.mod.Protocol.Network.ResourceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestPattern extends js.Object {
  
  /**
    * Stage at wich to begin intercepting requests. Default is Request.
    */
  var requestStage: js.UndefOr[RequestStage] = js.native
  
  /**
    * If set, only requests for matching resource types will be intercepted.
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  
  /**
    * Wildcards ('*' -> zero or more, '?' -> exactly one) are allowed. Escape character is
    * backslash. Omitting is equivalent to "*".
    */
  var urlPattern: js.UndefOr[String] = js.native
}
object RequestPattern {
  
  @scala.inline
  def apply(): RequestPattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestPattern]
  }
  
  @scala.inline
  implicit class RequestPatternOps[Self <: RequestPattern] (val x: Self) extends AnyVal {
    
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
    def setRequestStage(value: RequestStage): Self = this.set("requestStage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestStage: Self = this.set("requestStage", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
    
    @scala.inline
    def setUrlPattern(value: String): Self = this.set("urlPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlPattern: Self = this.set("urlPattern", js.undefined)
  }
}
