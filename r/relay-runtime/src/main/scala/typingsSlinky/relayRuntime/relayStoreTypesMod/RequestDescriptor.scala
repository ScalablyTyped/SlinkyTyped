package typingsSlinky.relayRuntime.relayStoreTypesMod

import typingsSlinky.relayRuntime.getRequestIdentifierMod.RequestIdentifier
import typingsSlinky.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.CacheConfig
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestDescriptor extends js.Object {
  
  val cacheConfig: CacheConfig | Null = js.native
  
  val identifier: RequestIdentifier = js.native
  
  val node: ConcreteRequest = js.native
  
  val variables: Variables = js.native
}
object RequestDescriptor {
  
  @scala.inline
  def apply(identifier: RequestIdentifier, node: ConcreteRequest, variables: Variables): RequestDescriptor = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDescriptor]
  }
  
  @scala.inline
  implicit class RequestDescriptorOps[Self <: RequestDescriptor] (val x: Self) extends AnyVal {
    
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
    def setIdentifier(value: RequestIdentifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: ConcreteRequest): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariables(value: Variables): Self = this.set("variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheConfig(value: CacheConfig): Self = this.set("cacheConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheConfigNull: Self = this.set("cacheConfig", null)
  }
}
