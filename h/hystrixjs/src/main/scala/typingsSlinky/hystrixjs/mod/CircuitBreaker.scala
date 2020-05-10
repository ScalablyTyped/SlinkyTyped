package typingsSlinky.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CircuitBreaker extends js.Object {
  def allowRequest(): Boolean = js.native
  def allowSingleTest(): Boolean = js.native
  def isOpen(): Boolean = js.native
  def markSuccess(): Unit = js.native
}

object CircuitBreaker {
  @scala.inline
  def apply(
    allowRequest: () => Boolean,
    allowSingleTest: () => Boolean,
    isOpen: () => Boolean,
    markSuccess: () => Unit
  ): CircuitBreaker = {
    val __obj = js.Dynamic.literal(allowRequest = js.Any.fromFunction0(allowRequest), allowSingleTest = js.Any.fromFunction0(allowSingleTest), isOpen = js.Any.fromFunction0(isOpen), markSuccess = js.Any.fromFunction0(markSuccess))
    __obj.asInstanceOf[CircuitBreaker]
  }
  @scala.inline
  implicit class CircuitBreakerOps[Self <: CircuitBreaker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowRequest(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAllowSingleTest(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSingleTest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsOpen(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMarkSuccess(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markSuccess")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

