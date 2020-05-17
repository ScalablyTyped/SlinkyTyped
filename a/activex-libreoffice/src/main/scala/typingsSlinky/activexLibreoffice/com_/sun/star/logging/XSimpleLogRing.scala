package typingsSlinky.activexLibreoffice.com_.sun.star.logging

import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * a simple log ring allowing to collect a limited number of last events
  *
  * The intention of this interface is to provide a simple possibility for developer to collect the most important events without affecting the
  * performance. For this reasons the messages related API is quite simple, the strings should be produced by the preprocessor mainly.
  * @since OOo 3.2
  */
@js.native
trait XSimpleLogRing extends js.Object {
  /**
    * allows to get the collected messages from the logger
    *
    * It is up to logger implementation to provide only the limited number of last messages.
    */
  val CollectedLog: SafeArray[String] = js.native
  /**
    * allows to get the collected messages from the logger
    *
    * It is up to logger implementation to provide only the limited number of last messages.
    */
  def getCollectedLog(): SafeArray[String] = js.native
  /** allows to add a message to the logger */
  def logString(aMessage: String): Unit = js.native
}

object XSimpleLogRing {
  @scala.inline
  def apply(
    CollectedLog: SafeArray[String],
    getCollectedLog: () => SafeArray[String],
    logString: String => Unit
  ): XSimpleLogRing = {
    val __obj = js.Dynamic.literal(CollectedLog = CollectedLog.asInstanceOf[js.Any], getCollectedLog = js.Any.fromFunction0(getCollectedLog), logString = js.Any.fromFunction1(logString))
    __obj.asInstanceOf[XSimpleLogRing]
  }
  @scala.inline
  implicit class XSimpleLogRingOps[Self <: XSimpleLogRing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollectedLog(value: SafeArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CollectedLog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCollectedLog(value: () => SafeArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCollectedLog")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLogString(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logString")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

