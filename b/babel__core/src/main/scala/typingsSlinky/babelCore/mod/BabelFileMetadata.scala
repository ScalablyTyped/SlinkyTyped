package typingsSlinky.babelCore.mod

import typingsSlinky.babelCore.anon.Loc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BabelFileMetadata extends StObject {
  
  var marked: js.Array[Loc] = js.native
  
  var modules: BabelFileModulesMetadata = js.native
  
  var usedHelpers: js.Array[String] = js.native
}
object BabelFileMetadata {
  
  @scala.inline
  def apply(marked: js.Array[Loc], modules: BabelFileModulesMetadata, usedHelpers: js.Array[String]): BabelFileMetadata = {
    val __obj = js.Dynamic.literal(marked = marked.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], usedHelpers = usedHelpers.asInstanceOf[js.Any])
    __obj.asInstanceOf[BabelFileMetadata]
  }
  
  @scala.inline
  implicit class BabelFileMetadataMutableBuilder[Self <: BabelFileMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarked(value: js.Array[Loc]): Self = StObject.set(x, "marked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkedVarargs(value: Loc*): Self = StObject.set(x, "marked", js.Array(value :_*))
    
    @scala.inline
    def setModules(value: BabelFileModulesMetadata): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsedHelpers(value: js.Array[String]): Self = StObject.set(x, "usedHelpers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsedHelpersVarargs(value: String*): Self = StObject.set(x, "usedHelpers", js.Array(value :_*))
  }
}
