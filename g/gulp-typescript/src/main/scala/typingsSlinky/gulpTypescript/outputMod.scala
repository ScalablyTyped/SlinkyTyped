package typingsSlinky.gulpTypescript

import typingsSlinky.gulpTypescript.inputMod.File
import typingsSlinky.gulpTypescript.projectMod.ProjectInfo
import typingsSlinky.gulpTypescript.reporterMod.CompilationResult
import typingsSlinky.gulpTypescript.reporterMod.TypeScriptError
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.typescript.mod.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outputMod {
  
  @JSImport("gulp-typescript/release/output", "Output")
  @js.native
  class Output protected () extends StObject {
    def this(_project: ProjectInfo, streamFull: Readable, streamJs: Readable, streamDts: Readable) = this()
    
    var applySourceMap: js.Any = js.native
    
    def diagnostic(info: Diagnostic): Unit = js.native
    
    def error(error: TypeScriptError): Unit = js.native
    
    def finish(result: CompilationResult): Unit = js.native
    
    var getError: js.Any = js.native
    
    var mightFinish: js.Any = js.native
    
    var pendingIO: js.Any = js.native
    
    var pipeRejection: js.Any = js.native
    
    var project: ProjectInfo = js.native
    
    var result: CompilationResult = js.native
    
    var streamDts: Readable = js.native
    
    var streamFull: Readable = js.native
    
    var streamJs: Readable = js.native
    
    def writeDts(
      base: String,
      fileName: String,
      content: String,
      declarationMapContent: String,
      cwd: String,
      original: File
    ): Unit = js.native
    
    var writeDtsAsync: js.Any = js.native
    
    def writeJs(
      base: String,
      fileName: String,
      content: String,
      sourceMapContent: String,
      cwd: String,
      original: File
    ): Unit = js.native
    
    var writeJsAsync: js.Any = js.native
  }
}
