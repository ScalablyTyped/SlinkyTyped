package typingsSlinky.firefoxWebextBrowser.browser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object extensionTypes {
  type Date = java.lang.String | scala.Double | js.Object
  /** A plain JSON value */
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - typingsSlinky.firefoxWebextBrowser.browser.extensionTypes.PlainJSONArray
    - typingsSlinky.firefoxWebextBrowser.browser.extensionTypes.PlainJSONObject
  */
  type PlainJSONValue = typingsSlinky.firefoxWebextBrowser.browser.extensionTypes._PlainJSONValue | scala.Null | java.lang.String | scala.Double | scala.Boolean
}
