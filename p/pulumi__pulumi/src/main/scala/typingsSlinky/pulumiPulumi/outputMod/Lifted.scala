package typingsSlinky.pulumiPulumi.outputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Object
  - typingsSlinky.pulumiPulumi.outputMod.LiftedObject[
java.lang.String | T, 
typingsSlinky.pulumiPulumi.outputMod.NonFunctionPropertyNames[java.lang.String | T]]
  - typingsSlinky.pulumiPulumi.outputMod.LiftedArray[js.Any]
*/
trait Lifted[T] extends js.Object

object Lifted {
  @scala.inline
  implicit def apply[T](value: LiftedArray[js.Any]): Lifted[T] = value.asInstanceOf[Lifted[T]]
  @scala.inline
  implicit def apply[T](value: LiftedObject[String | T, NonFunctionPropertyNames[String | T]]): Lifted[T] = value.asInstanceOf[Lifted[T]]
  @scala.inline
  implicit def apply[T](value: js.Object): Lifted[T] = value.asInstanceOf[Lifted[T]]
}

