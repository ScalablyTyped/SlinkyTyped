package typingsSlinky.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _xjsfl extends js.Object {
  var uri: String = js.native
  def init(_this: js.Any): Unit = js.native
}

object _xjsfl {
  @scala.inline
  def apply(init: js.Any => Unit, uri: String): _xjsfl = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init), uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[_xjsfl]
  }
  @scala.inline
  implicit class _xjsflOps[Self <: _xjsfl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInit(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

