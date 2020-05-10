package typingsSlinky.reactNativeVideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon extends js.Object {
  @JSName("")
  var _empty: String = js.native
  var errorString: String = js.native
}

object Anon {
  @scala.inline
  def apply(_empty: String, errorString: String): Anon = {
    val __obj = js.Dynamic.literal(errorString = errorString.asInstanceOf[js.Any])
    __obj.updateDynamic("")(_empty.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon]
  }
  @scala.inline
  implicit class AnonOps[Self <: Anon] (val x: Self) extends AnyVal {
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

