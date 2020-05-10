package typingsSlinky.babelPresetEnv.mod

import typingsSlinky.babelPresetEnv.babelPresetEnvBooleans.`true`
import typingsSlinky.babelPresetEnv.babelPresetEnvStrings.current
import typingsSlinky.babelPresetEnv.babelPresetEnvStrings.tp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _TargetsOptions extends js.Object

object _TargetsOptions {
  @scala.inline
  def AnonBrowsers(browsers: String | js.Array[String]): _TargetsOptions = {
    val __obj = js.Dynamic.literal(browsers = browsers.asInstanceOf[js.Any])
    __obj.asInstanceOf[_TargetsOptions]
  }
  @scala.inline
  def AnonSafari(safari: String | tp): _TargetsOptions = {
    val __obj = js.Dynamic.literal(safari = safari.asInstanceOf[js.Any])
    __obj.asInstanceOf[_TargetsOptions]
  }
  @scala.inline
  def AnonNode(node: String | current | `true`): _TargetsOptions = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[_TargetsOptions]
  }
  @scala.inline
  def keyinTargetstring(): _TargetsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_TargetsOptions]
  }
  @scala.inline
  def AnonEsmodules(esmodules: `true`): _TargetsOptions = {
    val __obj = js.Dynamic.literal(esmodules = esmodules.asInstanceOf[js.Any])
    __obj.asInstanceOf[_TargetsOptions]
  }
}

