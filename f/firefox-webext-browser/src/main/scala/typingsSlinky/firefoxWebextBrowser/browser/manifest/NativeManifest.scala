package typingsSlinky.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.pkcs11
import typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.stdio
import typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a native manifest file */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.anon.Allowedextensions
  - typingsSlinky.firefoxWebextBrowser.anon.Data
*/
trait NativeManifest extends StObject
object NativeManifest {
  
  @scala.inline
  def Allowedextensions(
    allowed_extensions: js.Array[ExtensionID],
    description: String,
    name: String,
    path: String,
    `type`: pkcs11 | stdio
  ): typingsSlinky.firefoxWebextBrowser.anon.Allowedextensions = {
    val __obj = js.Dynamic.literal(allowed_extensions = allowed_extensions.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.firefoxWebextBrowser.anon.Allowedextensions]
  }
  
  @scala.inline
  def Data(data: StringDictionary[js.Any], description: String, name: ExtensionID, `type`: storage): typingsSlinky.firefoxWebextBrowser.anon.Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.firefoxWebextBrowser.anon.Data]
  }
}
