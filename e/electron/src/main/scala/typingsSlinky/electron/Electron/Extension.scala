package typingsSlinky.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Extension extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/extension
  var id: String = js.native
  
  /**
    * Copy of the extension's manifest data.
    */
  var manifest: js.Any = js.native
  
  var name: String = js.native
  
  /**
    * The extension's file path.
    */
  var path: String = js.native
  
  /**
    * The extension's `chrome-extension://` URL.
    */
  var url: String = js.native
  
  var version: String = js.native
}
object Extension {
  
  @scala.inline
  def apply(id: String, manifest: js.Any, name: String, path: String, url: String, version: String): Extension = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extension]
  }
  
  @scala.inline
  implicit class ExtensionMutableBuilder[Self <: Extension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifest(value: js.Any): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
