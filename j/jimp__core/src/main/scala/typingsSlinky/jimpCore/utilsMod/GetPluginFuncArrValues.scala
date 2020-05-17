package typingsSlinky.jimpCore.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.UndefOr[scala.Nothing]
  - // Get the plugin value, may be ill-formed or well-formed
typingsSlinky.jimpCore.utilsMod.GetPluginVal[js.Any]
*/
trait GetPluginFuncArrValues[PluginFuncArr] extends js.Object

object GetPluginFuncArrValues {
  @scala.inline
  implicit def apply[PluginFuncArr](value: // Get the plugin value, may be ill-formed or well-formed
  GetPluginVal[js.Any]): GetPluginFuncArrValues[PluginFuncArr] = value.asInstanceOf[GetPluginFuncArrValues[PluginFuncArr]]
  @scala.inline
  implicit def fromUndef[PluginFuncArr, T](value: js.UndefOr[T])(implicit ev: T => GetPluginFuncArrValues[PluginFuncArr]): GetPluginFuncArrValues[PluginFuncArr] = value.asInstanceOf[GetPluginFuncArrValues[PluginFuncArr]]
}

