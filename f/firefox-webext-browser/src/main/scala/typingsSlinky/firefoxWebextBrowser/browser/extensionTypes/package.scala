package typingsSlinky.firefoxWebextBrowser.browser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object extensionTypes {
  
  type Date = java.lang.String | scala.Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Date */ js.Any)
  
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
