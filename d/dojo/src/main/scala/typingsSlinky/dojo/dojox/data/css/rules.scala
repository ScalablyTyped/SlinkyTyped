package typingsSlinky.dojo.dojox.data.css

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/data/css.rules.html
  *
  *
  */
@js.native
trait rules extends js.Object {
  /**
    *
    * @param fn
    * @param ctx
    * @param context
    */
  def forEach(fn: js.Any, ctx: js.Any, context: js.Any): Unit = js.native
}

object rules {
  @scala.inline
  def apply(forEach: (js.Any, js.Any, js.Any) => Unit): rules = {
    val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction3(forEach))
    __obj.asInstanceOf[rules]
  }
  @scala.inline
  implicit class rulesOps[Self <: rules] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForEach(value: (js.Any, js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forEach")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

