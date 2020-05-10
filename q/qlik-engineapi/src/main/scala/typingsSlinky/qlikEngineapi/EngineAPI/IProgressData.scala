package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ProgressData...
  */
@js.native
trait IProgressData extends js.Object {
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
  implicit class IProgressDataOps[Self <: IProgressData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQCompleted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qCompleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQErrorData(value: js.Array[IErrorData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qErrorData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQFinished(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qFinished")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQKB(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qKB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQMillisecs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qMillisecs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQPersistentProgress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qPersistentProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQPersistentProgressMessages(value: js.Array[IProgressMessage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qPersistentProgressMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQStarted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qStarted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQTransientProgress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qTransientProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQTransientProgressMessage(value: IProgressMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qTransientProgressMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQUserInteractionWanted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qUserInteractionWanted")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

