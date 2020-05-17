package typingsSlinky.pgPromise.pgSubsetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Function0[js.Promise[java.lang.String] | java.lang.String]
*/
trait DynamicPassword extends js.Object

object DynamicPassword {
  @scala.inline
  implicit def apply(value: js.Function0[js.Promise[String] | String]): DynamicPassword = value.asInstanceOf[DynamicPassword]
  @scala.inline
  implicit def apply(value: String): DynamicPassword = value.asInstanceOf[DynamicPassword]
}

