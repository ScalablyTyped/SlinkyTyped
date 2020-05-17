package typingsSlinky.amazonConnectStreams.connect

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.amazonConnectStreams.anon.Label
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Contact extends js.Object {
  /**
    * Accept an incoming contact.
    *
    * @param successFailOptions Optional success and failure callbacks can be provided to determine whether the operation was successful.
    */
  def accept(successFailOptions: SuccessFailOptions): Unit = js.native
  /**
    * Add a new outbound third-party connection to this contact and connect
    * it to the specified endpoint.
    *
    * @param endpoint The endpoint to add.
    * @param successFailOptions Optional success and failure callbacks can be provided to determine whether the operation was successful.
    */
  def addConnection(endpoint: Endpoint, successFailOptions: SuccessFailOptions): Unit = js.native
  /**
    * Conference together the active connections of the conversation.
    *
    * @param successFailOptions Optional success and failure callbacks can be provided to determine whether the operation was successful.
    */
  def conferenceConnections(successFailOptions: SuccessFailOptions): Unit = js.native
  /**
    * Close the contact and all of its associated connections.
    *
    * @param successFailOptions Optional success and failure callbacks can be provided to determine whether the operation was successful.
    */
  def destroy(successFailOptions: SuccessFailOptions): Unit = js.native
  /**
    * Get the inital connection of the contact, or null if the initial connection
    * is no longer active.
    */
  def getActiveInitialConnection(): Connection = js.native
  /**
    * Gets the agent connection. This is the connection that represents the agent's
    * participation in the contact.
    */
  def getAgentConnection(): Connection = js.native
  /**
    * Get a map from attribute name to value for each attribute associated with the contact.
    */
  def getAttributes(): StringDictionary[Label] = js.native
  /**
    * Get a list containing Connection API objects for each connection in the contact.
    */
  def getConnections(): js.Array[Connection] = js.native
  /**
    * Get the unique contactId of this contact.
    */
  def getContactId(): String = js.native
  /**
    * Get the initial connection of the contact.
    */
  def getInitialConnection(): Connection = js.native
  /**
    * Get the original contact id from which this contact was transferred,
    * or none if this is not an internal Connect transfer.
    */
  def getOriginalContactId(): String = js.native
  /**
    * Get the queue associated with the contact.
    */
  def getQueue(): Queue = js.native
  /**
    * In Voice contacts, there can only be one active third-party connection.
    * This method returns the single active third-party connection, or null if
    * there are no currently active third-party connections.
    */
  def getSingleActiveThirdPartyConnection(): Connection = js.native
  /**
    * Get a ContactState object representing the state of the contact.
    */
  def getStatus(): ContactState = js.native
  /**
    * Get the duration of the contact state in milliseconds relative to local time.
    */
  def getStatusDuration(): Double = js.native
  /**
    * Get a list of all of the third-party connections, i.e. the list of all
    * connections except for the initial connection, or an empty list if there
    * are no third-party connections.
    */
  def getThirdPartyConnections(): Connection = js.native
  /**
    * Get the type of the contact. This indicates what type of media is
    * carried over the connections of the contact.
    */
  def getType(): String = js.native
  /**
    * Determine whether the contact is in a connected state.
    */
  def isConnected(): Boolean = js.native
  /**
    * Determine whether this is an inbound or outbound contact.
    */
  def isInbound(): Boolean = js.native
  /*
    * Determine whether this contact is a softphone call.
    */
  def isSoftphoneCall(): Boolean = js.native
  /**
    * Provide diagnostic information for the contact in the case
    * something exceptional happens on the front end.
    *
    * @param successFailOptions Optional success and failure callbacks can be provided to determine whether the operation was successful.
    */
  def notifyIssue(successFailOptions: SuccessFailOptions): Unit = js.native
  /**
    * Subscribe a method to be invoked whenever the contact is accepted.
    */
  def onAccepted(callback: ContactCallback): Unit = js.native
  /**
    * Subscribe a method to be invoked when the contact is connected.
    */
  def onConnected(callback: ContactCallback): Unit = js.native
  /**
    * Subscribe a method to be invoked when the contact is connecting.
    */
  def onConnecting(callback: ContactCallback): Unit = js.native
  /**
    * Subscribe a method to be invoked whenever the contact is ended or destroyed.
    */
  def onEnded(callback: ContactCallback): Unit = js.native
  /**
    * Subscribe a method to be invoked when the contact is incoming.
    */
  def onIncoming(callback: ContactCallback): Unit = js.native
  /**
    * Subscribe a method to be invoked whenever the contact is updated.
    */
  def onRefresh(callback: ContactCallback): Unit = js.native
  /**
    * Rotate through the connected and on hold connections of the contact.
    * @param successFailOptions Optional success and failure callbacks can be provided to determine whether the operation was successful.
    */
  def toggleActiveConnections(successFailOptions: SuccessFailOptions): Unit = js.native
}

