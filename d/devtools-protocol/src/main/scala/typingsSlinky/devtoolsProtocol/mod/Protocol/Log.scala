package typingsSlinky.devtoolsProtocol.mod.Protocol

import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.appcache
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.blockedEvent
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.blockedParser
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.deprecation
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.discouragedAPIUse
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.error
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.handler
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.info
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.intervention
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.javascript_
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.longLayout
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.longTask
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.network
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.other_
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.recommendation
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.recurringHandler
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.rendering
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.security
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.storage
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.verbose
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.violation
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.warning
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.worker_
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.xml
import typingsSlinky.devtoolsProtocol.mod.Protocol.Network.RequestId
import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.RemoteObject
import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.StackTrace
import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Log {
  
  @js.native
  trait EntryAddedEvent extends StObject {
    
    /**
      * The entry.
      */
    var entry: LogEntry = js.native
  }
  object EntryAddedEvent {
    
    @scala.inline
    def apply(entry: LogEntry): EntryAddedEvent = {
      val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntryAddedEvent]
    }
    
    @scala.inline
    implicit class EntryAddedEventMutableBuilder[Self <: EntryAddedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntry(value: LogEntry): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LogEntry extends StObject {
    
    /**
      * Call arguments.
      */
    var args: js.UndefOr[js.Array[RemoteObject]] = js.native
    
    /**
      * Log entry severity. (LogEntryLevel enum)
      */
    var level: verbose | info | warning | error = js.native
    
    /**
      * Line number in the resource.
      */
    var lineNumber: js.UndefOr[integer] = js.native
    
    /**
      * Identifier of the network request associated with this entry.
      */
    var networkRequestId: js.UndefOr[RequestId] = js.native
    
    /**
      * Log entry source. (LogEntrySource enum)
      */
    var source: xml | javascript_ | network | storage | appcache | rendering | security | deprecation | worker_ | violation | intervention | recommendation | other_ = js.native
    
    /**
      * JavaScript stack trace.
      */
    var stackTrace: js.UndefOr[StackTrace] = js.native
    
    /**
      * Logged text.
      */
    var text: String = js.native
    
    /**
      * Timestamp when this entry was added.
      */
    var timestamp: Timestamp = js.native
    
    /**
      * URL of the resource if known.
      */
    var url: js.UndefOr[String] = js.native
    
    /**
      * Identifier of the worker associated with this entry.
      */
    var workerId: js.UndefOr[String] = js.native
  }
  object LogEntry {
    
    @scala.inline
    def apply(
      level: verbose | info | warning | error,
      source: xml | javascript_ | network | storage | appcache | rendering | security | deprecation | worker_ | violation | intervention | recommendation | other_,
      text: String,
      timestamp: Timestamp
    ): LogEntry = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogEntry]
    }
    
    @scala.inline
    implicit class LogEntryMutableBuilder[Self <: LogEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[RemoteObject]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setArgsVarargs(value: RemoteObject*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setLevel(value: verbose | info | warning | error): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineNumber(value: integer): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
      
      @scala.inline
      def setNetworkRequestId(value: RequestId): Self = StObject.set(x, "networkRequestId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkRequestIdUndefined: Self = StObject.set(x, "networkRequestId", js.undefined)
      
      @scala.inline
      def setSource(
        value: xml | javascript_ | network | storage | appcache | rendering | security | deprecation | worker_ | violation | intervention | recommendation | other_
      ): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackTrace(value: StackTrace): Self = StObject.set(x, "stackTrace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackTraceUndefined: Self = StObject.set(x, "stackTrace", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Timestamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setWorkerId(value: String): Self = StObject.set(x, "workerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkerIdUndefined: Self = StObject.set(x, "workerId", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.verbose
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.info
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.warning
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.error
  */
  trait LogEntryLevel extends StObject
  object LogEntryLevel {
    
    @scala.inline
    def Error: error = "error".asInstanceOf[error]
    
    @scala.inline
    def Info: info = "info".asInstanceOf[info]
    
    @scala.inline
    def Verbose: verbose = "verbose".asInstanceOf[verbose]
    
    @scala.inline
    def Warning: warning = "warning".asInstanceOf[warning]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.xml
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.javascript_
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.network
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.storage
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.appcache
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.rendering
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.security
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.deprecation
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.worker_
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.violation
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.intervention
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.recommendation
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.other_
  */
  trait LogEntrySource extends StObject
  object LogEntrySource {
    
    @scala.inline
    def Appcache: appcache = "appcache".asInstanceOf[appcache]
    
    @scala.inline
    def Deprecation: deprecation = "deprecation".asInstanceOf[deprecation]
    
    @scala.inline
    def Intervention: intervention = "intervention".asInstanceOf[intervention]
    
    @scala.inline
    def Javascript: javascript_ = "javascript".asInstanceOf[javascript_]
    
    @scala.inline
    def Network: network = "network".asInstanceOf[network]
    
    @scala.inline
    def Other: other_ = "other".asInstanceOf[other_]
    
    @scala.inline
    def Recommendation: recommendation = "recommendation".asInstanceOf[recommendation]
    
    @scala.inline
    def Rendering: rendering = "rendering".asInstanceOf[rendering]
    
    @scala.inline
    def Security: security = "security".asInstanceOf[security]
    
    @scala.inline
    def Storage: storage = "storage".asInstanceOf[storage]
    
    @scala.inline
    def Violation: violation = "violation".asInstanceOf[violation]
    
    @scala.inline
    def Worker: worker_ = "worker".asInstanceOf[worker_]
    
    @scala.inline
    def XML: xml = "xml".asInstanceOf[xml]
  }
  
  @js.native
  trait StartViolationsReportRequest extends StObject {
    
    /**
      * Configuration for violations.
      */
    var config: js.Array[ViolationSetting] = js.native
  }
  object StartViolationsReportRequest {
    
    @scala.inline
    def apply(config: js.Array[ViolationSetting]): StartViolationsReportRequest = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[StartViolationsReportRequest]
    }
    
    @scala.inline
    implicit class StartViolationsReportRequestMutableBuilder[Self <: StartViolationsReportRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: js.Array[ViolationSetting]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigVarargs(value: ViolationSetting*): Self = StObject.set(x, "config", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ViolationSetting extends StObject {
    
    /**
      * Violation type. (ViolationSettingName enum)
      */
    var name: longTask | longLayout | blockedEvent | blockedParser | discouragedAPIUse | handler | recurringHandler = js.native
    
    /**
      * Time threshold to trigger upon.
      */
    var threshold: Double = js.native
  }
  object ViolationSetting {
    
    @scala.inline
    def apply(
      name: longTask | longLayout | blockedEvent | blockedParser | discouragedAPIUse | handler | recurringHandler,
      threshold: Double
    ): ViolationSetting = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViolationSetting]
    }
    
    @scala.inline
    implicit class ViolationSettingMutableBuilder[Self <: ViolationSetting] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: longTask | longLayout | blockedEvent | blockedParser | discouragedAPIUse | handler | recurringHandler
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.longTask
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.longLayout
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.blockedEvent
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.blockedParser
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.discouragedAPIUse
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.handler
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.recurringHandler
  */
  trait ViolationSettingName extends StObject
  object ViolationSettingName {
    
    @scala.inline
    def BlockedEvent: blockedEvent = "blockedEvent".asInstanceOf[blockedEvent]
    
    @scala.inline
    def BlockedParser: blockedParser = "blockedParser".asInstanceOf[blockedParser]
    
    @scala.inline
    def DiscouragedAPIUse: discouragedAPIUse = "discouragedAPIUse".asInstanceOf[discouragedAPIUse]
    
    @scala.inline
    def Handler: handler = "handler".asInstanceOf[handler]
    
    @scala.inline
    def LongLayout: longLayout = "longLayout".asInstanceOf[longLayout]
    
    @scala.inline
    def LongTask: longTask = "longTask".asInstanceOf[longTask]
    
    @scala.inline
    def RecurringHandler: recurringHandler = "recurringHandler".asInstanceOf[recurringHandler]
  }
}
