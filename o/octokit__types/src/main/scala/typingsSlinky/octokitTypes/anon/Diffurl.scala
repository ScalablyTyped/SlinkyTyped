package typingsSlinky.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Diffurl extends StObject {
  
  var diff_url: String = js.native
  
  var html_url: String = js.native
  
  var patch_url: String = js.native
  
  var url: String = js.native
}
object Diffurl {
  
  @scala.inline
  def apply(diff_url: String, html_url: String, patch_url: String, url: String): Diffurl = {
    val __obj = js.Dynamic.literal(diff_url = diff_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], patch_url = patch_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diffurl]
  }
  
  @scala.inline
  implicit class DiffurlMutableBuilder[Self <: Diffurl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiff_url(value: String): Self = StObject.set(x, "diff_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatch_url(value: String): Self = StObject.set(x, "patch_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
