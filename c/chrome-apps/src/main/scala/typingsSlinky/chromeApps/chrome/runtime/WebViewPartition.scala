package typingsSlinky.chromeApps.chrome.runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebViewPartition extends StObject {
  
  /**
    * Path to files, relative, absolute or pattern
    * @example
    * ['local_*.html', '*.png', '*.js']
    * ['img/epic.html']
    *
    */
  var accessible_resources: js.Array[String] = js.native
  
  var name: String = js.native
}
object WebViewPartition {
  
  @scala.inline
  def apply(accessible_resources: js.Array[String], name: String): WebViewPartition = {
    val __obj = js.Dynamic.literal(accessible_resources = accessible_resources.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebViewPartition]
  }
  
  @scala.inline
  implicit class WebViewPartitionMutableBuilder[Self <: WebViewPartition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessible_resources(value: js.Array[String]): Self = StObject.set(x, "accessible_resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessible_resourcesVarargs(value: String*): Self = StObject.set(x, "accessible_resources", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
