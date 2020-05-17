package typingsSlinky.rollup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - js.Array[java.lang.String]
  - typingsSlinky.rollup.mod.IsPureModule
*/
trait PureModulesOption extends js.Object

object PureModulesOption {
  @scala.inline
  implicit def apply(value: js.Array[String]): PureModulesOption = value.asInstanceOf[PureModulesOption]
  @scala.inline
  implicit def apply(value: Boolean): PureModulesOption = value.asInstanceOf[PureModulesOption]
  @scala.inline
  implicit def apply(value: IsPureModule): PureModulesOption = value.asInstanceOf[PureModulesOption]
}

