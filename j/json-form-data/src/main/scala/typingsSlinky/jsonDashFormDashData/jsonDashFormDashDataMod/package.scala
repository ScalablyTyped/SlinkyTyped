package typingsSlinky.jsonDashFormDashData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsonDashFormDashDataMod {
  import org.scalajs.dom.raw.Blob
  import org.scalajs.dom.raw.File
  import org.scalajs.dom.raw.FormData

  type FormDataFormatter = js.Function2[/* json */ ValidJSON, /* opts */ js.UndefOr[FormatOptions], FormData]
  type ValidJSONValue = js.UndefOr[String | Double | Boolean | File | Blob | js.Date | Null]
}
