package typingsSlinky.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ProgressData...
  */
@js.native
trait IProgressData extends StObject {
  
  /**
    * This property is not used.
    */
  var qCompleted: Double = js.native
  
  /**
    * Information about the error messages that occur during the script execution.
    */
  var qErrorData: js.Array[IErrorData] = js.native
  
  /**
    * This property is set to true if the request is finished.
    */
  var qFinished: Boolean = js.native
  
  /**
    * This property is not used.
    */
  var qKB: Double = js.native
  
  /**
    * Request duration in milliseconds.
    */
  var qMillisecs: Double = js.native
  
  /**
    * A progress message is persistent when it informs about the start or end of a statement.
    * For example, it can inform about the total number of lines fetched from a data source, tells that the app was saved.
    *
    * All persistent progress messages between two GetProgress calls are summarized in this string.
    * Contrarily to qPersistentProgressMessages, the content of the localized message string is displayed
    * (not its message code).
    */
  var qPersistentProgress: String = js.native
  
  /**
    * List of persistent progress messages.
    */
  var qPersistentProgressMessages: js.Array[IProgressMessage] = js.native
  
  /**
    * This property is set to true if the request is started.
    */
  var qStarted: Boolean = js.native
  
  /**
    * This property is not used.
    */
  var qTotal: Double = js.native
  
  /**
    * A progress message is transient when it informs about the progress of an ongoing statement.
    * For example, it can tell how many lines are currently fetched from a data source.
    *
    * All transient progress messages between two GetProgress calls are summarized in this string.
    * Contrarily to qTransientProgressMessage, the content of the localized message string is displayed
    * (not its message code).
    */
  var qTransientProgress: String = js.native
  
  /**
    * Transient progress message.
    */
  var qTransientProgressMessage: IProgressMessage = js.native
  
  /**
    * This property is set to true when the engine pauses the script execution and waits for a user interaction.
    */
  var qUserInteractionWanted: Boolean = js.native
}
object IProgressData {
  
  @scala.inline
  def apply(
    qCompleted: Double,
    qErrorData: js.Array[IErrorData],
    qFinished: Boolean,
    qKB: Double,
    qMillisecs: Double,
    qPersistentProgress: String,
    qPersistentProgressMessages: js.Array[IProgressMessage],
    qStarted: Boolean,
    qTotal: Double,
    qTransientProgress: String,
    qTransientProgressMessage: IProgressMessage,
    qUserInteractionWanted: Boolean
  ): IProgressData = {
    val __obj = js.Dynamic.literal(qCompleted = qCompleted.asInstanceOf[js.Any], qErrorData = qErrorData.asInstanceOf[js.Any], qFinished = qFinished.asInstanceOf[js.Any], qKB = qKB.asInstanceOf[js.Any], qMillisecs = qMillisecs.asInstanceOf[js.Any], qPersistentProgress = qPersistentProgress.asInstanceOf[js.Any], qPersistentProgressMessages = qPersistentProgressMessages.asInstanceOf[js.Any], qStarted = qStarted.asInstanceOf[js.Any], qTotal = qTotal.asInstanceOf[js.Any], qTransientProgress = qTransientProgress.asInstanceOf[js.Any], qTransientProgressMessage = qTransientProgressMessage.asInstanceOf[js.Any], qUserInteractionWanted = qUserInteractionWanted.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProgressData]
  }
  
  @scala.inline
  implicit class IProgressDataMutableBuilder[Self <: IProgressData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQCompleted(value: Double): Self = StObject.set(x, "qCompleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQErrorData(value: js.Array[IErrorData]): Self = StObject.set(x, "qErrorData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQErrorDataVarargs(value: IErrorData*): Self = StObject.set(x, "qErrorData", js.Array(value :_*))
    
    @scala.inline
    def setQFinished(value: Boolean): Self = StObject.set(x, "qFinished", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQKB(value: Double): Self = StObject.set(x, "qKB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMillisecs(value: Double): Self = StObject.set(x, "qMillisecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQPersistentProgress(value: String): Self = StObject.set(x, "qPersistentProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQPersistentProgressMessages(value: js.Array[IProgressMessage]): Self = StObject.set(x, "qPersistentProgressMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQPersistentProgressMessagesVarargs(value: IProgressMessage*): Self = StObject.set(x, "qPersistentProgressMessages", js.Array(value :_*))
    
    @scala.inline
    def setQStarted(value: Boolean): Self = StObject.set(x, "qStarted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTotal(value: Double): Self = StObject.set(x, "qTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTransientProgress(value: String): Self = StObject.set(x, "qTransientProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTransientProgressMessage(value: IProgressMessage): Self = StObject.set(x, "qTransientProgressMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUserInteractionWanted(value: Boolean): Self = StObject.set(x, "qUserInteractionWanted", value.asInstanceOf[js.Any])
  }
}
