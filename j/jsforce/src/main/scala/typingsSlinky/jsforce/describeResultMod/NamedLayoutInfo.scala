package typingsSlinky.jsforce.describeResultMod

import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamedLayoutInfo extends StObject {
  
  var name: String = js.native
  
  var urls: Record[String, String] = js.native
}
object NamedLayoutInfo {
  
  @scala.inline
  def apply(name: String, urls: Record[String, String]): NamedLayoutInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedLayoutInfo]
  }
  
  @scala.inline
  implicit class NamedLayoutInfoMutableBuilder[Self <: NamedLayoutInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrls(value: Record[String, String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
  }
}
