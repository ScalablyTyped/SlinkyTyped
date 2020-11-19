package typingsSlinky.angularCore

import typingsSlinky.angularCore.anon.Compiler
import typingsSlinky.typescript.mod.CompilerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core/schematics/migrations/undecorated-classes-with-di/create_ngc_program", JSImport.Namespace)
@js.native
object createNgcProgramMod extends js.Object {
  
  def createNgcProgram(
    createHost: js.Function1[
      /* options */ CompilerOptions, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CompilerHost */ _
    ],
    tsconfigPath: String
  ): Compiler = js.native
}
