package typingsSlinky.arangodb.Foxx

import typingsSlinky.arangodb.arangodbBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentationRouterOptions extends StObject {
  
  def before(req: Request, res: Response): Unit | `false` = js.native
  
  var indexFile: String = js.native
  
  var mount: String = js.native
  
  var swaggerRoot: String = js.native
}
object DocumentationRouterOptions {
  
  @scala.inline
  def apply(
    before: (Request, Response) => Unit | `false`,
    indexFile: String,
    mount: String,
    swaggerRoot: String
  ): DocumentationRouterOptions = {
    val __obj = js.Dynamic.literal(before = js.Any.fromFunction2(before), indexFile = indexFile.asInstanceOf[js.Any], mount = mount.asInstanceOf[js.Any], swaggerRoot = swaggerRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentationRouterOptions]
  }
  
  @scala.inline
  implicit class DocumentationRouterOptionsMutableBuilder[Self <: DocumentationRouterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBefore(value: (Request, Response) => Unit | `false`): Self = StObject.set(x, "before", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIndexFile(value: String): Self = StObject.set(x, "indexFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMount(value: String): Self = StObject.set(x, "mount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwaggerRoot(value: String): Self = StObject.set(x, "swaggerRoot", value.asInstanceOf[js.Any])
  }
}
