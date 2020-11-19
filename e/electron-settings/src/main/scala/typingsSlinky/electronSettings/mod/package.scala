package typingsSlinky.electronSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  // tslint:disable-line no-empty-interface
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - scala.Null
    - typingsSlinky.electronSettings.mod.JsonArray
    - typingsSlinky.electronSettings.mod.JsonObject
  */
  type JsonValue = typingsSlinky.electronSettings.mod._JsonValue | java.lang.String | scala.Double | scala.Boolean | scala.Null
  
  type SettingsHandler = js.Function2[/* newValue */ js.Any, /* oldValue */ js.Any, js.Any]
}
