package typingsSlinky.remarkable.libMod

import typingsSlinky.remarkable.remarkableStrings.link_open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.remarkable.libMod._Token because Already inherited */ @js.native
trait LinkOpenToken extends TagToken {
  
  /**
    * Link url.
    */
  var href: String = js.native
  
  /**
    * Link title.
    */
  var title: js.UndefOr[String] = js.native
  
  @JSName("type")
  var type_LinkOpenToken: link_open = js.native
}
object LinkOpenToken {
  
  @scala.inline
  def apply(href: String, level: Double, `type`: link_open): LinkOpenToken = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkOpenToken]
  }
  
  @scala.inline
  implicit class LinkOpenTokenMutableBuilder[Self <: LinkOpenToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: link_open): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
