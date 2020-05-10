package typingsSlinky.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CircuitFactory_ extends js.Object {
  def getCache(): js.Array[CircuitBreaker] = js.native
  def getOrCreate(config: CirctuiBreakerConfig): CircuitBreaker = js.native
  def resetCache(): Unit = js.native
}

object CircuitFactory_ {
  @scala.inline
  def apply(
    getCache: () => js.Array[CircuitBreaker],
    getOrCreate: CirctuiBreakerConfig => CircuitBreaker,
    resetCache: () => Unit
  ): CircuitFactory_ = {
    val __obj = js.Dynamic.literal(getCache = js.Any.fromFunction0(getCache), getOrCreate = js.Any.fromFunction1(getOrCreate), resetCache = js.Any.fromFunction0(resetCache))
    __obj.asInstanceOf[CircuitFactory_]
  }
  @scala.inline
  implicit class CircuitFactory_Ops[Self <: CircuitFactory_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCache(value: () => js.Array[CircuitBreaker]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCache")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOrCreate(value: CirctuiBreakerConfig => CircuitBreaker): Self = {
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

