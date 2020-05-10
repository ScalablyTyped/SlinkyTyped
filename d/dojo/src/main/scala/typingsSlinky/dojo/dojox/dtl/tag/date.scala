package typingsSlinky.dojo.dojox.dtl.tag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/tag/date.html
  *
  *
  */
@js.native
trait date extends js.Object {
  /**
    *
    * @param format
    * @param node
    */
  def NowNode(format: js.Any, node: js.Any): Unit = js.native
  /**
    *
    * @param parser
    * @param token
    */
  def now(parser: js.Any, token: js.Any): Unit = js.native
}

object date {
  @scala.inline
  def apply(NowNode: (js.Any, js.Any) => Unit, now: (js.Any, js.Any) => Unit): date = {
    val __obj = js.Dynamic.literal(NowNode = js.Any.fromFunction2(NowNode), now = js.Any.fromFunction2(now))
    __obj.asInstanceOf[date]
  }
  @scala.inline
  implicit class dateOps[Self <: date] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNowNode(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NowNode")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNow(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("now")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

