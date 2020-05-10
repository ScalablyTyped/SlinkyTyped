package typingsSlinky.ariClient.mod

import typingsSlinky.ariClient.Anon0
import typingsSlinky.ariClient.AnonFilterIndexableObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Application extends Resource {
  var bridge_ids: String | js.Array[String] = js.native
  var channel_ids: String | js.Array[String] = js.native
  var device_names: String | js.Array[String] = js.native
  var endpoint_ids: String | js.Array[String] = js.native
  var events_allowed: IndexableObject | js.Array[IndexableObject] = js.native
  var events_disallowed: IndexableObject | js.Array[IndexableObject] = js.native
  /* Properties */
  var name: String = js.native
  def filter(): js.Promise[Application] = js.native
  def filter(callback: js.Function2[/* err */ js.Error, /* application */ this.type, Unit]): Unit = js.native
  def filter(params: AnonFilterIndexableObject): js.Promise[Application] = js.native
  def filter(
    params: AnonFilterIndexableObject,
    callback: js.Function2[/* err */ js.Error, /* application */ this.type, Unit]
  ): Unit = js.native
  def get(): js.Promise[Application] = js.native
  def get(callback: js.Function2[/* err */ js.Error, /* application */ this.type, Unit]): Unit = js.native
  def list(): js.Promise[js.Array[Application]] = js.native
  /* Methods */
  def list(callback: js.Function2[/* err */ js.Error, /* applications */ js.Array[this.type], Unit]): Unit = js.native
  def subscribe(params: Anon0): js.Promise[Application] = js.native
  def subscribe(params: Anon0, callback: js.Function2[/* err */ js.Error, /* application */ this.type, Unit]): Unit = js.native
  def unsubscribe(params: Anon0): js.Promise[Application] = js.native
  def unsubscribe(params: Anon0, callback: js.Function2[/* err */ js.Error, /* application */ this.type, Unit]): Unit = js.native
}

