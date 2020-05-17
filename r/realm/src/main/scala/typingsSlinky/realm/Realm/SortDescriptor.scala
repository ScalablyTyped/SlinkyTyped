package typingsSlinky.realm.Realm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SortDescriptor
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Collection.html#~SortDescriptor }
  */
/* Rewritten from type alias, can be one of: 
  - js.Array[java.lang.String]
  - js.Tuple2[java.lang.String, scala.Boolean]
*/
trait SortDescriptor extends js.Object

object SortDescriptor {
  @scala.inline
  implicit def apply(value: js.Array[String]): SortDescriptor = value.asInstanceOf[SortDescriptor]
  @scala.inline
  implicit def apply(value: js.Tuple2[String, Boolean]): SortDescriptor = value.asInstanceOf[SortDescriptor]
}

