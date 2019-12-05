package typingsSlinky.elasticDashApmDashNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object elasticDashApmDashNodeMod {
  import org.scalablytyped.runtime.StringDictionary

  type CaptureErrorCallback = js.Function2[/* err */ js.Error | Null, /* id */ String, Unit]
  type FilterFn = js.Function1[/* payload */ Payload, Payload | Boolean | Unit]
  type KeyValueConfig = String | Labels | js.Array[js.Array[LabelValue]]
  type LabelValue = js.UndefOr[String | Double | Boolean | Null]
  type Labels = StringDictionary[LabelValue]
  type PatchHandler = js.Function3[/* exports */ js.Any, /* agent */ Agent, /* options */ PatchOptions, js.Any]
  type Payload = StringDictionary[js.Any]
}
