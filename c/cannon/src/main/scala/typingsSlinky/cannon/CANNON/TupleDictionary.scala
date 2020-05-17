package typingsSlinky.cannon.CANNON

import typingsSlinky.cannon.anon.Keys
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TupleDictionary extends js.Object {
  var data: Keys = js.native
  def get(i: Double, j: Double): Double = js.native
  def reset(): Unit = js.native
  def set(i: Double, j: Double, value: Double): Unit = js.native
}

object TupleDictionary {
  @scala.inline
  def apply(
    data: Keys,
    get: (Double, Double) => Double,
    reset: () => Unit,
    set: (Double, Double, Double) => Unit
  ): TupleDictionary = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], get = js.Any.fromFunction2(get), reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction3(set))
    __obj.asInstanceOf[TupleDictionary]
  }
  @scala.inline
  implicit class TupleDictionaryOps[Self <: TupleDictionary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: Keys): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet(value: (Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

