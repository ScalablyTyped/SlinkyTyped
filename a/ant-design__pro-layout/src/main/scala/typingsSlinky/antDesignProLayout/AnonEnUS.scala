package typingsSlinky.antDesignProLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEnUS extends js.Object {
  var `en-US`: AnonAppsettingcontentwidth = js.native
  var `it-IT`: AnonAppsettingcontentwidth = js.native
  var `zh-CN`: AnonAppsettingcontentwidth = js.native
  var `zh-TW`: AnonAppsettingcontentwidth = js.native
}

object AnonEnUS {
  @scala.inline
  def apply(
    `en-US`: AnonAppsettingcontentwidth,
    `it-IT`: AnonAppsettingcontentwidth,
    `zh-CN`: AnonAppsettingcontentwidth,
    `zh-TW`: AnonAppsettingcontentwidth
  ): AnonEnUS = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("en-US")(`en-US`.asInstanceOf[js.Any])
    __obj.updateDynamic("it-IT")(`it-IT`.asInstanceOf[js.Any])
    __obj.updateDynamic("zh-CN")(`zh-CN`.asInstanceOf[js.Any])
    __obj.updateDynamic("zh-TW")(`zh-TW`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnUS]
  }
  @scala.inline
  implicit class AnonEnUSOps[Self <: AnonEnUS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withEn-US`(value: AnonAppsettingcontentwidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("en-US")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withIt-IT`(value: AnonAppsettingcontentwidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("it-IT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withZh-CN`(value: AnonAppsettingcontentwidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zh-CN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withZh-TW`(value: AnonAppsettingcontentwidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zh-TW")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

