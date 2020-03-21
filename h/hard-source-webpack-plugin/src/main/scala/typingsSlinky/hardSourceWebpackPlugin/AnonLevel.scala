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

trait AnonLevel extends js.Object {
  var level: debug | log | info | warn | error
  var mode: none | test
}

object AnonLevel {
  @scala.inline
  def apply(level: debug | log | info | warn | error, mode: none | test): AnonLevel = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLevel]
  }
}

