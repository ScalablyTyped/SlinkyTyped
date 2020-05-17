package typingsSlinky.moment.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Function4[
/ * n * / scala.Double, 
/ * withoutSuffix * / scala.Boolean, 
/ * key * / typingsSlinky.moment.mod.RelativeTimeKey, 
/ * isFuture * / scala.Boolean, 
java.lang.String]
*/
trait RelativeTimeSpecVal extends js.Object

object RelativeTimeSpecVal {
  @scala.inline
  implicit def apply(
    value: js.Function4[
      /* n */ Double, 
      /* withoutSuffix */ Boolean, 
      /* key */ RelativeTimeKey, 
      /* isFuture */ Boolean, 
      String
    ]
  ): RelativeTimeSpecVal = value.asInstanceOf[RelativeTimeSpecVal]
  @scala.inline
  implicit def apply(value: String): RelativeTimeSpecVal = value.asInstanceOf[RelativeTimeSpecVal]
}

