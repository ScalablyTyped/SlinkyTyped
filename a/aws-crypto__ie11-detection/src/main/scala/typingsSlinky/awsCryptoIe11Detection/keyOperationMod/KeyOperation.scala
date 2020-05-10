package typingsSlinky.awsCryptoIe11Detection.keyOperationMod

import typingsSlinky.awsCryptoIe11Detection.keyMod.Key
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyOperation extends js.Object {
  val result: js.UndefOr[Key] = js.native
  def oncomplete(event: Event_): Unit = js.native
  def onerror(event: Event_): Unit = js.native
}

object KeyOperation {
  @scala.inline
  def apply(oncomplete: Event_ => Unit, onerror: Event_ => Unit): KeyOperation = {
    val __obj = js.Dynamic.literal(oncomplete = js.Any.fromFunction1(oncomplete), onerror = js.Any.fromFunction1(onerror))
    __obj.asInstanceOf[KeyOperation]
  }
  @scala.inline
  implicit class KeyOperationOps[Self <: KeyOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOncomplete(value: Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncomplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnerror(value: Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResult(value: Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(js.undefined)
        ret
    }
  }
  
}

