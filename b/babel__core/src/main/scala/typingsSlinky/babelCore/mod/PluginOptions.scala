package typingsSlinky.babelCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Object
  - js.UndefOr[scala.Nothing]
  - typingsSlinky.babelCore.babelCoreBooleans.`false`
*/
trait PluginOptions extends js.Object

object PluginOptions {
  @scala.inline
  def `false`: typingsSlinky.babelCore.babelCoreBooleans.`false` = false.asInstanceOf[typingsSlinky.babelCore.babelCoreBooleans.`false`]
  @scala.inline
  implicit def apply(value: js.Object): PluginOptions = value.asInstanceOf[PluginOptions]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => PluginOptions): PluginOptions = value.asInstanceOf[PluginOptions]
}

