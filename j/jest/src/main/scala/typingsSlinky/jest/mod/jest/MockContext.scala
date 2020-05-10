package typingsSlinky.jest.mod.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MockContext[T, Y /* <: js.Array[_] */] extends js.Object {
  var calls: js.Array[Y] = js.native
  var instances: js.Array[T] = js.native
  var invocationCallOrder: js.Array[Double] = js.native
  /**
    * List of results of calls to the mock function.
    */
  var results: js.Array[MockResult[T]] = js.native
}

object MockContext {
  @scala.inline
  def apply[T, Y](
    calls: js.Array[Y],
    instances: js.Array[T],
    invocationCallOrder: js.Array[Double],
    results: js.Array[MockResult[T]]
  ): MockContext[T, Y] = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], instances = instances.asInstanceOf[js.Any], invocationCallOrder = invocationCallOrder.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockContext[T, Y]]
  }
  @scala.inline
  implicit class MockContextOps[Self[t, y] <: MockContext[t, y], T, Y] (val x: Self[T, Y]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, Y] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, Y]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, Y]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, Y]) with Other]
    @scala.inline
    def withCalls(value: js.Array[Y]): Self[T, Y] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstances(value: js.Array[T]): Self[T, Y] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvocationCallOrder(value: js.Array[Double]): Self[T, Y] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invocationCallOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResults(value: js.Array[MockResult[T]]): Self[T, Y] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

