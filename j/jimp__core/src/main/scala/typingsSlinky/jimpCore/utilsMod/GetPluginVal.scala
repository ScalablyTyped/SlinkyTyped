package typingsSlinky.jimpCore.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - Q
  - typingsSlinky.jimpCore.utilsMod.WellFormedValues[Q]
*/
trait GetPluginVal[Q]
  extends GetPluginFuncArrValues[js.Any]

object GetPluginVal {
  @scala.inline
  implicit def apply[Q](value: Q): GetPluginVal[Q] = value.asInstanceOf[GetPluginVal[Q]]
  @scala.inline
  implicit def apply[Q](value: WellFormedValues[Q]): GetPluginVal[Q] = value.asInstanceOf[GetPluginVal[Q]]
}

