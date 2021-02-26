package typingsSlinky.angularCompiler.anon

import typingsSlinky.angularCompiler.compileMetadataMod.CompileDirectiveMetadata
import typingsSlinky.angularCompiler.compileMetadataMod.CompileNgModuleMetadata
import typingsSlinky.angularCompiler.compileMetadataMod.CompilePipeMetadata
import typingsSlinky.angularCompiler.compileMetadataMod.CompileTypeMetadata
import typingsSlinky.angularCompiler.compileMetadataMod.CompileTypeSummary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Metadata extends StObject {
  
  var metadata: CompileNgModuleMetadata | CompileDirectiveMetadata | CompilePipeMetadata | CompileTypeMetadata = js.native
  
  var summary: CompileTypeSummary = js.native
}
object Metadata {
  
  @scala.inline
  def apply(
    metadata: CompileNgModuleMetadata | CompileDirectiveMetadata | CompilePipeMetadata | CompileTypeMetadata,
    summary: CompileTypeSummary
  ): Metadata = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
  
  @scala.inline
  implicit class MetadataMutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(
      value: CompileNgModuleMetadata | CompileDirectiveMetadata | CompilePipeMetadata | CompileTypeMetadata
    ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummary(value: CompileTypeSummary): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
  }
}
