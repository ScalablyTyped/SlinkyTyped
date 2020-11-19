package typingsSlinky.awsIotDeviceSdk.mod

import typingsSlinky.awsIotDeviceSdk.awsIotDeviceSdkStrings.close
import typingsSlinky.awsIotDeviceSdk.awsIotDeviceSdkStrings.connect
import typingsSlinky.awsIotDeviceSdk.awsIotDeviceSdkStrings.error
import typingsSlinky.awsIotDeviceSdk.awsIotDeviceSdkStrings.message
import typingsSlinky.awsIotDeviceSdk.awsIotDeviceSdkStrings.offline
import typingsSlinky.awsIotDeviceSdk.awsIotDeviceSdkStrings.reconnect
import typingsSlinky.mqtt.clientMod.ClientSubscribeCallback
import typingsSlinky.mqtt.clientMod.PacketCallback
import typingsSlinky.mqtt.clientOptionsMod.IClientPublishOptions
import typingsSlinky.mqtt.clientOptionsMod.IClientSubscribeOptions
import typingsSlinky.mqtt.mod.Client
import typingsSlinky.node.Buffer
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-iot-device-sdk", "device")
@js.native
/**
  * Returns a wrapper for the mqtt.Client() class, configured for a TLS
  * connection with the AWS IoT platform and with arguments as specified
  * in options.
  */
class device () extends EventEmitter {
  def this(options: DeviceOptions) = this()
  
  /**
    * end - close connection
    *
    * @param force passing it to true will close the client right away, without waiting for the in-flight messages to be acked.
    *     This parameter is optional.
    * @param callback
    */
  def end(): Client = js.native
  def end(force: js.UndefOr[scala.Nothing], callback: js.Function): Client = js.native
  def end(force: Boolean): Client = js.native
  def end(force: Boolean, callback: js.Function): Client = js.native
  
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
  // Error | string comes from:
  // https://github.com/aws/aws-iot-device-sdk-js/blob/97b0b46/device/index.js#L744
  // Remove when https://github.com/aws/aws-iot-device-sdk-js/issues/95 is fixed
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* error */ js.Error | String, Unit]): this.type = js.native
  /** Emitted when a message is received on a topic not related to any Thing Shadows */
  @JSName("on")
  def on_message(event: message, listener: js.Function2[/* topic */ String, /* payload */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_offline(event: offline, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_reconnect(event: reconnect, listener: js.Function0[Unit]): this.type = js.native
  
  def publish(topic: String, message: String): Client = js.native
  def publish(
    topic: String,
    message: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]
  ): Client = js.native
  def publish(topic: String, message: String, options: IClientPublishOptions): Client = js.native
  def publish(
    topic: String,
    message: String,
    options: IClientPublishOptions,
    callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]
  ): Client = js.native
  // The following publish, subscribe, unsubscribe and end Definitions
  // are derived from the mqtt definition as they are re-surfaced through
  // thingShadow
  // https://github.com/DefinitelyTyped/DefinitelyTyped/blob/e7772769fab8c206449ce9673cac417370330aa9/mqtt/mqtt.d.ts#L199
  /**
    * Publish a message to a topic
    *
    * @param topic to publish to
    * @param message to publish
    * @param publish options
    * @param called when publish succeeds or fails
    */
  def publish(topic: String, message: Buffer): Client = js.native
  def publish(
    topic: String,
    message: Buffer,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]
  ): Client = js.native
  def publish(topic: String, message: Buffer, options: IClientPublishOptions): Client = js.native
  def publish(
    topic: String,
    message: Buffer,
    options: IClientPublishOptions,
    callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]
  ): Client = js.native
  
  /**
    * Subscribe to a topic or topics
    * @param topic to subscribe to or an Array of topics to subscribe to. It can also be an object.
    * @param the options to subscribe with
    * @param callback fired on suback
    */
  def subscribe(topic: String): Client = js.native
  def subscribe(topic: String, options: js.UndefOr[scala.Nothing], callback: ClientSubscribeCallback): Client = js.native
  def subscribe(topic: String, options: IClientSubscribeOptions): Client = js.native
  def subscribe(topic: String, options: IClientSubscribeOptions, callback: ClientSubscribeCallback): Client = js.native
  def subscribe(topic: js.Array[String]): Client = js.native
  def subscribe(topic: js.Array[String], options: js.UndefOr[scala.Nothing], callback: ClientSubscribeCallback): Client = js.native
  def subscribe(topic: js.Array[String], options: IClientSubscribeOptions): Client = js.native
  def subscribe(topic: js.Array[String], options: IClientSubscribeOptions, callback: ClientSubscribeCallback): Client = js.native
  
  /**
    * Unsubscribe from a topic or topics
    *
    * @param topic  is a String topic or an array of topics to unsubscribe from
    * @param callback  fired on unsuback
    */
  def unsubscribe(topic: String): Client = js.native
  def unsubscribe(topic: String, callback: PacketCallback): Client = js.native
  def unsubscribe(topic: js.Array[String]): Client = js.native
  def unsubscribe(topic: js.Array[String], callback: PacketCallback): Client = js.native
  
  /**
    * Update the credentials set used to authenticate via WebSocket/SigV4.
    *
    * This method is designed to be invoked during the callback of the
    * getCredentialsForIdentity method in the AWS SDK for JavaScript.
    */
  def updateWebSocketCredentials(accessKeyId: String, secretKey: String, sessionToken: String, expiration: js.Date): Unit = js.native
}
