package typingsSlinky.babelCore.mod

import typingsSlinky.babelCore.anon.Exported
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BabelFileModulesMetadata extends StObject {
  
  var exports: Exported = js.native
  
  var imports: js.Array[js.Object] = js.native
}
object BabelFileModulesMetadata {
  
  @scala.inline
  def apply(exports: Exported, imports: js.Array[js.Object]): BabelFileModulesMetadata = {
    val __obj = js.Dynamic.literal(exports = exports.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any])
    __obj.asInstanceOf[BabelFileModulesMetadata]
  }
  
  @scala.inline
  implicit class BabelFileModulesMetadataMutableBuilder[Self <: BabelFileModulesMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExports(value: Exported): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImports(value: js.Array[js.Object]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportsVarargs(value: js.Object*): Self = StObject.set(x, "imports", js.Array(value :_*))
  }
}
