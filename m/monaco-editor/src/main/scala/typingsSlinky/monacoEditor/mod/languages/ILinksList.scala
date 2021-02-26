package typingsSlinky.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILinksList extends StObject {
  
  var dispose: js.UndefOr[js.Function0[Unit]] = js.native
  
  var links: js.Array[ILink] = js.native
}
object ILinksList {
  
  @scala.inline
  def apply(links: js.Array[ILink]): ILinksList = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILinksList]
  }
  
  @scala.inline
  implicit class ILinksListMutableBuilder[Self <: ILinksList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisposeUndefined: Self = StObject.set(x, "dispose", js.undefined)
    
    @scala.inline
    def setLinks(value: js.Array[ILink]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksVarargs(value: ILink*): Self = StObject.set(x, "links", js.Array(value :_*))
  }
}
