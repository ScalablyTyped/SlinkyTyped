package typingsSlinky.jupyterlabStatusbar.memoryUsageMod.MemoryUsage

import typingsSlinky.jupyterlabApputils.vdomMod.VDomModel
import typingsSlinky.jupyterlabStatusbar.memoryUsageMod.MemoryUsage.Model.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A VDomModel for the memory usage status item.
  */
@JSImport("@jupyterlab/statusbar/lib/defaults/memoryUsage", "MemoryUsage.Model")
@js.native
class Model_ protected () extends VDomModel {
  /**
    * Construct a new memory usage model.
    *
    * @param options: the options for creating the model.
    */
  def this(options: IOptions) = this()
  
  var _currentMemory: js.Any = js.native
  
  var _memoryLimit: js.Any = js.native
  
  var _metricsAvailable: js.Any = js.native
  
  var _poll: js.Any = js.native
  
  var _units: js.Any = js.native
  
  /**
    * Given the results of the metrics request, update model values.
    */
  var _updateMetricsValues: js.Any = js.native
  
  var _warn: js.Any = js.native
  
  /**
    * The current memory usage/
    */
  def currentMemory: Double = js.native
  
  /**
    * The current memory limit, or null if not specified.
    */
  def memoryLimit: Double | Null = js.native
  
  /**
    * Whether the metrics server extension is available.
    */
  def metricsAvailable: Boolean = js.native
  
  /**
    * The units for memory usages and limits.
    */
  def units: MemoryUnit = js.native
  
  /**
    * The warning for memory usage.
    */
  def usageWarning: Boolean = js.native
}
