package typingsSlinky.appBuilderLib.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[java.lang.String | typingsSlinky.appBuilderLib.coreMod.TargetConfiguration]
  - java.lang.String
  - typingsSlinky.appBuilderLib.coreMod.TargetConfiguration
  - scala.Null
*/
trait TargetConfigType extends js.Object

object TargetConfigType {
  @scala.inline
  implicit def apply(value: js.Array[String | TargetConfiguration]): TargetConfigType = value.asInstanceOf[TargetConfigType]
  @scala.inline
  implicit def apply(value: Null): TargetConfigType = value.asInstanceOf[TargetConfigType]
  @scala.inline
  implicit def apply(value: String): TargetConfigType = value.asInstanceOf[TargetConfigType]
  @scala.inline
  implicit def apply(value: TargetConfiguration): TargetConfigType = value.asInstanceOf[TargetConfigType]
}

