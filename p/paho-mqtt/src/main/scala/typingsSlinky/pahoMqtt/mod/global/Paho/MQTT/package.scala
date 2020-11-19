package typingsSlinky.pahoMqtt.mod.global.Paho

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object MQTT {
  
  /**
    * Called when a connection has been lost.
    * @param error A single response object parameter is passed to the onConnectionLost callback containing the
    *  following fields:
    *  <li>errorCode
    *  <li>errorMessage
    */
  type OnConnectionLostHandler = js.Function1[/* error */ typingsSlinky.pahoMqtt.mod.global.Paho.MQTT.MQTTError, scala.Unit]
  
  /**
    * Called when the connect request has failed or timed out.
    * @param e
    *  A single response object parameter is passed to the onFailure callback containing the following fields:
    *  <li><code>invocationContext</code> as passed in with the corresponding field in the connectOptions.
    *  <li><code>errorCode</code> a number indicating the nature of the error.
    *  <li><code>errorMessage</code> text describing the error.
    */
  type OnFailureCallback = js.Function1[
    /* e */ typingsSlinky.pahoMqtt.mod.global.Paho.MQTT.ErrorWithInvocationContext, 
    scala.Unit
  ]
  
  /**
    * Called when a message was delivered or has arrived.
    * @param message The {@link Paho.MQTT.Message} that was delivered or has arrived.
    */
  type OnMessageHandler = js.Function1[/* message */ typingsSlinky.pahoMqtt.mod.global.Paho.MQTT.Message, scala.Unit]
  
  /**
    * Called when the subscribe acknowledgement has been received from the server.
    * @param o
    *  A single response object parameter is passed to the onSuccess callback containing the following fields:
    *  <li><code>invocationContext</code> as passed in with the corresponding field in the connectOptions.
    */
  type OnSubscribeSuccessCallback = js.Function1[
    /* o */ typingsSlinky.pahoMqtt.mod.global.Paho.MQTT.OnSubscribeSuccessParams, 
    scala.Unit
  ]
  
  /**
    * Called when the connect acknowledgement has been received from the server.
    * @param o
    *  A single response object parameter is passed to the onSuccess callback containing the following fields:
    *  <li><code>invocationContext</code> as passed in with the corresponding field in the connectOptions.
    */
  type OnSuccessCallback = js.Function1[
    /* o */ typingsSlinky.pahoMqtt.mod.global.Paho.MQTT.WithInvocationContext, 
    scala.Unit
  ]
  
  type TraceFunction = js.Function1[/* element */ typingsSlinky.pahoMqtt.mod.global.Paho.MQTT.TraceElement, scala.Unit]
  
  type TypedArray = js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array
}
