package typingsSlinky.jsonFormData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FormDataFormatter = js.Function2[
    /* json */ typingsSlinky.jsonFormData.mod.ValidJSON, 
    /* opts */ js.UndefOr[typingsSlinky.jsonFormData.mod.FormatOptions], 
    org.scalajs.dom.raw.FormData
  ]
  type ValidJSONValue = js.UndefOr[
    java.lang.String | scala.Double | scala.Boolean | org.scalajs.dom.raw.File | org.scalajs.dom.raw.Blob | js.Date | scala.Null
  ]
}
