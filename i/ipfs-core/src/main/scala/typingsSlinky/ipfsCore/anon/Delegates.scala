package typingsSlinky.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Delegates extends js.Object {
  
  var API: String = js.native
  
  var Delegates: js.Array[String] = js.native
  
  var Gateway: String = js.native
  
  var Swarm: js.Array[String] = js.native
}
object Delegates {
  
  @scala.inline
  def apply(API: String, Delegates: js.Array[String], Gateway: String, Swarm: js.Array[String]): Delegates = {
    val __obj = js.Dynamic.literal(API = API.asInstanceOf[js.Any], Delegates = Delegates.asInstanceOf[js.Any], Gateway = Gateway.asInstanceOf[js.Any], Swarm = Swarm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delegates]
  }
  
  @scala.inline
  implicit class DelegatesOps[Self <: Delegates] (val x: Self) extends AnyVal {
    
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
    def setAPI(value: String): Self = this.set("API", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelegatesVarargs(value: String*): Self = this.set("Delegates", js.Array(value :_*))
    
    @scala.inline
    def setDelegates(value: js.Array[String]): Self = this.set("Delegates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGateway(value: String): Self = this.set("Gateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwarmVarargs(value: String*): Self = this.set("Swarm", js.Array(value :_*))
    
    @scala.inline
    def setSwarm(value: js.Array[String]): Self = this.set("Swarm", value.asInstanceOf[js.Any])
  }
}
