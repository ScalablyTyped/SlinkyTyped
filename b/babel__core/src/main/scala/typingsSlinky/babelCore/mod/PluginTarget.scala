package typingsSlinky.babelCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Object
  - js.Function1[/ * repeated * / js.Any, js.Any]
*/
trait PluginTarget extends PluginItem

object PluginTarget {
  @scala.inline
  implicit def apply(value: js.Function1[/* repeated */ js.Any, js.Any]): PluginTarget = value.asInstanceOf[PluginTarget]
  @scala.inline
  implicit def apply(value: js.Object): PluginTarget = value.asInstanceOf[PluginTarget]
  @scala.inline
  implicit def apply(value: String): PluginTarget = value.asInstanceOf[PluginTarget]
}

