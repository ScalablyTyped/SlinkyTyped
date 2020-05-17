package typingsSlinky.recharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - js.Function1[
/ * dataObject * / js.Any, 
java.lang.String | scala.Double | (js.Tuple2[scala.Double, scala.Double]) | scala.Null]
*/
trait DataKey extends js.Object

object DataKey {
  @scala.inline
  implicit def apply(value: Double): DataKey = value.asInstanceOf[DataKey]
  @scala.inline
  implicit def apply(value: js.Function1[/* dataObject */ js.Any, String | Double | (js.Tuple2[Double, Double]) | Null]): DataKey = value.asInstanceOf[DataKey]
  @scala.inline
  implicit def apply(value: String): DataKey = value.asInstanceOf[DataKey]
}

