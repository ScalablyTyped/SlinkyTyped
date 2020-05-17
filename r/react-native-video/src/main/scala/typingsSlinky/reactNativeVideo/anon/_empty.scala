package typingsSlinky.reactNativeVideo.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _empty extends js.Object {
  @JSName("")
  var _empty: String = js.native
  var errorString: String = js.native
}

object _empty {
  @scala.inline
  def apply(_empty: String, errorString: String): _empty = {
    val __obj = js.Dynamic.literal(errorString = errorString.asInstanceOf[js.Any])
    __obj.updateDynamic("")(_empty.asInstanceOf[js.Any])
    __obj.asInstanceOf[_empty]
  }
  @scala.inline
  implicit class _emptyOps[Self <: _empty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_empty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorString")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

