package typingsSlinky.jsonwebtoken

import typingsSlinky.jsonwebtoken.jsonwebtokenBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined jsonwebtoken.jsonwebtoken.DecodeOptions & {  json  :true} */
@js.native
trait DecodeOptionsjsontrue extends js.Object {
  var complete: js.UndefOr[Boolean] = js.native
  var json: js.UndefOr[Boolean with `true`] = js.native
}

object DecodeOptionsjsontrue {
  @scala.inline
  def apply(): DecodeOptionsjsontrue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecodeOptionsjsontrue]
  }
  @scala.inline
  implicit class DecodeOptionsjsontrueOps[Self <: DecodeOptionsjsontrue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
        ret
    }
    @scala.inline
    def withJson(value: Boolean with `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(js.undefined)
        ret
    }
  }
  
}

