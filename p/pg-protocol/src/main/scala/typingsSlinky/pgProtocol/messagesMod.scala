package typingsSlinky.pgProtocol

import typingsSlinky.node.Buffer
import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messagesMod {
  
  @JSImport("pg-protocol/dist/messages", "AuthenticationMD5Password")
  @js.native
  class AuthenticationMD5Password protected () extends BackendMessage {
    def this(length: Double, salt: Buffer) = this()
    
    val salt: Buffer = js.native
  }
  
  @JSImport("pg-protocol/dist/messages", "BackendKeyDataMessage")
  @js.native
  class BackendKeyDataMessage protected () extends StObject {
    def this(length: Double, processID: Double, secretKey: Double) = this()
    
    val length: Double = js.native
    
    val name: MessageName = js.native
    
    val processID: Double = js.native
    
    val secretKey: Double = js.native
  }
  
  @JSImport("pg-protocol/dist/messages", "CommandCompleteMessage")
  @js.native
  class CommandCompleteMessage protected () extends StObject {
    def this(length: Double, text: String) = this()
    
    val length: Double = js.native
    
    val name: MessageName = js.native
    
    val text: String = js.native
  }
  
  @JSImport("pg-protocol/dist/messages", "CopyDataMessage")
  @js.native
  class CopyDataMessage protected () extends StObject {
    def this(length: Double, chunk: Buffer) = this()
    
    val chunk: Buffer = js.native
    
    val length: Double = js.native
    
    val name: String | Double = js.native
  }
  
  @JSImport("pg-protocol/dist/messages", "CopyResponse")
  @js.native
  class CopyResponse protected () extends StObject {
    def this(length: Double, name: MessageName, binary: Boolean, columnCount: Double) = this()
    
    val binary: Boolean = js.native
    
    val columnTypes: js.Array[Double] = js.native
    
    val length: Double = js.native
    
    val name: MessageName = js.native
  }
  
  @JSImport("pg-protocol/dist/messages", "DataRowMessage")
  @js.native
  class DataRowMessage protected () extends StObject {
    def this(length: Double, fields: js.Array[_]) = this()
    
    val fieldCount: Double = js.native
    
    var fields: js.Array[_] = js.native
    
    var length: Double = js.native
    
    val name: MessageName = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.pgProtocol.messagesMod.NoticeOrError because var conflicts: message. Inlined severity, code, detail, hint, position, internalPosition, internalQuery, where, schema, table, column, dataType, constraint, file, line, routine */ @JSImport("pg-protocol/dist/messages", "DatabaseError")
  @js.native
  class DatabaseError protected () extends Error {
    def this(message: String, length: Double, name: MessageName) = this()
    
    var code: js.UndefOr[String] = js.native
    
    var column: js.UndefOr[String] = js.native
    
    var constraint: js.UndefOr[String] = js.native
    
    var dataType: js.UndefOr[String] = js.native
    
    var detail: js.UndefOr[String] = js.native
    
    var file: js.UndefOr[String] = js.native
    
    var hint: js.UndefOr[String] = js.native
    
    var internalPosition: js.UndefOr[String] = js.native
    
    var internalQuery: js.UndefOr[String] = js.native
    
    val length: Double = js.native
    
    var line: js.UndefOr[String] = js.native
    
    @JSName("name")
    val name_DatabaseError: MessageName = js.native
    
    var position: js.UndefOr[String] = js.native
    
    var routine: js.UndefOr[String] = js.native
    
    var schema: js.UndefOr[String] = js.native
    
    var severity: js.UndefOr[String] = js.native
    
    var table: js.UndefOr[String] = js.native
    
    var where: js.UndefOr[String] = js.native
  }
  
  @JSImport("pg-protocol/dist/messages", "Field")
  @js.native
  class Field protected () extends StObject {
    def this(
      name: String,
      tableID: Double,
      columnID: Double,
      dataTypeID: Double,
      dataTypeSize: Double,
      dataTypeModifier: Double,
      format: Mode
    ) = this()
    
    val columnID: Double = js.native
    
    val dataTypeID: Double = js.native
    
    val dataTypeModifier: Double = js.native
    
    val dataTypeSize: Double = js.native
    
    val format: Mode = js.native
    
    val name: String = js.native
    
    val tableID: Double = js.native
  }
  
  @JSImport("pg-protocol/dist/messages", "NoticeMessage")
  @js.native
  class NoticeMessage protected ()
    extends BackendMessage
       with NoticeOrError {
    def this(length: Double) = this()
    def this(length: Double, message: String) = this()
    
    @JSName("name")
    val name_NoticeMessage: String | Double = js.native
  }
  
  @JSImport("pg-protocol/dist/messages", "NotificationResponseMessage")
  @js.native
  class NotificationResponseMessage protected () extends StObject {
    def this(length: Double, processId: Double, channel: String, payload: String) = this()
    
    val channel: String = js.native
    
    val length: Double = js.native
    
    val name: MessageName = js.native
    
    val payload: String = js.native
    
    val processId: Double = js.native
  }
  
  @JSImport("pg-protocol/dist/messages", "ParameterStatusMessage")
  @js.native
  class ParameterStatusMessage protected () extends StObject {
    def this(length: Double, parameterName: String, parameterValue: String) = this()
    
    val length: Double = js.native
    
    val name: MessageName = js.native
    
    val parameterName: String = js.native
    
    val parameterValue: String = js.native
  }
  
  @JSImport("pg-protocol/dist/messages", "ReadyForQueryMessage")
  @js.native
  class ReadyForQueryMessage protected () extends StObject {
    def this(length: Double, status: String) = this()
    
    val length: Double = js.native
    
    val name: MessageName = js.native
    
    val status: String = js.native
  }
  
  @JSImport("pg-protocol/dist/messages", "RowDescriptionMessage")
  @js.native
  class RowDescriptionMessage protected () extends StObject {
    def this(length: Double, fieldCount: Double) = this()
    
    val fieldCount: Double = js.native
    
    val fields: js.Array[Field] = js.native
    
    val length: Double = js.native
    
    val name: MessageName = js.native
  }
  
  @JSImport("pg-protocol/dist/messages", "bindComplete")
  @js.native
  val bindComplete: BackendMessage = js.native
  
  @JSImport("pg-protocol/dist/messages", "closeComplete")
  @js.native
  val closeComplete: BackendMessage = js.native
  
  @JSImport("pg-protocol/dist/messages", "copyDone")
  @js.native
  val copyDone: BackendMessage = js.native
  
  @JSImport("pg-protocol/dist/messages", "emptyQuery")
  @js.native
  val emptyQuery: BackendMessage = js.native
  
  @JSImport("pg-protocol/dist/messages", "noData")
  @js.native
  val noData: BackendMessage = js.native
  
  @JSImport("pg-protocol/dist/messages", "parseComplete")
  @js.native
  val parseComplete: BackendMessage = js.native
  
  @JSImport("pg-protocol/dist/messages", "portalSuspended")
  @js.native
  val portalSuspended: BackendMessage = js.native
  
  @JSImport("pg-protocol/dist/messages", "replicationStart")
  @js.native
  val replicationStart: BackendMessage = js.native
  
  @js.native
  trait BackendMessage extends StObject {
    
    var length: Double = js.native
    
    var name: MessageName = js.native
  }
  object BackendMessage {
    
    @scala.inline
    def apply(length: Double, name: MessageName): BackendMessage = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackendMessage]
    }
    
    @scala.inline
    implicit class BackendMessageMutableBuilder[Self <: BackendMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: MessageName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.pgProtocol.pgProtocolStrings.parseComplete
    - typingsSlinky.pgProtocol.pgProtocolStrings.bindComplete
    - typingsSlinky.pgProtocol.pgProtocolStrings.closeComplete
    - typingsSlinky.pgProtocol.pgProtocolStrings.noData
    - typingsSlinky.pgProtocol.pgProtocolStrings.portalSuspended
    - typingsSlinky.pgProtocol.pgProtocolStrings.replicationStart
    - typingsSlinky.pgProtocol.pgProtocolStrings.emptyQuery
    - typingsSlinky.pgProtocol.pgProtocolStrings.copyDone
    - typingsSlinky.pgProtocol.pgProtocolStrings.copyData
    - typingsSlinky.pgProtocol.pgProtocolStrings.rowDescription
    - typingsSlinky.pgProtocol.pgProtocolStrings.parameterStatus
    - typingsSlinky.pgProtocol.pgProtocolStrings.backendKeyData
    - typingsSlinky.pgProtocol.pgProtocolStrings.notification
    - typingsSlinky.pgProtocol.pgProtocolStrings.readyForQuery
    - typingsSlinky.pgProtocol.pgProtocolStrings.commandComplete
    - typingsSlinky.pgProtocol.pgProtocolStrings.dataRow
    - typingsSlinky.pgProtocol.pgProtocolStrings.copyInResponse
    - typingsSlinky.pgProtocol.pgProtocolStrings.copyOutResponse
    - typingsSlinky.pgProtocol.pgProtocolStrings.authenticationOk
    - typingsSlinky.pgProtocol.pgProtocolStrings.authenticationMD5Password
    - typingsSlinky.pgProtocol.pgProtocolStrings.authenticationCleartextPassword
    - typingsSlinky.pgProtocol.pgProtocolStrings.authenticationSASL
    - typingsSlinky.pgProtocol.pgProtocolStrings.authenticationSASLContinue
    - typingsSlinky.pgProtocol.pgProtocolStrings.authenticationSASLFinal
    - typingsSlinky.pgProtocol.pgProtocolStrings.error
    - typingsSlinky.pgProtocol.pgProtocolStrings.notice
  */
  trait MessageName extends StObject
  object MessageName {
    
    @scala.inline
    def authenticationCleartextPassword: typingsSlinky.pgProtocol.pgProtocolStrings.authenticationCleartextPassword = "authenticationCleartextPassword".asInstanceOf[typingsSlinky.pgProtocol.pgProtocolStrings.authenticationCleartextPassword]
    
    @scala.inline
    def authenticationMD5Password: typingsSlinky.pgProtocol.pgProtocolStrings.authenticationMD5Password = "authenticationMD5Password".asInstanceOf[typingsSlinky.pgProtocol.pgProtocolStrings.authenticationMD5Password]
    
    @scala.inline
    def authenticationOk: typingsSlinky.pgProtocol.pgProtocolStrings.authenticationOk = "authenticationOk".asInstanceOf[typingsSlinky.pgProtocol.pgProtocolStrings.authenticationOk]
    
    @scala.inline
    def authenticationSASL: typingsSlinky.pgProtocol.pgProtocolStrings.authenticationSASL = "authenticationSASL".asInstanceOf[typingsSlinky.pgProtocol.pgProtocolStrings.authenticationSASL]
    
    @scala.inline
    def authenticationSASLContinue: typingsSlinky.pgProtocol.pgProtocolStrings.authenticationSASLContinue = "authenticationSASLContinue".asInstanceOf[typingsSlinky.pgProtocol.pgProtocolStrings.authenticationSASLContinue]
    
    @scala.inline
    def authenticationSASLFinal: typingsSlinky.pgProtocol.pgProtocolStrings.authenticationSASLFinal = "authenticationSASLFinal".asInstanceOf[typingsSlinky.pgProtocol.pgProtocolStrings.authenticationSASLFinal]
    
    @scala.inline
    def backendKeyData: typingsSlinky.pgProtocol.pgProtocolStrings.backendKeyData = "backendKeyData".asInstanceOf[typingsSlinky.pgProtocol.pgProtocolStrings.backendKeyData]
    
    @scala.inline
    def bindComplete: typingsSlinky.pgProtocol.pgProtocolStrings.bindComplete = "bindComplete".asInstanceOf[typingsSlinky.pgProtocol.pgProtocolStrings.bindComplete]
    
    @scala.inline
    def closeComplete: typingsSlinky.pgProtocol.pgProtocolStrings.closeComplete = "closeComplete".asInstanceOf[typingsSlinky.pgProtocol.pgProtocolStrings.closeComplete]
    
    @scala.inline
    def commandComplete: typingsSlinky.pgProtocol.pgProtocolStrings.commandComplete = "commandComplete".asInstanceOf[typingsSlinky.pgProtocol.pgProtocolStrings.commandComplete]
    
    @scala.inline
    def copyData: typingsSlinky.pgProtocol.pgProtocolStrings.copyData = "copyData".asInstanceOf[typingsSlinky.pgProtocol.pgProtocolStrings.copyData]
    
    @scala.inline
    def copyDone: typingsSlinky.pgProtocol.pgProtocolStrings.copyDone = "copyDone".asInstanceOf[typingsSlinky.pgProtocol.pgProtocolStrings.copyDone]
    
    @scala.inline
    def copyInResponse: typingsSlinky.pgProtocol.pgProtocolStrings.copyInResponse = "copyInResponse".asInstanceOf[typingsSlinky.pgProtocol.pgProtocolStrings.copyInResponse]
    
    @scala.inline
    def copyOutResponse: typingsSlinky.pgProtocol.pgProtocolStrings.copyOutResponse = "copyOutResponse".asInstanceOf[typingsSlinky.pgProtocol.pgProtocolStrings.copyOutResponse]
    
    @scala.inline
    def dataRow: typingsSlinky.pgProtocol.pgProtocolStrings.dataRow = "dataRow".asInstanceOf[typingsSlinky.pgProtocol.pgProtocolStrings.dataRow]
    
    @scala.inline
    def emptyQuery: typingsSlinky.pgProtocol.pgProtocolStrings.emptyQuery = "emptyQuery".asInstanceOf[typingsSlinky.pgProtocol.pgProtocolStrings.emptyQuery]
    
    @scala.inline
    def error: typingsSlinky.pgProtocol.pgProtocolStrings.error = "error".asInstanceOf[typingsSlinky.pgProtocol.pgProtocolStrings.error]
    
    @scala.inline
    def noData: typingsSlinky.pgProtocol.pgProtocolStrings.noData = "noData".asInstanceOf[typingsSlinky.pgProtocol.pgProtocolStrings.noData]
    
    @scala.inline
    def notice: typingsSlinky.pgProtocol.pgProtocolStrings.notice = "notice".asInstanceOf[typingsSlinky.pgProtocol.pgProtocolStrings.notice]
    
    @scala.inline
    def notification: typingsSlinky.pgProtocol.pgProtocolStrings.notification = "notification".asInstanceOf[typingsSlinky.pgProtocol.pgProtocolStrings.notification]
    
    @scala.inline
    def parameterStatus: typingsSlinky.pgProtocol.pgProtocolStrings.parameterStatus = "parameterStatus".asInstanceOf[typingsSlinky.pgProtocol.pgProtocolStrings.parameterStatus]
    
    @scala.inline
    def parseComplete: typingsSlinky.pgProtocol.pgProtocolStrings.parseComplete = "parseComplete".asInstanceOf[typingsSlinky.pgProtocol.pgProtocolStrings.parseComplete]
    
    @scala.inline
    def portalSuspended: typingsSlinky.pgProtocol.pgProtocolStrings.portalSuspended = "portalSuspended".asInstanceOf[typingsSlinky.pgProtocol.pgProtocolStrings.portalSuspended]
    
    @scala.inline
    def readyForQuery: typingsSlinky.pgProtocol.pgProtocolStrings.readyForQuery = "readyForQuery".asInstanceOf[typingsSlinky.pgProtocol.pgProtocolStrings.readyForQuery]
    
    @scala.inline
    def replicationStart: typingsSlinky.pgProtocol.pgProtocolStrings.replicationStart = "replicationStart".asInstanceOf[typingsSlinky.pgProtocol.pgProtocolStrings.replicationStart]
    
    @scala.inline
    def rowDescription: typingsSlinky.pgProtocol.pgProtocolStrings.rowDescription = "rowDescription".asInstanceOf[typingsSlinky.pgProtocol.pgProtocolStrings.rowDescription]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.pgProtocol.pgProtocolStrings.text
    - typingsSlinky.pgProtocol.pgProtocolStrings.binary
  */
  trait Mode extends StObject
  object Mode {
    
    @scala.inline
    def binary: typingsSlinky.pgProtocol.pgProtocolStrings.binary = "binary".asInstanceOf[typingsSlinky.pgProtocol.pgProtocolStrings.binary]
    
    @scala.inline
    def text: typingsSlinky.pgProtocol.pgProtocolStrings.text = "text".asInstanceOf[typingsSlinky.pgProtocol.pgProtocolStrings.text]
  }
  
  @js.native
  trait NoticeOrError extends StObject {
    
    var code: js.UndefOr[String] = js.native
    
    var column: js.UndefOr[String] = js.native
    
    var constraint: js.UndefOr[String] = js.native
    
    var dataType: js.UndefOr[String] = js.native
    
    var detail: js.UndefOr[String] = js.native
    
    var file: js.UndefOr[String] = js.native
    
    var hint: js.UndefOr[String] = js.native
    
    var internalPosition: js.UndefOr[String] = js.native
    
    var internalQuery: js.UndefOr[String] = js.native
    
    var line: js.UndefOr[String] = js.native
    
    var message: js.UndefOr[String] = js.native
    
    var position: js.UndefOr[String] = js.native
    
    var routine: js.UndefOr[String] = js.native
    
    var schema: js.UndefOr[String] = js.native
    
    var severity: js.UndefOr[String] = js.native
    
    var table: js.UndefOr[String] = js.native
    
    var where: js.UndefOr[String] = js.native
  }
  object NoticeOrError {
    
    @scala.inline
    def apply(): NoticeOrError = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NoticeOrError]
    }
    
    @scala.inline
    implicit class NoticeOrErrorMutableBuilder[Self <: NoticeOrError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      @scala.inline
      def setConstraint(value: String): Self = StObject.set(x, "constraint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstraintUndefined: Self = StObject.set(x, "constraint", js.undefined)
      
      @scala.inline
      def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
      
      @scala.inline
      def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      @scala.inline
      def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
      
      @scala.inline
      def setInternalPosition(value: String): Self = StObject.set(x, "internalPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternalPositionUndefined: Self = StObject.set(x, "internalPosition", js.undefined)
      
      @scala.inline
      def setInternalQuery(value: String): Self = StObject.set(x, "internalQuery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternalQueryUndefined: Self = StObject.set(x, "internalQuery", js.undefined)
      
      @scala.inline
      def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setRoutine(value: String): Self = StObject.set(x, "routine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutineUndefined: Self = StObject.set(x, "routine", js.undefined)
      
      @scala.inline
      def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      @scala.inline
      def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
      
      @scala.inline
      def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
      
      @scala.inline
      def setWhere(value: String): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
    }
  }
}
