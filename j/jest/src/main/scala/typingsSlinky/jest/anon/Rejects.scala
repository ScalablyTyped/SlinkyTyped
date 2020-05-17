package typingsSlinky.jest.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rejects[TPromise /* <: js.Object */] extends js.Object {
  /**
    * Unwraps the reason of a rejected promise so any other matcher can be chained.
    * If the promise is fulfilled the assertion fails.
    */
  var rejects: typingsSlinky.jest.mod.jest.AndNot[TPromise] = js.native
  /**
    * Use resolves to unwrap the value of a fulfilled promise so any other
    * matcher can be chained. If the promise is rejected the assertion fails.
    */
  var resolves: typingsSlinky.jest.mod.jest.AndNot[TPromise] = js.native
}

object Rejects {
  @scala.inline
  def apply[TPromise](
    rejects: typingsSlinky.jest.mod.jest.AndNot[TPromise],
    resolves: typingsSlinky.jest.mod.jest.AndNot[TPromise]
  ): Rejects[TPromise] = {
    val __obj = js.Dynamic.literal(rejects = rejects.asInstanceOf[js.Any], resolves = resolves.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rejects[TPromise]]
  }
  @scala.inline
  implicit class RejectsOps[Self[tpromise] <: Rejects[tpromise], TPromise] (val x: Self[TPromise]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TPromise] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TPromise]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TPromise] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TPromise] with Other]
    @scala.inline
    def withRejects(value: typingsSlinky.jest.mod.jest.AndNot[TPromise]): Self[TPromise] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolves(value: typingsSlinky.jest.mod.jest.AndNot[TPromise]): Self[TPromise] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolves")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

