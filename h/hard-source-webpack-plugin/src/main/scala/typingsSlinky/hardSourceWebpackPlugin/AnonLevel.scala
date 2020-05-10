package typingsSlinky.hardSourceWebpackPlugin

import typingsSlinky.hardSourceWebpackPlugin.hardSourceWebpackPluginStrings.debug
import typingsSlinky.hardSourceWebpackPlugin.hardSourceWebpackPluginStrings.error
import typingsSlinky.hardSourceWebpackPlugin.hardSourceWebpackPluginStrings.info
import typingsSlinky.hardSourceWebpackPlugin.hardSourceWebpackPluginStrings.log
import typingsSlinky.hardSourceWebpackPlugin.hardSourceWebpackPluginStrings.none
import typingsSlinky.hardSourceWebpackPlugin.hardSourceWebpackPluginStrings.test
import typingsSlinky.hardSourceWebpackPlugin.hardSourceWebpackPluginStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLevel extends js.Object {
  var level: debug | log | info | warn | error = js.native
  var mode: none | test = js.native
}

object AnonLevel {
  @scala.inline
  def apply(level: debug | log | info | warn | error, mode: none | test): AnonLevel = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLevel]
  }
  @scala.inline
  implicit class AnonLevelOps[Self <: AnonLevel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLevel(value: debug | log | info | warn | error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: none | test): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

