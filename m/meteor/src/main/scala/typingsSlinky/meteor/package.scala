package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object meteor {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Pick

  type EJSON = EJSONable
  type EJSONable = StringDictionary[EJSONableProperty]
  type EJSONableProperty = js.UndefOr[
    Double | String | Boolean | js.Object | (js.Array[Double | js.Object | String]) | js.Date | scala.scalajs.js.typedarray.Uint8Array | EJSONableCustomType | Null
  ]
  type Header = StringDictionary[String]
  type JSONable = StringDictionary[
    js.UndefOr[
      Double | String | Boolean | js.Object | (js.Array[Double | js.Object | String]) | Null
    ]
  ]
  type UnionOmit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  type global_Error = js.Error
}
