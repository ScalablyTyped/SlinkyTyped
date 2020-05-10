package typingsSlinky.i18nextExpressMiddleware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MissingKeyHandlerOptions extends js.Object {
  var lngParam: js.UndefOr[String] = js.native
  var nsParam: js.UndefOr[String] = js.native
}

object MissingKeyHandlerOptions {
  @scala.inline
  def apply(): MissingKeyHandlerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MissingKeyHandlerOptions]
  }
  @scala.inline
  implicit class MissingKeyHandlerOptionsOps[Self <: MissingKeyHandlerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLngParam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lngParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLngParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lngParam")(js.undefined)
        ret
    }
    @scala.inline
    def withNsParam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nsParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNsParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nsParam")(js.undefined)
        ret
    }
  }
  
}

