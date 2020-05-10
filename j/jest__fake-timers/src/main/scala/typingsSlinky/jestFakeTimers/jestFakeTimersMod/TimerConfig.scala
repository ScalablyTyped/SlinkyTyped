package typingsSlinky.jestFakeTimers.jestFakeTimersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimerConfig[Ref] extends js.Object {
  def idToRef(id: Double): Ref = js.native
  def refToId(ref: Ref): Double | Unit = js.native
}

object TimerConfig {
  @scala.inline
  def apply[Ref](idToRef: Double => Ref, refToId: Ref => Double | Unit): TimerConfig[Ref] = {
    val __obj = js.Dynamic.literal(idToRef = js.Any.fromFunction1(idToRef), refToId = js.Any.fromFunction1(refToId))
    __obj.asInstanceOf[TimerConfig[Ref]]
  }
  @scala.inline
  implicit class TimerConfigOps[Self[ref] <: TimerConfig[ref], Ref] (val x: Self[Ref]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Ref] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Ref]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Ref] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Ref] with Other]
    @scala.inline
    def withIdToRef(value: Double => Ref): Self[Ref] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idToRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRefToId(value: Ref => Double | Unit): Self[Ref] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refToId")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