object Contact {
  @scala.inline
  def apply(
    accept: SuccessFailOptions => Unit,
    addConnection: (Endpoint, SuccessFailOptions) => Unit,
    conferenceConnections: SuccessFailOptions => Unit,
    destroy: SuccessFailOptions => Unit,
    getActiveInitialConnection: () => Connection,
    getAgentConnection: () => Connection,
    getAttributes: () => StringDictionary[Label],
    getConnections: () => js.Array[Connection],
    getContactId: () => String,
    getInitialConnection: () => Connection,
    getOriginalContactId: () => String,
    getQueue: () => Queue,
    getSingleActiveThirdPartyConnection: () => Connection,
    getStatus: () => ContactState,
    getStatusDuration: () => Double,
    getThirdPartyConnections: () => Connection,
    getType: () => String,
    isConnected: () => Boolean,
    isInbound: () => Boolean,
    isSoftphoneCall: () => Boolean,
    notifyIssue: SuccessFailOptions => Unit,
    onAccepted: ContactCallback => Unit,
    onConnected: ContactCallback => Unit,
    onConnecting: ContactCallback => Unit,
    onEnded: ContactCallback => Unit,
    onIncoming: ContactCallback => Unit,
    onRefresh: ContactCallback => Unit,
    toggleActiveConnections: SuccessFailOptions => Unit
  ): Contact = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1(accept), addConnection = js.Any.fromFunction2(addConnection), conferenceConnections = js.Any.fromFunction1(conferenceConnections), destroy = js.Any.fromFunction1(destroy), getActiveInitialConnection = js.Any.fromFunction0(getActiveInitialConnection), getAgentConnection = js.Any.fromFunction0(getAgentConnection), getAttributes = js.Any.fromFunction0(getAttributes), getConnections = js.Any.fromFunction0(getConnections), getContactId = js.Any.fromFunction0(getContactId), getInitialConnection = js.Any.fromFunction0(getInitialConnection), getOriginalContactId = js.Any.fromFunction0(getOriginalContactId), getQueue = js.Any.fromFunction0(getQueue), getSingleActiveThirdPartyConnection = js.Any.fromFunction0(getSingleActiveThirdPartyConnection), getStatus = js.Any.fromFunction0(getStatus), getStatusDuration = js.Any.fromFunction0(getStatusDuration), getThirdPartyConnections = js.Any.fromFunction0(getThirdPartyConnections), getType = js.Any.fromFunction0(getType), isConnected = js.Any.fromFunction0(isConnected), isInbound = js.Any.fromFunction0(isInbound), isSoftphoneCall = js.Any.fromFunction0(isSoftphoneCall), notifyIssue = js.Any.fromFunction1(notifyIssue), onAccepted = js.Any.fromFunction1(onAccepted), onConnected = js.Any.fromFunction1(onConnected), onConnecting = js.Any.fromFunction1(onConnecting), onEnded = js.Any.fromFunction1(onEnded), onIncoming = js.Any.fromFunction1(onIncoming), onRefresh = js.Any.fromFunction1(onRefresh), toggleActiveConnections = js.Any.fromFunction1(toggleActiveConnections))
    __obj.asInstanceOf[Contact]
  }
  @scala.inline
  implicit class ContactOps[Self <: Contact] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccept(value: SuccessFailOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddConnection(value: (Endpoint, SuccessFailOptions) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addConnection")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withConferenceConnections(value: SuccessFailOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conferenceConnections")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDestroy(value: SuccessFailOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetActiveInitialConnection(value: () => Connection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveInitialConnection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAgentConnection(value: () => Connection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAgentConnection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAttributes(value: () => StringDictionary[Label]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttributes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetConnections(value: () => js.Array[Connection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConnections")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetContactId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContactId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetInitialConnection(value: () => Connection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInitialConnection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOriginalContactId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOriginalContactId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetQueue(value: () => Queue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getQueue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSingleActiveThirdPartyConnection(value: () => Connection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSingleActiveThirdPartyConnection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStatus(value: () => ContactState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStatus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStatusDuration(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStatusDuration")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetThirdPartyConnections(value: () => Connection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getThirdPartyConnections")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetType(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsConnected(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isConnected")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsInbound(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInbound")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsSoftphoneCall(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSoftphoneCall")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNotifyIssue(value: SuccessFailOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyIssue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnAccepted(value: ContactCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAccepted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnConnected(value: ContactCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConnected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnConnecting(value: ContactCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConnecting")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnEnded(value: ContactCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnIncoming(value: ContactCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIncoming")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnRefresh(value: ContactCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRefresh")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToggleActiveConnections(value: SuccessFailOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleActiveConnections")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

