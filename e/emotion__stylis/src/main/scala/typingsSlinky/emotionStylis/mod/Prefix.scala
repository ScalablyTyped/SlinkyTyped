package typingsSlinky.emotionStylis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - js.Function3[
/ * key * / java.lang.String, 
/ * value * / java.lang.String, 
/ * context * / typingsSlinky.emotionStylis.mod.PrefixContext, 
scala.Boolean]
*/
trait Prefix extends js.Object

object Prefix {
  @scala.inline
  implicit def apply(value: Boolean): Prefix = value.asInstanceOf[Prefix]
  @scala.inline
  implicit def apply(value: js.Function3[/* key */ String, /* value */ String, /* context */ PrefixContext, Boolean]): Prefix = value.asInstanceOf[Prefix]
}

