package typingsSlinky.ecmarkup

import org.scalajs.dom.raw.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ecmarkup/lib/lint/collect-nodes", JSImport.Namespace)
@js.native
object collectNodesMod extends js.Object {
  
  def collectNodes(sourceText: String, dom: js.Any, document: Document): CollectNodesReturnType = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.ecmarkup.anon.Algorithms
    - typingsSlinky.ecmarkup.anon.Errors
  */
  trait CollectNodesReturnType extends js.Object
}
