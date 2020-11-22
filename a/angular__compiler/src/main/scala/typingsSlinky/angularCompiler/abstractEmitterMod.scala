package typingsSlinky.angularCompiler

import typingsSlinky.angularCompiler.anon.SourceSpan
import typingsSlinky.angularCompiler.outputAstMod.AssertNotNull_
import typingsSlinky.angularCompiler.outputAstMod.BinaryOperatorExpr
import typingsSlinky.angularCompiler.outputAstMod.BuiltinMethod
import typingsSlinky.angularCompiler.outputAstMod.ClassStmt
import typingsSlinky.angularCompiler.outputAstMod.CommaExpr
import typingsSlinky.angularCompiler.outputAstMod.ConditionalExpr
import typingsSlinky.angularCompiler.outputAstMod.DeclareVarStmt
import typingsSlinky.angularCompiler.outputAstMod.Expression
import typingsSlinky.angularCompiler.outputAstMod.ExpressionStatement
import typingsSlinky.angularCompiler.outputAstMod.ExpressionVisitor
import typingsSlinky.angularCompiler.outputAstMod.ExternalExpr
import typingsSlinky.angularCompiler.outputAstMod.FunctionExpr
import typingsSlinky.angularCompiler.outputAstMod.IfStmt_
import typingsSlinky.angularCompiler.outputAstMod.InstantiateExpr
import typingsSlinky.angularCompiler.outputAstMod.InvokeFunctionExpr
import typingsSlinky.angularCompiler.outputAstMod.InvokeMethodExpr
import typingsSlinky.angularCompiler.outputAstMod.LiteralArrayExpr
import typingsSlinky.angularCompiler.outputAstMod.LiteralExpr
import typingsSlinky.angularCompiler.outputAstMod.LiteralMapExpr
import typingsSlinky.angularCompiler.outputAstMod.LocalizedString_
import typingsSlinky.angularCompiler.outputAstMod.NotExpr
import typingsSlinky.angularCompiler.outputAstMod.ReadKeyExpr
import typingsSlinky.angularCompiler.outputAstMod.ReadPropExpr
import typingsSlinky.angularCompiler.outputAstMod.ReadVarExpr
import typingsSlinky.angularCompiler.outputAstMod.ReturnStatement
import typingsSlinky.angularCompiler.outputAstMod.Statement
import typingsSlinky.angularCompiler.outputAstMod.StatementVisitor
import typingsSlinky.angularCompiler.outputAstMod.ThrowStmt
import typingsSlinky.angularCompiler.outputAstMod.TryCatchStmt
import typingsSlinky.angularCompiler.outputAstMod.TypeofExpr_
import typingsSlinky.angularCompiler.outputAstMod.UnaryOperatorExpr
import typingsSlinky.angularCompiler.outputAstMod.WrappedNodeExpr
import typingsSlinky.angularCompiler.outputAstMod.WriteKeyExpr
import typingsSlinky.angularCompiler.outputAstMod.WritePropExpr
import typingsSlinky.angularCompiler.outputAstMod.WriteVarExpr
import typingsSlinky.angularCompiler.sourceMapMod.SourceMapGenerator
import typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/output/abstract_emitter", JSImport.Namespace)
@js.native
object abstractEmitterMod extends js.Object {
  
  val CATCH_ERROR_VAR: ReadVarExpr = js.native
  
  val CATCH_STACK_VAR: ReadVarExpr = js.native
  
  def escapeIdentifier(input: String, escapeDollar: Boolean): js.Any = js.native
  def escapeIdentifier(input: String, escapeDollar: Boolean, alwaysQuote: Boolean): js.Any = js.native
  
