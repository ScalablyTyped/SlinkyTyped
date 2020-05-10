package typingsSlinky.amazonConnectStreams.connect

import typingsSlinky.amazonConnectStreams.amazonConnectStreamsStrings.inbound
import typingsSlinky.amazonConnectStreams.amazonConnectStreamsStrings.monitoring
import typingsSlinky.amazonConnectStreams.amazonConnectStreamsStrings.outbound
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection extends js.Object {
  /**
    * Ends the connection.
    * @param successFailOptions Optional success and failure callbacks can be provided to determine whether the operation was successful.
    */
  def destroy(successFailOptions: SuccessFailOptions): Unit = js.native
  /**
    * Gets the unique connectionId for this connection.
    */
  def getConnectionId(): String = js.native
  /**
    * Gets the unique contactId of the contact to which this connection belongs.
    */
  def getContactId(): String = js.native
  /**
    * Gets the endpoint to which this connection is connected.
    */
  def getEndpoint(): Endpoint = js.native
  /**
    * Gets the ConnectionState object for this connection.
    */
  def getState(): ConnectionState = js.native
  /**
    * Get the duration of the connection state, in milliseconds, relative to local time.
    */
  def getStateDuration(): Double = js.native
  /**
    * Get the type of connection.
    */
  def getType(): inbound | outbound | monitoring = js.native
  /**
    * Put this connection on hold.
    * @param successFailOptions Optional success and failure callbacks can be provided to determine whether the operation was successful.
    */
  def hold(successFailOptions: SuccessFailOptions): Unit = js.native
  /**
    * Determine if the contact is active.
    */
  def isActive(): Boolean = js.native
  /**
    * Determine if the connection is connected, meaning that the agent is live in a
    * conversation through this connection.
    */
  def isConnected(): Boolean = js.native
  /**
    * Determine whether the connection is in the process of connecting.
    */
  def isConnecting(): Boolean = js.native
  /**
    * Determine if the connection is the contact's initial connection.
    */
  def isInitialConnection(): Boolean = js.native
  /**
    * Determine whether the connection is on hold.
    */
  def isOnHold(): Boolean = js.native
  /**
    * Resume this connection if it was on hold.
    * @param successFailOptions Optional success and failure callbacks can be provided to determine whether the operation was successful.
    */
  def resume(successFailOptions: SuccessFailOptions): Unit = js.native
  /**
    * Send a digit or string of digits through this connection.
    * @param successFailOptions Optional success and failure callbacks can be provided to determine whether the operation was successful.
    */
  def sendDigits(options: SendDigitOptions): Unit = js.native
}

object Connection {
  @scala.inline
  def apply(
    destroy: SuccessFailOptions => Unit,
    getConnectionId: () => String,
    getContactId: () => String,
    getEndpoint: () => Endpoint,
    getState: () => ConnectionState,
    getStateDuration: () => Double,
    getType: () => inbound | outbound | monitoring,
    hold: SuccessFailOptions => Unit,
    isActive: () => Boolean,
    isConnected: () => Boolean,
    isConnecting: () => Boolean,
    isInitialConnection: () => Boolean,
    isOnHold: () => Boolean,
    resume: SuccessFailOptions => Unit,
    sendDigits: SendDigitOptions => Unit
  ): Connection = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction1(destroy), getConnectionId = js.Any.fromFunction0(getConnectionId), getContactId = js.Any.fromFunction0(getContactId), getEndpoint = js.Any.fromFunction0(getEndpoint), getState = js.Any.fromFunction0(getState), getStateDuration = js.Any.fromFunction0(getStateDuration), getType = js.Any.fromFunction0(getType), hold = js.Any.fromFunction1(hold), isActive = js.Any.fromFunction0(isActive), isConnected = js.Any.fromFunction0(isConnected), isConnecting = js.Any.fromFunction0(isConnecting), isInitialConnection = js.Any.fromFunction0(isInitialConnection), isOnHold = js.Any.fromFunction0(isOnHold), resume = js.Any.fromFunction1(resume), sendDigits = js.Any.fromFunction1(sendDigits))
    __obj.asInstanceOf[Connection]
  }
  @scala.inline
  implicit class ConnectionOps[Self <: Connection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestroy(value: SuccessFailOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetConnectionId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConnectionId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetContactId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContactId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEndpoint(value: () => Endpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEndpoint")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetState(value: () => ConnectionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getState")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStateDuration(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStateDuration")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetType(value: () => inbound | outbound | monitoring): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHold(value: SuccessFailOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hold")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsActive(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsConnected(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isConnected")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsConnecting(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isConnecting")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsInitialConnection(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInitialConnection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsOnHold(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOnHold")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResume(value: SuccessFailOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resume")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSendDigits(value: SendDigitOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendDigits")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

