package typingsSlinky.handlebars

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.handlebars.hbs.AST.Expression
import typingsSlinky.handlebars.hbs.AST.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Handlebars {
  
  @js.native
  trait Exception extends StObject {
    
    var column: js.UndefOr[js.Any] = js.native
    
    var description: String = js.native
    
    var endColumn: js.UndefOr[js.Any] = js.native
    
    var endLineNumber: js.UndefOr[js.Any] = js.native
    
    var fileName: String = js.native
    
    var lineNumber: js.UndefOr[js.Any] = js.native
    
    var message: String = js.native
    
    var name: String = js.native
    
    var number: Double = js.native
    
    var stack: js.UndefOr[String] = js.native
  }
  object Exception {
    
    @scala.inline
    def apply(description: String, fileName: String, message: String, name: String, number: Double): Exception = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
      __obj.asInstanceOf[Exception]
    }
    
    @scala.inline
    implicit class ExceptionMutableBuilder[Self <: Exception] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: js.Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndColumn(value: js.Any): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndColumnUndefined: Self = StObject.set(x, "endColumn", js.undefined)
      
      @scala.inline
      def setEndLineNumber(value: js.Any): Self = StObject.set(x, "endLineNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndLineNumberUndefined: Self = StObject.set(x, "endLineNumber", js.undefined)
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineNumber(value: js.Any): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  type HelperDeclareSpec = StringDictionary[HelperDelegate]
  
  type HelperDelegate = js.Function7[
    /* context */ js.UndefOr[js.Any], 
    /* arg1 */ js.UndefOr[js.Any], 
    /* arg2 */ js.UndefOr[js.Any], 
    /* arg3 */ js.UndefOr[js.Any], 
    /* arg4 */ js.UndefOr[js.Any], 
    /* arg5 */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[HelperOptions], 
    js.Any
  ]
  
  @js.native
  trait HelperOptions extends StObject {
    
    var data: js.UndefOr[js.Any] = js.native
    
    def fn(context: js.Any): String = js.native
    def fn(context: js.Any, options: typingsSlinky.handlebars.Handlebars.RuntimeOptions): String = js.native
    @JSName("fn")
    var fn_Original: TemplateDelegate[_] = js.native
    
    var hash: js.Any = js.native
    
    def inverse(context: js.Any): String = js.native
    def inverse(context: js.Any, options: typingsSlinky.handlebars.Handlebars.RuntimeOptions): String = js.native
    @JSName("inverse")
    var inverse_Original: TemplateDelegate[_] = js.native
  }
  
  @js.native
  trait ICompiler extends StObject {
    
    def BlockStatement(block: typingsSlinky.handlebars.hbs.AST.BlockStatement): Unit = js.native
    
    def BooleanLiteral(bool: typingsSlinky.handlebars.hbs.AST.BooleanLiteral): Unit = js.native
    
    def CommentStatement(): Unit = js.native
    def CommentStatement(comment: typingsSlinky.handlebars.hbs.AST.CommentStatement): Unit = js.native
    
    def ContentStatement(content: typingsSlinky.handlebars.hbs.AST.ContentStatement): Unit = js.native
    
    def Decorator(decorator: typingsSlinky.handlebars.hbs.AST.Decorator): Unit = js.native
    
    def DecoratorBlock(decorator: typingsSlinky.handlebars.hbs.AST.DecoratorBlock): Unit = js.native
    
    def Hash(hash: typingsSlinky.handlebars.hbs.AST.Hash): Unit = js.native
    
    def MustacheStatement(mustache: typingsSlinky.handlebars.hbs.AST.MustacheStatement): Unit = js.native
    
    def NullLiteral(): Unit = js.native
    
    def NumberLiteral(num: typingsSlinky.handlebars.hbs.AST.NumberLiteral): Unit = js.native
    
    def PartialBlockStatement(partial: typingsSlinky.handlebars.hbs.AST.PartialBlockStatement): Unit = js.native
    
    def PartialStatement(partial: typingsSlinky.handlebars.hbs.AST.PartialStatement): Unit = js.native
    
    def PathExpression(path: typingsSlinky.handlebars.hbs.AST.PathExpression): Unit = js.native
    
    def Program(program: typingsSlinky.handlebars.hbs.AST.Program): Unit = js.native
    
    def StringLiteral(str: typingsSlinky.handlebars.hbs.AST.StringLiteral): Unit = js.native
    
    def SubExpression(sexpr: typingsSlinky.handlebars.hbs.AST.SubExpression): Unit = js.native
    
    def UndefinedLiteral(): Unit = js.native
    
    def accept(node: Node): Unit = js.native
  }
  
  @js.native
  trait ParseOptions extends StObject {
    
    var ignoreStandalone: js.UndefOr[Boolean] = js.native
    
    var srcName: js.UndefOr[String] = js.native
  }
  object ParseOptions {
    
    @scala.inline
    def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    @scala.inline
    implicit class ParseOptionsMutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIgnoreStandalone(value: Boolean): Self = StObject.set(x, "ignoreStandalone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreStandaloneUndefined: Self = StObject.set(x, "ignoreStandalone", js.undefined)
      
      @scala.inline
      def setSrcName(value: String): Self = StObject.set(x, "srcName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcNameUndefined: Self = StObject.set(x, "srcName", js.undefined)
    }
  }
  
  @js.native
  trait ResolvePartialOptions extends StObject {
    
    var data: js.UndefOr[js.Any] = js.native
    
    var decorators: js.UndefOr[StringDictionary[js.Function]] = js.native
    
    var helpers: js.UndefOr[StringDictionary[js.Function]] = js.native
    
    var name: String = js.native
    
    var partials: js.UndefOr[StringDictionary[HandlebarsTemplateDelegate[_]]] = js.native
  }
  object ResolvePartialOptions {
    
    @scala.inline
    def apply(name: String): ResolvePartialOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvePartialOptions]
    }
    
    @scala.inline
    implicit class ResolvePartialOptionsMutableBuilder[Self <: ResolvePartialOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDecorators(value: StringDictionary[js.Function]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecoratorsUndefined: Self = StObject.set(x, "decorators", js.undefined)
      
      @scala.inline
      def setHelpers(value: StringDictionary[js.Function]): Self = StObject.set(x, "helpers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpersUndefined: Self = StObject.set(x, "helpers", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartials(value: StringDictionary[HandlebarsTemplateDelegate[_]]): Self = StObject.set(x, "partials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartialsUndefined: Self = StObject.set(x, "partials", js.undefined)
    }
  }
  
  @js.native
  trait RuntimeOptions extends StObject {
    
    var allowCallsToHelperMissing: js.UndefOr[Boolean] = js.native
    
    var allowProtoMethodsByDefault: js.UndefOr[Boolean] = js.native
    
    var allowProtoPropertiesByDefault: js.UndefOr[Boolean] = js.native
    
    var allowedProtoMethods: js.UndefOr[StringDictionary[Boolean]] = js.native
    
    var allowedProtoProperties: js.UndefOr[StringDictionary[Boolean]] = js.native
    
    var blockParams: js.UndefOr[js.Array[_]] = js.native
    
    var data: js.UndefOr[js.Any] = js.native
    
    var decorators: js.UndefOr[StringDictionary[js.Function]] = js.native
    
    var depths: js.UndefOr[js.Array[_]] = js.native
    
    var helpers: js.UndefOr[StringDictionary[js.Function]] = js.native
    
    var partial: js.UndefOr[Boolean] = js.native
    
    var partials: js.UndefOr[StringDictionary[HandlebarsTemplateDelegate[_]]] = js.native
  }
  object RuntimeOptions {
    
    @scala.inline
    def apply(): typingsSlinky.handlebars.Handlebars.RuntimeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.handlebars.Handlebars.RuntimeOptions]
    }
    
    @scala.inline
    implicit class RuntimeOptionsMutableBuilder[Self <: typingsSlinky.handlebars.Handlebars.RuntimeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowCallsToHelperMissing(value: Boolean): Self = StObject.set(x, "allowCallsToHelperMissing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowCallsToHelperMissingUndefined: Self = StObject.set(x, "allowCallsToHelperMissing", js.undefined)
      
      @scala.inline
      def setAllowProtoMethodsByDefault(value: Boolean): Self = StObject.set(x, "allowProtoMethodsByDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowProtoMethodsByDefaultUndefined: Self = StObject.set(x, "allowProtoMethodsByDefault", js.undefined)
      
      @scala.inline
      def setAllowProtoPropertiesByDefault(value: Boolean): Self = StObject.set(x, "allowProtoPropertiesByDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowProtoPropertiesByDefaultUndefined: Self = StObject.set(x, "allowProtoPropertiesByDefault", js.undefined)
      
      @scala.inline
      def setAllowedProtoMethods(value: StringDictionary[Boolean]): Self = StObject.set(x, "allowedProtoMethods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedProtoMethodsUndefined: Self = StObject.set(x, "allowedProtoMethods", js.undefined)
      
      @scala.inline
      def setAllowedProtoProperties(value: StringDictionary[Boolean]): Self = StObject.set(x, "allowedProtoProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedProtoPropertiesUndefined: Self = StObject.set(x, "allowedProtoProperties", js.undefined)
      
      @scala.inline
      def setBlockParams(value: js.Array[_]): Self = StObject.set(x, "blockParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockParamsUndefined: Self = StObject.set(x, "blockParams", js.undefined)
      
      @scala.inline
      def setBlockParamsVarargs(value: js.Any*): Self = StObject.set(x, "blockParams", js.Array(value :_*))
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDecorators(value: StringDictionary[js.Function]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecoratorsUndefined: Self = StObject.set(x, "decorators", js.undefined)
      
      @scala.inline
      def setDepths(value: js.Array[_]): Self = StObject.set(x, "depths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthsUndefined: Self = StObject.set(x, "depths", js.undefined)
      
      @scala.inline
      def setDepthsVarargs(value: js.Any*): Self = StObject.set(x, "depths", js.Array(value :_*))
      
      @scala.inline
      def setHelpers(value: StringDictionary[js.Function]): Self = StObject.set(x, "helpers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpersUndefined: Self = StObject.set(x, "helpers", js.undefined)
      
      @scala.inline
      def setPartial(value: Boolean): Self = StObject.set(x, "partial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartialUndefined: Self = StObject.set(x, "partial", js.undefined)
      
      @scala.inline
      def setPartials(value: StringDictionary[HandlebarsTemplateDelegate[_]]): Self = StObject.set(x, "partials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartialsUndefined: Self = StObject.set(x, "partials", js.undefined)
    }
  }
  
  @js.native
  trait SafeString extends StObject {
    
    def toHTML(): String = js.native
  }
  object SafeString {
    
    @scala.inline
    def apply(toHTML: () => String): SafeString = {
      val __obj = js.Dynamic.literal(toHTML = js.Any.fromFunction0(toHTML))
      __obj.asInstanceOf[SafeString]
    }
    
    @scala.inline
    implicit class SafeStringMutableBuilder[Self <: SafeString] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToHTML(value: () => String): Self = StObject.set(x, "toHTML", js.Any.fromFunction0(value))
    }
  }
  
  type Template[T] = TemplateDelegate[T] | String
  
  type TemplateDelegate[T] = js.Function2[
    /* context */ T, 
    /* options */ js.UndefOr[typingsSlinky.handlebars.Handlebars.RuntimeOptions], 
    String
  ]
  
  @js.native
  trait Visitor extends ICompiler {
    
    def acceptArray(arr: js.Array[Expression]): Unit = js.native
    
    def acceptKey(node: Node, name: String): Unit = js.native
  }
}
