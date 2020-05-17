package typingsSlinky.handlebarsHelpers.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
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
import typingsSlinky.handlebars.hbs.AST.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofHandlebars extends js.Object {
  val AST: TypeofAST = js.native
  var Exception: Instantiable1[/* message */ String, typingsSlinky.handlebars.mod.Exception] = js.native
  var SafeString: Instantiable1[/* str */ String, typingsSlinky.handlebars.mod.SafeString] = js.native
  val Utils: TypeofUtils = js.native
  val VERSION: String = js.native
  val VM: TypeofVM = js.native
  var Visitor: Instantiable0[typingsSlinky.handlebars.mod.Visitor] = js.native
  val decorators: StringDictionary[js.Function] = js.native
  val helpers: StringDictionary[HelperDelegate] = js.native
  val logger: Logger = js.native
  val partials: StringDictionary[js.Any] = js.native
  val templates: HandlebarsTemplates = js.native
  def K(): Unit = js.native
  def blockParams(obj: js.Array[_], ids: js.Array[_]): js.Array[_] = js.native
  def compile[T](input: js.Any): HandlebarsTemplateDelegate[T] = js.native
  def compile[T](input: js.Any, options: CompileOptions): HandlebarsTemplateDelegate[T] = js.native
  def create(): typingsSlinky.handlebars.anon.TypeofHandlebars = js.native
  def createFrame(`object`: js.Any): js.Any = js.native
  def escapeExpression(str: String): String = js.native
  def log(level: Double, obj: js.Any): Unit = js.native
  def noConflict(): typingsSlinky.handlebars.anon.TypeofHandlebars = js.native
  def parse(input: String): Program = js.native
  def parse(input: String, options: ParseOptions): Program = js.native
  def parseWithoutProcessing(input: String): Program = js.native
  def parseWithoutProcessing(input: String, options: ParseOptions): Program = js.native
  def precompile(input: js.Any): TemplateSpecification = js.native
  def precompile(input: js.Any, options: PrecompileOptions): TemplateSpecification = js.native
  def registerDecorator(name: String, fn: js.Function): Unit = js.native
  def registerHelper(name: String, fn: HelperDelegate): Unit = js.native
  def registerHelper(name: HelperDeclareSpec): Unit = js.native
  def registerPartial(name: String, fn: Template[_]): Unit = js.native
  def registerPartial(spec: StringDictionary[HandlebarsTemplateDelegate[_]]): Unit = js.native
  def template[T](precompilation: TemplateSpecification): HandlebarsTemplateDelegate[T] = js.native
  def unregisterDecorator(name: String): Unit = js.native
  def unregisterHelper(name: String): Unit = js.native
  def unregisterPartial(name: String): Unit = js.native
}

