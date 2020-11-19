package typingsSlinky.anyproxy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("anyproxy", "utils")
@js.native
object utils extends js.Object {
  
  /** Manage certificates of AnyProxy. */
  @js.native
  object certMgr extends js.Object {
    
    /** Generate a rootCA */
    def generateRootCA(callback: js.Function2[/* err */ js.Error, /* keyPath */ String, Unit]): Unit = js.native
    
    /** Detect if AnyProx rootCA exists */
    def ifRootCAFileExists(): Boolean = js.native
  }
  
  /** Manage the system proxy config. sudo password may be required. */
  @js.native
  object systemProxyMgr extends js.Object {
    
    /** Disable global system proxy. sudo password may be required. */
    def disableGlobalProxy(): Unit = js.native
    def disableGlobalProxy(networkType: NetworkType): Unit = js.native
    
    /** Enable global system proxy with specified params. sudo password may be required. */
    def enableGlobalProxy(host: String, port: String): Unit = js.native
    def enableGlobalProxy(host: String, port: String, networkType: NetworkType): Unit = js.native
    def enableGlobalProxy(host: String, port: Double): Unit = js.native
    def enableGlobalProxy(host: String, port: Double, networkType: NetworkType): Unit = js.native
  }
}
