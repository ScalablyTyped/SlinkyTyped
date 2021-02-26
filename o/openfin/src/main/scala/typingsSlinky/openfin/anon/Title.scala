package typingsSlinky.openfin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Title extends StObject {
  
  var identity: typingsSlinky.openfin.shapesIdentityMod.Identity = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var url: String = js.native
}
object Title {
  
  @scala.inline
  def apply(identity: typingsSlinky.openfin.shapesIdentityMod.Identity, url: String): Title = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Title]
  }
  
  @scala.inline
  implicit class TitleMutableBuilder[Self <: Title] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentity(value: typingsSlinky.openfin.shapesIdentityMod.Identity): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
