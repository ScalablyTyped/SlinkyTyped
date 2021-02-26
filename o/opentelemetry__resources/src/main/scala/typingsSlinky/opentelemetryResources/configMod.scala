package typingsSlinky.opentelemetryResources

import typingsSlinky.opentelemetryApi.loggerMod.Logger
import typingsSlinky.opentelemetryResources.typesMod.Detector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  @js.native
  trait ResourceDetectionConfig extends StObject {
    
    var detectors: js.UndefOr[js.Array[Detector]] = js.native
    
    /** Optional Logger. */
    var logger: js.UndefOr[Logger] = js.native
  }
  object ResourceDetectionConfig {
    
    @scala.inline
    def apply(): ResourceDetectionConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResourceDetectionConfig]
    }
    
    @scala.inline
    implicit class ResourceDetectionConfigMutableBuilder[Self <: ResourceDetectionConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetectors(value: js.Array[Detector]): Self = StObject.set(x, "detectors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetectorsUndefined: Self = StObject.set(x, "detectors", js.undefined)
      
      @scala.inline
      def setDetectorsVarargs(value: Detector*): Self = StObject.set(x, "detectors", js.Array(value :_*))
      
      @scala.inline
      def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    }
  }
  
  @js.native
  trait ResourceDetectionConfigWithLogger extends ResourceDetectionConfig {
    
    /** Required Logger */
    @JSName("logger")
    var logger_ResourceDetectionConfigWithLogger: Logger = js.native
  }
  object ResourceDetectionConfigWithLogger {
    
    @scala.inline
    def apply(logger: Logger): ResourceDetectionConfigWithLogger = {
      val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceDetectionConfigWithLogger]
    }
    
    @scala.inline
    implicit class ResourceDetectionConfigWithLoggerMutableBuilder[Self <: ResourceDetectionConfigWithLogger] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    }
  }
}
