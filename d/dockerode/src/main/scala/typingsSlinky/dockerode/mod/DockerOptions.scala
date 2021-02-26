package typingsSlinky.dockerode.mod

import typingsSlinky.dockerode.dockerodeStrings.http
import typingsSlinky.dockerode.dockerodeStrings.https
import typingsSlinky.dockerode.dockerodeStrings.ssh
import typingsSlinky.node.Buffer
import typingsSlinky.std.PromiseConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DockerOptions extends StObject {
  
  var Promise: js.UndefOr[PromiseConstructor] = js.native
  
  var ca: js.UndefOr[String | (js.Array[Buffer | String]) | Buffer] = js.native
  
  var cert: js.UndefOr[String | (js.Array[Buffer | String]) | Buffer] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var key: js.UndefOr[String | (js.Array[Buffer | KeyObject | String]) | Buffer] = js.native
  
  var port: js.UndefOr[Double | String] = js.native
  
  var protocol: js.UndefOr[https | http | ssh] = js.native
  
  var socketPath: js.UndefOr[String] = js.native
  
  var sshAuthAgent: js.UndefOr[String] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var username: js.UndefOr[String] = js.native
  
  var version: js.UndefOr[String] = js.native
}
object DockerOptions {
  
  @scala.inline
  def apply(): DockerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DockerOptions]
  }
  
  @scala.inline
  implicit class DockerOptionsMutableBuilder[Self <: DockerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCa(value: String | (js.Array[Buffer | String]) | Buffer): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
    
    @scala.inline
    def setCaVarargs(value: (Buffer | String)*): Self = StObject.set(x, "ca", js.Array(value :_*))
    
    @scala.inline
    def setCert(value: String | (js.Array[Buffer | String]) | Buffer): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
    
    @scala.inline
    def setCertVarargs(value: (Buffer | String)*): Self = StObject.set(x, "cert", js.Array(value :_*))
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setKey(value: String | (js.Array[Buffer | KeyObject | String]) | Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setKeyVarargs(value: (Buffer | KeyObject | String)*): Self = StObject.set(x, "key", js.Array(value :_*))
    
    @scala.inline
    def setPort(value: Double | String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setPromise(value: PromiseConstructor): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromiseUndefined: Self = StObject.set(x, "Promise", js.undefined)
    
    @scala.inline
    def setProtocol(value: https | http | ssh): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    @scala.inline
    def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
    
    @scala.inline
    def setSshAuthAgent(value: String): Self = StObject.set(x, "sshAuthAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSshAuthAgentUndefined: Self = StObject.set(x, "sshAuthAgent", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
