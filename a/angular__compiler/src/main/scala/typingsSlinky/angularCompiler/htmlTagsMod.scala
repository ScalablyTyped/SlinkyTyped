package typingsSlinky.angularCompiler

import typingsSlinky.angularCompiler.anon.ClosedByChildren
import typingsSlinky.angularCompiler.tagsMod.TagDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/ml_parser/html_tags", JSImport.Namespace)
@js.native
object htmlTagsMod extends js.Object {
  
  def getHtmlTagDefinition(tagName: String): HtmlTagDefinition = js.native
  
  @js.native
  class HtmlTagDefinition () extends TagDefinition {
    def this(hasClosedByChildrenImplicitNamespacePrefixContentTypeClosedByParentIsVoidIgnoreFirstLf: ClosedByChildren) = this()
    
    var closedByChildren: js.Any = js.native
  }
}
