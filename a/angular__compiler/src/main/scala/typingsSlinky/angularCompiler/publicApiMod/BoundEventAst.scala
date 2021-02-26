package typingsSlinky.angularCompiler.publicApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "BoundEventAst")
@js.native
class BoundEventAst protected ()
  extends typingsSlinky.angularCompiler.srcCompilerMod.BoundEventAst {
  def this(
    name: String,
    target: String,
    phase: String,
    handler: typingsSlinky.angularCompiler.astMod.ASTWithSource,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    handlerSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    target: String,
    phase: Null,
    handler: typingsSlinky.angularCompiler.astMod.ASTWithSource,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    handlerSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    target: Null,
    phase: String,
    handler: typingsSlinky.angularCompiler.astMod.ASTWithSource,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    handlerSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    target: Null,
    phase: Null,
    handler: typingsSlinky.angularCompiler.astMod.ASTWithSource,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    handlerSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}
/* static members */
object BoundEventAst {
  
  @JSImport("@angular/compiler/public_api", "BoundEventAst.calcFullName")
  @js.native
  def calcFullName(name: String): String = js.native
  @JSImport("@angular/compiler/public_api", "BoundEventAst.calcFullName")
  @js.native
  def calcFullName(name: String, target: String): String = js.native
  @JSImport("@angular/compiler/public_api", "BoundEventAst.calcFullName")
  @js.native
  def calcFullName(name: String, target: String, phase: String): String = js.native
  @JSImport("@angular/compiler/public_api", "BoundEventAst.calcFullName")
  @js.native
  def calcFullName(name: String, target: Null, phase: String): String = js.native
  
  @JSImport("@angular/compiler/public_api", "BoundEventAst.fromParsedEvent")
  @js.native
  def fromParsedEvent(event: typingsSlinky.angularCompiler.astMod.ParsedEvent): typingsSlinky.angularCompiler.templateAstMod.BoundEventAst = js.native
}
