package typingsSlinky.pahoDashMqtt.pahoDashMqttMod._Global_.Paho

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MQTT {
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
  type OnMessageHandler = js.Function1[
    /* message */ typingsSlinky.pahoDashMqtt.pahoDashMqttMod._Global_.Paho.MQTT.Message, 
    Unit
  ]
  /**
    * Called when the subscribe acknowledgement has been received from the server.
    * @param o
    *  A single response object parameter is passed to the onSuccess callback containing the following fields:
    *  <li><code>invocationContext</code> as passed in with the corresponding field in the connectOptions.
    */
  type OnSubscribeSuccessCallback = js.Function1[/* o */ OnSubscribeSuccessParams, Unit]
  /**
    * Called when the connect acknowledgement has been received from the server.
    * @param o
    *  A single response object parameter is passed to the onSuccess callback containing the following fields:
    *  <li><code>invocationContext</code> as passed in with the corresponding field in the connectOptions.
    */
  type OnSuccessCallback = js.Function1[/* o */ WithInvocationContext, Unit]
  type TraceFunction = js.Function1[/* element */ TraceElement, Unit]
  type TypedArray = scala.scalajs.js.typedarray.Int8Array | scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Uint8ClampedArray | scala.scalajs.js.typedarray.Int16Array | scala.scalajs.js.typedarray.Uint16Array | scala.scalajs.js.typedarray.Int32Array | scala.scalajs.js.typedarray.Uint32Array | scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Float64Array
}
