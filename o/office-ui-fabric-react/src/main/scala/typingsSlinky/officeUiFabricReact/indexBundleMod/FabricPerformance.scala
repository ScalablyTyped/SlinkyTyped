package typingsSlinky.officeUiFabricReact.indexBundleMod

import typingsSlinky.uifabricUtilities.fabricPerformanceMod.IPerfSummary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/index.bundle", "FabricPerformance")
@js.native
class FabricPerformance ()
  extends typingsSlinky.officeUiFabricReact.mod.FabricPerformance
/* static members */
object FabricPerformance {
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "FabricPerformance")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "FabricPerformance._timeoutId")
  @js.native
  def _timeoutId: js.Any = js.native
  @scala.inline
  def _timeoutId_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_timeoutId")(x.asInstanceOf[js.Any])
  
  /**
    * Measures execution time of the given syncronous function. If the same logic is executed multiple times,
    * each individual measurement will be collected as well the overall numbers.
    * @param name - The name of this measurement
    * @param func - The logic to be measured for execution time
    */
  @JSImport("office-ui-fabric-react/lib/index.bundle", "FabricPerformance.measure")
  @js.native
  def measure(name: String, func: js.Function0[Unit]): Unit = js.native
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "FabricPerformance.reset")
  @js.native
  def reset(): Unit = js.native
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "FabricPerformance.setPeriodicReset")
  @js.native
  def setPeriodicReset(): Unit = js.native
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "FabricPerformance.summary")
  @js.native
  def summary: IPerfSummary = js.native
  @scala.inline
  def summary_=(x: IPerfSummary): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("summary")(x.asInstanceOf[js.Any])
}
