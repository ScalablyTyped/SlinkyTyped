package typingsSlinky.moment.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Function1[/ * relTime * / java.lang.String, java.lang.String]
*/
trait RelativeTimeFuturePastVal extends js.Object

object RelativeTimeFuturePastVal {
  @scala.inline
  implicit def apply(value: js.Function1[/* relTime */ String, String]): RelativeTimeFuturePastVal = value.asInstanceOf[RelativeTimeFuturePastVal]
  @scala.inline
  implicit def apply(value: String): RelativeTimeFuturePastVal = value.asInstanceOf[RelativeTimeFuturePastVal]
}

