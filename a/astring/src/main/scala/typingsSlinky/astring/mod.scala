package typingsSlinky.astring

import typingsSlinky.astring.anon.FnCall
import typingsSlinky.astring.anon.OptionsoutputStream
import typingsSlinky.astring.anon.Type
import typingsSlinky.astring.anon.Write
import typingsSlinky.astring.anon.`0`
import typingsSlinky.astring.anon.`10`
import typingsSlinky.astring.anon.`11`
import typingsSlinky.astring.anon.`12`
import typingsSlinky.astring.anon.`13`
import typingsSlinky.astring.anon.`14`
import typingsSlinky.astring.anon.`15`
import typingsSlinky.astring.anon.`16`
import typingsSlinky.astring.anon.`17`
import typingsSlinky.astring.anon.`18`
import typingsSlinky.astring.anon.`19`
import typingsSlinky.astring.anon.`1`
import typingsSlinky.astring.anon.`20`
import typingsSlinky.astring.anon.`21`
import typingsSlinky.astring.anon.`22`
import typingsSlinky.astring.anon.`23`
import typingsSlinky.astring.anon.`24`
import typingsSlinky.astring.anon.`25`
import typingsSlinky.astring.anon.`26`
import typingsSlinky.astring.anon.`27`
import typingsSlinky.astring.anon.`28`
import typingsSlinky.astring.anon.`29`
import typingsSlinky.astring.anon.`2`
import typingsSlinky.astring.anon.`30`
import typingsSlinky.astring.anon.`31`
import typingsSlinky.astring.anon.`32`
import typingsSlinky.astring.anon.`33`
import typingsSlinky.astring.anon.`34`
import typingsSlinky.astring.anon.`35`
import typingsSlinky.astring.anon.`36`
import typingsSlinky.astring.anon.`37`
import typingsSlinky.astring.anon.`38`
import typingsSlinky.astring.anon.`39`
import typingsSlinky.astring.anon.`3`
import typingsSlinky.astring.anon.`40`
import typingsSlinky.astring.anon.`41`
import typingsSlinky.astring.anon.`42`
import typingsSlinky.astring.anon.`43`
import typingsSlinky.astring.anon.`44`
import typingsSlinky.astring.anon.`45`
import typingsSlinky.astring.anon.`46`
import typingsSlinky.astring.anon.`47`
import typingsSlinky.astring.anon.`48`
import typingsSlinky.astring.anon.`49`
import typingsSlinky.astring.anon.`4`
import typingsSlinky.astring.anon.`50`
import typingsSlinky.astring.anon.`51`
import typingsSlinky.astring.anon.`52`
import typingsSlinky.astring.anon.`53`
import typingsSlinky.astring.anon.`54`
import typingsSlinky.astring.anon.`55`
import typingsSlinky.astring.anon.`56`
import typingsSlinky.astring.anon.`57`
import typingsSlinky.astring.anon.`58`
import typingsSlinky.astring.anon.`59`
import typingsSlinky.astring.anon.`5`
import typingsSlinky.astring.anon.`60`
import typingsSlinky.astring.anon.`61`
import typingsSlinky.astring.anon.`62`
import typingsSlinky.astring.anon.`63`
import typingsSlinky.astring.anon.`64`
import typingsSlinky.astring.anon.`65`
import typingsSlinky.astring.anon.`66`
import typingsSlinky.astring.anon.`6`
import typingsSlinky.astring.anon.`7`
import typingsSlinky.astring.anon.`8`
import typingsSlinky.astring.anon.`9`
import typingsSlinky.estree.mod.Node
import typingsSlinky.node.streamMod.Stream
import typingsSlinky.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("astring", "baseGenerator")
  @js.native
  val baseGenerator: Generator = js.native
  
  @JSImport("astring", "generate")
  @js.native
  def generate(node: Node): String = js.native
  @JSImport("astring", "generate")
  @js.native
  def generate(node: Node, options: OptionsoutputStream): Stream = js.native
  @JSImport("astring", "generate")
  @js.native
  def generate(node: Node, options: Options): String = js.native
  
  object global {
    
    @js.native
    trait astring extends StObject {
      
      /** Base generator that can be used to extend Astring. See https://github.com/davidbonnet/astring#extending */
      var baseGenerator: Generator = js.native
      
      def generate(node: Node): String = js.native
      def generate(node: Node, options: OptionsoutputStream): Stream = js.native
      def generate(node: Node, options: Options): String = js.native
      @JSName("generate")
      var generate_Original: FnCall = js.native
    }
    @JSGlobal("astring")
    @js.native
    val astring: typingsSlinky.astring.mod.global.astring = js.native
  }
  
  /* Inlined {[ key in estree.estree.Node['type'] ]: (node : std.Extract<estree.estree.Node, {  type :key}>, state : {write (s : string): void}): void} */
  @js.native
  trait Generator extends StObject {
    
    def ArrayExpression(node: Extract[Node, `17`], state: Write): Unit = js.native
    @JSName("ArrayExpression")
    var ArrayExpression_Original: js.Function2[/* node */ Extract[Node, `17`], /* state */ Write, Unit] = js.native
    
    def ArrayPattern(node: Extract[Node, `37`], state: Write): Unit = js.native
    @JSName("ArrayPattern")
    var ArrayPattern_Original: js.Function2[/* node */ Extract[Node, `37`], /* state */ Write, Unit] = js.native
    
    def ArrowFunctionExpression(node: Extract[Node, `46`], state: Write): Unit = js.native
    @JSName("ArrowFunctionExpression")
    var ArrowFunctionExpression_Original: js.Function2[/* node */ Extract[Node, `46`], /* state */ Write, Unit] = js.native
    
    def AssignmentExpression(node: Extract[Node, `41`], state: Write): Unit = js.native
    @JSName("AssignmentExpression")
    var AssignmentExpression_Original: js.Function2[/* node */ Extract[Node, `41`], /* state */ Write, Unit] = js.native
    
    def AssignmentPattern(node: Extract[Node, `21`], state: Write): Unit = js.native
    @JSName("AssignmentPattern")
    var AssignmentPattern_Original: js.Function2[/* node */ Extract[Node, `21`], /* state */ Write, Unit] = js.native
    
    def AwaitExpression(node: Extract[Node, `35`], state: Write): Unit = js.native
    @JSName("AwaitExpression")
    var AwaitExpression_Original: js.Function2[/* node */ Extract[Node, `35`], /* state */ Write, Unit] = js.native
    
    def BinaryExpression(node: Extract[Node, `29`], state: Write): Unit = js.native
    @JSName("BinaryExpression")
    var BinaryExpression_Original: js.Function2[/* node */ Extract[Node, `29`], /* state */ Write, Unit] = js.native
    
    def BlockStatement(node: Extract[Node, `7`], state: Write): Unit = js.native
    @JSName("BlockStatement")
    var BlockStatement_Original: js.Function2[/* node */ Extract[Node, `7`], /* state */ Write, Unit] = js.native
    
    def BreakStatement(node: Extract[Node, `0`], state: Write): Unit = js.native
    @JSName("BreakStatement")
    var BreakStatement_Original: js.Function2[/* node */ Extract[Node, `0`], /* state */ Write, Unit] = js.native
    
    def CallExpression(node: Extract[Node, `15`], state: Write): Unit = js.native
    @JSName("CallExpression")
    var CallExpression_Original: js.Function2[/* node */ Extract[Node, `15`], /* state */ Write, Unit] = js.native
    
    def CatchClause(node: Extract[Node, `54`], state: Write): Unit = js.native
    @JSName("CatchClause")
    var CatchClause_Original: js.Function2[/* node */ Extract[Node, `54`], /* state */ Write, Unit] = js.native
    
    def ChainExpression(node: Extract[Node, `60`], state: Write): Unit = js.native
    @JSName("ChainExpression")
    var ChainExpression_Original: js.Function2[/* node */ Extract[Node, `60`], /* state */ Write, Unit] = js.native
    
    def ClassBody(node: Extract[Node, `63`], state: Write): Unit = js.native
    @JSName("ClassBody")
    var ClassBody_Original: js.Function2[/* node */ Extract[Node, `63`], /* state */ Write, Unit] = js.native
    
    def ClassDeclaration(node: Extract[Node, `34`], state: Write): Unit = js.native
    @JSName("ClassDeclaration")
    var ClassDeclaration_Original: js.Function2[/* node */ Extract[Node, `34`], /* state */ Write, Unit] = js.native
    
    def ClassExpression(node: Extract[Node, Type], state: Write): Unit = js.native
    @JSName("ClassExpression")
    var ClassExpression_Original: js.Function2[/* node */ Extract[Node, Type], /* state */ Write, Unit] = js.native
    
    def ConditionalExpression(node: Extract[Node, `52`], state: Write): Unit = js.native
    @JSName("ConditionalExpression")
    var ConditionalExpression_Original: js.Function2[/* node */ Extract[Node, `52`], /* state */ Write, Unit] = js.native
    
    def ContinueStatement(node: Extract[Node, `12`], state: Write): Unit = js.native
    @JSName("ContinueStatement")
    var ContinueStatement_Original: js.Function2[/* node */ Extract[Node, `12`], /* state */ Write, Unit] = js.native
    
    def DebuggerStatement(node: Extract[Node, `43`], state: Write): Unit = js.native
    @JSName("DebuggerStatement")
    var DebuggerStatement_Original: js.Function2[/* node */ Extract[Node, `43`], /* state */ Write, Unit] = js.native
    
    def DoWhileStatement(node: Extract[Node, `59`], state: Write): Unit = js.native
    @JSName("DoWhileStatement")
    var DoWhileStatement_Original: js.Function2[/* node */ Extract[Node, `59`], /* state */ Write, Unit] = js.native
    
    def EmptyStatement(node: Extract[Node, `33`], state: Write): Unit = js.native
    @JSName("EmptyStatement")
    var EmptyStatement_Original: js.Function2[/* node */ Extract[Node, `33`], /* state */ Write, Unit] = js.native
    
    def ExportAllDeclaration(node: Extract[Node, `10`], state: Write): Unit = js.native
    @JSName("ExportAllDeclaration")
    var ExportAllDeclaration_Original: js.Function2[/* node */ Extract[Node, `10`], /* state */ Write, Unit] = js.native
    
    def ExportDefaultDeclaration(node: Extract[Node, `26`], state: Write): Unit = js.native
    @JSName("ExportDefaultDeclaration")
    var ExportDefaultDeclaration_Original: js.Function2[/* node */ Extract[Node, `26`], /* state */ Write, Unit] = js.native
    
    def ExportNamedDeclaration(node: Extract[Node, `14`], state: Write): Unit = js.native
    @JSName("ExportNamedDeclaration")
    var ExportNamedDeclaration_Original: js.Function2[/* node */ Extract[Node, `14`], /* state */ Write, Unit] = js.native
    
    def ExportSpecifier(node: Extract[Node, `38`], state: Write): Unit = js.native
    @JSName("ExportSpecifier")
    var ExportSpecifier_Original: js.Function2[/* node */ Extract[Node, `38`], /* state */ Write, Unit] = js.native
    
    def ExpressionStatement(node: Extract[Node, `20`], state: Write): Unit = js.native
    @JSName("ExpressionStatement")
    var ExpressionStatement_Original: js.Function2[/* node */ Extract[Node, `20`], /* state */ Write, Unit] = js.native
    
    def ForInStatement(node: Extract[Node, `3`], state: Write): Unit = js.native
    @JSName("ForInStatement")
    var ForInStatement_Original: js.Function2[/* node */ Extract[Node, `3`], /* state */ Write, Unit] = js.native
    
    def ForOfStatement(node: Extract[Node, `51`], state: Write): Unit = js.native
    @JSName("ForOfStatement")
    var ForOfStatement_Original: js.Function2[/* node */ Extract[Node, `51`], /* state */ Write, Unit] = js.native
    
    def ForStatement(node: Extract[Node, `56`], state: Write): Unit = js.native
    @JSName("ForStatement")
    var ForStatement_Original: js.Function2[/* node */ Extract[Node, `56`], /* state */ Write, Unit] = js.native
    
    def FunctionDeclaration(node: Extract[Node, `42`], state: Write): Unit = js.native
    @JSName("FunctionDeclaration")
    var FunctionDeclaration_Original: js.Function2[/* node */ Extract[Node, `42`], /* state */ Write, Unit] = js.native
    
    def FunctionExpression(node: Extract[Node, `57`], state: Write): Unit = js.native
    @JSName("FunctionExpression")
    var FunctionExpression_Original: js.Function2[/* node */ Extract[Node, `57`], /* state */ Write, Unit] = js.native
    
    def Identifier(node: Extract[Node, `31`], state: Write): Unit = js.native
    @JSName("Identifier")
    var Identifier_Original: js.Function2[/* node */ Extract[Node, `31`], /* state */ Write, Unit] = js.native
    
    def IfStatement(node: Extract[Node, `28`], state: Write): Unit = js.native
    @JSName("IfStatement")
    var IfStatement_Original: js.Function2[/* node */ Extract[Node, `28`], /* state */ Write, Unit] = js.native
    
    def ImportDeclaration(node: Extract[Node, `66`], state: Write): Unit = js.native
    @JSName("ImportDeclaration")
    var ImportDeclaration_Original: js.Function2[/* node */ Extract[Node, `66`], /* state */ Write, Unit] = js.native
    
    def ImportDefaultSpecifier(node: Extract[Node, `4`], state: Write): Unit = js.native
    @JSName("ImportDefaultSpecifier")
    var ImportDefaultSpecifier_Original: js.Function2[/* node */ Extract[Node, `4`], /* state */ Write, Unit] = js.native
    
    def ImportExpression(node: Extract[Node, `64`], state: Write): Unit = js.native
    @JSName("ImportExpression")
    var ImportExpression_Original: js.Function2[/* node */ Extract[Node, `64`], /* state */ Write, Unit] = js.native
    
    def ImportNamespaceSpecifier(node: Extract[Node, `61`], state: Write): Unit = js.native
    @JSName("ImportNamespaceSpecifier")
    var ImportNamespaceSpecifier_Original: js.Function2[/* node */ Extract[Node, `61`], /* state */ Write, Unit] = js.native
    
    def ImportSpecifier(node: Extract[Node, `36`], state: Write): Unit = js.native
    @JSName("ImportSpecifier")
    var ImportSpecifier_Original: js.Function2[/* node */ Extract[Node, `36`], /* state */ Write, Unit] = js.native
    
    def LabeledStatement(node: Extract[Node, `9`], state: Write): Unit = js.native
    @JSName("LabeledStatement")
    var LabeledStatement_Original: js.Function2[/* node */ Extract[Node, `9`], /* state */ Write, Unit] = js.native
    
    def Literal(node: Extract[Node, `48`], state: Write): Unit = js.native
    @JSName("Literal")
    var Literal_Original: js.Function2[/* node */ Extract[Node, `48`], /* state */ Write, Unit] = js.native
    
    def LogicalExpression(node: Extract[Node, `23`], state: Write): Unit = js.native
    @JSName("LogicalExpression")
    var LogicalExpression_Original: js.Function2[/* node */ Extract[Node, `23`], /* state */ Write, Unit] = js.native
    
    def MemberExpression(node: Extract[Node, `19`], state: Write): Unit = js.native
    @JSName("MemberExpression")
    var MemberExpression_Original: js.Function2[/* node */ Extract[Node, `19`], /* state */ Write, Unit] = js.native
    
    def MetaProperty(node: Extract[Node, `27`], state: Write): Unit = js.native
    @JSName("MetaProperty")
    var MetaProperty_Original: js.Function2[/* node */ Extract[Node, `27`], /* state */ Write, Unit] = js.native
    
    def MethodDefinition(node: Extract[Node, `47`], state: Write): Unit = js.native
    @JSName("MethodDefinition")
    var MethodDefinition_Original: js.Function2[/* node */ Extract[Node, `47`], /* state */ Write, Unit] = js.native
    
    def NewExpression(node: Extract[Node, `18`], state: Write): Unit = js.native
    @JSName("NewExpression")
    var NewExpression_Original: js.Function2[/* node */ Extract[Node, `18`], /* state */ Write, Unit] = js.native
    
    def ObjectExpression(node: Extract[Node, `39`], state: Write): Unit = js.native
    @JSName("ObjectExpression")
    var ObjectExpression_Original: js.Function2[/* node */ Extract[Node, `39`], /* state */ Write, Unit] = js.native
    
    def ObjectPattern(node: Extract[Node, `62`], state: Write): Unit = js.native
    @JSName("ObjectPattern")
    var ObjectPattern_Original: js.Function2[/* node */ Extract[Node, `62`], /* state */ Write, Unit] = js.native
    
    def Program(node: Extract[Node, `49`], state: Write): Unit = js.native
    @JSName("Program")
    var Program_Original: js.Function2[/* node */ Extract[Node, `49`], /* state */ Write, Unit] = js.native
    
    def Property(node: Extract[Node, `45`], state: Write): Unit = js.native
    @JSName("Property")
    var Property_Original: js.Function2[/* node */ Extract[Node, `45`], /* state */ Write, Unit] = js.native
    
    def RestElement(node: Extract[Node, `8`], state: Write): Unit = js.native
    @JSName("RestElement")
    var RestElement_Original: js.Function2[/* node */ Extract[Node, `8`], /* state */ Write, Unit] = js.native
    
    def ReturnStatement(node: Extract[Node, `1`], state: Write): Unit = js.native
    @JSName("ReturnStatement")
    var ReturnStatement_Original: js.Function2[/* node */ Extract[Node, `1`], /* state */ Write, Unit] = js.native
    
    def SequenceExpression(node: Extract[Node, `53`], state: Write): Unit = js.native
    @JSName("SequenceExpression")
    var SequenceExpression_Original: js.Function2[/* node */ Extract[Node, `53`], /* state */ Write, Unit] = js.native
    
    def SpreadElement(node: Extract[Node, `5`], state: Write): Unit = js.native
    @JSName("SpreadElement")
    var SpreadElement_Original: js.Function2[/* node */ Extract[Node, `5`], /* state */ Write, Unit] = js.native
    
    def Super(node: Extract[Node, `50`], state: Write): Unit = js.native
    @JSName("Super")
    var Super_Original: js.Function2[/* node */ Extract[Node, `50`], /* state */ Write, Unit] = js.native
    
    def SwitchCase(node: Extract[Node, `16`], state: Write): Unit = js.native
    @JSName("SwitchCase")
    var SwitchCase_Original: js.Function2[/* node */ Extract[Node, `16`], /* state */ Write, Unit] = js.native
    
    def SwitchStatement(node: Extract[Node, `13`], state: Write): Unit = js.native
    @JSName("SwitchStatement")
    var SwitchStatement_Original: js.Function2[/* node */ Extract[Node, `13`], /* state */ Write, Unit] = js.native
    
    def TaggedTemplateExpression(node: Extract[Node, `24`], state: Write): Unit = js.native
    @JSName("TaggedTemplateExpression")
    var TaggedTemplateExpression_Original: js.Function2[/* node */ Extract[Node, `24`], /* state */ Write, Unit] = js.native
    
    def TemplateElement(node: Extract[Node, `58`], state: Write): Unit = js.native
    @JSName("TemplateElement")
    var TemplateElement_Original: js.Function2[/* node */ Extract[Node, `58`], /* state */ Write, Unit] = js.native
    
    def TemplateLiteral(node: Extract[Node, `25`], state: Write): Unit = js.native
    @JSName("TemplateLiteral")
    var TemplateLiteral_Original: js.Function2[/* node */ Extract[Node, `25`], /* state */ Write, Unit] = js.native
    
    def ThisExpression(node: Extract[Node, `65`], state: Write): Unit = js.native
    @JSName("ThisExpression")
    var ThisExpression_Original: js.Function2[/* node */ Extract[Node, `65`], /* state */ Write, Unit] = js.native
    
    def ThrowStatement(node: Extract[Node, `44`], state: Write): Unit = js.native
    @JSName("ThrowStatement")
    var ThrowStatement_Original: js.Function2[/* node */ Extract[Node, `44`], /* state */ Write, Unit] = js.native
    
    def TryStatement(node: Extract[Node, `6`], state: Write): Unit = js.native
    @JSName("TryStatement")
    var TryStatement_Original: js.Function2[/* node */ Extract[Node, `6`], /* state */ Write, Unit] = js.native
    
    def UnaryExpression(node: Extract[Node, `55`], state: Write): Unit = js.native
    @JSName("UnaryExpression")
    var UnaryExpression_Original: js.Function2[/* node */ Extract[Node, `55`], /* state */ Write, Unit] = js.native
    
    def UpdateExpression(node: Extract[Node, `32`], state: Write): Unit = js.native
    @JSName("UpdateExpression")
    var UpdateExpression_Original: js.Function2[/* node */ Extract[Node, `32`], /* state */ Write, Unit] = js.native
    
    def VariableDeclaration(node: Extract[Node, `22`], state: Write): Unit = js.native
    @JSName("VariableDeclaration")
    var VariableDeclaration_Original: js.Function2[/* node */ Extract[Node, `22`], /* state */ Write, Unit] = js.native
    
    def VariableDeclarator(node: Extract[Node, `40`], state: Write): Unit = js.native
    @JSName("VariableDeclarator")
    var VariableDeclarator_Original: js.Function2[/* node */ Extract[Node, `40`], /* state */ Write, Unit] = js.native
    
    def WhileStatement(node: Extract[Node, `11`], state: Write): Unit = js.native
    @JSName("WhileStatement")
    var WhileStatement_Original: js.Function2[/* node */ Extract[Node, `11`], /* state */ Write, Unit] = js.native
    
    def WithStatement(node: Extract[Node, `30`], state: Write): Unit = js.native
    @JSName("WithStatement")
    var WithStatement_Original: js.Function2[/* node */ Extract[Node, `30`], /* state */ Write, Unit] = js.native
    
    def YieldExpression(node: Extract[Node, `2`], state: Write): Unit = js.native
    @JSName("YieldExpression")
    var YieldExpression_Original: js.Function2[/* node */ Extract[Node, `2`], /* state */ Write, Unit] = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    /** generate comments if true (defaults to false) */
    var comments: js.UndefOr[Boolean] = js.native
    
    /** custom code generator (defaults to astring.baseGenerator) */
    var generator: js.UndefOr[js.Object] = js.native
    
    /** string to use for indentation (defaults to "  ") */
    var indent: js.UndefOr[String] = js.native
    
    /** string to use for line endings (defaults to "\n") */
    var lineEnd: js.UndefOr[String] = js.native
    
    /** source map generator (defaults to null), see https://github.com/mozilla/source-map#sourcemapgenerator */
    var sourceMap: js.UndefOr[js.Any] = js.native
    
    /** indent level to start from (defaults to 0) */
    var startingIndentLevel: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComments(value: Boolean): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      @scala.inline
      def setGenerator(value: js.Object): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeneratorUndefined: Self = StObject.set(x, "generator", js.undefined)
      
      @scala.inline
      def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      @scala.inline
      def setLineEnd(value: String): Self = StObject.set(x, "lineEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineEndUndefined: Self = StObject.set(x, "lineEnd", js.undefined)
      
      @scala.inline
      def setSourceMap(value: js.Any): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      @scala.inline
      def setStartingIndentLevel(value: Double): Self = StObject.set(x, "startingIndentLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartingIndentLevelUndefined: Self = StObject.set(x, "startingIndentLevel", js.undefined)
    }
  }
}
