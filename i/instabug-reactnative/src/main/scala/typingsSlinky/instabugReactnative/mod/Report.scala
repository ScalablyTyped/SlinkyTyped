package typingsSlinky.instabugReactnative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Report extends js.Object {
  def addFileAttachmentWithData(data: String, filename: String): Unit = js.native
  def addFileAttachmentWithUrl(url: String, filename: String): Unit = js.native
  def appendConsoleLog(consoleLog: String): Unit = js.native
  def appendTag(tag: String): Unit = js.native
  def logDebug(log: String): Unit = js.native
  def logError(log: String): Unit = js.native
  def logInfo(log: String): Unit = js.native
  def logVerbose(log: String): Unit = js.native
  def logWarn(log: String): Unit = js.native
  def setUserAttribute(key: String, value: String): Unit = js.native
}

object Report {
  @scala.inline
  def apply(
    addFileAttachmentWithData: (String, String) => Unit,
    addFileAttachmentWithUrl: (String, String) => Unit,
    appendConsoleLog: String => Unit,
    appendTag: String => Unit,
    logDebug: String => Unit,
    logError: String => Unit,
    logInfo: String => Unit,
    logVerbose: String => Unit,
    logWarn: String => Unit,
    setUserAttribute: (String, String) => Unit
  ): Report = {
    val __obj = js.Dynamic.literal(addFileAttachmentWithData = js.Any.fromFunction2(addFileAttachmentWithData), addFileAttachmentWithUrl = js.Any.fromFunction2(addFileAttachmentWithUrl), appendConsoleLog = js.Any.fromFunction1(appendConsoleLog), appendTag = js.Any.fromFunction1(appendTag), logDebug = js.Any.fromFunction1(logDebug), logError = js.Any.fromFunction1(logError), logInfo = js.Any.fromFunction1(logInfo), logVerbose = js.Any.fromFunction1(logVerbose), logWarn = js.Any.fromFunction1(logWarn), setUserAttribute = js.Any.fromFunction2(setUserAttribute))
    __obj.asInstanceOf[Report]
  }
  @scala.inline
  implicit class ReportOps[Self <: Report] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddFileAttachmentWithData(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addFileAttachmentWithData")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAddFileAttachmentWithUrl(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addFileAttachmentWithUrl")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAppendConsoleLog(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendConsoleLog")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAppendTag(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendTag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLogDebug(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logDebug")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLogError(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLogInfo(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logInfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLogVerbose(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logVerbose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLogWarn(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logWarn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetUserAttribute(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUserAttribute")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

