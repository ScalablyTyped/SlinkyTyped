package typingsSlinky.lyricist.mod

import typingsSlinky.lyricist.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AvatarConfig extends StObject {
  
  var bounding_box: Height = js.native
  
  var url: String = js.native
}
object AvatarConfig {
  
  @scala.inline
  def apply(bounding_box: Height, url: String): AvatarConfig = {
    val __obj = js.Dynamic.literal(bounding_box = bounding_box.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvatarConfig]
  }
  
  @scala.inline
  implicit class AvatarConfigMutableBuilder[Self <: AvatarConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounding_box(value: Height): Self = StObject.set(x, "bounding_box", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
