package typingsSlinky.openfin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logMod {
  
  @js.native
  trait GetLogRequestType extends StObject {
    
    var endFile: js.UndefOr[String] = js.native
    
    var name: String = js.native
    
    var sizeLimit: js.UndefOr[Double] = js.native
  }
  object GetLogRequestType {
    
    @scala.inline
    def apply(name: String): GetLogRequestType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetLogRequestType]
    }
    
    @scala.inline
    implicit class GetLogRequestTypeMutableBuilder[Self <: GetLogRequestType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndFile(value: String): Self = StObject.set(x, "endFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndFileUndefined: Self = StObject.set(x, "endFile", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeLimit(value: Double): Self = StObject.set(x, "sizeLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeLimitUndefined: Self = StObject.set(x, "sizeLimit", js.undefined)
    }
  }
  
  @js.native
  trait LogInfo extends StObject {
    
    var date: String = js.native
    
    var name: String = js.native
    
    var size: Double = js.native
  }
  object LogInfo {
    
    @scala.inline
    def apply(date: String, name: String, size: Double): LogInfo = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogInfo]
    }
    
    @scala.inline
    implicit class LogInfoMutableBuilder[Self <: LogInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.openfin.openfinStrings.verbose
    - typingsSlinky.openfin.openfinStrings.info
    - typingsSlinky.openfin.openfinStrings.warning
    - typingsSlinky.openfin.openfinStrings.error
    - typingsSlinky.openfin.openfinStrings.fatal
  */
  trait LogLevel extends StObject
  object LogLevel {
    
    @scala.inline
    def error: typingsSlinky.openfin.openfinStrings.error = "error".asInstanceOf[typingsSlinky.openfin.openfinStrings.error]
    
    @scala.inline
    def fatal: typingsSlinky.openfin.openfinStrings.fatal = "fatal".asInstanceOf[typingsSlinky.openfin.openfinStrings.fatal]
    
    @scala.inline
    def info: typingsSlinky.openfin.openfinStrings.info = "info".asInstanceOf[typingsSlinky.openfin.openfinStrings.info]
    
    @scala.inline
    def verbose: typingsSlinky.openfin.openfinStrings.verbose = "verbose".asInstanceOf[typingsSlinky.openfin.openfinStrings.verbose]
    
    @scala.inline
    def warning: typingsSlinky.openfin.openfinStrings.warning = "warning".asInstanceOf[typingsSlinky.openfin.openfinStrings.warning]
  }
}
