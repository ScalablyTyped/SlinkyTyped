package typingsSlinky.dojo.dojox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/rails.html
  *
  *
  */
@js.native
trait rails extends js.Object {
  /**
    *
    * @param selector
    * @param evtName
    * @param fn
    */
  def live(selector: js.Any, evtName: js.Any, fn: js.Any): Unit = js.native
}

object rails {
  @scala.inline
  def apply(live: (js.Any, js.Any, js.Any) => Unit): rails = {
    val __obj = js.Dynamic.literal(live = js.Any.fromFunction3(live))
    __obj.asInstanceOf[rails]
  }
  @scala.inline
  implicit class railsOps[Self <: rails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLive(value: (js.Any, js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("live")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

