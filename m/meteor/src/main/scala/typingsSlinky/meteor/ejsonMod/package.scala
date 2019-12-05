package typingsSlinky.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ejsonMod {
  import org.scalablytyped.runtime.StringDictionary

  type EJSON = typingsSlinky.meteor.ejsonMod.EJSONable
  type EJSONable = StringDictionary[typingsSlinky.meteor.ejsonMod.EJSONableProperty]
  type EJSONableProperty = js.UndefOr[
    Double | String | Boolean | js.Object | (js.Array[Double | js.Object | String]) | js.Date | scala.scalajs.js.typedarray.Uint8Array | typingsSlinky.meteor.ejsonMod.EJSONableCustomType | Null
  ]
  type JSONable = StringDictionary[
    js.UndefOr[
      Double | String | Boolean | js.Object | (js.Array[Double | js.Object | String]) | Null
    ]
  ]
}
