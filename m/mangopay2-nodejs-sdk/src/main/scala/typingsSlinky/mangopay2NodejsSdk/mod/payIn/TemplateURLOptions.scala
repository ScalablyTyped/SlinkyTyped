package typingsSlinky.mangopay2NodejsSdk.mod.payIn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateURLOptions extends js.Object {
  var Payline: String = js.native
}

object TemplateURLOptions {
  @scala.inline
  def apply(Payline: String): TemplateURLOptions = {
    val __obj = js.Dynamic.literal(Payline = Payline.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateURLOptions]
  }
  @scala.inline
  implicit class TemplateURLOptionsOps[Self <: TemplateURLOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPayline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Payline")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

