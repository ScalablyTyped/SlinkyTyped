package typingsSlinky.knockoutAmdHelpers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutAMDTemplate extends js.Object {
  var defaultPath: String = js.native
  var defaultRequireTextPluginName: String = js.native
  var defaultSuffix: String = js.native
}

object KnockoutAMDTemplate {
  @scala.inline
  def apply(defaultPath: String, defaultRequireTextPluginName: String, defaultSuffix: String): KnockoutAMDTemplate = {
    val __obj = js.Dynamic.literal(defaultPath = defaultPath.asInstanceOf[js.Any], defaultRequireTextPluginName = defaultRequireTextPluginName.asInstanceOf[js.Any], defaultSuffix = defaultSuffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutAMDTemplate]
  }
  @scala.inline
  implicit class KnockoutAMDTemplateOps[Self <: KnockoutAMDTemplate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultRequireTextPluginName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRequireTextPluginName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSuffix")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

