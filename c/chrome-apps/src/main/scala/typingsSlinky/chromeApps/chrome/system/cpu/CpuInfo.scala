package typingsSlinky.chromeApps.chrome.system.cpu

import typingsSlinky.chromeApps.chrome.double
import typingsSlinky.chromeApps.chrome.integer
import typingsSlinky.chromeApps.chromeAppsStrings.avx
import typingsSlinky.chromeApps.chromeAppsStrings.mmx
import typingsSlinky.chromeApps.chromeAppsStrings.sse
import typingsSlinky.chromeApps.chromeAppsStrings.sse2
import typingsSlinky.chromeApps.chromeAppsStrings.sse3
import typingsSlinky.chromeApps.chromeAppsStrings.sse4_1
import typingsSlinky.chromeApps.chromeAppsStrings.sse4_2
import typingsSlinky.chromeApps.chromeAppsStrings.ssse3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CpuInfo extends js.Object {
  /** The architecture name of the processors. */
  var archName: String
  /**
    * A set of feature codes indicating some of the processor's capabilities.
    * The currently supported codes are 'mmx', 'sse', 'sse2', 'sse3', 'ssse3', 'sse4_1', 'sse4_2', and 'avx'.
    */
  var features: mmx | sse | sse2 | sse3 | ssse3 | sse4_1 | sse4_2 | avx
  /** The model name of the processors. */
  var modelName: String
  /** The number of logical processors. */
  var numOfProcessors: integer
  /** Information about each logical processor. */
  var processors: js.Array[ProcessorInfo]
  /**
    * @requires(CrOS) Currently supported on Chrome OS only.
    * @description
    * List of CPU temperature readings from each thermal zone of the CPU.
    * Temperatures are in degrees Celsius.
    */
  var temperatures: js.UndefOr[js.Array[double]] = js.undefined
}

object CpuInfo {
  @scala.inline
  def apply(
    archName: String,
    features: mmx | sse | sse2 | sse3 | ssse3 | sse4_1 | sse4_2 | avx,
    modelName: String,
    numOfProcessors: integer,
    processors: js.Array[ProcessorInfo],
    temperatures: js.Array[double] = null
  ): CpuInfo = {
    val __obj = js.Dynamic.literal(archName = archName.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any], numOfProcessors = numOfProcessors.asInstanceOf[js.Any], processors = processors.asInstanceOf[js.Any])
    if (temperatures != null) __obj.updateDynamic("temperatures")(temperatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[CpuInfo]
  }
}

