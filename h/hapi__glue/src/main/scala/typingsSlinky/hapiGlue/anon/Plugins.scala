package typingsSlinky.hapiGlue.anon

import typingsSlinky.hapiGlue.mod.PluginObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugins extends js.Object {
  var plugins: js.Array[PluginObject | String]
}

object Plugins {
  @scala.inline
  def apply(plugins: js.Array[PluginObject | String]): Plugins = {
    val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plugins]
  }
}

