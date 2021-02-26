package typingsSlinky.pahoMqtt

import typingsSlinky.pahoMqtt.mod.global.Paho.MQTT.TypedArray
import typingsSlinky.pahoMqtt.pahoMqttNumbers.`3`
import typingsSlinky.pahoMqtt.pahoMqttNumbers.`4`
import typingsSlinky.pahoMqtt.pahoMqttStrings.Debug
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * The JavaScript application communicates to the server using a {@link Paho.MQTT.Client} object.
    *
    * Most applications will create just one Client object and then call its connect() method,
    * however applications can create more than one Client object if they wish.
    * In this case the combination of host, port and clientId attributes must be different for each Client object.
    *
    * The send, subscribe and unsubscribe methods are implemented as asynchronous JavaScript methods
    * (even though the underlying protocol exchange might be synchronous in nature).
    * This means they signal their completion by calling back to the application,
    * via Success or Failure callback functions provided by the application on the method in question.
    * Such callbacks are called at most once per method invocation and do not persist beyond the lifetime
    * of the script that made the invocation.
    *
    * In contrast there are some callback functions, most notably {@link onMessageArrived},
    * that are defined on the {@link Paho.MQTT.Client} object.
    * These may get called multiple times, and aren't directly related to specific method invocations made by the
    * client.
    *
    */
  @JSImport("paho-mqtt", "Client")
  @js.native
  class Client protected ()
    extends typingsSlinky.pahoMqtt.mod.global.Paho.MQTT.Client {
    /**
      * @param hostUri - the address of the messaging server as a fully qualified WebSocket URI
      * @param clientId - the Messaging client identifier, between 1 and 23 characters in length.
      */
    def this(hostUri: String, clientId: String) = this()
    // tslint:disable-line unified-signatures (these cannot actually be neatly unified)
    /**
      * @param host - the address of the messaging server as a DNS name or dotted decimal IP address.
      * @param port - the port number to connect to
      * @param clientId - the Messaging client identifier, between 1 and 23 characters in length.
      */
    def this(host: String, port: Double, clientId: String) = this()
    /**
      * @param host - the address of the messaging server as a DNS name or dotted decimal IP address.
      * @param port - the port number to connect to
      * @param path - the path on the host to connect to - only used if host is not a URI. Default: '/mqtt'.
      * @param clientId - the Messaging client identifier, between 1 and 23 characters in length.
      */
    def this(host: String, port: Double, path: String, clientId: String) = this()
  }
  
  /**
    * An application message, sent or received.
    */
  @JSImport("paho-mqtt", "Message")
  @js.native
  class Message protected ()
    extends typingsSlinky.pahoMqtt.mod.global.Paho.MQTT.Message {
    /**
      * @param payload The message data to be sent.
      */
    def this(payload: String) = this()
    def this(payload: js.typedarray.ArrayBuffer) = this()
    def this(payload: TypedArray) = this()
  }
  
  object global {
    
    object Paho {
      
      /**
        * Send and receive messages using web browsers.
        * <p>
        * This programming interface lets a JavaScript client application use the MQTT V3.1 or
        * V3.1.1 protocol to connect to an MQTT-supporting messaging server.
        *
        * The function supported includes:
        * <ol>
        * <li>Connecting to and disconnecting from a server. The server is identified by its host name and port number.
        * <li>Specifying options that relate to the communications link with the server,
        * for example the frequency of keep-alive heartbeats, and whether SSL/TLS is required.
        * <li>Subscribing to and receiving messages from MQTT Topics.
        * <li>Publishing messages to MQTT Topics.
        * </ol>
        * <p>
        * The API consists of two main objects:
        * <dl>
        * <dt><b>{@link Paho.MQTT.Client}</b></dt>
        * <dd>This contains methods that provide the functionality of the API,
        * including provision of callbacks that notify the application when a message
        * arrives from or is delivered to the messaging server,
        * or when the status of its connection to the messaging server changes.</dd>
        * <dt><b>{@link Paho.MQTT.Message}</b></dt>
        * <dd>This encapsulates the payload of the message along with various attributes
        * associated with its delivery, in particular the destination to which it has
        * been (or is about to be) sent.</dd>
        * </dl>
        * <p>
        * The programming interface validates parameters passed to it, and will throw
        * an Error containing an error message intended for developer use, if it detects
        * an error with any parameter.
        * <p>
        */
      object MQTT {
        
        /**
          * The JavaScript application communicates to the server using a {@link Paho.MQTT.Client} object.
          *
          * Most applications will create just one Client object and then call its connect() method,
          * however applications can create more than one Client object if they wish.
          * In this case the combination of host, port and clientId attributes must be different for each Client object.
          *
          * The send, subscribe and unsubscribe methods are implemented as asynchronous JavaScript methods
          * (even though the underlying protocol exchange might be synchronous in nature).
          * This means they signal their completion by calling back to the application,
          * via Success or Failure callback functions provided by the application on the method in question.
          * Such callbacks are called at most once per method invocation and do not persist beyond the lifetime
          * of the script that made the invocation.
          *
          * In contrast there are some callback functions, most notably {@link onMessageArrived},
          * that are defined on the {@link Paho.MQTT.Client} object.
          * These may get called multiple times, and aren't directly related to specific method invocations made by the
          * client.
          *
          */
        @JSGlobal("Paho.MQTT.Client")
        @js.native
        class Client protected () extends StObject {
          /**
            * @param hostUri - the address of the messaging server as a fully qualified WebSocket URI
            * @param clientId - the Messaging client identifier, between 1 and 23 characters in length.
            */
          def this(hostUri: String, clientId: String) = this()
          // tslint:disable-line unified-signatures (these cannot actually be neatly unified)
          /**
            * @param host - the address of the messaging server as a DNS name or dotted decimal IP address.
            * @param port - the port number to connect to
            * @param clientId - the Messaging client identifier, between 1 and 23 characters in length.
            */
          def this(host: String, port: Double, clientId: String) = this()
          /**
            * @param host - the address of the messaging server as a DNS name or dotted decimal IP address.
            * @param port - the port number to connect to
            * @param path - the path on the host to connect to - only used if host is not a URI. Default: '/mqtt'.
            * @param clientId - the Messaging client identifier, between 1 and 23 characters in length.
            */
          def this(host: String, port: Double, path: String, clientId: String) = this()
          
          /** used when connecting to the server. */
          val clientId: String = js.native
          
          /**
            * Connect this Messaging client to its server.
            * @throws {InvalidState} if the client is not in disconnected state. The client must have received
            *      connectionLost or disconnected before calling connect for a second or subsequent time.
            */
          def connect(): Unit = js.native
          def connect(connectionOptions: ConnectionOptions): Unit = js.native
          
          /**
            * Normal disconnect of this Messaging client from its server.
            *
            * @throws {InvalidState} if the client is already disconnected.
            */
          def disconnect(): Unit = js.native
          
          /**
            * Get the contents of the trace log.
            *
            *  @return tracebuffer containing the time ordered trace records.
            */
          def getTraceLog(): js.Array[_] = js.native
          
          /** the server's DNS hostname or dotted decimal IP address. */
          val host: String = js.native
          
          /**
            * @returns True if the client is currently connected
            */
          def isConnected(): Boolean = js.native
          
          /**
            * called when a connection has been lost. after a connect() method has succeeded.
            * Establish the call back used when a connection has been lost. The connection may be
            * lost because the client initiates a disconnect or because the server or network
            * cause the client to be disconnected. The disconnect call back may be called without
            * the connectionComplete call back being invoked if, for example the client fails to
            * connect.
            * A single response object parameter is passed to the onConnectionLost callback containing the following
            * fields:
            * <li>errorCode
            * <li>errorMessage
            */
          def onConnectionLost(error: MQTTError): Unit = js.native
          /**
            * called when a connection has been lost. after a connect() method has succeeded.
            * Establish the call back used when a connection has been lost. The connection may be
            * lost because the client initiates a disconnect or because the server or network
            * cause the client to be disconnected. The disconnect call back may be called without
            * the connectionComplete call back being invoked if, for example the client fails to
            * connect.
            * A single response object parameter is passed to the onConnectionLost callback containing the following
            * fields:
            * <li>errorCode
            * <li>errorMessage
            */
          @JSName("onConnectionLost")
          var onConnectionLost_Original: OnConnectionLostHandler = js.native
          
          /**
            * called when a message has arrived in this Paho.MQTT.client.
            * Parameters passed to the onMessageArrived callback are:
            * <li> {@link Paho.MQTT.Message} that has arrived.
            */
          def onMessageArrived(message: typingsSlinky.pahoMqtt.mod.global.Paho.MQTT.Message): Unit = js.native
          /**
            * called when a message has arrived in this Paho.MQTT.client.
            * Parameters passed to the onMessageArrived callback are:
            * <li> {@link Paho.MQTT.Message} that has arrived.
            */
          @JSName("onMessageArrived")
          var onMessageArrived_Original: OnMessageHandler = js.native
          
          /**
            * called when a message has been delivered.
            * All processing that this Client will ever do has been completed. So, for example,
            * in the case of a Qos=2 message sent by this client, the PubComp flow has been received from the server
            * and the message has been removed from persistent storage before this callback is invoked.
            * Parameters passed to the onMessageDelivered callback are:
            * <li>{@link Paho.MQTT.Message} that was delivered.
            */
          def onMessageDelivered(message: typingsSlinky.pahoMqtt.mod.global.Paho.MQTT.Message): Unit = js.native
          /**
            * called when a message has been delivered.
            * All processing that this Client will ever do has been completed. So, for example,
            * in the case of a Qos=2 message sent by this client, the PubComp flow has been received from the server
            * and the message has been removed from persistent storage before this callback is invoked.
            * Parameters passed to the onMessageDelivered callback are:
            * <li>{@link Paho.MQTT.Message} that was delivered.
            */
          @JSName("onMessageDelivered")
          var onMessageDelivered_Original: OnMessageHandler = js.native
          
          /** the server's path. */
          val path: String = js.native
          
          /** the server's port. */
          val port: Double = js.native
          
          /**
            * Send a message to the consumers of the destination in the Message.
            *
            * @param message - <b>mandatory</b> The {@link Paho.MQTT.Message} object to be sent.
            * @throws {InvalidState} if the client is not connected.
            */
          def send(message: typingsSlinky.pahoMqtt.mod.global.Paho.MQTT.Message): Unit = js.native
          /**
            * Send a message to the consumers of the destination in the Message.
            *
            * @param topic - <b>mandatory</b> The name of the destination to which the message is to be sent.
            * @param payload - The message data to be sent.
            * @param qos The Quality of Service used to deliver the message.
            *        <dl>
            *            <dt>0 Best effort (default).
            *            <dt>1 At least once.
            *            <dt>2 Exactly once.
            *        </dl>
            * @param retained If true, the message is to be retained by the server and delivered to both
            * current and future subscriptions. If false the server only delivers the message to current subscribers,
            * this is the default for new Messages. A received message has the retained boolean set to true if the
            * message was published with the retained boolean set to true and the subscrption was made after the
            * message has been published.
            * @throws {InvalidState} if the client is not connected.
            */
          def send(topic: String, payload: String): Unit = js.native
          def send(topic: String, payload: String, qos: js.UndefOr[scala.Nothing], retained: Boolean): Unit = js.native
          def send(topic: String, payload: String, qos: Qos): Unit = js.native
          def send(topic: String, payload: String, qos: Qos, retained: Boolean): Unit = js.native
          def send(topic: String, payload: js.typedarray.ArrayBuffer): Unit = js.native
          def send(
            topic: String,
            payload: js.typedarray.ArrayBuffer,
            qos: js.UndefOr[scala.Nothing],
            retained: Boolean
          ): Unit = js.native
          def send(topic: String, payload: js.typedarray.ArrayBuffer, qos: Qos): Unit = js.native
          def send(topic: String, payload: js.typedarray.ArrayBuffer, qos: Qos, retained: Boolean): Unit = js.native
          
          /**
            * Start tracing.
            */
          def startTrace(): Unit = js.native
          
          /**
            * Stop tracing.
            */
          def stopTrace(): Unit = js.native
          
          /**
            * Subscribe for messages, request receipt of a copy of messages sent to the destinations described by the
            * filter.
            *
            * @param filter A filter describing the destinations to receive messages from.
            * @param subcribeOptions Used to control the subscription
            * @throws {InvalidState} if the client is not in connected state.
            */
          def subscribe(filter: String): Unit = js.native
          def subscribe(filter: String, subcribeOptions: SubscribeOptions): Unit = js.native
          
          /** function called with trace information, if set */
          var trace: js.UndefOr[TraceFunction] = js.native
          
          /**
            * Unsubscribe for messages, stop receiving messages sent to destinations described by the filter.
            *
            * @param filter - describing the destinations to receive messages from.
            * @param unsubscribeOptions - used to control the subscription
            * @throws {InvalidState} if the client is not in connected state.
            */
          def unsubscribe(filter: String): Unit = js.native
          def unsubscribe(filter: String, unsubcribeOptions: UnsubscribeOptions): Unit = js.native
        }
        
        /**
          * An application message, sent or received.
          */
        @JSGlobal("Paho.MQTT.Message")
        @js.native
        class Message protected () extends StObject {
          /**
            * @param payload The message data to be sent.
            */
          def this(payload: String) = this()
          def this(payload: js.typedarray.ArrayBuffer) = this()
          def this(payload: TypedArray) = this()
          
          /**
            * The name of the destination to which the message is to be sent
            * (for messages about to be sent) or the name of the destination from which the message has been received.
            * (for messages received by the onMessage function).
            */
          var destinationName: String = js.native
          
          /**
            * If true, this message might be a duplicate of one which has already been received.
            * This is only set on messages received from the server.
            */
          val duplicate: Boolean = js.native
          
          /**
            * The payload.
            * @return if payload is a string. Return the original otherwise.
            */
          val payloadBytes: js.typedarray.ArrayBuffer | TypedArray = js.native
          
          /**
            *  The payload as a string if the payload consists of valid UTF-8 characters.
            *  @throw {Error} if the payload is not valid UTF-8
            */
          val payloadString: String = js.native
          
          /**
            * The Quality of Service used to deliver the message.
            * <dl>
            *     <dt>0 Best effort (default).
            *     <dt>1 At least once.
            *     <dt>2 Exactly once.
            * </dl>
            *
            * @default 0
            */
          var qos: Qos = js.native
          
          /**
            * If true, the message is to be retained by the server and delivered to both current and future
            * subscriptions. If false the server only delivers the message to current subscribers, this is the default
            * for new Messages. A received message has the retained boolean set to true if the message was published
            * with the retained boolean set to true and the subscription was made after the message has been published.
            *
            * @default false
            */
          var retained: Boolean = js.native
        }
        
        /**
          * Attributes used with a connection.
          */
        @js.native
        trait ConnectionOptions extends StObject {
          
          /**
            * If true(default) the client and server persistent state is deleted on successful connect.
            * @default true
            */
          var cleanSession: js.UndefOr[Boolean] = js.native
          
          /**
            * If present this contains either a set of hostnames or fully qualified
            * WebSocket URIs (ws://example.com:1883/mqtt), that are tried in order in place of the host and port
            * paramater on the construtor. The hosts are tried one at at time in order until one of then succeeds.
            */
          var hosts: js.UndefOr[js.Array[String]] = js.native
          
          /** Passed to the onSuccess callback or onFailure callback. */
          var invocationContext: js.UndefOr[js.Any] = js.native
          
          /**
            * The server disconnects this client if there is no activity for this number of seconds.
            * @default The default value of 60 seconds is assumed if not set.
            */
          var keepAliveInterval: js.UndefOr[Double] = js.native
          
          /**
            * Specifies the mqtt version to use when connecting
            * <dl>
            *     <dt>3 - MQTT 3.1</dt>
            *     <dt>4 - MQTT 3.1.1 (default)</dt>
            * </dl>
            * @default 4
            */
          var mqttVersion: js.UndefOr[`3` | `4`] = js.native
          
          /**
            * Called when the connect request has failed or timed out.
            */
          var onFailure: js.UndefOr[OnFailureCallback] = js.native
          
          /**
            * Called when the connect acknowledgement has been received from the server.
            */
          var onSuccess: js.UndefOr[OnSuccessCallback] = js.native
          
          /** Authentication password for this connection. */
          var password: js.UndefOr[String] = js.native
          
          /**
            * If present the set of ports matching the hosts. If hosts contains URIs, this property is not used.
            */
          var ports: js.UndefOr[js.Array[Double]] = js.native
          
          /**
            * If the connect has not succeeded within this number of seconds, it is deemed to have failed.
            * @default The default is 30 seconds.
            */
          var timeout: js.UndefOr[Double] = js.native
          
          /** If present and true, use an SSL Websocket connection. */
          var useSSL: js.UndefOr[Boolean] = js.native
          
          /** Authentication username for this connection. */
          var userName: js.UndefOr[String] = js.native
          
          /** Sent by the server when the client disconnects abnormally. */
          var willMessage: js.UndefOr[typingsSlinky.pahoMqtt.mod.global.Paho.MQTT.Message] = js.native
        }
        object ConnectionOptions {
          
          @scala.inline
          def apply(): ConnectionOptions = {
            val __obj = js.Dynamic.literal()
            __obj.asInstanceOf[ConnectionOptions]
          }
          
          @scala.inline
          implicit class ConnectionOptionsMutableBuilder[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setCleanSession(value: Boolean): Self = StObject.set(x, "cleanSession", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setCleanSessionUndefined: Self = StObject.set(x, "cleanSession", js.undefined)
            
            @scala.inline
            def setHosts(value: js.Array[String]): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setHostsUndefined: Self = StObject.set(x, "hosts", js.undefined)
            
            @scala.inline
            def setHostsVarargs(value: String*): Self = StObject.set(x, "hosts", js.Array(value :_*))
            
            @scala.inline
            def setInvocationContext(value: js.Any): Self = StObject.set(x, "invocationContext", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setInvocationContextUndefined: Self = StObject.set(x, "invocationContext", js.undefined)
            
            @scala.inline
            def setKeepAliveInterval(value: Double): Self = StObject.set(x, "keepAliveInterval", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setKeepAliveIntervalUndefined: Self = StObject.set(x, "keepAliveInterval", js.undefined)
            
            @scala.inline
            def setMqttVersion(value: `3` | `4`): Self = StObject.set(x, "mqttVersion", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setMqttVersionUndefined: Self = StObject.set(x, "mqttVersion", js.undefined)
            
            @scala.inline
            def setOnFailure(value: /* e */ ErrorWithInvocationContext => Unit): Self = StObject.set(x, "onFailure", js.Any.fromFunction1(value))
            
            @scala.inline
            def setOnFailureUndefined: Self = StObject.set(x, "onFailure", js.undefined)
            
            @scala.inline
            def setOnSuccess(value: /* o */ WithInvocationContext => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1(value))
            
            @scala.inline
            def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
            
            @scala.inline
            def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
            
            @scala.inline
            def setPorts(value: js.Array[Double]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
            
            @scala.inline
            def setPortsVarargs(value: Double*): Self = StObject.set(x, "ports", js.Array(value :_*))
            
            @scala.inline
            def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
            
            @scala.inline
            def setUseSSL(value: Boolean): Self = StObject.set(x, "useSSL", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setUseSSLUndefined: Self = StObject.set(x, "useSSL", js.undefined)
            
            @scala.inline
            def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
            
            @scala.inline
            def setWillMessage(value: typingsSlinky.pahoMqtt.mod.global.Paho.MQTT.Message): Self = StObject.set(x, "willMessage", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setWillMessageUndefined: Self = StObject.set(x, "willMessage", js.undefined)
          }
        }
        
        @js.native
        trait ErrorWithInvocationContext
          extends MQTTError
             with WithInvocationContext
        object ErrorWithInvocationContext {
          
          @scala.inline
          def apply(errorCode: Double, errorMessage: String, invocationContext: js.Any): ErrorWithInvocationContext = {
            val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], invocationContext = invocationContext.asInstanceOf[js.Any])
            __obj.asInstanceOf[ErrorWithInvocationContext]
          }
        }
        
        @js.native
        trait MQTTError extends StObject {
          
          /** A number indicating the nature of the error. */
          var errorCode: Double = js.native
          
          /** Text describing the error */
          var errorMessage: String = js.native
        }
        object MQTTError {
          
          @scala.inline
          def apply(errorCode: Double, errorMessage: String): MQTTError = {
            val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
            __obj.asInstanceOf[MQTTError]
          }
          
          @scala.inline
          implicit class MQTTErrorMutableBuilder[Self <: MQTTError] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
          }
        }
        
        /**
          * Called when a connection has been lost.
          * @param error A single response object parameter is passed to the onConnectionLost callback containing the
          *  following fields:
          *  <li>errorCode
          *  <li>errorMessage
          */
        type OnConnectionLostHandler = js.Function1[/* error */ MQTTError, Unit]
        
        /**
          * Called when the connect request has failed or timed out.
          * @param e
          *  A single response object parameter is passed to the onFailure callback containing the following fields:
          *  <li><code>invocationContext</code> as passed in with the corresponding field in the connectOptions.
          *  <li><code>errorCode</code> a number indicating the nature of the error.
          *  <li><code>errorMessage</code> text describing the error.
          */
        type OnFailureCallback = js.Function1[/* e */ ErrorWithInvocationContext, Unit]
        
        /**
          * Called when a message was delivered or has arrived.
          * @param message The {@link Paho.MQTT.Message} that was delivered or has arrived.
          */
        type OnMessageHandler = js.Function1[/* message */ typingsSlinky.pahoMqtt.mod.global.Paho.MQTT.Message, Unit]
        
        /**
          * Called when the subscribe acknowledgement has been received from the server.
          * @param o
          *  A single response object parameter is passed to the onSuccess callback containing the following fields:
          *  <li><code>invocationContext</code> as passed in with the corresponding field in the connectOptions.
          */
        type OnSubscribeSuccessCallback = js.Function1[/* o */ OnSubscribeSuccessParams, Unit]
        
        @js.native
        trait OnSubscribeSuccessParams extends WithInvocationContext {
          
          var grantedQos: Qos = js.native
        }
        object OnSubscribeSuccessParams {
          
          @scala.inline
          def apply(grantedQos: Qos, invocationContext: js.Any): OnSubscribeSuccessParams = {
            val __obj = js.Dynamic.literal(grantedQos = grantedQos.asInstanceOf[js.Any], invocationContext = invocationContext.asInstanceOf[js.Any])
            __obj.asInstanceOf[OnSubscribeSuccessParams]
          }
          
          @scala.inline
          implicit class OnSubscribeSuccessParamsMutableBuilder[Self <: OnSubscribeSuccessParams] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setGrantedQos(value: Qos): Self = StObject.set(x, "grantedQos", value.asInstanceOf[js.Any])
          }
        }
        
        /**
          * Called when the connect acknowledgement has been received from the server.
          * @param o
          *  A single response object parameter is passed to the onSuccess callback containing the following fields:
          *  <li><code>invocationContext</code> as passed in with the corresponding field in the connectOptions.
          */
        type OnSuccessCallback = js.Function1[/* o */ WithInvocationContext, Unit]
        
        /**
          * The Quality of Service used to deliver a message.
          * <dl>
          *    <dt>0 Best effort (default).</dt>
          *    <dt>1 At least once.</dt>
          *    <dt>2 Exactly once.</dt>
          * </dl>
          */
        /* Rewritten from type alias, can be one of: 
          - typingsSlinky.pahoMqtt.pahoMqttNumbers.`0`
          - typingsSlinky.pahoMqtt.pahoMqttNumbers.`1`
          - typingsSlinky.pahoMqtt.pahoMqttNumbers.`2`
        */
        trait Qos extends StObject
        object Qos {
          
          @scala.inline
          def `0`: typingsSlinky.pahoMqtt.pahoMqttNumbers.`0` = 0.asInstanceOf[typingsSlinky.pahoMqtt.pahoMqttNumbers.`0`]
          
          @scala.inline
          def `1`: typingsSlinky.pahoMqtt.pahoMqttNumbers.`1` = 1.asInstanceOf[typingsSlinky.pahoMqtt.pahoMqttNumbers.`1`]
          
          @scala.inline
          def `2`: typingsSlinky.pahoMqtt.pahoMqttNumbers.`2` = 2.asInstanceOf[typingsSlinky.pahoMqtt.pahoMqttNumbers.`2`]
        }
        
        /**
          * Used to control a subscription
          */
        @js.native
        trait SubscribeOptions extends StObject {
          
          /** passed to the onSuccess callback or onFailure callback. */
          var invocationContext: js.UndefOr[js.Any] = js.native
          
          /** called when the subscribe request has failed or timed out. */
          var onFailure: js.UndefOr[OnFailureCallback] = js.native
          
          /** called when the subscribe acknowledgement has been received from the server. */
          var onSuccess: js.UndefOr[OnSubscribeSuccessCallback] = js.native
          
          /** the maximum qos of any publications sent as a result of making this subscription. */
          var qos: js.UndefOr[Qos] = js.native
          
          /**
            * timeout which, if present, determines the number of seconds after which the onFailure calback is called.
            * The presence of a timeout does not prevent the onSuccess callback from being called when the subscribe
            * completes.
            */
          var timeout: js.UndefOr[Double] = js.native
        }
        object SubscribeOptions {
          
          @scala.inline
          def apply(): SubscribeOptions = {
            val __obj = js.Dynamic.literal()
            __obj.asInstanceOf[SubscribeOptions]
          }
          
          @scala.inline
          implicit class SubscribeOptionsMutableBuilder[Self <: SubscribeOptions] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setInvocationContext(value: js.Any): Self = StObject.set(x, "invocationContext", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setInvocationContextUndefined: Self = StObject.set(x, "invocationContext", js.undefined)
            
            @scala.inline
            def setOnFailure(value: /* e */ ErrorWithInvocationContext => Unit): Self = StObject.set(x, "onFailure", js.Any.fromFunction1(value))
            
            @scala.inline
            def setOnFailureUndefined: Self = StObject.set(x, "onFailure", js.undefined)
            
            @scala.inline
            def setOnSuccess(value: /* o */ OnSubscribeSuccessParams => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1(value))
            
            @scala.inline
            def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
            
            @scala.inline
            def setQos(value: Qos): Self = StObject.set(x, "qos", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setQosUndefined: Self = StObject.set(x, "qos", js.undefined)
            
            @scala.inline
            def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
          }
        }
        
        @js.native
        trait TraceElement extends StObject {
          
          var message: String = js.native
          
          var severity: Debug = js.native
        }
        object TraceElement {
          
          @scala.inline
          def apply(message: String, severity: Debug): TraceElement = {
            val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
            __obj.asInstanceOf[TraceElement]
          }
          
          @scala.inline
          implicit class TraceElementMutableBuilder[Self <: TraceElement] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setSeverity(value: Debug): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
          }
        }
        
        type TraceFunction = js.Function1[/* element */ TraceElement, Unit]
        
        type TypedArray = js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array
        
        @js.native
        trait UnsubscribeOptions extends StObject {
          
          /** passed to the onSuccess callback or onFailure callback.  */
          var invocationContext: js.UndefOr[js.Any] = js.native
          
          /** called when the unsubscribe request has failed or timed out. */
          var onFailure: js.UndefOr[OnFailureCallback] = js.native
          
          /** called when the unsubscribe acknowledgement has been received from the server. */
          var onSuccess: js.UndefOr[OnSuccessCallback] = js.native
          
          /**
            * timeout which, if present, determines the number of seconds after which the onFailure calback is called.
            * The presence of a timeout does not prevent the onSuccess callback from being called when the unsubscribe
            * completes.
            */
          var timeout: js.UndefOr[Double] = js.native
        }
        object UnsubscribeOptions {
          
          @scala.inline
          def apply(): UnsubscribeOptions = {
            val __obj = js.Dynamic.literal()
            __obj.asInstanceOf[UnsubscribeOptions]
          }
          
          @scala.inline
          implicit class UnsubscribeOptionsMutableBuilder[Self <: UnsubscribeOptions] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setInvocationContext(value: js.Any): Self = StObject.set(x, "invocationContext", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setInvocationContextUndefined: Self = StObject.set(x, "invocationContext", js.undefined)
            
            @scala.inline
            def setOnFailure(value: /* e */ ErrorWithInvocationContext => Unit): Self = StObject.set(x, "onFailure", js.Any.fromFunction1(value))
            
            @scala.inline
            def setOnFailureUndefined: Self = StObject.set(x, "onFailure", js.undefined)
            
            @scala.inline
            def setOnSuccess(value: /* o */ WithInvocationContext => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1(value))
            
            @scala.inline
            def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
            
            @scala.inline
            def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
          }
        }
        
        @js.native
        trait WithInvocationContext extends StObject {
          
          /**
            * <code>invocationContext</code> as passed in with the corresponding field in the connectOptions or
            * subscribeOptions.
            */
          var invocationContext: js.Any = js.native
        }
        object WithInvocationContext {
          
          @scala.inline
          def apply(invocationContext: js.Any): WithInvocationContext = {
            val __obj = js.Dynamic.literal(invocationContext = invocationContext.asInstanceOf[js.Any])
            __obj.asInstanceOf[WithInvocationContext]
          }
          
          @scala.inline
          implicit class WithInvocationContextMutableBuilder[Self <: WithInvocationContext] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setInvocationContext(value: js.Any): Self = StObject.set(x, "invocationContext", value.asInstanceOf[js.Any])
          }
        }
      }
    }
  }
}
