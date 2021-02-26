package typingsSlinky.angularCompiler.anon

import typingsSlinky.angularCompiler.compileMetadataMod.CompileTypeMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeCompileTypeMetadata extends StObject {
  
  var `type`: CompileTypeMetadata = js.native
}
object TypeCompileTypeMetadata {
  
  @scala.inline
  def apply(`type`: CompileTypeMetadata): TypeCompileTypeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeCompileTypeMetadata]
  }
  
  @scala.inline
  implicit class TypeCompileTypeMetadataMutableBuilder[Self <: TypeCompileTypeMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: CompileTypeMetadata): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
