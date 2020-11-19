package typingsSlinky.log4javascript.mod

import org.scalajs.dom.raw.XMLHttpRequest
import typingsSlinky.log4javascript.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("log4javascript", "AjaxAppender")
@js.native
class AjaxAppender protected () extends Appender {
  /**
  	 * Constructor
  	 * @param url The URL to which log messages should be sent. Note that this is subject to the usual Ajax restrictions:
  	 * the URL should be in the same domain as that of the page making the request.
  	 * @param withCredentials Specifies whether cookies should be sent with each request.
  	 */
  def this(url: String) = this()
  def this(url: String, withCredentials: Boolean) = this()
  
  /**
  	 * Adds an HTTP header that is sent with each request.
  	 */
  def addHeader(name: String, value: String): Unit = js.native
  
  /**
  	 * Returns the number of log messages sent in each request. See above for more details.
  	 */
  def getBatchSize(): Double = js.native
  
  /**
  	 * Returns an array of the additional headers that are sent with each HTTP request. Each array item is an object with
  	 * properties name and value.
  	 */
  def getHeaders(): js.Array[Name] = js.native
  
  /**
  	 * Returns the post variable name whose value will the formatted log message(s) for each request.
  	 */
  def getPostVarName(): String = js.native
  
  /**
  	 * Returns the session id sent to the server each time a request is made.
  	 */
  def getSessionId(): String = js.native
  
  /**
  	 * Returns the length of time in milliseconds between each sending of queued log messages. See above for more details.
  	 */
  def getTimerInterval(): Double = js.native
  
  /**
  	 * Returns whether all remaining unsent log messages are sent to the server when the page unloads.
  	 */
  def isSendAllOnUnload(): Boolean = js.native
  
  /**
  	 * Returns whether log messages are sent to the server at regular, timed intervals.
  	 */
  def isTimed(): Boolean = js.native
  
  /**
  	 * Returns whether the appender waits for a response from a previous HTTP request from this appender before sending the next
  	 * log message / batch of messages.
  	 */
  def isWaitForResponse(): Boolean = js.native
  
  /**
  	 * Sends all log messages in the queue. If log messages are batched then only completed batches are sent.
  	 */
  def sendAll(): Unit = js.native
  
  /**
  	 * Sets the number of log messages to send in each request. If not specified, defaults to 1.
  	 */
  def setBatchSize(batchSize: Double): Unit = js.native
  
  /**
  	 * Sets the function that is called whenever any kind of failure occurs in the appender, including browser deficiencies or
  	 * configuration errors (e.g. supplying a non-existent URL to the appender). This feature can be used to handle
  	 * AjaxAppender-specific errors.
  	 * A single parameter, message, is passed to the callback function. This is the error-specific message that caused the failure.
  	 */
  def setFailCallback(failCallback: js.Function1[/* message */ String, Unit]): Unit = js.native
  
  /**
  	 * Sets the post variable name whose value will the formatted log message(s) for each request.
  	 * Default value is data.
  	 */
  def setPostVarName(postVarName: String): Unit = js.native
  
  /**
  	 * Sets the function that is called whenever a successful request is made, called at the point at which the response is
  	 * received. This feature can be used to confirm whether a request has been successful and act accordingly.
  	 * A single parameter, xmlHttp, is passed to the callback function. This is the XMLHttpRequest object that performed the
  	 * request.
  	 */
  def setRequestSuccessCallback(requestSuccessCallback: js.Function1[/* xmlHttp */ XMLHttpRequest, Unit]): Unit = js.native
  
  /**
  	 * Whether to send all remaining unsent log messages to the server when the page unloads.
  	 * Since version 1.4.3, the default value is false. Previously the default was true.
  	 */
  def setSendAllOnUnload(sendAllOnUnload: Boolean): Unit = js.native
  
  /**
  	 * Sets the session id sent to the server each time a request is made.
  	 */
  def setSessionId(sessionId: String): Unit = js.native
  
  /**
  	 * Whether to send log messages to the server at regular, timed intervals.
  	 * Default value is false.
  	 */
  def setTimed(timed: Boolean): Unit = js.native
  
  /**
  	 * Sets the length of time in milliseconds between each sending of queued log messages.
  	 */
  def setTimerInterval(timerInterval: Double): Unit = js.native
  
  /**
  	 * Sets whether to wait for a response from a previous HTTP request from this appender before sending the next log
  	 * message / batch of messages.
  	 * Default value is false.
  	 */
  def setWaitForResponse(waitForResponse: Boolean): Unit = js.native
}
