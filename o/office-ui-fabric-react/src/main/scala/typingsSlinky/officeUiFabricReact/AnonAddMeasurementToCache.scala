package typingsSlinky.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddMeasurementToCache extends js.Object {
  /**
    * Should be called whenever there is a new measurement associated with a given data object.
    * If the data has a cacheKey, store that measurement in the measurementsCache.
    */
  def addMeasurementToCache(data: js.Any, measurement: Double): Unit = js.native
  /**
    * Checks if the provided data has a cacheKey. If it has a cacheKey and there is a
    * corresponding entry in the measurementsCache, then it will return that value.
    * Returns undefined otherwise.
    */
  def getCachedMeasurement(data: js.Any): js.UndefOr[Double] = js.native
}

object AnonAddMeasurementToCache {
  @scala.inline
  def apply(
    addMeasurementToCache: (js.Any, Double) => Unit,
    getCachedMeasurement: js.Any => js.UndefOr[Double]
  ): AnonAddMeasurementToCache = {
    val __obj = js.Dynamic.literal(addMeasurementToCache = js.Any.fromFunction2(addMeasurementToCache), getCachedMeasurement = js.Any.fromFunction1(getCachedMeasurement))
    __obj.asInstanceOf[AnonAddMeasurementToCache]
  }
  @scala.inline
  implicit class AnonAddMeasurementToCacheOps[Self <: AnonAddMeasurementToCache] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddMeasurementToCache(value: (js.Any, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addMeasurementToCache")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetCachedMeasurement(value: js.Any => js.UndefOr[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCachedMeasurement")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

