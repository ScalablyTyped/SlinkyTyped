package typingsSlinky.babelPresetEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BrowserslistQuery = java.lang.String
  type PluginList = js.Array[typingsSlinky.babelPresetEnv.mod.PluginListItem]
  type PluginListItem = java.lang.String | js.RegExp
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.babelPresetEnv.mod.BrowserslistQuery
    - js.Array[typingsSlinky.babelPresetEnv.mod.BrowserslistQuery]
    - typingsSlinky.babelPresetEnv.keyinTargetstring
    - typingsSlinky.babelPresetEnv.AnonEsmodules
    - typingsSlinky.babelPresetEnv.AnonNode
    - typingsSlinky.babelPresetEnv.AnonSafari
    - typingsSlinky.babelPresetEnv.AnonBrowsers
  */
  type TargetsOptions = typingsSlinky.babelPresetEnv.mod._TargetsOptions | js.Array[typingsSlinky.babelPresetEnv.mod.BrowserslistQuery] | typingsSlinky.babelPresetEnv.mod.BrowserslistQuery
}
