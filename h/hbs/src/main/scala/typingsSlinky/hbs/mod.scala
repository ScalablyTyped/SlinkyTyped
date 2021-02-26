package typingsSlinky.hbs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.handlebars.CompileOptions
import typingsSlinky.handlebars.Handlebars.HelperDeclareSpec
import typingsSlinky.handlebars.Handlebars.HelperDelegate
import typingsSlinky.handlebars.Handlebars.ParseOptions
import typingsSlinky.handlebars.Handlebars.Template
import typingsSlinky.handlebars.HandlebarsTemplateDelegate
import typingsSlinky.handlebars.HandlebarsTemplates
import typingsSlinky.handlebars.Logger
import typingsSlinky.handlebars.PrecompileOptions
import typingsSlinky.handlebars.TemplateSpecification
import typingsSlinky.handlebars.anon.TypeofHandlebars
import typingsSlinky.handlebars.hbs.AST.Program
import typingsSlinky.hbs.anon.TypeofAST
import typingsSlinky.hbs.anon.TypeofUtils
import typingsSlinky.hbs.anon.TypeofVM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("hbs", JSImport.Namespace)
  @js.native
  val ^ : hbsModuleWithCreate = js.native
  
  type _To = hbsModuleWithCreate
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: hbsModuleWithCreate = ^
  
  @js.native
  trait handlebarsModule extends StObject {
    
    val AST: TypeofAST = js.native
    
    var Exception: Instantiable1[/* message */ String, typingsSlinky.handlebars.mod.Exception] = js.native
    
    def K(): Unit = js.native
    
    var SafeString: Instantiable1[/* str */ String, typingsSlinky.handlebars.mod.SafeString] = js.native
    
    val Utils: TypeofUtils = js.native
    
    val VERSION: String = js.native
    
    val VM: TypeofVM = js.native
    
    var Visitor: Instantiable0[typingsSlinky.handlebars.mod.Visitor] = js.native
    
    def blockParams(obj: js.Array[_], ids: js.Array[_]): js.Array[_] = js.native
    
    def compile[T](input: js.Any): HandlebarsTemplateDelegate[T] = js.native
    def compile[T](input: js.Any, options: CompileOptions): HandlebarsTemplateDelegate[T] = js.native
    
    def create(): TypeofHandlebars = js.native
    
    def createFrame(`object`: js.Any): js.Any = js.native
    
    val decorators: js.Any = js.native
    
    def escapeExpression(str: String): String = js.native
    
    val helpers: js.Any = js.native
    
    def log(level: Double, obj: js.Any): Unit = js.native
    
    val logger: Logger = js.native
    
    def noConflict(): TypeofHandlebars = js.native
    
    def parse(input: String): Program = js.native
    def parse(input: String, options: ParseOptions): Program = js.native
    
    def parseWithoutProcessing(input: String): Program = js.native
    def parseWithoutProcessing(input: String, options: ParseOptions): Program = js.native
    
    val partials: js.Any = js.native
    
    def precompile(input: js.Any): TemplateSpecification = js.native
    def precompile(input: js.Any, options: PrecompileOptions): TemplateSpecification = js.native
    
    def registerDecorator(name: String, fn: js.Function): Unit = js.native
    
    def registerHelper(name: String, fn: HelperDelegate): Unit = js.native
    def registerHelper(name: HelperDeclareSpec): Unit = js.native
    
    def registerPartial(name: String, fn: Template[_]): Unit = js.native
    def registerPartial(spec: StringDictionary[HandlebarsTemplateDelegate[_]]): Unit = js.native
    
    def template[T](precompilation: TemplateSpecification): HandlebarsTemplateDelegate[T] = js.native
    
    val templates: HandlebarsTemplates = js.native
    
    def unregisterDecorator(name: String): Unit = js.native
    
    def unregisterHelper(name: String): Unit = js.native
    
    def unregisterPartial(name: String): Unit = js.native
  }
  
  @js.native
  trait hbsModule extends StObject {
    
    def __express(filename: String, options: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
    
    val handlebars: handlebarsModule = js.native
    
    def localsAsTemplateData(app: js.Any): Unit = js.native
    
    def registerHelper(helperName: String, helperFunction: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
    
    def registerPartial(partialName: String, partialValue: String): Unit = js.native
    
    def registerPartials(directoryName: String): Unit = js.native
    def registerPartials(directoryName: String, callback: js.Function0[Unit]): Unit = js.native
  }
  
  @js.native
  trait hbsModuleWithCreate extends hbsModule {
    
    def create(): hbsModule = js.native
    def create(handlebars: handlebarsModule): hbsModule = js.native
  }
}
