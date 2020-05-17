package typingsSlinky.babelCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelCore.mod.ConfigItem
  - typingsSlinky.babelCore.mod.PluginObj[js.Any]
  - typingsSlinky.babelCore.mod.PluginTarget
  - js.Tuple2[
typingsSlinky.babelCore.mod.PluginTarget, 
typingsSlinky.babelCore.mod.PluginOptions]
  - js.Tuple3[
typingsSlinky.babelCore.mod.PluginTarget, 
typingsSlinky.babelCore.mod.PluginOptions, 
js.UndefOr[java.lang.String]]
*/
trait PluginItem extends js.Object

object PluginItem {
  @scala.inline
  implicit def apply(value: ConfigItem): PluginItem = value.asInstanceOf[PluginItem]
  @scala.inline
  implicit def apply(value: PluginObj[js.Any]): PluginItem = value.asInstanceOf[PluginItem]
  @scala.inline
  implicit def apply(value: PluginTarget): PluginItem = value.asInstanceOf[PluginItem]
  @scala.inline
  implicit def apply(value: js.Tuple2[PluginTarget, PluginOptions]): PluginItem = value.asInstanceOf[PluginItem]
  @scala.inline
  implicit def apply(value: js.Tuple3[PluginTarget, PluginOptions, js.UndefOr[String]]): PluginItem = value.asInstanceOf[PluginItem]
}

