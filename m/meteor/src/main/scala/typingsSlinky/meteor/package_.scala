package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object meteor {
  type EJSON = typingsSlinky.meteor.EJSONable
  type EJSONable = org.scalablytyped.runtime.StringDictionary[typingsSlinky.meteor.EJSONableProperty]
  type EJSONableProperty = js.UndefOr[
    scala.Double | java.lang.String | scala.Boolean | js.Object | (js.Array[scala.Double | js.Object | java.lang.String]) | js.Date | js.typedarray.Uint8Array | typingsSlinky.meteor.EJSONableCustomType | scala.Null
  ]
  type Header = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type JSONable = org.scalablytyped.runtime.StringDictionary[
    js.UndefOr[
      scala.Double | java.lang.String | scala.Boolean | js.Object | (js.Array[scala.Double | js.Object | java.lang.String]) | scala.Null
    ]
  ]
  type UnionOmit[T, K /* <: /* keyof any */ java.lang.String */] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  type globalError = js.Error
}
