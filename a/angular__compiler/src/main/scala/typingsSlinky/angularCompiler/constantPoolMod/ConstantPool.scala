package typingsSlinky.angularCompiler.constantPoolMod

import typingsSlinky.angularCompiler.anon.LiteralFactory
import typingsSlinky.angularCompiler.outputAstMod.Expression
import typingsSlinky.angularCompiler.outputAstMod.LiteralArrayExpr
import typingsSlinky.angularCompiler.outputAstMod.LiteralMapExpr
import typingsSlinky.angularCompiler.outputAstMod.Statement
import typingsSlinky.angularCompiler.srcUtilMod.OutputContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/constant_pool", "ConstantPool")
@js.native
class ConstantPool () extends js.Object {
  def this(isClosureCompilerEnabled: Boolean) = this()
  
  var _getLiteralFactory: js.Any = js.native
  
  var componentDefinitions: js.Any = js.native
  
  var definitionsOf: js.Any = js.native
  
  var directiveDefinitions: js.Any = js.native
  
  var freshName: js.Any = js.native
  
  def getConstLiteral(literal: Expression): Expression = js.native
  def getConstLiteral(literal: Expression, forceShared: Boolean): Expression = js.native
  
  def getDefinition(`type`: js.Any, kind: DefinitionKind, ctx: OutputContext): Expression = js.native
  def getDefinition(`type`: js.Any, kind: DefinitionKind, ctx: OutputContext, forceShared: Boolean): Expression = js.native
  
  def getLiteralFactory(literal: LiteralArrayExpr): LiteralFactory = js.native
  def getLiteralFactory(literal: LiteralMapExpr): LiteralFactory = js.native
  
  var injectorDefinitions: js.Any = js.native
  
  val isClosureCompilerEnabled: js.Any = js.native
  
  var keyOf: js.Any = js.native
  
  var literalFactories: js.Any = js.native
  
  var literals: js.Any = js.native
  
  var nextNameIndex: js.Any = js.native
  
  var pipeDefinitions: js.Any = js.native
  
  def propertyNameOf(kind: DefinitionKind): String = js.native
  
  var statements: js.Array[Statement] = js.native
  
  /**
    * Produce a unique name.
    *
    * The name might be unique among different prefixes if any of the prefixes end in
    * a digit so the prefix should be a constant string (not based on user input) and
    * must not end in a digit.
    */
  def uniqueName(prefix: String): String = js.native
}
