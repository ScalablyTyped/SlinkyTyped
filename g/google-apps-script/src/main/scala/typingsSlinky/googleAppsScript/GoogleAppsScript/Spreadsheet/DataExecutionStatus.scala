package typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet

import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The data execution status.
  */
@js.native
trait DataExecutionStatus extends js.Object {
  def getErrorCode(): DataExecutionErrorCode = js.native
  def getErrorMessage(): String = js.native
  def getExecutionState(): DataExecutionState = js.native
  def getLastRefreshedTime(): Date | Null = js.native
  def isTruncated(): Boolean = js.native
}

object DataExecutionStatus {
  @scala.inline
  def apply(
    getErrorCode: () => DataExecutionErrorCode,
    getErrorMessage: () => String,
    getExecutionState: () => DataExecutionState,
    getLastRefreshedTime: () => Date | Null,
    isTruncated: () => Boolean
  ): DataExecutionStatus = {
    val __obj = js.Dynamic.literal(getErrorCode = js.Any.fromFunction0(getErrorCode), getErrorMessage = js.Any.fromFunction0(getErrorMessage), getExecutionState = js.Any.fromFunction0(getExecutionState), getLastRefreshedTime = js.Any.fromFunction0(getLastRefreshedTime), isTruncated = js.Any.fromFunction0(isTruncated))
    __obj.asInstanceOf[DataExecutionStatus]
  }
  @scala.inline
  implicit class DataExecutionStatusOps[Self <: DataExecutionStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetErrorCode(value: () => DataExecutionErrorCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getErrorCode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetErrorMessage(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getErrorMessage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetExecutionState(value: () => DataExecutionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExecutionState")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLastRefreshedTime(value: () => Date | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLastRefreshedTime")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsTruncated(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTruncated")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

