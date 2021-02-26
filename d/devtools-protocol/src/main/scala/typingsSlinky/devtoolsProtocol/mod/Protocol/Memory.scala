package typingsSlinky.devtoolsProtocol.mod.Protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Memory {
  
  @js.native
  trait GetAllTimeSamplingProfileResponse extends StObject {
    
    var profile: SamplingProfile = js.native
  }
  object GetAllTimeSamplingProfileResponse {
    
    @scala.inline
    def apply(profile: SamplingProfile): GetAllTimeSamplingProfileResponse = {
      val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAllTimeSamplingProfileResponse]
    }
    
    @scala.inline
    implicit class GetAllTimeSamplingProfileResponseMutableBuilder[Self <: GetAllTimeSamplingProfileResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProfile(value: SamplingProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetBrowserSamplingProfileResponse extends StObject {
    
    var profile: SamplingProfile = js.native
  }
  object GetBrowserSamplingProfileResponse {
    
    @scala.inline
    def apply(profile: SamplingProfile): GetBrowserSamplingProfileResponse = {
      val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBrowserSamplingProfileResponse]
    }
    
    @scala.inline
    implicit class GetBrowserSamplingProfileResponseMutableBuilder[Self <: GetBrowserSamplingProfileResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProfile(value: SamplingProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetDOMCountersResponse extends StObject {
    
    var documents: integer = js.native
    
    var jsEventListeners: integer = js.native
    
    var nodes: integer = js.native
  }
  object GetDOMCountersResponse {
    
    @scala.inline
    def apply(documents: integer, jsEventListeners: integer, nodes: integer): GetDOMCountersResponse = {
      val __obj = js.Dynamic.literal(documents = documents.asInstanceOf[js.Any], jsEventListeners = jsEventListeners.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDOMCountersResponse]
    }
    
    @scala.inline
    implicit class GetDOMCountersResponseMutableBuilder[Self <: GetDOMCountersResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDocuments(value: integer): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsEventListeners(value: integer): Self = StObject.set(x, "jsEventListeners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodes(value: integer): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetSamplingProfileResponse extends StObject {
    
    var profile: SamplingProfile = js.native
  }
  object GetSamplingProfileResponse {
    
    @scala.inline
    def apply(profile: SamplingProfile): GetSamplingProfileResponse = {
      val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSamplingProfileResponse]
    }
    
    @scala.inline
    implicit class GetSamplingProfileResponseMutableBuilder[Self <: GetSamplingProfileResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProfile(value: SamplingProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Module extends StObject {
    
    /**
      * Base address where the module is loaded into memory. Encoded as a decimal
      * or hexadecimal (0x prefixed) string.
      */
    var baseAddress: String = js.native
    
    /**
      * Name of the module.
      */
    var name: String = js.native
    
    /**
      * Size of the module in bytes.
      */
    var size: Double = js.native
    
    /**
      * UUID of the module.
      */
    var uuid: String = js.native
  }
  object Module {
    
    @scala.inline
    def apply(baseAddress: String, name: String, size: Double, uuid: String): Module = {
      val __obj = js.Dynamic.literal(baseAddress = baseAddress.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Module]
    }
    
    @scala.inline
    implicit class ModuleMutableBuilder[Self <: Module] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseAddress(value: String): Self = StObject.set(x, "baseAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.moderate
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.critical
  */
  trait PressureLevel extends StObject
  object PressureLevel {
    
    @scala.inline
    def critical: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.critical = "critical".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.critical]
    
    @scala.inline
    def moderate: typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.moderate = "moderate".asInstanceOf[typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.moderate]
  }
  
  @js.native
  trait SamplingProfile extends StObject {
    
    var modules: js.Array[Module] = js.native
    
    var samples: js.Array[SamplingProfileNode] = js.native
  }
  object SamplingProfile {
    
    @scala.inline
    def apply(modules: js.Array[Module], samples: js.Array[SamplingProfileNode]): SamplingProfile = {
      val __obj = js.Dynamic.literal(modules = modules.asInstanceOf[js.Any], samples = samples.asInstanceOf[js.Any])
      __obj.asInstanceOf[SamplingProfile]
    }
    
    @scala.inline
    implicit class SamplingProfileMutableBuilder[Self <: SamplingProfile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModules(value: js.Array[Module]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModulesVarargs(value: Module*): Self = StObject.set(x, "modules", js.Array(value :_*))
      
      @scala.inline
      def setSamples(value: js.Array[SamplingProfileNode]): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSamplesVarargs(value: SamplingProfileNode*): Self = StObject.set(x, "samples", js.Array(value :_*))
    }
  }
  
  @js.native
  trait SamplingProfileNode extends StObject {
    
    /**
      * Size of the sampled allocation.
      */
    var size: Double = js.native
    
    /**
      * Execution stack at the point of allocation.
      */
    var stack: js.Array[String] = js.native
    
    /**
      * Total bytes attributed to this sample.
      */
    var total: Double = js.native
  }
  object SamplingProfileNode {
    
    @scala.inline
    def apply(size: Double, stack: js.Array[String], total: Double): SamplingProfileNode = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[SamplingProfileNode]
    }
    
    @scala.inline
    implicit class SamplingProfileNodeMutableBuilder[Self <: SamplingProfileNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStack(value: js.Array[String]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackVarargs(value: String*): Self = StObject.set(x, "stack", js.Array(value :_*))
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SetPressureNotificationsSuppressedRequest extends StObject {
    
    /**
      * If true, memory pressure notifications will be suppressed.
      */
    var suppressed: Boolean = js.native
  }
  object SetPressureNotificationsSuppressedRequest {
    
    @scala.inline
    def apply(suppressed: Boolean): SetPressureNotificationsSuppressedRequest = {
      val __obj = js.Dynamic.literal(suppressed = suppressed.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetPressureNotificationsSuppressedRequest]
    }
    
    @scala.inline
    implicit class SetPressureNotificationsSuppressedRequestMutableBuilder[Self <: SetPressureNotificationsSuppressedRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSuppressed(value: Boolean): Self = StObject.set(x, "suppressed", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SimulatePressureNotificationRequest extends StObject {
    
    /**
      * Memory pressure level of the notification.
      */
    var level: PressureLevel = js.native
  }
  object SimulatePressureNotificationRequest {
    
    @scala.inline
    def apply(level: PressureLevel): SimulatePressureNotificationRequest = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimulatePressureNotificationRequest]
    }
    
    @scala.inline
    implicit class SimulatePressureNotificationRequestMutableBuilder[Self <: SimulatePressureNotificationRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLevel(value: PressureLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StartSamplingRequest extends StObject {
    
    /**
      * Average number of bytes between samples.
      */
    var samplingInterval: js.UndefOr[integer] = js.native
    
    /**
      * Do not randomize intervals between samples.
      */
    var suppressRandomness: js.UndefOr[Boolean] = js.native
  }
  object StartSamplingRequest {
    
    @scala.inline
    def apply(): StartSamplingRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartSamplingRequest]
    }
    
    @scala.inline
    implicit class StartSamplingRequestMutableBuilder[Self <: StartSamplingRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSamplingInterval(value: integer): Self = StObject.set(x, "samplingInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSamplingIntervalUndefined: Self = StObject.set(x, "samplingInterval", js.undefined)
      
      @scala.inline
      def setSuppressRandomness(value: Boolean): Self = StObject.set(x, "suppressRandomness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressRandomnessUndefined: Self = StObject.set(x, "suppressRandomness", js.undefined)
    }
  }
}
