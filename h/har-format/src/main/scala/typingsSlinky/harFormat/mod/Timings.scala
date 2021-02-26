package typingsSlinky.harFormat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Timings extends StObject {
  
  /**
    * Time spent in a queue waiting for a network connection.
    *
    * Use `-1` if the timing does not apply to the current request.
    */
  var blocked: js.UndefOr[Double] = js.native
  
  /**  A comment provided by the user or the application */
  var comment: js.UndefOr[String] = js.native
  
  /**
    * Time required to create TCP connection.
    *
    * Use `-1` if the timing does not apply to the current request.
    */
  var connect: js.UndefOr[Double] = js.native
  
  /**
    * DNS resolution time. The time required to resolve a host name.
    *
    * Use `-1` if the timing does not apply to the current request.
    */
  var dns: js.UndefOr[Double] = js.native
  
  /**
    * Time required to read entire response from the server (or cache).
    *
    * _Not optional and must have non-negative values._
    */
  var receive: Double = js.native
  
  /**
    * Time required to send HTTP request to the server.
    *
    * _Not optional and must have non-negative values._
    */
  var send: js.UndefOr[Double] = js.native
  
  /**
    * Time required for SSL/TLS negotiation.
    *
    * If this field is defined then the time is also included in the connect
    * field (to ensure backward compatibility with HAR 1.1).
    *
    * Use `-1` if the timing does not apply to the current request.
    */
  var ssl: js.UndefOr[Double] = js.native
  
  /**
    * Waiting for a response from the server.
    *
    * _Not optional and must have non-negative values._
    */
  @JSName("wait")
  var wait_FTimings: Double = js.native
}
object Timings {
  
  @scala.inline
  def apply(receive: Double, wait_ : Double): Timings = {
    val __obj = js.Dynamic.literal(receive = receive.asInstanceOf[js.Any])
    __obj.updateDynamic("wait")(wait_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timings]
  }
  
  @scala.inline
  implicit class TimingsMutableBuilder[Self <: Timings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlocked(value: Double): Self = StObject.set(x, "blocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockedUndefined: Self = StObject.set(x, "blocked", js.undefined)
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setConnect(value: Double): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
    
    @scala.inline
    def setDns(value: Double): Self = StObject.set(x, "dns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsUndefined: Self = StObject.set(x, "dns", js.undefined)
    
    @scala.inline
    def setReceive(value: Double): Self = StObject.set(x, "receive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSend(value: Double): Self = StObject.set(x, "send", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendUndefined: Self = StObject.set(x, "send", js.undefined)
    
    @scala.inline
    def setSsl(value: Double): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
    
    @scala.inline
    def setWait_(value: Double): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
  }
}
