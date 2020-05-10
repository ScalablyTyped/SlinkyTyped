package typingsSlinky.dojo.dojox.lang.async

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/lang/async/timeout.html
  *
  *
  */
@js.native
trait timeout extends js.Object {
  /**
    *
    * @param ms
    */
  def failOn(ms: js.Any): Unit = js.native
  /**
    *
    * @param ms
    */
  def from(ms: js.Any): Unit = js.native
}

object timeout {
  @scala.inline
  def apply(failOn: js.Any => Unit, from: js.Any => Unit): timeout = {
    val __obj = js.Dynamic.literal(failOn = js.Any.fromFunction1(failOn), from = js.Any.fromFunction1(from))
    __obj.asInstanceOf[timeout]
  }
  @scala.inline
  implicit class timeoutOps[Self <: timeout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailOn(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failOn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFrom(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

