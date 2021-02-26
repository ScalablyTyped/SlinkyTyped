package typingsSlinky.log4js.mod

import typingsSlinky.log4js.log4jsStrings.master
import typingsSlinky.log4js.log4jsStrings.multiprocess
import typingsSlinky.log4js.log4jsStrings.worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiprocessAppender extends Appender {
  
  // (only needed if mode == master)- the name of the appender to send the log events to
  var appender: js.UndefOr[String] = js.native
  
  // (defaults to localhost) - the host/IP address to listen on, or send to
  var loggerHost: js.UndefOr[String] = js.native
  
  // (defaults to 5000) - the port to listen on, or send to
  var loggerPort: js.UndefOr[Double] = js.native
  
  // controls whether the appender listens for log events sent over the network, or is responsible for serialising events and sending them to a server.
  var mode: master | worker = js.native
  
  var `type`: multiprocess = js.native
}
object MultiprocessAppender {
  
  @scala.inline
  def apply(mode: master | worker, `type`: multiprocess): MultiprocessAppender = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiprocessAppender]
  }
  
  @scala.inline
  implicit class MultiprocessAppenderMutableBuilder[Self <: MultiprocessAppender] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppender(value: String): Self = StObject.set(x, "appender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppenderUndefined: Self = StObject.set(x, "appender", js.undefined)
    
    @scala.inline
    def setLoggerHost(value: String): Self = StObject.set(x, "loggerHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggerHostUndefined: Self = StObject.set(x, "loggerHost", js.undefined)
    
    @scala.inline
    def setLoggerPort(value: Double): Self = StObject.set(x, "loggerPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggerPortUndefined: Self = StObject.set(x, "loggerPort", js.undefined)
    
    @scala.inline
    def setMode(value: master | worker): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: multiprocess): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
