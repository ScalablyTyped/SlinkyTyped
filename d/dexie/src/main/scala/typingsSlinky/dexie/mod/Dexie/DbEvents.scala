package typingsSlinky.dexie.mod.Dexie

import org.scalajs.dom.raw.IDBVersionChangeEvent
import typingsSlinky.dexie.dexieStrings.blocked
import typingsSlinky.dexie.dexieStrings.populate
import typingsSlinky.dexie.dexieStrings.ready
import typingsSlinky.dexie.dexieStrings.versionchange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DbEvents extends DexieEventSet {
  var blocked: DexieEvent = js.native
  var populate: DexieEvent = js.native
  var ready: DexieOnReadyEvent = js.native
  var versionchange: DexieVersionChangeEvent = js.native
  def apply(eventName: blocked, subscriber: js.Function0[_]): Unit = js.native
  def apply(eventName: populate, subscriber: js.Function0[_]): Unit = js.native
  def apply(eventName: ready, subscriber: js.Function0[_]): Unit = js.native
  def apply(eventName: ready, subscriber: js.Function0[_], bSticky: Boolean): Unit = js.native
  def apply(eventName: versionchange, subscriber: js.Function1[/* event */ IDBVersionChangeEvent, _]): Unit = js.native
}

