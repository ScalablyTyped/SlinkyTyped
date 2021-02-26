package typingsSlinky.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExternalLink extends StObject {
  
  // The url of the link.
  var href: js.UndefOr[NullableOption[String]] = js.native
}
object ExternalLink {
  
  @scala.inline
  def apply(): ExternalLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalLink]
  }
  
  @scala.inline
  implicit class ExternalLinkMutableBuilder[Self <: ExternalLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHref(value: NullableOption[String]): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefNull: Self = StObject.set(x, "href", null)
    
    @scala.inline
    def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
  }
}
