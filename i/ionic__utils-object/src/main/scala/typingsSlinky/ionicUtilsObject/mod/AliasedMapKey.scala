package typingsSlinky.ionicUtilsObject.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Symbol
*/
trait AliasedMapKey extends js.Object

object AliasedMapKey {
  @scala.inline
  implicit def apply(value: String): AliasedMapKey = value.asInstanceOf[AliasedMapKey]
  @scala.inline
  implicit def apply(value: js.Symbol): AliasedMapKey = value.asInstanceOf[AliasedMapKey]
}

