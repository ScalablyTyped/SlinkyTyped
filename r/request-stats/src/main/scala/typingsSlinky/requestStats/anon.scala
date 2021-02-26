package typingsSlinky.requestStats

import typingsSlinky.node.httpMod.IncomingHttpHeaders
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.OutgoingHttpHeaders
import typingsSlinky.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Bytes extends StObject {
    
    /**
      * Number of bytes sent by the client
      */
    var bytes: Double = js.native
    
    /**
      * The headers sent by the client
      */
    var headers: IncomingHttpHeaders = js.native
    
    /**
      * The remote ip
      */
    var ip: String = js.native
    
    /**
      * The HTTP method used by the client
      */
    var method: String = js.native
    
    /**
      * The path part of the request URL
      */
    var path: String = js.native
    
    /**
      * The original `http.IncomingMessage` object
      */
    var raw: IncomingMessage = js.native
  }
  object Bytes {
    
    @scala.inline
    def apply(
      bytes: Double,
      headers: IncomingHttpHeaders,
      ip: String,
      method: String,
      path: String,
      raw: IncomingMessage
    ): Bytes = {
      val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bytes]
    }
    
    @scala.inline
    implicit class BytesMutableBuilder[Self <: Bytes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBytes(value: Double): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRaw(value: IncomingMessage): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BytesDelta extends StObject {
    
    /**
      * Total bytes received
      */
    var bytes: Double = js.native
    
    /**
      * Bytes received since previous call to `.progress()`
      */
    var bytesDelta: Double = js.native
    
    /**
      * If the request contains a Content-Size header
      */
    var bytesLeft: Double = js.native
    
    /**
      * Bytes per second calculated since previous call to `.progress()`
      */
    var speed: Double = js.native
    
    /**
      * If the request contains a Content-Size header
      */
    var timeLeft: Double = js.native
  }
  object BytesDelta {
    
    @scala.inline
    def apply(bytes: Double, bytesDelta: Double, bytesLeft: Double, speed: Double, timeLeft: Double): BytesDelta = {
      val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], bytesDelta = bytesDelta.asInstanceOf[js.Any], bytesLeft = bytesLeft.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], timeLeft = timeLeft.asInstanceOf[js.Any])
      __obj.asInstanceOf[BytesDelta]
    }
    
    @scala.inline
    implicit class BytesDeltaMutableBuilder[Self <: BytesDelta] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBytes(value: Double): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBytesDelta(value: Double): Self = StObject.set(x, "bytesDelta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBytesLeft(value: Double): Self = StObject.set(x, "bytesLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeLeft(value: Double): Self = StObject.set(x, "timeLeft", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Headers extends StObject {
    
    /**
      * Number of bytes sent back to the client
      */
    var bytes: Double = js.native
    
    /**
      * The headers sent back to the client
      */
    var headers: OutgoingHttpHeaders = js.native
    
    /**
      * The original `http.ServerResponse` object
      */
    var raw: ServerResponse = js.native
    
    /**
      * The HTTP status code returned to the client
      */
    var status: Double = js.native
  }
  object Headers {
    
    @scala.inline
    def apply(bytes: Double, headers: OutgoingHttpHeaders, raw: ServerResponse, status: Double): Headers = {
      val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Headers]
    }
    
    @scala.inline
    implicit class HeadersMutableBuilder[Self <: Headers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBytes(value: Double): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRaw(value: ServerResponse): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Speed extends StObject {
    
    /**
      * Total bytes send back to the client
      */
    var bytes: Double = js.native
    
    /**
      * Bytes sent back to the client since previous call to `.progress()`
      */
    var bytesDelta: Double = js.native
    
    /**
      * Bytes per second calculated since previous call to `.progress()`
      */
    var speed: Double = js.native
  }
  object Speed {
    
    @scala.inline
    def apply(bytes: Double, bytesDelta: Double, speed: Double): Speed = {
      val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], bytesDelta = bytesDelta.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any])
      __obj.asInstanceOf[Speed]
    }
    
    @scala.inline
    implicit class SpeedMutableBuilder[Self <: Speed] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBytes(value: Double): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBytesDelta(value: Double): Self = StObject.set(x, "bytesDelta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    }
  }
}
