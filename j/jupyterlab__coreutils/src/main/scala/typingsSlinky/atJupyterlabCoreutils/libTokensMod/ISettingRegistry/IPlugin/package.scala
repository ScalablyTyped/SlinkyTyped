package typingsSlinky.atJupyterlabCoreutils.libTokensMod.ISettingRegistry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object IPlugin {
  /**
    * A function that transforms a plugin object before it is consumed by the
    * setting registry.
    */
  type Transform = js.Function1[
    /* plugin */ typingsSlinky.atJupyterlabCoreutils.libTokensMod.ISettingRegistry.IPlugin, 
    typingsSlinky.atJupyterlabCoreutils.libTokensMod.ISettingRegistry.IPlugin
  ]
}
