package typingsSlinky.antDesignProLayout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnUS extends js.Object {
  var `en-US`: Appsettingcontentwidth = js.native
  var `it-IT`: Appsettingcontentwidth = js.native
  var `zh-CN`: Appsettingcontentwidth = js.native
  var `zh-TW`: Appsettingcontentwidth = js.native
}

object EnUS {
  @scala.inline
  def apply(
    `en-US`: Appsettingcontentwidth,
    `it-IT`: Appsettingcontentwidth,
    `zh-CN`: Appsettingcontentwidth,
    `zh-TW`: Appsettingcontentwidth
  ): EnUS = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("en-US")(`en-US`.asInstanceOf[js.Any])
    __obj.updateDynamic("it-IT")(`it-IT`.asInstanceOf[js.Any])
    __obj.updateDynamic("zh-CN")(`zh-CN`.asInstanceOf[js.Any])
    __obj.updateDynamic("zh-TW")(`zh-TW`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnUS]
  }
  @scala.inline
  implicit class EnUSOps[Self <: EnUS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withEn-US`(value: Appsettingcontentwidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("en-US")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withIt-IT`(value: Appsettingcontentwidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("it-IT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withZh-CN`(value: Appsettingcontentwidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zh-CN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withZh-TW`(value: Appsettingcontentwidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zh-TW")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

