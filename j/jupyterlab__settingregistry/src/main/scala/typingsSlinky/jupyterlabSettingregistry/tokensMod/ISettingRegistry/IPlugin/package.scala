package typingsSlinky.jupyterlabSettingregistry.tokensMod.ISettingRegistry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object IPlugin {
  /**
    * A function that transforms a plugin object before it is consumed by the
    * setting registry.
    */
  type Transform = js.Function1[
    /* plugin */ typingsSlinky.jupyterlabSettingregistry.tokensMod.ISettingRegistry.IPlugin, 
    typingsSlinky.jupyterlabSettingregistry.tokensMod.ISettingRegistry.IPlugin
  ]
}
