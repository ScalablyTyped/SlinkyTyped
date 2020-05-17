package typingsSlinky.bent.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - org.scalablytyped.runtime.StringDictionary[js.Any] with org.scalablytyped.runtime.NumberDictionary[js.Any]
  - js.Array[js.Any]
*/
trait Json
  extends RequestBody
     with ValidResponse

object Json {
  @scala.inline
  implicit def apply(value: StringDictionary[js.Any] with NumberDictionary[js.Any]): Json = value.asInstanceOf[Json]
  @scala.inline
  implicit def apply(value: js.Array[js.Any]): Json = value.asInstanceOf[Json]
}

