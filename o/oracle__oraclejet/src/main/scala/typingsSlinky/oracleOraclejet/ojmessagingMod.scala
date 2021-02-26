package typingsSlinky.oracleOraclejet

import typingsSlinky.oracleOraclejet.oracleOraclejetNumbers.`-1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojmessagingMod {
  
  @JSImport("@oracle/oraclejet/ojmessaging", JSImport.Namespace)
  @js.native
  class ^ protected () extends Message {
    def this(summary: String, detail: String) = this()
    def this(summary: String, detail: String, severity: SEVERITY_LEVEL) = this()
    def this(summary: String, detail: String, severity: SEVERITY_TYPE) = this()
  }
  
  /* static member */
  @JSImport("@oracle/oraclejet/ojmessaging", "getMaxSeverity")
  @js.native
  def getMaxSeverity(): SEVERITY_LEVEL | `-1` = js.native
  @JSImport("@oracle/oraclejet/ojmessaging", "getMaxSeverity")
  @js.native
  def getMaxSeverity(messages: js.Array[Message]): SEVERITY_LEVEL | `-1` = js.native
  
  /* static member */
  @JSImport("@oracle/oraclejet/ojmessaging", "getSeverityLevel")
  @js.native
  def getSeverityLevel(): SEVERITY_LEVEL = js.native
  @JSImport("@oracle/oraclejet/ojmessaging", "getSeverityLevel")
  @js.native
  def getSeverityLevel(severity: SEVERITY_LEVEL): SEVERITY_LEVEL = js.native
  @JSImport("@oracle/oraclejet/ojmessaging", "getSeverityLevel")
  @js.native
  def getSeverityLevel(severity: SEVERITY_TYPE): SEVERITY_LEVEL = js.native
  
  /* static member */
  @JSImport("@oracle/oraclejet/ojmessaging", "getSeverityType")
  @js.native
  def getSeverityType(): SEVERITY_TYPE = js.native
  @JSImport("@oracle/oraclejet/ojmessaging", "getSeverityType")
  @js.native
  def getSeverityType(level: SEVERITY_LEVEL): SEVERITY_TYPE = js.native
  @JSImport("@oracle/oraclejet/ojmessaging", "getSeverityType")
  @js.native
  def getSeverityType(level: SEVERITY_TYPE): SEVERITY_TYPE = js.native
  
  /* static member */
  @JSImport("@oracle/oraclejet/ojmessaging", "isValid")
  @js.native
  def isValid(messages: js.Array[Message]): Boolean = js.native
  
  @js.native
  trait Message extends StObject {
    
    var detail: String = js.native
    
    var severity: SEVERITY_TYPE | SEVERITY_LEVEL = js.native
    
    var summary: String = js.native
  }
  object Message {
    
    @scala.inline
    def apply(detail: String, severity: SEVERITY_TYPE | SEVERITY_LEVEL, summary: String): Message = {
      val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeverity(value: SEVERITY_TYPE | SEVERITY_LEVEL): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.oracleOraclejet.oracleOraclejetNumbers.`5`
    - typingsSlinky.oracleOraclejet.oracleOraclejetNumbers.`4`
    - typingsSlinky.oracleOraclejet.oracleOraclejetNumbers.`3`
    - typingsSlinky.oracleOraclejet.oracleOraclejetNumbers.`2`
    - typingsSlinky.oracleOraclejet.oracleOraclejetNumbers.`1`
  */
  trait SEVERITY_LEVEL extends StObject
  object SEVERITY_LEVEL {
    
    @scala.inline
    def `1`: typingsSlinky.oracleOraclejet.oracleOraclejetNumbers.`1` = 1.asInstanceOf[typingsSlinky.oracleOraclejet.oracleOraclejetNumbers.`1`]
    
    @scala.inline
    def `2`: typingsSlinky.oracleOraclejet.oracleOraclejetNumbers.`2` = 2.asInstanceOf[typingsSlinky.oracleOraclejet.oracleOraclejetNumbers.`2`]
    
    @scala.inline
    def `3`: typingsSlinky.oracleOraclejet.oracleOraclejetNumbers.`3` = 3.asInstanceOf[typingsSlinky.oracleOraclejet.oracleOraclejetNumbers.`3`]
    
    @scala.inline
    def `4`: typingsSlinky.oracleOraclejet.oracleOraclejetNumbers.`4` = 4.asInstanceOf[typingsSlinky.oracleOraclejet.oracleOraclejetNumbers.`4`]
    
    @scala.inline
    def `5`: typingsSlinky.oracleOraclejet.oracleOraclejetNumbers.`5` = 5.asInstanceOf[typingsSlinky.oracleOraclejet.oracleOraclejetNumbers.`5`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.oracleOraclejet.oracleOraclejetStrings.confirmation
    - typingsSlinky.oracleOraclejet.oracleOraclejetStrings.info
    - typingsSlinky.oracleOraclejet.oracleOraclejetStrings.warning
    - typingsSlinky.oracleOraclejet.oracleOraclejetStrings.error
    - typingsSlinky.oracleOraclejet.oracleOraclejetStrings.fatal
  */
  trait SEVERITY_TYPE extends StObject
  object SEVERITY_TYPE {
    
    @scala.inline
    def confirmation: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.confirmation = "confirmation".asInstanceOf[typingsSlinky.oracleOraclejet.oracleOraclejetStrings.confirmation]
    
    @scala.inline
    def error: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.error = "error".asInstanceOf[typingsSlinky.oracleOraclejet.oracleOraclejetStrings.error]
    
    @scala.inline
    def fatal: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.fatal = "fatal".asInstanceOf[typingsSlinky.oracleOraclejet.oracleOraclejetStrings.fatal]
    
    @scala.inline
    def info: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.info = "info".asInstanceOf[typingsSlinky.oracleOraclejet.oracleOraclejetStrings.info]
    
    @scala.inline
    def warning: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.warning = "warning".asInstanceOf[typingsSlinky.oracleOraclejet.oracleOraclejetStrings.warning]
  }
}