  @js.native
  abstract class AbstractEmitterVisitor protected ()
    extends StatementVisitor
       with ExpressionVisitor {
    def this(_escapeDollarInStrings: Boolean) = this()
    
    var _escapeDollarInStrings: js.Any = js.native
    
    def getBuiltinMethodName(method: BuiltinMethod): String = js.native
    
    /* protected */ def printLeadingComments(stmt: Statement, ctx: EmitterVisitorContext): Unit = js.native
    
    def visitAllExpressions(expressions: js.Array[Expression], ctx: EmitterVisitorContext, separator: String): Unit = js.native
    
    def visitAllObjects[T](
      handler: js.Function1[/* t */ T, Unit],
      expressions: js.Array[T],
      ctx: EmitterVisitorContext,
      separator: String
    ): Unit = js.native
    
    def visitAllStatements(statements: js.Array[Statement], ctx: EmitterVisitorContext): Unit = js.native
    
    def visitAssertNotNullExpr(ast: AssertNotNull_, ctx: EmitterVisitorContext): js.Any = js.native
    
    def visitBinaryOperatorExpr(ast: BinaryOperatorExpr, ctx: EmitterVisitorContext): js.Any = js.native
    
    def visitCommaExpr(ast: CommaExpr, ctx: EmitterVisitorContext): js.Any = js.native
    
    def visitConditionalExpr(ast: ConditionalExpr, ctx: EmitterVisitorContext): js.Any = js.native
    
    def visitDeclareClassStmt(stmt: ClassStmt, ctx: EmitterVisitorContext): js.Any = js.native
    
    def visitDeclareVarStmt(stmt: DeclareVarStmt, ctx: EmitterVisitorContext): js.Any = js.native
    
    def visitExpressionStmt(stmt: ExpressionStatement, ctx: EmitterVisitorContext): js.Any = js.native
    
    def visitExternalExpr(ast: ExternalExpr, ctx: EmitterVisitorContext): js.Any = js.native
    
    def visitFunctionExpr(ast: FunctionExpr, ctx: EmitterVisitorContext): js.Any = js.native
    
    def visitIfStmt(stmt: IfStmt_, ctx: EmitterVisitorContext): js.Any = js.native
    
    def visitInstantiateExpr(ast: InstantiateExpr, ctx: EmitterVisitorContext): js.Any = js.native
    
    def visitInvokeFunctionExpr(expr: InvokeFunctionExpr, ctx: EmitterVisitorContext): js.Any = js.native
    
    def visitInvokeMethodExpr(expr: InvokeMethodExpr, ctx: EmitterVisitorContext): js.Any = js.native
    
    def visitLiteralArrayExpr(ast: LiteralArrayExpr, ctx: EmitterVisitorContext): js.Any = js.native
    
    def visitLiteralExpr(ast: LiteralExpr, ctx: EmitterVisitorContext): js.Any = js.native
    
    def visitLiteralMapExpr(ast: LiteralMapExpr, ctx: EmitterVisitorContext): js.Any = js.native
    
    def visitLocalizedString(ast: LocalizedString_, ctx: EmitterVisitorContext): js.Any = js.native
    
    def visitNotExpr(ast: NotExpr, ctx: EmitterVisitorContext): js.Any = js.native
    
    def visitReadKeyExpr(ast: ReadKeyExpr, ctx: EmitterVisitorContext): js.Any = js.native
    
    def visitReadPropExpr(ast: ReadPropExpr, ctx: EmitterVisitorContext): js.Any = js.native
    
    def visitReadVarExpr(ast: ReadVarExpr, ctx: EmitterVisitorContext): js.Any = js.native
    
    def visitReturnStmt(stmt: ReturnStatement, ctx: EmitterVisitorContext): js.Any = js.native
    
    def visitThrowStmt(stmt: ThrowStmt, ctx: EmitterVisitorContext): js.Any = js.native
    
    def visitTryCatchStmt(stmt: TryCatchStmt, ctx: EmitterVisitorContext): js.Any = js.native
    
    def visitTypeofExpr(expr: TypeofExpr_, ctx: EmitterVisitorContext): js.Any = js.native
    
    def visitUnaryOperatorExpr(ast: UnaryOperatorExpr, ctx: EmitterVisitorContext): js.Any = js.native
    
    def visitWrappedNodeExpr(ast: WrappedNodeExpr[_], ctx: EmitterVisitorContext): js.Any = js.native
    
    def visitWriteKeyExpr(expr: WriteKeyExpr, ctx: EmitterVisitorContext): js.Any = js.native
    
    def visitWritePropExpr(expr: WritePropExpr, ctx: EmitterVisitorContext): js.Any = js.native
    
    def visitWriteVarExpr(expr: WriteVarExpr, ctx: EmitterVisitorContext): js.Any = js.native
  }
  
  @js.native
  class EmitterVisitorContext protected () extends js.Object {
    def this(_indent: Double) = this()
    
    var _classes: js.Any = js.native
    
    var _indent: js.Any = js.native
    
    var _lines: js.Any = js.native
    
    var _preambleLineCount: js.Any = js.native
    
    def currentClass: ClassStmt | Null = js.native
    
    def decIndent(): Unit = js.native
    
    def incIndent(): Unit = js.native
    
    def lineIsEmpty(): Boolean = js.native
    
    def lineLength(): Double = js.native
    
    def popClass(): ClassStmt = js.native
    
    def print(from: Null, part: String): Unit = js.native
    def print(from: Null, part: String, newLine: Boolean): Unit = js.native
    def print(from: SourceSpan, part: String): Unit = js.native
    def print(from: SourceSpan, part: String, newLine: Boolean): Unit = js.native
    
    def println(): Unit = js.native
    def println(from: js.UndefOr[scala.Nothing], lastPart: String): Unit = js.native
    def println(from: Null, lastPart: String): Unit = js.native
    def println(from: SourceSpan): Unit = js.native
    def println(from: SourceSpan, lastPart: String): Unit = js.native
    
    def pushClass(clazz: ClassStmt): Unit = js.native
    
    def removeEmptyLastLine(): Unit = js.native
    
    def setPreambleLineCount(count: Double): Double = js.native
    
    def spanOf(line: Double, column: Double): ParseSourceSpan | Null = js.native
    
    def toSource(): String = js.native
    
    def toSourceMapGenerator(genFilePath: String): SourceMapGenerator = js.native
    def toSourceMapGenerator(genFilePath: String, startsAtLine: Double): SourceMapGenerator = js.native
  }
  /* static members */
  @js.native
  object EmitterVisitorContext extends js.Object {
    
    def createRoot(): EmitterVisitorContext = js.native
  }
  
  @js.native
  trait OutputEmitter extends js.Object {
    
    def emitStatements(genFilePath: String, stmts: js.Array[Statement]): String = js.native
    def emitStatements(genFilePath: String, stmts: js.Array[Statement], preamble: String): String = js.native
  }
}
