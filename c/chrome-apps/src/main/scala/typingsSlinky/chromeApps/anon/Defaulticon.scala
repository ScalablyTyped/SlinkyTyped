package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chromeAppsStrings.read_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Defaulticon extends StObject {
  
  /** Icon */
  var default_icon: String = js.native
  
  /** What the button will display */
  var default_title: String = js.native
  
  /** ['read'] = read only mode */
  var file_access: js.UndefOr[js.Array[read_ | String]] = js.native
  
  /**
    * To match all files, use 'filesystem:*.*'
    */
  var file_filters: js.Array[String] = js.native
  
  /** Handler id */
  var id: String = js.native
}
object Defaulticon {
  
  @scala.inline
  def apply(default_icon: String, default_title: String, file_filters: js.Array[String], id: String): Defaulticon = {
    val __obj = js.Dynamic.literal(default_icon = default_icon.asInstanceOf[js.Any], default_title = default_title.asInstanceOf[js.Any], file_filters = file_filters.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Defaulticon]
  }
  
  @scala.inline
  implicit class DefaulticonMutableBuilder[Self <: Defaulticon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault_icon(value: String): Self = StObject.set(x, "default_icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault_title(value: String): Self = StObject.set(x, "default_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile_access(value: js.Array[read_ | String]): Self = StObject.set(x, "file_access", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile_accessUndefined: Self = StObject.set(x, "file_access", js.undefined)
    
    @scala.inline
    def setFile_accessVarargs(value: (read_ | String)*): Self = StObject.set(x, "file_access", js.Array(value :_*))
    
    @scala.inline
    def setFile_filters(value: js.Array[String]): Self = StObject.set(x, "file_filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile_filtersVarargs(value: String*): Self = StObject.set(x, "file_filters", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
