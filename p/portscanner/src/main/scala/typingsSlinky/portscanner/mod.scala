package typingsSlinky.portscanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("portscanner", "checkPortStatus")
  @js.native
  def checkPortStatus(port: Double): js.Promise[Status] = js.native
  @JSImport("portscanner", "checkPortStatus")
  @js.native
  def checkPortStatus(port: Double, checkPortCallback: StatusCallback): Unit = js.native
  @JSImport("portscanner", "checkPortStatus")
  @js.native
  def checkPortStatus(port: Double, host: String): js.Promise[Status] = js.native
  @JSImport("portscanner", "checkPortStatus")
  @js.native
  def checkPortStatus(port: Double, host: String, checkPortCallback: StatusCallback): Unit = js.native
  @JSImport("portscanner", "checkPortStatus")
  @js.native
  def checkPortStatus(port: Double, host: String, opts: Options): js.Promise[Status] = js.native
  @JSImport("portscanner", "checkPortStatus")
  @js.native
  def checkPortStatus(port: Double, host: String, opts: Options, checkPortCallback: StatusCallback): Unit = js.native
  @JSImport("portscanner", "checkPortStatus")
  @js.native
  def checkPortStatus(port: Double, opts: Options): js.Promise[Status] = js.native
  @JSImport("portscanner", "checkPortStatus")
  @js.native
  def checkPortStatus(port: Double, opts: Options, checkPortCallback: StatusCallback): Unit = js.native
  
  @JSImport("portscanner", "findAPortInUse")
  @js.native
  def findAPortInUse(portList: js.Array[Double]): js.Promise[Double] = js.native
  @JSImport("portscanner", "findAPortInUse")
  @js.native
  def findAPortInUse(portList: js.Array[Double], findPortCallback: PortCallback): Unit = js.native
  @JSImport("portscanner", "findAPortInUse")
  @js.native
  def findAPortInUse(portList: js.Array[Double], host: String): js.Promise[Double] = js.native
  @JSImport("portscanner", "findAPortInUse")
  @js.native
  def findAPortInUse(startPort: Double): js.Promise[Double] = js.native
  @JSImport("portscanner", "findAPortInUse")
  @js.native
  def findAPortInUse(startPort: Double, endPort: Double): js.Promise[Double] = js.native
  @JSImport("portscanner", "findAPortInUse")
  @js.native
  def findAPortInUse(startPort: Double, endPort: Double, findPortCallback: PortCallback): Unit = js.native
  @JSImport("portscanner", "findAPortInUse")
  @js.native
  def findAPortInUse(startPort: Double, endPort: Double, host: String): js.Promise[Double] = js.native
  @JSImport("portscanner", "findAPortInUse")
  @js.native
  def findAPortInUse(startPort: Double, endPort: Double, host: String, findPortCallback: PortCallback): Unit = js.native
  @JSImport("portscanner", "findAPortInUse")
  @js.native
  def findAPortInUse(startPort: Double, findPortCallback: PortCallback): Unit = js.native
  @JSImport("portscanner", "findAPortInUse")
  @js.native
  def findAPortInUse(startPort: Double, host: String): js.Promise[Double] = js.native
  
  @JSImport("portscanner", "findAPortNotInUse")
  @js.native
  def findAPortNotInUse(portList: js.Array[Double]): js.Promise[Double] = js.native
  @JSImport("portscanner", "findAPortNotInUse")
  @js.native
  def findAPortNotInUse(portList: js.Array[Double], findPortCallback: PortCallback): Unit = js.native
  @JSImport("portscanner", "findAPortNotInUse")
  @js.native
  def findAPortNotInUse(portList: js.Array[Double], host: String): js.Promise[Double] = js.native
  @JSImport("portscanner", "findAPortNotInUse")
  @js.native
  def findAPortNotInUse(startPort: Double): js.Promise[Double] = js.native
  @JSImport("portscanner", "findAPortNotInUse")
  @js.native
  def findAPortNotInUse(startPort: Double, endPort: Double): js.Promise[Double] = js.native
  @JSImport("portscanner", "findAPortNotInUse")
  @js.native
  def findAPortNotInUse(startPort: Double, endPort: Double, findPortCallback: PortCallback): Unit = js.native
  @JSImport("portscanner", "findAPortNotInUse")
  @js.native
  def findAPortNotInUse(startPort: Double, endPort: Double, host: String): js.Promise[Double] = js.native
  @JSImport("portscanner", "findAPortNotInUse")
  @js.native
  def findAPortNotInUse(startPort: Double, endPort: Double, host: String, findPortCallback: PortCallback): Unit = js.native
  @JSImport("portscanner", "findAPortNotInUse")
  @js.native
  def findAPortNotInUse(startPort: Double, findPortCallback: PortCallback): Unit = js.native
  @JSImport("portscanner", "findAPortNotInUse")
  @js.native
  def findAPortNotInUse(startPort: Double, host: String): js.Promise[Double] = js.native
  
  @js.native
  trait Options extends StObject {
    
    var host: js.UndefOr[String] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  type PortCallback = js.Function2[/* error */ js.Error | Null, /* port */ Double, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.portscanner.portscannerStrings.open
    - typingsSlinky.portscanner.portscannerStrings.closed
  */
  trait Status extends StObject
  object Status {
    
    @scala.inline
    def closed: typingsSlinky.portscanner.portscannerStrings.closed = "closed".asInstanceOf[typingsSlinky.portscanner.portscannerStrings.closed]
    
    @scala.inline
    def open: typingsSlinky.portscanner.portscannerStrings.open = "open".asInstanceOf[typingsSlinky.portscanner.portscannerStrings.open]
  }
  
  type StatusCallback = js.Function2[/* error */ js.Error | Null, /* port */ Status, Unit]
}
