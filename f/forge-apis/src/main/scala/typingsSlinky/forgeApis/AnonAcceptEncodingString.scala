package typingsSlinky.forgeApis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAcceptEncodingString extends js.Object {
  var acceptEncoding: js.UndefOr[String] = js.native
}

object AnonAcceptEncodingString {
  @scala.inline
  def apply(): AnonAcceptEncodingString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAcceptEncodingString]
  }
  @scala.inline
  implicit class AnonAcceptEncodingStringOps[Self <: AnonAcceptEncodingString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptEncoding")(js.undefined)
        ret
    }
  }
  
}

