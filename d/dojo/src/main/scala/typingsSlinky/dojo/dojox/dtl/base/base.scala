package typingsSlinky.dojo.dojox.dtl.base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/_base._base.html
  *
  *
  */
@js.native
trait base extends js.Object {
  /**
    * Escapes a string's HTML
    *
    * @param value
    */
  def escape(value: js.Any): Unit = js.native
  /**
    *
    * @param value
    */
  def safe(value: js.Any): Unit = js.native
}

object base {
  @scala.inline
  def apply(escape: js.Any => Unit, safe: js.Any => Unit): base = {
    val __obj = js.Dynamic.literal(escape = js.Any.fromFunction1(escape), safe = js.Any.fromFunction1(safe))
    __obj.asInstanceOf[base]
  }
  @scala.inline
  implicit class baseOps[Self <: typingsSlinky.dojo.dojox.dtl.base.base] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEscape(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escape")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSafe(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safe")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

