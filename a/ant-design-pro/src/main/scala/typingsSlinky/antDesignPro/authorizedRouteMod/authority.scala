package typingsSlinky.antDesignPro.authorizedRouteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[java.lang.String]
  - typingsSlinky.antDesignPro.authorizedRouteMod.authorityFN
  - js.Promise[js.Any]
*/
trait authority extends js.Object

object authority {
  @scala.inline
  implicit def apply(value: js.Array[String]): authority = value.asInstanceOf[authority]
  @scala.inline
  implicit def apply(value: js.Promise[js.Any]): authority = value.asInstanceOf[authority]
  @scala.inline
  implicit def apply(value: String): authority = value.asInstanceOf[authority]
  @scala.inline
  implicit def apply(value: authorityFN): authority = value.asInstanceOf[authority]
}

