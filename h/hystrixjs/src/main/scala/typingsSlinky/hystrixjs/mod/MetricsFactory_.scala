package typingsSlinky.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricsFactory_ extends js.Object {
  def getAllMetrics(): js.Array[CommandMetrics] = js.native
  def getOrCreate(config: MetricsProperties): CommandMetrics = js.native
  def resetCache(): Unit = js.native
}

object MetricsFactory_ {
  @scala.inline
  def apply(
    getAllMetrics: () => js.Array[CommandMetrics],
    getOrCreate: MetricsProperties => CommandMetrics,
    resetCache: () => Unit
  ): MetricsFactory_ = {
    val __obj = js.Dynamic.literal(getAllMetrics = js.Any.fromFunction0(getAllMetrics), getOrCreate = js.Any.fromFunction1(getOrCreate), resetCache = js.Any.fromFunction0(resetCache))
    __obj.asInstanceOf[MetricsFactory_]
  }
  @scala.inline
  implicit class MetricsFactory_Ops[Self <: MetricsFactory_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAllMetrics(value: () => js.Array[CommandMetrics]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllMetrics")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOrCreate(value: MetricsProperties => CommandMetrics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOrCreate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResetCache(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetCache")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

