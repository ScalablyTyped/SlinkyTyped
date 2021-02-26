package typingsSlinky.angularCore.anon

import typingsSlinky.angularCompiler.mod.AotCompiler
import typingsSlinky.typescript.mod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Compiler extends StObject {
  
  var compiler: AotCompiler = js.native
  
  var host: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CompilerHost */ js.Any = js.native
  
  var ngcProgram: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_compiler-cli.Program */ js.Any = js.native
  
  var program: Program = js.native
}
object Compiler {
  
  @scala.inline
  def apply(
    compiler: AotCompiler,
    host: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CompilerHost */ js.Any,
    ngcProgram: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_compiler-cli.Program */ js.Any,
    program: Program
  ): Compiler = {
    val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], ngcProgram = ngcProgram.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compiler]
  }
  
  @scala.inline
  implicit class CompilerMutableBuilder[Self <: Compiler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompiler(value: AotCompiler): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CompilerHost */ js.Any
    ): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNgcProgram(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_compiler-cli.Program */ js.Any
    ): Self = StObject.set(x, "ngcProgram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgram(value: Program): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
  }
}
