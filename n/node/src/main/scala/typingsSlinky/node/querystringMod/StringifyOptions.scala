package typingsSlinky.node.querystringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringifyOptions extends js.Object {
  var encodeURIComponent: js.UndefOr[js.Function1[/* str */ String, String]] = js.native
}

object StringifyOptions {
  @scala.inline
  def apply(): StringifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringifyOptions]
  }
  @scala.inline
  implicit class StringifyOptionsOps[Self <: StringifyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncodeURIComponent(value: /* str */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodeURIComponent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEncodeURIComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodeURIComponent")(js.undefined)
        ret
    }
  }
  
}

