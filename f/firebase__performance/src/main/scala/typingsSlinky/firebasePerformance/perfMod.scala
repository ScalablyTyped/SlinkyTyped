package typingsSlinky.firebasePerformance

import typingsSlinky.firebaseAppTypes.mod.FirebaseApp
import typingsSlinky.firebasePerformanceTypes.mod.FirebasePerformance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/performance/dist/src/controllers/perf", JSImport.Namespace)
@js.native
object perfMod extends js.Object {
  @js.native
  class PerformanceController protected () extends FirebasePerformance {
    def this(app: FirebaseApp) = this()
    val app: FirebaseApp = js.native
    @JSName("dataCollectionEnabled")
    def dataCollectionEnabled_MPerformanceController: Boolean = js.native
    @JSName("dataCollectionEnabled")
    def dataCollectionEnabled_MPerformanceController(`val`: Boolean): js.Any = js.native
    @JSName("instrumentationEnabled")
    def instrumentationEnabled_MPerformanceController: Boolean = js.native
    @JSName("instrumentationEnabled")
    def instrumentationEnabled_MPerformanceController(`val`: Boolean): js.Any = js.native
  }
  
}

