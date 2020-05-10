package typingsSlinky.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client extends Resource {
  /* Properties */
  var applications: Applications = js.native
  var asterisk: Asterisk = js.native
  var bridges: Bridges = js.native
  var channels: Channels = js.native
  var deviceStates: DeviceStates = js.native
  var endpoints: Endpoints = js.native
  var events: Events = js.native
  var mailboxes: Mailboxes = js.native
  var playbacks: Playbacks = js.native
  var recordings: Recordings = js.native
  var sounds: Sounds = js.native
  /* Create Methods */
  def Application(): typingsSlinky.ariClient.mod.Application = js.native
  def Application(id: String): typingsSlinky.ariClient.mod.Application = js.native
  def Application(id: String, objValues: IndexableObject): typingsSlinky.ariClient.mod.Application = js.native
  def Asterisk(): typingsSlinky.ariClient.mod.Asterisk = js.native
  def Asterisk(id: String): typingsSlinky.ariClient.mod.Asterisk = js.native
  def Asterisk(id: String, objValues: IndexableObject): typingsSlinky.ariClient.mod.Asterisk = js.native
  def Bridge(): typingsSlinky.ariClient.mod.Bridge = js.native
  def Bridge(id: String): typingsSlinky.ariClient.mod.Bridge = js.native
  def Bridge(id: String, objValues: IndexableObject): typingsSlinky.ariClient.mod.Bridge = js.native
  def Channel(): typingsSlinky.ariClient.mod.Channel = js.native
  def Channel(id: String): typingsSlinky.ariClient.mod.Channel = js.native
  def Channel(id: String, objValues: IndexableObject): typingsSlinky.ariClient.mod.Channel = js.native
  def DeviceState(): typingsSlinky.ariClient.mod.DeviceState = js.native
  def DeviceState(id: String): typingsSlinky.ariClient.mod.DeviceState = js.native
  def DeviceState(id: String, objValues: IndexableObject): typingsSlinky.ariClient.mod.DeviceState = js.native
  def Endpoint(): typingsSlinky.ariClient.mod.Endpoint = js.native
  def Endpoint(id: String): typingsSlinky.ariClient.mod.Endpoint = js.native
  def Endpoint(id: String, objValues: IndexableObject): typingsSlinky.ariClient.mod.Endpoint = js.native
  def LiveRecording(): typingsSlinky.ariClient.mod.LiveRecording = js.native
  def LiveRecording(id: String): typingsSlinky.ariClient.mod.LiveRecording = js.native
  def LiveRecording(id: String, objValues: IndexableObject): typingsSlinky.ariClient.mod.LiveRecording = js.native
  def Mailbox(): typingsSlinky.ariClient.mod.Mailbox = js.native
  def Mailbox(id: String): typingsSlinky.ariClient.mod.Mailbox = js.native
  def Mailbox(id: String, objValues: IndexableObject): typingsSlinky.ariClient.mod.Mailbox = js.native
  def Playback(): typingsSlinky.ariClient.mod.Playback = js.native
  def Playback(id: String): typingsSlinky.ariClient.mod.Playback = js.native
  def Playback(id: String, objValues: IndexableObject): typingsSlinky.ariClient.mod.Playback = js.native
  def Sound(): typingsSlinky.ariClient.mod.Sound = js.native
  def Sound(id: String): typingsSlinky.ariClient.mod.Sound = js.native
  def Sound(id: String, objValues: IndexableObject): typingsSlinky.ariClient.mod.Sound = js.native
  def StoredRecording(): typingsSlinky.ariClient.mod.StoredRecording = js.native
  def StoredRecording(id: String): typingsSlinky.ariClient.mod.StoredRecording = js.native
  def StoredRecording(id: String, objValues: IndexableObject): typingsSlinky.ariClient.mod.StoredRecording = js.native
  def start(apps: String): Unit = js.native
  def start(apps: String, callback: js.Function2[/* err */ js.Error, /* repeated */ js.Any, Unit]): Unit = js.native
  /* Start and Stop Method Overloads */
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
  def stop(): Unit = js.native
}

