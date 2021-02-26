package typingsSlinky.devtoolsProtocol.mod.Protocol

import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.`console-api`
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.appcache
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.debug
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.deprecation
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.error
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.info
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.javascript_
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.log
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.network
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.other_
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.rendering
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.security
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.storage
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.warning
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.worker_
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.xml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Console {
  
  @js.native
  trait ConsoleMessage extends StObject {
    
    /**
      * Column number in the resource that generated this message (1-based).
      */
    var column: js.UndefOr[integer] = js.native
    
    /**
      * Message severity. (ConsoleMessageLevel enum)
      */
    var level: log | warning | error | debug | info = js.native
    
    /**
      * Line number in the resource that generated this message (1-based).
      */
    var line: js.UndefOr[integer] = js.native
    
    /**
      * Message source. (ConsoleMessageSource enum)
      */
    var source: xml | javascript_ | network | `console-api` | storage | appcache | rendering | security | other_ | deprecation | worker_ = js.native
    
    /**
      * Message text.
      */
    var text: String = js.native
    
    /**
      * URL of the message origin.
      */
    var url: js.UndefOr[String] = js.native
  }
  object ConsoleMessage {
    
    @scala.inline
    def apply(
      level: log | warning | error | debug | info,
      source: xml | javascript_ | network | `console-api` | storage | appcache | rendering | security | other_ | deprecation | worker_,
      text: String
    ): ConsoleMessage = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConsoleMessage]
    }
    
    @scala.inline
    implicit class ConsoleMessageMutableBuilder[Self <: ConsoleMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: integer): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      @scala.inline
      def setLevel(value: log | warning | error | debug | info): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: integer): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      @scala.inline
      def setSource(
        value: xml | javascript_ | network | `console-api` | storage | appcache | rendering | security | other_ | deprecation | worker_
      ): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.log
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.warning
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.error
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.debug
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.info
  */
  trait ConsoleMessageLevel extends StObject
  object ConsoleMessageLevel {
    
    @scala.inline
    def Debug: debug = "debug".asInstanceOf[debug]
    
    @scala.inline
    def Error: error = "error".asInstanceOf[error]
    
    @scala.inline
    def Info: info = "info".asInstanceOf[info]
    
    @scala.inline
    def Log: log = "log".asInstanceOf[log]
    
    @scala.inline
    def Warning: warning = "warning".asInstanceOf[warning]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.xml
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.javascript_
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.network
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.`console-api`
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.storage
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.appcache
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.rendering
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.security
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.other_
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.deprecation
    - typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.worker_
  */
  trait ConsoleMessageSource extends StObject
  object ConsoleMessageSource {
    
    @scala.inline
    def Appcache: appcache = "appcache".asInstanceOf[appcache]
    
    @scala.inline
    def ConsoleAPI: `console-api` = "console-api".asInstanceOf[`console-api`]
    
    @scala.inline
    def Deprecation: deprecation = "deprecation".asInstanceOf[deprecation]
    
    @scala.inline
    def Javascript: javascript_ = "javascript".asInstanceOf[javascript_]
    
    @scala.inline
    def Network: network = "network".asInstanceOf[network]
    
    @scala.inline
    def Other: other_ = "other".asInstanceOf[other_]
    
    @scala.inline
    def Rendering: rendering = "rendering".asInstanceOf[rendering]
    
    @scala.inline
    def Security: security = "security".asInstanceOf[security]
    
    @scala.inline
    def Storage: storage = "storage".asInstanceOf[storage]
    
    @scala.inline
    def Worker: worker_ = "worker".asInstanceOf[worker_]
    
    @scala.inline
    def XML: xml = "xml".asInstanceOf[xml]
  }
  
  @js.native
  trait MessageAddedEvent extends StObject {
    
    /**
      * Console message that has been added.
      */
    var message: ConsoleMessage = js.native
  }
  object MessageAddedEvent {
    
    @scala.inline
    def apply(message: ConsoleMessage): MessageAddedEvent = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageAddedEvent]
    }
    
    @scala.inline
    implicit class MessageAddedEventMutableBuilder[Self <: MessageAddedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: ConsoleMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
