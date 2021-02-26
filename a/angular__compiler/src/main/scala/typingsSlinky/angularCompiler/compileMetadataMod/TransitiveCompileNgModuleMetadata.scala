package typingsSlinky.angularCompiler.compileMetadataMod

import typingsSlinky.angularCompiler.anon.Module
import typingsSlinky.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/compile_metadata", "TransitiveCompileNgModuleMetadata")
@js.native
class TransitiveCompileNgModuleMetadata () extends StObject {
  
  def addDirective(id: CompileIdentifierMetadata): Unit = js.native
  
  def addEntryComponent(ec: CompileEntryComponentMetadata): Unit = js.native
  
  def addExportedDirective(id: CompileIdentifierMetadata): Unit = js.native
  
  def addExportedPipe(id: CompileIdentifierMetadata): Unit = js.native
  
  def addModule(id: CompileTypeMetadata): Unit = js.native
  
  def addPipe(id: CompileIdentifierMetadata): Unit = js.native
  
  def addProvider(provider: CompileProviderMetadata, module: CompileIdentifierMetadata): Unit = js.native
  
  var directives: js.Array[CompileIdentifierMetadata] = js.native
  
  var directivesSet: Set[_] = js.native
  
  var entryComponents: js.Array[CompileEntryComponentMetadata] = js.native
  
  var entryComponentsSet: Set[_] = js.native
  
  var exportedDirectives: js.Array[CompileIdentifierMetadata] = js.native
  
  var exportedDirectivesSet: Set[_] = js.native
  
  var exportedPipes: js.Array[CompileIdentifierMetadata] = js.native
  
  var exportedPipesSet: Set[_] = js.native
  
  var modules: js.Array[CompileTypeMetadata] = js.native
  
  var modulesSet: Set[_] = js.native
  
  var pipes: js.Array[CompileIdentifierMetadata] = js.native
  
  var pipesSet: Set[_] = js.native
  
  var providers: js.Array[Module] = js.native
}
