package typingsSlinky.dexie.mod

import org.scalajs.dom.raw.IDBVersionChangeEvent
import typingsSlinky.dexie.dexieStrings.blocked
import typingsSlinky.dexie.dexieStrings.populate
import typingsSlinky.dexie.dexieStrings.ready
import typingsSlinky.dexie.dexieStrings.versionchange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DbEvents extends DexieEventSet {
  
  def apply(eventName: blocked, subscriber: js.Function1[/* event */ IDBVersionChangeEvent, _]): Unit = js.native
  def apply(eventName: populate, subscriber: js.Function1[/* trans */ Transaction, _]): Unit = js.native
  def apply(eventName: ready, subscriber: js.Function0[_]): Unit = js.native
  def apply(eventName: ready, subscriber: js.Function0[_], bSticky: Boolean): Unit = js.native
  def apply(eventName: versionchange, subscriber: js.Function1[/* event */ IDBVersionChangeEvent, _]): Unit = js.native
  
  var blocked: DexieEvent = js.native
  
  var populate: DexiePopulateEvent = js.native
  
  var ready: DexieOnReadyEvent = js.native
  
  var versionchange: DexieVersionChangeEvent = js.native
}
