package typingsSlinky.angularCore

import typingsSlinky.angularCompiler.compilerHostMod.AotCompilerHost
import typingsSlinky.angularCore.importManagerMod.ImportManager
import typingsSlinky.std.Error
import typingsSlinky.typescript.mod.Node
import typingsSlinky.typescript.mod.SourceFile
import typingsSlinky.typescript.mod.TransformationContext
import typingsSlinky.typescript.mod.Transformer
import typingsSlinky.typescript.mod.TypeChecker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core/schematics/migrations/undecorated-classes-with-di/decorator_rewrite/import_rewrite_visitor", JSImport.Namespace)
@js.native
object importRewriteVisitorMod extends js.Object {
  
  @js.native
  class ImportRewriteTransformerFactory protected () extends js.Object {
    def this(importManager: ImportManager, typeChecker: TypeChecker, compilerHost: AotCompilerHost) = this()
    
    /**
      * Gets the resolved exports of a given source file. Exports are cached
      * for subsequent calls.
      */
    var _getSourceFileExports: js.Any = js.native
    
    var _recordIdentifierReference: js.Any = js.native
    
    /** Rewrites a module import to be relative to the target file location. */
    var _rewriteModuleImport: js.Any = js.native
    
    var compilerHost: js.Any = js.native
    
    def create[T /* <: Node */](ctx: TransformationContext, newSourceFile: SourceFile): Transformer[T] = js.native
    
    var importManager: js.Any = js.native
    
    var sourceFileExports: js.Any = js.native
    
    var typeChecker: js.Any = js.native
  }
  
  @js.native
  class UnresolvedIdentifierError () extends Error
}
