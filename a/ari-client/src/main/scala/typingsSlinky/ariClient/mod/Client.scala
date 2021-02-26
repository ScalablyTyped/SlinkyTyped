package typingsSlinky.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Client extends Resource {
  
  /**
    *  Creates a new Application instance.
    */
  def Application(): typingsSlinky.ariClient.mod.Application = js.native
  def Application(id: js.UndefOr[scala.Nothing], objValues: IndexableObject): typingsSlinky.ariClient.mod.Application = js.native
  def Application(id: String): typingsSlinky.ariClient.mod.Application = js.native
  def Application(id: String, objValues: IndexableObject): typingsSlinky.ariClient.mod.Application = js.native
  
  /**
    *  Creates a new Asterisk instance.
    */
  def Asterisk(): typingsSlinky.ariClient.mod.Asterisk = js.native
  def Asterisk(id: js.UndefOr[scala.Nothing], objValues: IndexableObject): typingsSlinky.ariClient.mod.Asterisk = js.native
  def Asterisk(id: String): typingsSlinky.ariClient.mod.Asterisk = js.native
  def Asterisk(id: String, objValues: IndexableObject): typingsSlinky.ariClient.mod.Asterisk = js.native
  
  /**
    *  Creates a new Bridge instance.
    */
  def Bridge(): typingsSlinky.ariClient.mod.Bridge = js.native
  def Bridge(id: js.UndefOr[scala.Nothing], objValues: IndexableObject): typingsSlinky.ariClient.mod.Bridge = js.native
  def Bridge(id: String): typingsSlinky.ariClient.mod.Bridge = js.native
  def Bridge(id: String, objValues: IndexableObject): typingsSlinky.ariClient.mod.Bridge = js.native
  
  /**
    *  Creates a new Channel instance.
    */
  def Channel(): typingsSlinky.ariClient.mod.Channel = js.native
  def Channel(id: js.UndefOr[scala.Nothing], objValues: IndexableObject): typingsSlinky.ariClient.mod.Channel = js.native
  def Channel(id: String): typingsSlinky.ariClient.mod.Channel = js.native
  def Channel(id: String, objValues: IndexableObject): typingsSlinky.ariClient.mod.Channel = js.native
  
  /**
    *  Creates a new DeviceState instance.
    */
  def DeviceState(): typingsSlinky.ariClient.mod.DeviceState = js.native
  def DeviceState(id: js.UndefOr[scala.Nothing], objValues: IndexableObject): typingsSlinky.ariClient.mod.DeviceState = js.native
  def DeviceState(id: String): typingsSlinky.ariClient.mod.DeviceState = js.native
  def DeviceState(id: String, objValues: IndexableObject): typingsSlinky.ariClient.mod.DeviceState = js.native
  
  /**
    *  Creates a new Endpoint instance.
    */
  def Endpoint(): typingsSlinky.ariClient.mod.Endpoint = js.native
  def Endpoint(id: js.UndefOr[scala.Nothing], objValues: IndexableObject): typingsSlinky.ariClient.mod.Endpoint = js.native
  def Endpoint(id: String): typingsSlinky.ariClient.mod.Endpoint = js.native
  def Endpoint(id: String, objValues: IndexableObject): typingsSlinky.ariClient.mod.Endpoint = js.native
  
  /**
    *  Creates a new LiveRecording instance.
    */
  def LiveRecording(): typingsSlinky.ariClient.mod.LiveRecording = js.native
  def LiveRecording(id: js.UndefOr[scala.Nothing], objValues: IndexableObject): typingsSlinky.ariClient.mod.LiveRecording = js.native
  def LiveRecording(id: String): typingsSlinky.ariClient.mod.LiveRecording = js.native
  def LiveRecording(id: String, objValues: IndexableObject): typingsSlinky.ariClient.mod.LiveRecording = js.native
  
  /**
    *  Creates a new Mailbox instance.
    */
  def Mailbox(): typingsSlinky.ariClient.mod.Mailbox = js.native
  def Mailbox(id: js.UndefOr[scala.Nothing], objValues: IndexableObject): typingsSlinky.ariClient.mod.Mailbox = js.native
  def Mailbox(id: String): typingsSlinky.ariClient.mod.Mailbox = js.native
  def Mailbox(id: String, objValues: IndexableObject): typingsSlinky.ariClient.mod.Mailbox = js.native
  
  /**
    *  Creates a new Playback instance.
    */
  def Playback(): typingsSlinky.ariClient.mod.Playback = js.native
  def Playback(id: js.UndefOr[scala.Nothing], objValues: IndexableObject): typingsSlinky.ariClient.mod.Playback = js.native
  def Playback(id: String): typingsSlinky.ariClient.mod.Playback = js.native
  def Playback(id: String, objValues: IndexableObject): typingsSlinky.ariClient.mod.Playback = js.native
  
  /**
    *  Creates a new Sound instance.
    */
  def Sound(): typingsSlinky.ariClient.mod.Sound = js.native
  def Sound(id: js.UndefOr[scala.Nothing], objValues: IndexableObject): typingsSlinky.ariClient.mod.Sound = js.native
  def Sound(id: String): typingsSlinky.ariClient.mod.Sound = js.native
  def Sound(id: String, objValues: IndexableObject): typingsSlinky.ariClient.mod.Sound = js.native
  
  /**
    *  Creates a new StoredRecording instance.
    */
  def StoredRecording(): typingsSlinky.ariClient.mod.StoredRecording = js.native
  def StoredRecording(id: js.UndefOr[scala.Nothing], objValues: IndexableObject): typingsSlinky.ariClient.mod.StoredRecording = js.native
  def StoredRecording(id: String): typingsSlinky.ariClient.mod.StoredRecording = js.native
  def StoredRecording(id: String, objValues: IndexableObject): typingsSlinky.ariClient.mod.StoredRecording = js.native
  
  /**
    *  Available Applications resources.
    */
  var applications: Applications = js.native
  
  /**
    *  Available Asterisk resource.
    */
  var asterisk: Asterisk = js.native
  
  /**
    *  Available Bridges resources.
    */
  var bridges: Bridges = js.native
  
  /**
    *  Available Channels resources.
    */
  var channels: Channels = js.native
  
  /**
    *  Available DeviceStates resources.
    */
  var deviceStates: DeviceStates = js.native
  
  /**
    *  Available Endpoints resources.
    */
  var endpoints: Endpoints = js.native
  
  /**
    *  Available Events resources.
    */
  var events: Events = js.native
  
  /**
    *  Available Mailboxes resources.
    */
  var mailboxes: Mailboxes = js.native
  
  /**
    *  Pings the WebSocket.
    */
  def ping(): Unit = js.native
  
  /**
    *  Available Playbacks resources.
    */
  var playbacks: Playbacks = js.native
  
  /**
    *  Available Recordings resources.
    */
  var recordings: Recordings = js.native
  
  /**
    *  Available Sounds resources.
    */
  var sounds: Sounds = js.native
  
  /**
    *  Creates the WebSocket connection, subscribing to the given apps.
    *
    *  @param apps - Name or array of names of the applications to be started.
    *  @param [callback] - The callback to be called after applications have started.
    */
  def start(apps: String): Unit = js.native
  def start(apps: String, callback: js.Function2[/* err */ js.Error, /* repeated */ js.Any, Unit]): Unit = js.native
  /**
    *  Creates the WebSocket connection, subscribing to the given apps.
    *
    *  @param apps - Name or array of names of the applications to be started.
    *  @param subscribeAll - Subscribe to all Asterisk events (true/false).
    *  @param [callback] - The callback to be called after applications have started.
    */
  def start(apps: String, subscribeAll: Boolean): Unit = js.native
  def start(
    apps: String,
    subscribeAll: Boolean,
    callback: js.Function2[/* err */ js.Error, /* repeated */ js.Any, Unit]
  ): Unit = js.native
  def start(apps: js.Array[String]): Unit = js.native
  def start(apps: js.Array[String], callback: js.Function2[/* err */ js.Error, /* repeated */ js.Any, Unit]): Unit = js.native
  def start(apps: js.Array[String], subscribeAll: Boolean): Unit = js.native
  def start(
    apps: js.Array[String],
    subscribeAll: Boolean,
    callback: js.Function2[/* err */ js.Error, /* repeated */ js.Any, Unit]
  ): Unit = js.native
  
  /**
    *  Closes the WebSocket connection.
    */
  def stop(): Unit = js.native
}
