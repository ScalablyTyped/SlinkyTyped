package typingsSlinky.netconf

import typingsSlinky.netconf.anon.Action
import typingsSlinky.netconf.anon.Host
import typingsSlinky.netconf.anon.Hostname
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("netconf", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class Client protected () extends js.Object {
    /**
      * Creates a new Client object by passing in the connection parameters. Both password and private key authentication methods are supported
      */
    def this(params: Host) = this()
    
    /**
      * Closes the session
      */
    def close(): Unit = js.native
    def close(callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
    
    /**
      * Commits candidate configuration to device
      */
    def commit(callback: js.Function2[/* err */ js.Any, /* reply */ js.Any, Unit]): Unit = js.native
    
    /**
      * Shows difference between running and candidate-config. Equivalent to "show | compare".
      */
    def compare(callback: js.Function2[/* err */ js.Any, /* diff */ js.Any, Unit]): Unit = js.native
    
    /**
      * Collects some useful information from several RPC calls and presents the results back
      */
    def facts(callback: js.Function2[/* err */ js.Any, /* facts */ Hostname, Unit]): Unit = js.native
    
    /**
      * Loads configuration data into candidate-config using NETCONF. Default options are equivalent to "load merge" and would expect configuration data in JunOS curly-brace format
      */
    def load(args: String, callback: js.Function2[/* err */ js.Any, /* reply */ js.Any, Unit]): Unit = js.native
    def load(args: Action, callback: js.Function2[/* err */ js.Any, /* reply */ js.Any, Unit]): Unit = js.native
    
    /**
      * Opens a session
      */
    def open(callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
    
    /**
      * Discards candidate configuration on device
      */
    def rollback(callback: js.Function2[/* err */ js.Any, /* reply */ js.Any, Unit]): Unit = js.native
    
    /**
      * Sends requests. Requests are sent using the .rpc() method
      */
    def rpc(request: js.Any, callback: js.Function2[/* err */ js.Any, /* reply */ js.Any, Unit]): Unit = js.native
  }
}
