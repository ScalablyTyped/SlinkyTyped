package typingsSlinky.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlgString extends js.Object {
  var alg: js.UndefOr[String] = js.native
}

object AlgString {
  @scala.inline
  def apply(): AlgString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlgString]
  }
  @scala.inline
  implicit class AlgStringOps[Self <: AlgString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alg")(js.undefined)
        ret
    }
  }
  
}

