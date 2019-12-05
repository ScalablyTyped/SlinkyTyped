package typingsSlinky.hardDashSourceDashWebpackDashPlugin

import typingsSlinky.hardDashSourceDashWebpackDashPlugin.hardDashSourceDashWebpackDashPluginStrings.debug
import typingsSlinky.hardDashSourceDashWebpackDashPlugin.hardDashSourceDashWebpackDashPluginStrings.error
import typingsSlinky.hardDashSourceDashWebpackDashPlugin.hardDashSourceDashWebpackDashPluginStrings.info
import typingsSlinky.hardDashSourceDashWebpackDashPlugin.hardDashSourceDashWebpackDashPluginStrings.log
import typingsSlinky.hardDashSourceDashWebpackDashPlugin.hardDashSourceDashWebpackDashPluginStrings.none
import typingsSlinky.hardDashSourceDashWebpackDashPlugin.hardDashSourceDashWebpackDashPluginStrings.test
import typingsSlinky.hardDashSourceDashWebpackDashPlugin.hardDashSourceDashWebpackDashPluginStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Debug extends js.Object {
  var level: debug | log | info | warn | error
  var mode: none | test
}

object Anon_Debug {
  @scala.inline
  def apply(level: debug | log | info | warn | error, mode: none | test): Anon_Debug = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Debug]
  }
}

