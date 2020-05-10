package typingsSlinky.dojo.dojox.lang.async

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/lang/async/event.html
  *
  *
  */
@js.native
trait event extends js.Object {
  /**
    *
    * @param src
    * @param name
    */
  def failOn(src: js.Any, name: js.Any): Unit = js.native
  /**
    *
    * @param src
    * @param name
    */
  def from(src: js.Any, name: js.Any): Unit = js.native
}

object event {
  @scala.inline
  def apply(failOn: (js.Any, js.Any) => Unit, from: (js.Any, js.Any) => Unit): event = {
    val __obj = js.Dynamic.literal(failOn = js.Any.fromFunction2(failOn), from = js.Any.fromFunction2(from))
    __obj.asInstanceOf[event]
  }
  @scala.inline
  implicit class eventOps[Self <: event] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailOn(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failOn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFrom(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

