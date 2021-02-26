package typingsSlinky.angularCompiler.anon

import typingsSlinky.angularCompiler.compileMetadataMod.CompileIdentifierMetadata
import typingsSlinky.angularCompiler.compileMetadataMod.CompileProviderMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Module extends StObject {
  
  var module: CompileIdentifierMetadata = js.native
  
  var provider: CompileProviderMetadata = js.native
}
object Module {
  
  @scala.inline
  def apply(module: CompileIdentifierMetadata, provider: CompileProviderMetadata): Module = {
    val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[Module]
  }
  
  @scala.inline
  implicit class ModuleMutableBuilder[Self <: Module] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModule(value: CompileIdentifierMetadata): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvider(value: CompileProviderMetadata): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
  }
}
