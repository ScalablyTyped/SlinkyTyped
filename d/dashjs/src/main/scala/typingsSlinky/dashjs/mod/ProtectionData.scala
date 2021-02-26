package typingsSlinky.dashjs.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.dashjs.anon.PinMediaKeyMessageTypestr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dashjs", "ProtectionData")
@js.native
class ProtectionData () extends StObject {
  
  /**
    * Defines a set of clear keys that are available to the key system.
    * Object properties are base64-encoded keyIDs (with no padding).
    * Corresponding property values are keys, base64-encoded (no padding).
    */
  var clearkeys: js.UndefOr[StringDictionary[String]] = js.native
  
  /** headers to add to the http request */
  var httpRequestHeaders: js.UndefOr[js.Object] = js.native
  
  /**
    * A license server URL to use with this key system.
    * When specified as a string, a single URL will be used regardless of message type.
    * When specified as an object, the object will have property names for each message
    * type with the corresponding property value being the URL to use for
    * messages of that type
    */
  var serverURL: js.UndefOr[String | PinMediaKeyMessageTypestr] = js.native
}
