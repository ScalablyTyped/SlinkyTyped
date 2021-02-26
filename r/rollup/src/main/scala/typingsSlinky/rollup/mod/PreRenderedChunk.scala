package typingsSlinky.rollup.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.rollup.rollupStrings.chunk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreRenderedChunk extends StObject {
  
  var exports: js.Array[String] = js.native
  
  var facadeModuleId: String | Null = js.native
  
  var isDynamicEntry: Boolean = js.native
  
  var isEntry: Boolean = js.native
  
  var isImplicitEntry: Boolean = js.native
  
  var modules: StringDictionary[RenderedModule] = js.native
  
  var name: String = js.native
  
  var `type`: chunk = js.native
}
object PreRenderedChunk {
  
  @scala.inline
  def apply(
    exports: js.Array[String],
    isDynamicEntry: Boolean,
    isEntry: Boolean,
    isImplicitEntry: Boolean,
    modules: StringDictionary[RenderedModule],
    name: String,
    `type`: chunk
  ): PreRenderedChunk = {
    val __obj = js.Dynamic.literal(exports = exports.asInstanceOf[js.Any], isDynamicEntry = isDynamicEntry.asInstanceOf[js.Any], isEntry = isEntry.asInstanceOf[js.Any], isImplicitEntry = isImplicitEntry.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreRenderedChunk]
  }
  
  @scala.inline
  implicit class PreRenderedChunkMutableBuilder[Self <: PreRenderedChunk] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExports(value: js.Array[String]): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportsVarargs(value: String*): Self = StObject.set(x, "exports", js.Array(value :_*))
    
    @scala.inline
    def setFacadeModuleId(value: String): Self = StObject.set(x, "facadeModuleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacadeModuleIdNull: Self = StObject.set(x, "facadeModuleId", null)
    
    @scala.inline
    def setIsDynamicEntry(value: Boolean): Self = StObject.set(x, "isDynamicEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEntry(value: Boolean): Self = StObject.set(x, "isEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsImplicitEntry(value: Boolean): Self = StObject.set(x, "isImplicitEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModules(value: StringDictionary[RenderedModule]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: chunk): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
