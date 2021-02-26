package typingsSlinky.scErrors

import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sc-errors", "AuthTokenError")
  @js.native
  class AuthTokenError protected () extends Error {
    def this(message: String) = this()
  }
  
  @JSImport("sc-errors", "AuthTokenExpiredError")
  @js.native
  class AuthTokenExpiredError protected () extends Error {
    def this(message: String, expiry: js.Date) = this()
    
    var expiry: js.Date = js.native
  }
  
  @JSImport("sc-errors", "AuthTokenInvalidError")
  @js.native
  class AuthTokenInvalidError protected () extends Error {
    def this(message: String) = this()
  }
  
  @JSImport("sc-errors", "AuthTokenNotBeforeError")
  @js.native
  class AuthTokenNotBeforeError protected () extends Error {
    def this(message: String, date: js.Date) = this()
    
    var date: js.Date = js.native
  }
  
  @JSImport("sc-errors", "BadConnectionError")
  @js.native
  class BadConnectionError protected () extends Error {
    def this(message: String, `type`: String) = this()
    
    var `type`: String = js.native
  }
  
  @JSImport("sc-errors", "BrokerError")
  @js.native
  class BrokerError protected () extends Error {
    def this(message: String) = this()
  }
  
  @JSImport("sc-errors", "HTTPServerError")
  @js.native
  class HTTPServerError protected () extends Error {
    def this(message: String) = this()
  }
  
  @JSImport("sc-errors", "InvalidActionError")
  @js.native
  class InvalidActionError protected () extends Error {
    def this(message: String) = this()
  }
  
  @JSImport("sc-errors", "InvalidArgumentsError")
  @js.native
  class InvalidArgumentsError protected () extends Error {
    def this(message: String) = this()
  }
  
  @JSImport("sc-errors", "InvalidMessageError")
  @js.native
  class InvalidMessageError protected () extends Error {
    def this(message: String) = this()
  }
  
  @JSImport("sc-errors", "InvalidOptionsError")
  @js.native
  class InvalidOptionsError protected () extends Error {
    def this(message: String) = this()
  }
  
  @JSImport("sc-errors", "ProcessExitError")
  @js.native
  class ProcessExitError protected () extends Error {
    def this(message: String) = this()
    def this(message: String, code: Double) = this()
    
    var code: js.UndefOr[Double] = js.native
  }
  
  @JSImport("sc-errors", "ResourceLimitError")
  @js.native
  class ResourceLimitError protected () extends Error {
    def this(message: String) = this()
  }
  
  @JSImport("sc-errors", "ServerProtocolError")
  @js.native
  class ServerProtocolError protected () extends Error {
    def this(message: String) = this()
  }
  
  @JSImport("sc-errors", "SilentMiddlewareBlockedError")
  @js.native
  class SilentMiddlewareBlockedError protected () extends Error {
    def this(message: String, `type`: String) = this()
    
    var `type`: String = js.native
  }
  
  @JSImport("sc-errors", "SocketProtocolError")
  @js.native
  class SocketProtocolError protected () extends Error {
    def this(message: String, code: Double) = this()
    
    var code: Double = js.native
  }
  
  @JSImport("sc-errors", "TimeoutError")
  @js.native
  class TimeoutError protected () extends Error {
    def this(message: String) = this()
  }
  
  @JSImport("sc-errors", "UnknownError")
  @js.native
  class UnknownError protected () extends Error {
    def this(message: String) = this()
  }
  
  @JSImport("sc-errors", "decycle")
  @js.native
  def decycle(`object`: js.Any): js.Any = js.native
  
  @JSImport("sc-errors", "dehydrateError")
  @js.native
  def dehydrateError(error: js.Any): DehydratedError = js.native
  @JSImport("sc-errors", "dehydrateError")
  @js.native
  def dehydrateError(error: js.Any, includeStackTrace: Boolean): DehydratedError = js.native
  
  @JSImport("sc-errors", "hydrateError")
  @js.native
  def hydrateError(error: DehydratedError): js.Any = js.native
  
  @JSImport("sc-errors", "socketProtocolErrorStatuses")
  @js.native
  val socketProtocolErrorStatuses: SocketProtocolErrorStatuses_ = js.native
  
  @JSImport("sc-errors", "socketProtocolIgnoreStatuses")
  @js.native
  val socketProtocolIgnoreStatuses: SocketProtocolIgnoreStatuses_ = js.native
  
  type DehydratedError = js.Any
  
  @js.native
  trait SocketProtocolErrorStatuses_ extends StObject {
    
    var `1001`: String = js.native
    
    var `1002`: String = js.native
    
    var `1003`: String = js.native
    
    var `1005`: String = js.native
    
    var `1006`: String = js.native
    
    var `1007`: String = js.native
    
    var `1008`: String = js.native
    
    var `1009`: String = js.native
    
    var `1010`: String = js.native
    
    var `1011`: String = js.native
    
    var `4000`: String = js.native
    
    var `4001`: String = js.native
    
    var `4002`: String = js.native
    
    var `4003`: String = js.native
    
    var `4004`: String = js.native
    
    var `4005`: String = js.native
    
    var `4006`: String = js.native
    
    var `4007`: String = js.native
    
    var `4008`: String = js.native
  }
  object SocketProtocolErrorStatuses_ {
    
    @scala.inline
    def apply(
      `1001`: String,
      `1002`: String,
      `1003`: String,
      `1005`: String,
      `1006`: String,
      `1007`: String,
      `1008`: String,
      `1009`: String,
      `1010`: String,
      `1011`: String,
      `4000`: String,
      `4001`: String,
      `4002`: String,
      `4003`: String,
      `4004`: String,
      `4005`: String,
      `4006`: String,
      `4007`: String,
      `4008`: String
    ): SocketProtocolErrorStatuses_ = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("1001")(`1001`.asInstanceOf[js.Any])
      __obj.updateDynamic("1002")(`1002`.asInstanceOf[js.Any])
      __obj.updateDynamic("1003")(`1003`.asInstanceOf[js.Any])
      __obj.updateDynamic("1005")(`1005`.asInstanceOf[js.Any])
      __obj.updateDynamic("1006")(`1006`.asInstanceOf[js.Any])
      __obj.updateDynamic("1007")(`1007`.asInstanceOf[js.Any])
      __obj.updateDynamic("1008")(`1008`.asInstanceOf[js.Any])
      __obj.updateDynamic("1009")(`1009`.asInstanceOf[js.Any])
      __obj.updateDynamic("1010")(`1010`.asInstanceOf[js.Any])
      __obj.updateDynamic("1011")(`1011`.asInstanceOf[js.Any])
      __obj.updateDynamic("4000")(`4000`.asInstanceOf[js.Any])
      __obj.updateDynamic("4001")(`4001`.asInstanceOf[js.Any])
      __obj.updateDynamic("4002")(`4002`.asInstanceOf[js.Any])
      __obj.updateDynamic("4003")(`4003`.asInstanceOf[js.Any])
      __obj.updateDynamic("4004")(`4004`.asInstanceOf[js.Any])
      __obj.updateDynamic("4005")(`4005`.asInstanceOf[js.Any])
      __obj.updateDynamic("4006")(`4006`.asInstanceOf[js.Any])
      __obj.updateDynamic("4007")(`4007`.asInstanceOf[js.Any])
      __obj.updateDynamic("4008")(`4008`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocketProtocolErrorStatuses_]
    }
    
    @scala.inline
    implicit class SocketProtocolErrorStatuses_MutableBuilder[Self <: SocketProtocolErrorStatuses_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set1001(value: String): Self = StObject.set(x, "1001", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set1002(value: String): Self = StObject.set(x, "1002", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set1003(value: String): Self = StObject.set(x, "1003", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set1005(value: String): Self = StObject.set(x, "1005", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set1006(value: String): Self = StObject.set(x, "1006", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set1007(value: String): Self = StObject.set(x, "1007", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set1008(value: String): Self = StObject.set(x, "1008", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set1009(value: String): Self = StObject.set(x, "1009", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set1010(value: String): Self = StObject.set(x, "1010", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set1011(value: String): Self = StObject.set(x, "1011", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set4000(value: String): Self = StObject.set(x, "4000", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set4001(value: String): Self = StObject.set(x, "4001", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set4002(value: String): Self = StObject.set(x, "4002", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set4003(value: String): Self = StObject.set(x, "4003", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set4004(value: String): Self = StObject.set(x, "4004", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set4005(value: String): Self = StObject.set(x, "4005", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set4006(value: String): Self = StObject.set(x, "4006", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set4007(value: String): Self = StObject.set(x, "4007", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set4008(value: String): Self = StObject.set(x, "4008", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SocketProtocolIgnoreStatuses_ extends StObject {
    
    var `1000`: String = js.native
    
    var `1001`: String = js.native
  }
  object SocketProtocolIgnoreStatuses_ {
    
    @scala.inline
    def apply(`1000`: String, `1001`: String): SocketProtocolIgnoreStatuses_ = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("1000")(`1000`.asInstanceOf[js.Any])
      __obj.updateDynamic("1001")(`1001`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocketProtocolIgnoreStatuses_]
    }
    
    @scala.inline
    implicit class SocketProtocolIgnoreStatuses_MutableBuilder[Self <: SocketProtocolIgnoreStatuses_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set1000(value: String): Self = StObject.set(x, "1000", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set1001(value: String): Self = StObject.set(x, "1001", value.asInstanceOf[js.Any])
    }
  }
}
