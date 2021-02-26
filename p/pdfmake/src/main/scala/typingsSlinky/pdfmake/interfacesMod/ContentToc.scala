package typingsSlinky.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentToc
  extends ContentBase
     with _Content {
  
  var toc: TableOfContent = js.native
}
object ContentToc {
  
  @scala.inline
  def apply(toc: TableOfContent): ContentToc = {
    val __obj = js.Dynamic.literal(toc = toc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentToc]
  }
  
  @scala.inline
  implicit class ContentTocMutableBuilder[Self <: ContentToc] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setToc(value: TableOfContent): Self = StObject.set(x, "toc", value.asInstanceOf[js.Any])
  }
}
