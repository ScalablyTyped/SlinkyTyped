package typingsSlinky.plotlyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - js.Array[
js.UndefOr[
  (js.Array[js.UndefOr[java.lang.String | scala.Double | scala.Null]]) | scala.Double | scala.Null | java.lang.String
]]
*/
trait Color extends js.Object

object Color {
  @scala.inline
  implicit def apply(
    value: js.Array[
      js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String]
    ]
  ): Color = value.asInstanceOf[Color]
  @scala.inline
  implicit def apply(value: Double): Color = value.asInstanceOf[Color]
  @scala.inline
  implicit def apply(value: String): Color = value.asInstanceOf[Color]
}

