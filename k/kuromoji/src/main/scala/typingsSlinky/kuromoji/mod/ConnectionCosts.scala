package typingsSlinky.kuromoji.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionCosts extends js.Object {
  var buffer: js.typedarray.Int16Array = js.native
  def get(forward_id: Double, backward_id: Double): Double = js.native
  def loadConnectionCosts(connection_costs_buffer: js.typedarray.Int16Array): Unit = js.native
  def put(forward_id: Double, backward_id: Double, cost: Double): Unit = js.native
}

object ConnectionCosts {
  @scala.inline
  def apply(
    buffer: js.typedarray.Int16Array,
    get: (Double, Double) => Double,
    loadConnectionCosts: js.typedarray.Int16Array => Unit,
    put: (Double, Double, Double) => Unit
  ): ConnectionCosts = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], get = js.Any.fromFunction2(get), loadConnectionCosts = js.Any.fromFunction1(loadConnectionCosts), put = js.Any.fromFunction3(put))
    __obj.asInstanceOf[ConnectionCosts]
  }
  @scala.inline
  implicit class ConnectionCostsOps[Self <: ConnectionCosts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBuffer(value: js.typedarray.Int16Array): Self = this.set("buffer", value.asInstanceOf[js.Any])
    @scala.inline
    def setGet(value: (Double, Double) => Double): Self = this.set("get", js.Any.fromFunction2(value))
    @scala.inline
    def setLoadConnectionCosts(value: js.typedarray.Int16Array => Unit): Self = this.set("loadConnectionCosts", js.Any.fromFunction1(value))
    @scala.inline
    def setPut(value: (Double, Double, Double) => Unit): Self = this.set("put", js.Any.fromFunction3(value))
  }
  
}

