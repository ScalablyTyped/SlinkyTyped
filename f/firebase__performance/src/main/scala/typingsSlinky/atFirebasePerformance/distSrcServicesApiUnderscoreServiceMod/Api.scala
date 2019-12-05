package typingsSlinky.atFirebasePerformance.distSrcServicesApiUnderscoreServiceMod

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Navigator
import org.scalajs.dom.raw.PerformanceEntry
import org.scalajs.dom.raw.Storage
import typingsSlinky.atFirebasePerformance.distSrcServicesApiUnderscoreServiceMod._Global_.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/performance/dist/src/services/api_service", "Api")
@js.native
class Api () extends js.Object {
  def this(window: Window) = this()
  /** PreformanceObserver constructor function. */
  var PerformanceObserver: js.Any = js.native
  var document: Document = js.native
  var localStorage: Storage = js.native
  var navigator: Navigator = js.native
  var onFirstInputDelay: js.UndefOr[js.Function] = js.native
  var performance: js.Any = js.native
  var windowLocation: js.Any = js.native
  def getEntriesByName(name: String): js.Array[PerformanceEntry] = js.native
  def getEntriesByType(`type`: EntryType): js.Array[PerformanceEntry] = js.native
  def getTimeOrigin(): Double = js.native
  def getUrl(): String = js.native
  def mark(name: String): Unit = js.native
  def measure(measureName: String, mark1: String, mark2: String): Unit = js.native
  def requiredApisAvailable(): Boolean = js.native
  def setupObserver(entryType: EntryType, callback: js.Function1[/* entry */ PerformanceEntry, Unit]): Unit = js.native
}

/* static members */
@JSImport("@firebase/performance/dist/src/services/api_service", "Api")
@js.native
object Api extends js.Object {
  def getInstance(): Api = js.native
}

